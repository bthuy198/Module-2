package repository.memory;

import model.Product;
import repository.memory.MemoryContext;

import java.util.ArrayList;
import java.util.Date;

public class ProductRepository extends MemoryContext<Product> {
    @Override
    public void init() {
        list = new ArrayList<>();
        list.add(new Product(111, "Milk", 15000, 5, new Date()));
        list.add(new Product(123, "Butter", 10000, 5, new Date()));
        list.add(new Product(124, "Candy", 20000, 5, new Date()));
        list.add(new Product(456, "Cookie", 5000, 5, new Date()));
        list.add(new Product(354, "Sugar", 15000, 5, new Date()));
    }
}
