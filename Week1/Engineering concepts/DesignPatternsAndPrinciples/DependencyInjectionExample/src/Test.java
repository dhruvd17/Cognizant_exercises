public class Test {

    public static void main(String[] args) {

        CustomerRepository customerRepo =
                new CustomerRepositoryImpl();

        CustomerService customerService =
                new CustomerService(customerRepo);

        Customer foundCustomer =
                customerService.getCustomer(101);

        if (foundCustomer != null) {

            System.out.println("Customer Details");

            System.out.println(
                    "Customer ID: "
                            + foundCustomer.getId());

            System.out.println(
                    "Customer Name: "
                            + foundCustomer.getName());

        } else {

            System.out.println(
                    "No customer found.");
        }
    }
}