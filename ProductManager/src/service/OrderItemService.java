package service;

import model.OrderItem;
import repository.IModel;
import repository.OrderDetailRepository;

import java.util.ArrayList;
import java.util.List;

public class OrderItemService {
    private OrderDetailRepository orderDetailRepository;
    public OrderItemService(){
        orderDetailRepository = new OrderDetailRepository();
    }

    public void add(OrderItem newOrderItem){
        orderDetailRepository.add(newOrderItem);
    }
    public List<OrderItem> findByIdOrder(long idOrder){
        return orderDetailRepository.findByIdOrder(idOrder);
    }
}
