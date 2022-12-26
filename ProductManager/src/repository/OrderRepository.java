package repository;

import model.EStatus;
import model.Order;
import model.OrderItem;
import model.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderRepository extends MemoryContext<Order> {
    ProductRepository productRepository;
    OrderDetailRepository orderDetailRepository;
    private static long id = 0;

    @Override
    public void init() {
        list = new ArrayList<>();
        productRepository = new ProductRepository();
        orderDetailRepository = new OrderDetailRepository();

        Order order1 = new Order(++id, "John", total(findByIdOrder(id)), new Date(), findByIdOrder(id), EStatus.CONFIRMED);
        Order order2 = new Order(++id, "Thủy", total(findByIdOrder(id)), new Date(), findByIdOrder(id), EStatus.COMPLETED);
        list.add(order1);
        list.add(order2);
    }

    public static double total(List<OrderItem> orderItemList) {
        ProductRepository productRepository = new ProductRepository();
        double total = 0;
        for (OrderItem item : orderItemList) {
            Product product = productRepository.findById(item.getIdProduct());
            total += product.getPrice() * item.getAmount();
        }
        return total;
    }
    public List<OrderItem> findByIdOrder(long idOrder){
        return orderDetailRepository.findByIdOrder(idOrder);
    }
}
