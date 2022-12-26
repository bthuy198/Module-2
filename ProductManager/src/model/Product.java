package model;

import repository.IModel;
import repository.ISearch;

import java.util.Date;

public class Product implements IModel<Product>, ISearch<Product> {
    protected long id;
    protected String productName;
    protected double price;
    protected int quantity;
    protected Date createDate;

    public Product() {
    }

    public Product(long idProduct, String productName, double price, int quantity, Date createDate) {
        this.id = idProduct;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.createDate = createDate;
    }
    public long getId() {
        return id;
    }

    @Override
    public String getName() {
        return this.productName;
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
    public void updateProduct(Product product){
        this.setProductName(product.getProductName());
        this.setPrice(product.getPrice());
        this.setQuantity(product.getQuantity());
        this.setCreateDate(product.getCreateDate());
    }
    public String viewProduct() {
        return String.format("%5s|%15s|%10s|%10s|%-10s", id, productName, price, quantity, createDate);
    }
}
