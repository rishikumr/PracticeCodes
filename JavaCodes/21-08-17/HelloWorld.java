

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HelloWorld {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        //String s = "HackerRank ";
		
		System.out.println("Enter 1 int , 1 double and 1 string"); 
		
        Scanner scan = new Scanner(System.in);
    int j =  scan.nextInt();
        double e = scan.nextDouble();
    scan.nextLine();
        String x = scan.nextLine();
  

    System.out.println("int +4 = "+(i+j));
    System.out.println("double +4 = "+(d+e));
    System.out.println("You typed "+x); 
	
	scan.close();
    }
}