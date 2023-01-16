package repository.file;

import model.Customer;

public class CustomerRepository extends FileContext<Customer>{
    public CustomerRepository(){
        filePath = "./data/customer.txt";
        tClass = Customer.class;
    }
}
