import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {



    final int TIER2_CUTOFF = 13000;
    final double GALLONS = 1000.0;
    private String name;
    private int gallonsUsed;
    private int customerType; //1 is single fam 2 is duplex
    protected double bill;
    //getter

    public Customer (){

    }
    public Customer(String name, int gallonsUsed, int customerType){
        setName(name);
        setGallonsUsed(gallonsUsed);
        setCustomerType(customerType);
    }

    public int getGallonsUsed(){
        return gallonsUsed;
    }

    public double getBill() {
        return bill;
    }

    public String getName() {
        return name;
    }

    public int getCustomerType() {
        return customerType;
    }

    //setter----------------------------------------------


    public void setName(String name) {
        if (name.equals("") || name == null){
            System.out.println("Must have name");
        }
        else {
            this.name = name;
        }
    }

    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }

    public void setGallonsUsed(int gallonsUsed){
        if (gallonsUsed < 0){
            System.out.println("Gallons used must be positive");
        }
        else {
            this.gallonsUsed = gallonsUsed;
        }
    }







    public void customerInput(){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            System.out.print("Enter Customer Name: ");
            setName(bufferedReader.readLine());


            System.out.print("Enter Customer Type (1: SingleFamily, 2: Duplex): ");
            customerType = Integer.parseInt(bufferedReader.readLine());

            System.out.print("Enter gallons used: ");
            setGallonsUsed (Integer.parseInt(bufferedReader.readLine()));

        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }



    }

    public void calculateBill() {

    }


    public void printBill(){
        System.out.println("The bill is " + bill);

    }



}
