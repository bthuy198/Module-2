package view;

import model.*;
import repository.memory.ProductRepository;
import service.OrderItemService;
import service.OrderService;
import service.ProductService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class OrderView {
    private OrderService orderService;
    private OrderItemService orderItemService;
    private ProductService productService;
    public static long idOrderView = 2;
    Scanner scn = new Scanner(System.in);

    public OrderView() {
        orderService = new OrderService();
        productService = new ProductService();
    }

    public void renderMenu() {
        System.out.println("Order manager Menu");
        System.out.println("1. Show orders list");
        System.out.println("2. Add new order");
        System.out.println("3. Show detail order");
        System.out.println("4. Update order status");
    }

    public void launcher() {
        boolean checkAction = false;
        do {
            renderMenu();
            int actionMenuOrder = Integer.parseInt(scn.nextLine());
            switch (actionMenuOrder) {
                case 1:
                    showOrderList(orderService.getAllOrder());
                    break;
                case 2:
                    addInfoNewOrder();
                    break;
                case 3:
                    showDetailOrder();
                    break;
                case 4:
                    updateOrderStatus();
                    break;
            }
            checkAction = checkActionContinue();
        } while (checkAction);
    }

    public void updateOrderStatus() {
        System.out.println("Enter id's order you want to update status");
        long id = Long.parseLong(scn.nextLine());
        Order order = orderService.findById(id);
        if (order == null) {
            System.out.println("Not found this order");
        } else{
            System.out.println("----------Please choose status-----------");
            System.out.println("-----------------------------------------");
            for(EStatus status : EStatus.values()){
                System.out.printf("%s enter %s", status, status.getId());
                System.out.println();
            }
            System.out.println("-----------------------------------------");
            int updateStatus = Integer.parseInt(scn.nextLine());
            EStatus status = EStatus.changeStatus(updateStatus);
            order.setStatus(status);
            System.out.println("------------------Done--------------------");
        }
    }

    public void showDetailOrder() {
        System.out.println("Enter id's order you want to show detail");
        long idDetail = Long.parseLong(scn.nextLine());
        Order order = orderService.findById(idDetail);
        if (order == null) {
            System.out.println("Not found this order");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("ID Order: " + order.getId());
            System.out.println("Customer's name: " + order.getCustomerName());
            System.out.println("Ordered day: " + order.getCreateDate());
            System.out.println("Order status: " + order.getStatus());

            System.out.println("-----------------------------------------");
            System.out.printf("%15s|%10s|%13s", "Product name", "Amount", "Total");
            System.out.println();
            for (OrderItem orderItem : order.getOrderitemList()) {
                Product product = productService.findProductById(orderItem.getIdProduct());
                if (orderItem.getAmount() != 0) {
                    System.out.printf("%15s|%10s|%13s", product.getName(), orderItem.getAmount(), orderItem.getAmount() * product.getPrice());
                    System.out.println();
                }
            }
            System.out.println("-----------------------------------------");
            System.out.printf("%15s %24s", "Grand Total: ", order.getTotal());
            System.out.println();
            System.out.println("-----------------------------------------");
        }
    }

    public void showDetailOneOrder(long id) {
        Order order = orderService.findById(id);
        if (order == null) {
            System.out.println("Not found this order");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("ID Order: " + order.getId());
            System.out.println("Customer's name: " + order.getCustomerName());
            System.out.println("Ordered day: " + order.getCreateDate());
            System.out.println("Order status: " + order.getStatus());

            System.out.println("-----------------------------------------");
            System.out.printf("%15s|%10s|%13s", "Product name", "Amount", "Total");
            System.out.println();
            for (OrderItem orderItem : order.getOrderitemList()) {
                Product product = productService.findProductById(orderItem.getIdProduct());
                if (orderItem.getAmount() != 0) {
                    System.out.printf("%15s|%10s|%13s", product.getName(), orderItem.getAmount(), orderItem.getAmount() * product.getPrice());
                    System.out.println();
                }
            }
            System.out.println("-----------------------------------------");
            System.out.printf("%15s %24s", "Grand Total: ", order.getTotal());
            System.out.println();
            System.out.println("-----------------------------------------");
        }
    }

    public Order findById(long id) {
        return orderService.findById(id);
    }

    public void addInfoNewOrder() {
        Order newOrder;
        long id = idOrderView + 1;
        System.out.println("Enter customer's name");
        String name = scn.nextLine();
        Date createOrderDate = new Date();
        EStatus status = EStatus.CONFIRMED;
        newOrder = new Order(id, name, createOrderDate, status);
        orderService.add(newOrder);
        showProductList(productService.getAllProduct());
        List<OrderItem> orderItems = addOrderItem(newOrder);
        for (OrderItem items : orderItems) {
            items.setIdOrder(newOrder.getId());
        }
        newOrder.setOrderitemList(orderItems);
        double total_items = total(orderItems);
        newOrder.setTotal(total_items);
        System.out.println("---------------Your order---------------");
        showDetailOneOrder(newOrder.getId());
        idOrderView++;
    }

    public List<OrderItem> addOrderItem(Order order) {
        boolean checkActionAddItem = true;
        List<OrderItem> orderItems = new ArrayList<>();
        order.setOrderitemList(orderItems);
        long id = System.currentTimeMillis() % 1000;
        do {
            System.out.println("Enter ID product you want to buy");
            long idProduct = Long.parseLong(scn.nextLine());
            System.out.println("Enter amount");
            int amount = Integer.parseInt(scn.nextLine());
            OrderItem item = new OrderItem(id, idProduct, amount);
            Product product = productService.findProductById(item.getIdProduct());
            addProductToOrderItems(idProduct, amount,order, orderItems);

            System.out.println("Continue buying(1) or end this order(2)?");
            int choice = Integer.parseInt(scn.nextLine());
            if (choice != 1) {
                checkActionAddItem = false;
            }
            showOrderItems(order);
        } while (checkActionAddItem);
//        orderItems = checkInfoOrder(orderItems);
        return orderItems;
    }

    private void showOrderItems(Order order) {
        System.out.println("-----------------------------------------");
        for (int i = 0; i < order.getOrderitemList().size(); i++) {
            System.out.printf("%15s|%7s|%13s", "Product name", "Amount", "Total").println();
            Product product = productService.findProductById(order.getOrderitemList().get(i).getIdProduct());
            System.out.printf("%15s|%7s|%13s", product.getName(), order.getOrderitemList().get(i).getAmount(), product.getPrice() * order.getOrderitemList().get(i).getAmount()).println();
        }
    }

    private void addProductToOrderItems(long idProduct,int amount,Order order, List<OrderItem> orderItems) {
        boolean flag = false;
        for (int i = 0; i < orderItems.size(); i++) {
            if (orderItems.get(i).getIdProduct() == idProduct) {
                // tang so luong
                orderItems.get(i).setAmount(orderItems.get(i).getAmount() + amount);
                flag = true;
            }
        }
        if (flag == false) {
            orderItems.add(new OrderItem(System.currentTimeMillis()/1000,order.getId(), idProduct, amount ));
        }
    }

    public double total(List<OrderItem> orderItemList) {
        ProductRepository productRepository = new ProductRepository();
        double total = 0;
        for (OrderItem item : orderItemList) {
            Product product = productRepository.findById(item.getIdProduct());
            total += product.getPrice() * item.getAmount();
        }
        return total;
    }

    public List<OrderItem> checkInfoOrder(List<OrderItem> orderItems) {
        for (int i = 0; i < orderItems.size() - 1; i++) {
            for (int j = i + 1; j < orderItems.size(); j++) {
                if (orderItems.get(i).getIdProduct() == orderItems.get(j).getIdProduct()) {
                    orderItems.get(i).setAmount(orderItems.get(i).getAmount() + orderItems.get(j).getAmount());
                    orderItems.get(j).setAmount(0);
                }
            }
        }
        return orderItems;
    }

    public void showOrderList(List<Order> orderList) {
        System.out.printf("%5s|%15s|%10s|%10s|%-10s", "ID", "Product name", "Total","Status", "Create Date");
        System.out.println();
        for (Order order : orderList) {
            System.out.printf("%5s|%15s|%10s|%10s|%-10s", order.getId(), order.getCustomerName(), order.getTotal(),order.getStatus(), order.getCreateDate());
            System.out.println();
        }
    }

    public void showProductList(List<Product> productList) {
        System.out.printf("%5s|%15s|%10s|%10s|%-10s", "ID", "Product name", "Price", "Quantity", "Create Date");
        System.out.println();
        for (Product product : productList) {
            System.out.println(product.viewProduct());
        }
    }

    public boolean checkActionContinue() {
        boolean checkActionContinue = false;
        do {
            System.out.println("Continue? Y/N");
            String choice = scn.nextLine().trim().toUpperCase();
            switch (choice) {
                case "Y":
                    return true;
                case "N":
                    return false;
                default:
                    checkActionContinue = true;
            }
        } while (checkActionContinue);
        return false;
    }
}
