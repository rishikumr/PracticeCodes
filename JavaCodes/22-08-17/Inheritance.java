//Task 
//You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.

//A Student class constructor, which has  parameters:
//A string, .
//A string, .
//An integer, .
//An integer array (or vector) of test scores, .
//A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average



//Ans: 


import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
        
    Student(String firstName, String lastName, int identification,int[] testScores )
    {
        /* String this.firstname = firstname;
        String this.lastname=lsatname;
        */
        
        super(firstName,lastName,identification);
        
        this.testScores=testScores;
       
       
        
        
    }
    public char calculate()
        
        
    { 
         int p=0;
        int length =testScores.length;
       
        int sum=0;
        
        long avg=0;
        for( p=0;p<length;p++)
        {
            sum=sum+testScores[p];
        }
        avg= (long) (sum/length);
        //System.out.println(avg);
        
        
        if(90 <= avg && avg <= 100)
        {
            return 'O';
        }
        else if(80 <= avg && avg < 90)
        {
            return 'E';
        }
        else if(70 <= avg && avg < 80)
        {
            return 'A';
        }
        else if(55 <= avg && avg < 70)
        {
            return 'P';
        }
        else if(40 <= avg && avg <= 55)
        {
            return 'D';
        }
        else
        {
            return 'T';
        }
     
    }
        

    
}


class Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("Input First Name");
		String firstName = scan.next();
		System.out.println("Input Last Name");
		String lastName = scan.next();
		System.out.println("Input ID ");
		int id = scan.nextInt();
		System.out.println("Total number of test taken by this person ");
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
		System.out.println("Input Test marks out of 100 each time ");
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}