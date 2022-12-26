package model;

import repository.IModel;

import java.util.Date;

public class Customer implements IModel<Customer> {
    private long id;
    private String name;
    private int age;
    private EGender gender;
    private String address;
    private Date create;

    public Customer() {
    }

    public Customer(long id, String name, int age, EGender gender, String address, Date create) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.create = create;
    }

    public EGender getGender() {
        return gender;
    }

    public void setGender(EGender gender) {
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public String viewCustomer() {
        return String.format("%5s|%15s|%5s|%8s|%10s|%-10s", id, name, age, gender, address, create);
    }
}
