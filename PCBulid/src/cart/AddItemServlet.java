package cart;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cart.Cart;

public class AddItemServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession ();
		
		if (session.getAttribute ("cart") == null || request.getAttribute ("category") == null || request.getAttribute ("id") == null)
			return;
		
		final String categoryName = (String) request.getAttribute ("category");
		final int itemID = (int) request.getAttribute ("id");
		
		final String url = "jdbc:mysql://us-cdbr-azure-east-a.cloudapp.net:3306/";  
        final String dbName = "web app testing"; 
        final String driver = "com.mysql.jdbc.Driver";  
        final String dbUserName = "b8ebfad0623483";  
        final String dbPassword = "b8df9f4f";
        
    	try {
			Class.forName (driver).newInstance ();
			Connection connection = DriverManager.getConnection (url + dbName, dbUserName, dbPassword);  
			
			PreparedStatement select = null;
			ResultSet item = null;
			
			switch (categoryName)
			{
				case "Cases":
					select = connection.prepareStatement ("Select * from pc_cases where cases_ID = ?");
					select.setInt (1, itemID);

					item = select.executeQuery ();
					item.next ();
					
					((Cart) session.getAttribute ("cart")).addItem (new Item (item.getLong ("cases_ID"), item.getString ("cases_name"), item.getString ("cases_model"), item.getString ("cases_imagepath"), item.getDouble ("cases_price")));
				break;
				
				case "CPU":
					select = connection.prepareStatement ("Select * from pc_cpu where cpu_ID = ?");
					select.setInt (1, itemID);
					
					item = select.executeQuery ();
					item.next ();
					
					((Cart) session.getAttribute ("cart")).addItem (new Item (item.getLong ("cpu_ID"), item.getString ("cpu_name"), item.getString ("cpu_model"), item.getString ("cpu_imagepath"), item.getDouble ("cpu_price")));
				break;
					
				case "GPU":
					select = connection.prepareStatement ("Select * from pc_gpu where gpu_ID = ?");
					select.setInt (1, itemID);
					
					item = select.executeQuery ();
					item.next ();
					
				((Cart) session.getAttribute ("cart")).addItem (new Item (item.getLong ("gpu_ID"), item.getString ("gpu_name"), item.getString ("gpu_model"), item.getString ("gpu_imagepath"), item.getDouble ("gpu_price")));
				break;
					
				case "Harddrive":
					select = connection.prepareStatement ("Select * from pc_harddrive where harddrive_ID = ?");
					select.setInt (1, itemID);
					
					item = select.executeQuery ();
					item.next ();
					
					((Cart) session.getAttribute ("cart")).addItem (new Item (item.getLong ("harddrive_ID"), item.getString ("harddrive_name"), item.getString ("harddrive_model"), item.getString ("harddrive_imagepath"), item.getDouble ("harddrive_price")));
				break;
					
				case "Headset":
					select = connection.prepareStatement ("Select * from pc_headset where headset_ID = ?");
					select.setInt (1, itemID);
					
					item = select.executeQuery ();
					item.next ();
					
					((Cart) session.getAttribute ("cart")).addItem (new Item (item.getLong ("headset_ID"), item.getString ("headset_name"), item.getString ("headset_model"), item.getString ("headset_imagepath"), item.getDouble ("headset_price")));
				break;
					
				case "Memory":
					select = connection.prepareStatement ("Select * from pc_memory where memory_ID = ?");
					select.setInt (1, itemID);
					
					item = select.executeQuery ();
					item.next ();
					
					((Cart) session.getAttribute ("cart")).addItem (new Item (item.getLong ("memory_ID"), item.getString ("memory_name"), item.getString ("memory_model"), item.getString ("memory_imagepath"), item.getDouble ("memory_price")));
				break;
					
				case "Motherboard":
					select = connection.prepareStatement ("Select * from pc_motherboard where motherboard_ID = ?");
					select.setInt (1, itemID);
					
					item = select.executeQuery ();
					item.next ();
					
					((Cart) session.getAttribute ("cart")).addItem (new Item (item.getLong ("motherboard_ID"), item.getString ("motherboard_name"), item.getString ("motherboard_model"), item.getString ("motherboard_imagepath"), item.getDouble ("motherboard_price")));
				break;
				
				case "PSU":
					select = connection.prepareStatement ("Select * from pc_psu where psu_ID = ?");
					select.setInt (1, itemID);
					
					item = select.executeQuery ();
					item.next ();
					
					((Cart) session.getAttribute ("cart")).addItem (new Item (item.getLong ("psu_ID"), item.getString ("psu_name"), item.getString ("psu_model"), item.getString ("psu_imagepath"), item.getDouble ("psu_price")));
				break;
					
				case "SSD":
					select = connection.prepareStatement ("Select * from pc_ssd where ssd_ID = ?");
					select.setInt (1, itemID);
					
					item = select.executeQuery ();
					item.next ();
					
					((Cart) session.getAttribute ("cart")).addItem (new Item (item.getLong ("ssd_ID"), item.getString ("ssd_name"), item.getString ("ssd_model"), item.getString ("ssd_imagepath"), item.getDouble ("ssd_price")));
				break;
			}
			request.getRequestDispatcher ("cart.jsp").forward (request, response);
		} 
    	catch (InstantiationException e) 
    	{
			e.printStackTrace ();
		} 
    	catch (IllegalAccessException e) 
    	{
			e.printStackTrace ();
		} 
    	catch (ClassNotFoundException e) 
    	{
			e.printStackTrace ();
		} 
    	catch (SQLException e) 
    	{
			e.printStackTrace ();
		}  
	}
}
