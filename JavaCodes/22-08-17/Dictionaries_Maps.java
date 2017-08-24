//Task: use the concept of dictionaries and Maps in java

import java.io.*;
import java.util.*;


public class Dictionaries_Maps {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Input Dictionary size");
        int size = scan.nextInt();
        
        int array[] = new int[size];
        
        for(int k=0;k<size;k++){
		 System.out.println("Input Dictionary Element "+(k+1));
            array[k]= scan.nextInt();
        }
        for(int k=0;k<size;k++){
           
         
           if(k<(size-1)){
          System.out.print(array[(size-k-1)]+" ");
           }
            if(k==(size-1)){
          System.out.print(array[(size-k-1)]);
           }
       
        scan.close();
    }
    }
}

