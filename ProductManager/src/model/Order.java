package model;

import repository.IModel;
import repository.ISearch;

import java.util.Date;
import java.util.List;

public class Order implements IModel<Order>, ISearch<Order> {
    private long id;
    private String customerName;
    private double total;
    private Date createDate;
    private List<OrderItem> orderitemList;
    private EStatus status;

    public Order() {
    }

    public Order(long id, String customerName, Date createDate, EStatus status) {
        this.id = id;
        this.customerName = customerName;
        this.createDate = createDate;
        this.status = status;
    }

    public Order(long id, String customerName, double total, Date createDate, List<OrderItem> orderitemList, EStatus status) {
        this.id = id;
        this.customerName = customerName;
        if (total == 0) {
            return;
        } else {
            this.total = total;
        }
        this.createDate = createDate;
        this.orderitemList = orderitemList;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    @Override
    public Order parseData(String line) {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public List<OrderItem> getOrderitemList() {
        return orderitemList;
    }

    public void setOrderitemList(List<OrderItem> orderitemList) {
        this.orderitemList = orderitemList;
    }

    public EStatus getStatus() {
        return status;
    }

    public void setStatus(EStatus status) {
        this.status = status;
    }
}
