package compBuilderA;

public class ComputerATest {

    public static void main(String[] args) {
        Customer customer = new Customer();
        CompBuilder highEndBuilder = new HighEndCompBuilder();
        CompBuilder lowEndBuilder = new LowEndCompBuilder();

        customer.setCompBuilder(highEndBuilder);
        customer.constructComp();

        System.out.println(customer.getComputer());

        customer.setCompBuilder(lowEndBuilder);
        customer.constructComp();

        System.out.println(customer.getComputer());
    }
}
