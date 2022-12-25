package users;

import model.Customer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CustomerList {
    private List<Customer> customerList;
    Scanner scn = new Scanner(System.in);

    public CustomerList() {
        customerList = new ArrayList<>();
        customerList.add(new Customer(456, "John", 20, "Huế", new Date()));
        customerList.add(new Customer(457, "Levis", 30, "Huế", new Date()));
        customerList.add(new Customer(458, "Tom", 25, "ĐN", new Date()));
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
                    showCustomerList(customerList);
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

    public Customer findById(long id){
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                return customerList.get(i);
            }
        }
        return null;
    }
    public void searchById(long id){
        Customer searchResult = findById(id);
        if(searchResult == null){
            System.out.println("Not found");
        } else{
            showCustomer(searchResult);
        }
    }
    public void searchByName(String name){
        List<Customer> searchList = new ArrayList<>();
        for(int i = 0; i < customerList.size(); i++){
            if(customerList.get(i).getName().toLowerCase().equals(name)){
                searchList.add(customerList.get(i));
            }
        }
        if(searchList.size() == 0){
            System.out.println("Not found");
        } else{
            showCustomerList(searchList);
        }
    }
    public void deleteCustomer() {
        System.out.println("Enter ID's customer you want to delete");
        long id = Long.parseLong(scn.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                customerList.remove(i);
                System.out.println("------Done------");
                break;
            }
        }
        showCustomerList(customerList);
    }

    public void updateCustomerByName() {
        System.out.println("Name's customer you want to edit");
        String name = scn.nextLine().trim().toLowerCase();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName().toLowerCase().equals(name)) {
                editCustomer(customerList.get(i));
            } else break;
        }
    }

    public void updateCustomerById() {
        System.out.println("ID's customer you want to edit");
        long idCustomer = Long.parseLong(scn.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == idCustomer) {
                editCustomer(customerList.get(i));
            } else break;
        }
    }

    public void addNewCustomer() {
        long id = System.currentTimeMillis() % 1000;
        System.out.println("Enter customer's name");
        String name = scn.nextLine();
        System.out.println("Enter customer's age");
        int age = Integer.parseInt(scn.nextLine());
        System.out.println("Enter customer's address");
        String address = scn.nextLine();
        Date createDate = new Date();
        Customer newCustomer = new Customer(id, name, age, address, createDate);
        System.out.println("Please check new customer's information");
        showCustomer(newCustomer);
        System.out.println("Do you want to save? Y/N");
        String choice = scn.nextLine();
        choice = choice.trim().toUpperCase();
        switch (choice) {
            case "Y":
                customerList.add(newCustomer);
                System.out.println("---------Done---------");
                break;
            case "N":
                System.out.println("Edit(1) or cancel(2)? ");
                int edit = Integer.parseInt(scn.nextLine());
                if (edit == 1) {
                    editCustomer(newCustomer);
                } else break;
            default:
                break;
        }
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
        System.out.println(customer.viewCustomer());
    }

    public void showCustomerList(List<Customer> customerList) {
        for (Customer customer : customerList) {
            System.out.println(customer.viewCustomer());
        }
    }

    public static void main(String[] args) {
        CustomerList customerList = new CustomerList();
        customerList.launcher();
    }
}
