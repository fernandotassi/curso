package entities;


public class Product 
{
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() 
	{
		double result;
		
		result = price * quantity;
		
		return result;
		
	}   //fim tot
	
	public void addProducts(int quantity)
	{
		this.quantity += quantity;
		
	}    //fim add
	
	public void removeProducts(int quantity)
	{
		this.quantity -= quantity;
		
	}   //fim rem
	
	public String toString()
	{
		return name + " , R$ " + String.format("%.2f", price) + " , " + quantity +
			   " unidade , Total em: R$ " + String.format("%.2f", totalValueInStock()); 	
		
	}
	
	   
 } //fim prod
