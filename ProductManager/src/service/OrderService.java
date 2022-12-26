package service;

import model.Order;
import repository.OrderRepository;

import java.util.List;

public class OrderService {
    private OrderRepository orderRepository;

    public OrderService() {
        orderRepository = new OrderRepository();
    }
    public List<Order> getAllOrder(){
        return orderRepository.getAll();
    }
    public Order findById(long id){
        return orderRepository.findById(id);
    }
    public void add(Order newOrder){
        orderRepository.add(newOrder);
    }
}
