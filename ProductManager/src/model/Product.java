package products;

import java.util.Date;

public class Product {
    protected long idProduct;
    protected String productName;
    protected double price;
    protected int quantity;
    protected Date createDate;

    public Product() {
    }

    public Product(long idProduct, String productName, double price, int quantity, Date createDate) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.createDate = createDate;
    }


    public int generateId(int id) {
        int newId = id + 1;
        return newId;
    }

    public long getIdProduct() {
        return idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String viewProduct() {
        return String.format("%5s|%15s|%10s|%10s|%-10s", idProduct, productName, price, quantity, createDate);
    }
}
