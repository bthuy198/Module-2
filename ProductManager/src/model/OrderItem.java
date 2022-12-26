package model;

import repository.IModel;

public class OrderItem implements IModel<OrderItem> {
    private long id;
    private long idOrder;
    private long idProduct;
    private int amount;
//    private double itemTotalPrice;

    public OrderItem() {
    }

    public OrderItem(long id, long idOrder, long idProduct, int amount) {
        this.id = id;
        this.idOrder = idOrder;
        this.idProduct = idProduct;
        this.amount = amount;
    }
    public OrderItem(long id, long idProduct, int amount) {
        this.id = id;
        this.idProduct = idProduct;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }



    public void setId(long id) {
        this.id = id;
    }

    public long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(long idOrder) {
        this.idOrder = idOrder;
    }

    public long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(long idProduct) {
        this.idProduct = idProduct;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
