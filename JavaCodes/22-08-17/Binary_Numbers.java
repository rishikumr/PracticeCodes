//Task :
//Given a base-10 integer, , convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 's in 's binary representation.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Binary_Numbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.println("Input a number of base 10");
        int n = in.nextInt();
        
        int r[]= new int[30];
        int q=0;
        int i=0;
        while(n>0)
        {
            q= n%2;
            r[i]=q;
            n=n/2;
            i++;
         }
       // r[i]=0;
        int count =1;
        int max=1;
        for(int j=0;j<i-1;j++)
        {
          // System.out.print(r[j]);
            
           if(r[j]==r[j+1])
           {
               count++;
               if(count>max)
               {
                   max=count;
               }
           }
            else if(r[j]!=r[j+1])
            {
                count=1;
            }
        }
        System.out.println("Maximum number of continous 1 in binary format of given number is : ");
         System.out.print(max);
    }
}
