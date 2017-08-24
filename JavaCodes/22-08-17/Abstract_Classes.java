// Task: Given a Book class and a Solution class, write a MyBook Inherits from Book and Has a 3 parameterized constructor taking 3 parameters:

import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}


   class MyBook extends Book {
        int price;
        
       
        
        MyBook(String title, String author,int price){
            
          super(title,author);
             this.price=price;
            
        }
      
        
        
        void display(){
            
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("Price: "+price);
        }
        
    }
	
	public class Abstract_Classes {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter Book Title , author and Price");
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
