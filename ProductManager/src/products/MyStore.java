package products;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MyStore {
    private List<Product> productList;
    Scanner scn = new Scanner(System.in);

    public MyStore() {
        productList = new ArrayList<>();
        productList.add(new Product(111, "Milk", 15000, 5, new Date()));
        productList.add(new Product(123, "Butter", 10000, 5, new Date()));
        productList.add(new Product(124,"Candy", 20000, 5, new Date()));
        productList.add(new Product(456,"Cookie", 5000, 5, new Date()));
        productList.add(new Product(354,"Sugar", 15000, 5, new Date()));
    }

    public void renderMenu() {
        System.out.println("Product manager Menu");
        System.out.println("1. Show products list");
        System.out.println("2. Add new product");
        System.out.println("3. Edit product");
        System.out.println("4. Delete product");
        System.out.println("5. Sort by price");
        System.out.println("6. Sort by quantity");
        System.out.println("7. Sort by created date");
    }

    public void launcher() {
        boolean checkAction = false;
        do {
            renderMenu();
            int actionMenuProduct = Integer.parseInt(scn.nextLine());
            switch (actionMenuProduct) {
                case 1:
                    showProductList(productList);
                    break;
                case 2:
                    addNewProduct();
                    break;
                case 3:
                    System.out.println("1. Edit by id?");
                    System.out.println("2. Edit by name?");
                    int edit = Integer.parseInt(scn.nextLine());
                    if (edit == 1) {
                        updateProductById();
                    }
                    if (edit == 2) {
                        updateProductByName();
                    }
                    break;
                case 4:
                    deleteProduct();
                    break;
            }
            checkAction = checkActionContinue();
        } while (checkAction);
    }

    public void deleteProduct() {
        System.out.println("Enter ID's product you want to delete");
        long id = Long.parseLong(scn.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getIdProduct() == id) {
                productList.remove(i);
                System.out.println("------Done------");
                break;
            }
        }
        showProductList(productList);
    }

    public void updateProductById() {
        System.out.println("ID's product you want to edit");
        long idProduct = Long.parseLong(scn.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getIdProduct() == idProduct) {
                editProduct(productList.get(i));
            } else break;
        }
    }

    public void updateProductByName() {
        System.out.println("Name's product you want to edit");
        String productName = scn.nextLine().trim().toLowerCase();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductName().toLowerCase().equals(productName)) {
                editProduct(productList.get(i));
            } else break;
        }
    }

    public void addNewProduct() {
        long idProduct = System.currentTimeMillis()%1000;
        System.out.println("Enter product's name");
        String name = scn.nextLine();
        System.out.println("Enter product's price");
        double price = Double.parseDouble(scn.nextLine());
        System.out.println("Enter quantity");
        int quantity = Integer.parseInt(scn.nextLine());
        Date createDate = new Date();
        Product newProduct = new Product(idProduct, name,price,quantity,createDate);
        System.out.println("Please check new product's ìnformation");
        System.out.println(newProduct.viewProduct());
        System.out.println("Do you want to save? Y/N");
        String choice = scn.nextLine();
        choice = choice.trim().toUpperCase();
        switch (choice) {
            case "Y":
                productList.add(newProduct);
                System.out.println("---------Done---------");
                break;
            case "N":
                System.out.println("Edit(1) or cancel(2)? ");
                int edit = Integer.parseInt(scn.nextLine());
                if (edit == 1) {
                    editProduct(newProduct);
                } else break;
            default:
                break;
        }
    }

    public void editProduct(Product product) {
        System.out.println("You want to edit what?");
        System.out.println("1. Product name");
        System.out.println("2. Price");
        System.out.println("3. Quantity");
        System.out.println("Please choose 1");
        int choice = Integer.parseInt(scn.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Enter name");
                product.setProductName(scn.nextLine());
                showProductView(product);
                System.out.println("----------Done---------");
                break;
            case 2:
                System.out.println("Enter price");
                product.setPrice(Double.parseDouble(scn.nextLine()));
                showProductView(product);
                System.out.println("----------Done---------");
                break;
            case 3:
                System.out.println("Enter quantity");
                product.setQuantity(Integer.parseInt(scn.nextLine()));
                showProductView(product);
                System.out.println("----------Done---------");
                break;
            default:
                break;
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

    public void showProductList(List<Product> productList) {
        System.out.printf("%5s|%15s|%10s|%10s|%-10s", "ID", "Product name", "Price", "Quantity", "Create Date");
        System.out.println();
        for (Product product : productList) {
            System.out.println(product.viewProduct());
        }
    }
    public void showProductView(Product product){
        System.out.println(product.viewProduct());
    }

    public static void main(String[] args) {
        MyStore myStore = new MyStore();
        myStore.launcher();
    }
}
