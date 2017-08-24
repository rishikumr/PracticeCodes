import java.util.*;
import java.math.*;

public class Operators {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter original meal cost, tip percentage and tax percentage");
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        double tip = (double)(mealCost * tipPercent )/ 100;
        double tax = (double)(mealCost * taxPercent )/ 100;
       
        double tCost= mealCost+tip+tax;
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(tCost);
      
        System.out.println("The total meal cost is "+totalCost+" dollars.");
    }
}