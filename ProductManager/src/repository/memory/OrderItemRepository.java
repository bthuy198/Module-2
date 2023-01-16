package repository.memory;

import model.OrderItem;
import repository.memory.MemoryContext;

import java.util.ArrayList;

public class OrderItemRepository extends MemoryContext<OrderItem> {
    @Override
    public void init() {
        list = new ArrayList<>();
    }
}
