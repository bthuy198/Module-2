package repository.memory;

import model.Customer;
import model.EGender;

import java.util.ArrayList;
import java.util.Date;

public class CustomerRepository extends MemoryContext<Customer> {
    @Override
    public void init() {
        list = new ArrayList<Customer>();
        list.add(new Customer(456, "John", 20, EGender.MALE, "Huế", new Date()));
        list.add(new Customer(457, "Levis", 30,EGender.MALE, "Huế", new Date()));
        list.add(new Customer(458, "Jenny", 25,EGender.FEMALE, "ĐN", new Date()));
    }

}
