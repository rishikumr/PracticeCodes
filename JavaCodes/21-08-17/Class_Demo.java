import java.io.*;
import java.util.*;


public class Class_Demo {
    private int age;	
  
	public Class_Demo(int initialAge) {
  		if(initialAge>0){this.age=initialAge;}
		if(initialAge<0){this.age=0;System.out.println("Age is not valid, setting age to 0.");}
        // Add some more code to run some checks on initialAge
	}

	public void amIOld() {
  		String s="";
        // Write code determining if this person's age is old and print the correct statement:
        if(this.age<13){s="You are young.";}
        else if(this.age>12 && this.age<18){s="You are a teenager.";}
        else if(this.age>17){s="You are old.";}
        System.out.println(s);
	}

	public void yearPasses() {
		
				 ++this.age;
			
     
	   
  		// Increment this person's age.
	}
	
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of person: ");
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			System.out.println("Enter the Age of person "+(i+1));
			int age = sc.nextInt();
			Class_Demo p = new Class_Demo(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			//p.amIOld();
			System.out.println();
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}