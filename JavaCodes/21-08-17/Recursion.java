// Task: Write a factorial function that takes a positive integer,  as a parameter and prints the result of factorial.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Recursion {

    static int factorial(int n) {
       if(n==1){return 1;}
       else{ return (n*factorial(n-1));}// Complete this function
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
	 System.out.println("ENTER NUMBER TO FIND ITS FACTORIAL");
    int n = in.nextInt();
    int result = factorial(n);
    System.out.println(result);
    }
}
