package repository.memory;

import model.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailRepository extends MemoryContext<OrderItem> {

    ProductRepository productRepository;

    @Override
    public void init() {
        list = new ArrayList<>();
        productRepository = new ProductRepository();

        OrderItem orderItem1 = new OrderItem(1, 1, 111, 5);
        OrderItem orderItem2 = new OrderItem(2, 1, 354, 1);
        OrderItem orderItem3 = new OrderItem(3, 2, 123, 2);
        OrderItem orderItem4 = new OrderItem(4, 2, 124, 5);

        list.add(orderItem1);
        list.add(orderItem2);
        list.add(orderItem3);
        list.add(orderItem4);
    }
    public List<OrderItem> findByIdOrder(long idOrder){
        List<OrderItem> orderItemByIdOrder = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdOrder() == idOrder) {
                orderItemByIdOrder.add(list.get(i));
            }
        }
        return orderItemByIdOrder;
    }
}
