package pcbuild;

import java.util.ArrayList;

import pcbuild.Product;

public class Cart 
{
	private ArrayList <Product> products;
	
	public Cart ()
	{
		products = new ArrayList <Product> ();
	}
	
	public ArrayList <Product> getProducts ()
	{
		return products;
	}
	
	public void addProduct (Product add)
	{
		products.add (add);
	}
	
	public void removeProduct (int removeIndex)
	{
		products.remove (removeIndex);
	}
	
	public double getTotal ()
	{
		double total = 0.0d;
		
		for (Product product : products)
			total += product.getPrice ();
		
		return total;
	}
}
