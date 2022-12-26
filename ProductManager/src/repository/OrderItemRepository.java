package repository;

import model.Customer;
import model.OrderItem;

import java.util.ArrayList;

public class OrderItemRepository extends MemoryContext<OrderItem>{
    @Override
    public void init() {
        list = new ArrayList<>();
    }
}
