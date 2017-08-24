import java.util.*;
import java.io.*;


// User Created Exceptions

     class Insu extends Exception {
     public   void  Insu() {

       }
     
      public String getMessage(){
           String str = "n and p should be non-negative";
          return str;
       }
}


// Class name Calculator which takes input a and b AND gives the output a^b.

 class Calculator {
 
  int an=1;
  // method which throws Exception "Insu" if any input number is negative.
  
   public int power(int a, int b) throws Insu {
      
        
      if(a<0 | b<0) {
        throw new Insu();
          
      }
       else{
           
           for(int j=0;j<b;j++){
               an=an*a;

           }
       }
      
      return an;
   }
   
  
}


// Main class which takes input from the user a and b. AND pass these number to Calculator method power.
class Exceptions_2{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
