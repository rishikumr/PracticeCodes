//Task: Read a string, and print its integer value; if  cannot be converted to an integer, print Bad String.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Exceptions_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
								for(int a_i=0; a_i < n; a_i++){
									a[a_i] = in.nextInt();
								}
					   long swap=0;
					   
					for(int j=0;j<(n);j++)
					{
						 long sw=0;
						for(int i =0;i<(n)-1;i++) {
						if(a[i]>a[i+1])
						{
						   
							int temp = a[i];
							a[i]=a[i+1];
							a[i+1]=temp;
							sw++;
							swap++;
							
						}
							}
							   if(sw==0)
							   {
								   break;
							   }
							
					}
              
        System.out.println("Array is sorted in "+swap+" swaps.");
         System.out.println("First Element: "+a[0]);
         System.out.println("Last Element: "+a[(a.length)-1]);
       
    }
}
