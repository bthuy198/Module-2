package service;

import model.Customer;
import repository.CustomerRepository;

import java.util.List;


public class CustomerService {
    private CustomerRepository customerRepository;
    public CustomerService(){
       customerRepository = new CustomerRepository();
    }
    public List<Customer> getAll(){
        return customerRepository.getAll();
    }
    public List<Customer> searchByName(String name){
        return customerRepository.searchByName(name);
    }
    public void deleteById(long id){
        customerRepository.deleteById(id);
    }
    public Customer findById(long id){
        return customerRepository.findById(id);
    }
    public Customer findByName(String name){
        return customerRepository.findByName(name);
    }
//    public Customer updateProductById(long id, Customer customer){
//
//    }
    public void add(Customer newCustomer){
        customerRepository.add(newCustomer);
    }

}
