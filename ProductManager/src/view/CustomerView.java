package view;

import model.Customer;
import model.EGender;
import service.CustomerService;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private CustomerService customerService;
    Scanner scn = new Scanner(System.in);

    public CustomerView() {
        customerService = new CustomerService();
    }

    public void renderMenu() {
        System.out.println("Customer manager Menu");
        System.out.println("1. Show customer list");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer's profile");
        System.out.println("4. Delete customer");
        System.out.println("5. Search customer by ID");
        System.out.println("6. Search customer by name");
    }

    public void launcher() {
        boolean checkAction = false;
        do {
            renderMenu();
            int actionMenuProduct = Integer.parseInt(scn.nextLine());
            switch (actionMenuProduct) {
                case 1:
                    showCustomerList(customerService.getAll());
                    break;
                case 2:
                    addNewCustomer();
                    break;
                case 3:
                    System.out.println("1. Edit by id?");
                    System.out.println("2. Edit by name?");
                    int edit = Integer.parseInt(scn.nextLine());
                    if (edit == 1) {
                        updateCustomerById();
                    }
                    if (edit == 2) {
                        updateCustomerByName();
                    }
                    break;
                case 4:
                    deleteCustomer();
                    break;
                case 5:
                    System.out.println("Enter ID you want to search");
                    long id = Long.parseLong(scn.nextLine());
                    searchById(id);
                    break;
                case 6:
                    System.out.println("Enter name you want to search");
                    String name = scn.nextLine();
                    searchByName(name.trim().toLowerCase());
                    break;
            }
            checkAction = checkActionContinue();
        } while (checkAction);
    }

    public Customer findById(long id) {
        return customerService.findById(id);
    }

    public void searchById(long id) {
        Customer searchResult = findById(id);
        if (searchResult == null) {
            System.out.println("Not found");
        } else {
            showCustomer(searchResult);
        }
    }

    public void searchByName(String name) {
        showCustomerList(customerService.searchByName(name));
    }

    public void deleteCustomer() {
        System.out.println("Enter ID's customer you want to delete");
        long id = Long.parseLong(scn.nextLine());
        customerService.deleteById(id);
        showCustomerList(customerService.getAll());
    }

    public void updateCustomerByName() {
        System.out.println("Name's customer you want to edit");
        String name = scn.nextLine().trim().toLowerCase();
        Customer editCustomer = customerService.findByName(name);
        if (editCustomer != null) {
            editCustomer(editCustomer);
        } else {
            System.out.println("Not found this name");
        }
    }

    public void updateCustomerById() {
        System.out.println("ID's customer you want to edit");
        long idCustomer = Long.parseLong(scn.nextLine());
        editCustomer(customerService.findById(idCustomer));
    }

    public void addNewCustomer() {
        customerService.add(customer);
    }

    public void editCustomer(Customer customer) {
        System.out.println("You want to edit what?");
        System.out.println("1. Customer name");
        System.out.println("2. Customer age");
        System.out.println("3. Customer address");
        System.out.println("Please choose 1");
        int choice = Integer.parseInt(scn.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Enter name");
                customer.setName(scn.nextLine());
                showCustomer(customer);
                System.out.println("----------Done---------");
                break;
            case 2:
                System.out.println("Enter age");
                customer.setAge(Integer.parseInt(scn.nextLine()));
                showCustomer(customer);
                System.out.println("----------Done---------");
                break;
            case 3:
                System.out.println("Enter address");
                customer.setAddress(scn.nextLine());
                showCustomer(customer);
                System.out.println("----------Done---------");
                break;
            default:
                break;
        }
    }

    public boolean checkActionContinue() {
        boolean checkActionContinue = false;
        do {
            System.out.println("Continue? Y/N");
            String choice = scn.nextLine().trim().toUpperCase();
            switch (choice) {
                case "Y":
                    return true;
                case "N":
                    return false;
                default:
                    checkActionContinue = true;
            }
        } while (checkActionContinue);
        return false;
    }

    public void showCustomer(Customer customer) {
        System.out.printf("%5s|%15s|%5s|%8s|%10s|%-10s", "ID", "Customer's name", "Age", "Gender", "Address", "Create date").println();
        System.out.println(customer.viewCustomer());
    }

    public void showCustomerList(List<Customer> customerList) {
        System.out.printf("%5s|%15s|%5s|%8s|%10s|%-10s", "ID", "Customer's name", "Age", "Gender", "Address", "Create date").println();
        for (Customer customer : customerList) {
            System.out.println(customer.viewCustomer());
        }
    }

    public static void main(String[] args) {
        CustomerView customerList = new CustomerView();
        customerList.launcher();
    }
}
