package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program 
{

	public static void main(String[] args) 
	{
	   Locale.setDefault(Locale.US);
	   Scanner ftg = new Scanner(System.in);
	   
	   int quantity;
	   char esc;
	   Product product;
	   product = new Product();
	   
	   System.out.println("Digite: ");
	   System.out.print("Name: ");
	   product.name = ftg.nextLine();
	   System.out.print("Price: ");
	   product.price = ftg.nextDouble();
	   System.out.print("Quantity: ");
	   product.quantity = ftg.nextInt();
	   
	   System.out.println("Dados: " + product);
	   System.out.println();
	   
	   esc = 'a';
	   
	   while(esc == 'a' || esc == 'r')
	   {
		   
	     System.out.println("Add or Rem: ");
	     esc = ftg.next().charAt(0);
	     
	     if(esc == 'a')
	     {	 
	    	 System.out.println("How: ");
	         quantity = ftg.nextInt();
	         product.addProducts(quantity);
	         System.out.println(product);
	
	}
	     
	     else 
	    	 if(esc == 'r') 
	    	 {
	    		 System.out.println("How: ");
	    		 quantity = ftg.nextInt();
	    		 product.removeProducts(quantity);
	    		 System.out.println(product);
	    		 
	    	 }
	       
	 
	     
	   
	
	 
	   
	   
	   
	   
	   }   //fim while
	   
	   
	   
	   
	   
	   
	   
	   ftg.close();
      
	}   //fim main
	
}    //fim prog






