//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //USER INPUTS: totalbill, tippercent, people
        System.out.println("Enter total bill amount: $");
        double totalbill = scanner.nextDouble();


        System.out.println("Enter tip percentage: ");
        int tippercent = scanner.nextInt();


        System.out.println("People: ");
        int people = scanner.nextInt();


        scanner.close();
        // Calculations
        double totaltip = totalbill * (tippercent / 100.0);


        double totalbillwithtip = totalbill + totaltip;


        double tipperperson = totaltip / people;


        double totalperperson = totalbillwithtip / people;
        //DISPLAY


        System.out.println("------------------");
        System.out.println("Bill Summary");
        System.out.println("------------------");


        System.out.printf("Total Tip: $%.2f\n", totaltip);
        System.out.printf("Total Bill (with tip): $%.2f\n", totalbillwithtip);


        System.out.println("------------------");
        System.out.println("Per Person");
        System.out.println("------------------");


        System.out.printf("Tip Per Person: $%.2f\n", tipperperson);
        System.out.printf("Total Per Person: $%.2f\n", totalperperson);


        System.out.println("------------------");


    }
}