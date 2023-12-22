import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Scanner Object
        Scanner input = new Scanner(System.in);
        //Creating an Object for Base Salary
        Employee firstEmployee = new BaseSalariedCommissionEmployee("Bob", "Lewis", "1978-75", 5000, .04, 300);
        System.out.println("The employee " + firstEmployee.getClass() + );
        
    }
}
