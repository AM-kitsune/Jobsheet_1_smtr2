import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>(2);

        Customer customer1 = new Customer(1, "Zakia");
        Customer customer2 = new Customer(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer(4, "Cica"));
        
        customers.add(2, new Customer(100, "Rosa"));
        
        System.out.println("\nIndex dari Budi: " + customers.indexOf(customer2));
        
        Customer customer = customers.get(1);
        System.out.println("\nCustomer di index 1 sebelum diubah: " + customer.name);
        customer.name = "Budi Utomo";

        System.out.println("Daftar Customer:");
        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }

        ArrayList<Customer> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer(201, "Della"));
        newCustomers.add(new Customer(202, "Victor"));
        newCustomers.add(new Customer(203, "Sarah"));
        customers.addAll(newCustomers);
        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println(customers);

    }
}