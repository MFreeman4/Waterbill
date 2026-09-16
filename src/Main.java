import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args){


        System.out.println("Hello world");

        Customer charleeCustomer = new Customer();
        charleeCustomer.name ="Charlee";
        charleeCustomer.customerType = 1;
        charleeCustomer.gallonsUsed = 8000;
        charleeCustomer.calculateBill();


        Customer quinnCustomer = new Customer();
        quinnCustomer.gallonsUsed=4;
        System.out.println(quinnCustomer.gallonsUsed);

    }
}
