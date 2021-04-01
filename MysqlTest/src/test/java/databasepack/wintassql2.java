package databasepack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class wintassql2 {

	public static void main(String[] args) throws SQLException {
		      //create a connection
		      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MYDB","root","Emrakel11@");
		      //CreatE statement/Query  
		      Statement stmt=con.createStatement();
		      
		      String s="select CUST_Id,CUST_ZIP,CUST_STREET from address";
		      //Execute statement/Query & store data in resultset
		      ResultSet rs=stmt.executeQuery(s);
		      while(rs.next())
		      {
		        int cid=rs.getInt("CUST_Id");
		        String zip=rs.getString("CUST_ZIP");
		        String street=rs.getString("CUST_STREET");
		        System.out.println(cid+" "+zip+" "+street);
		      }
		      
		      //close connection
		      con.close();
		      System.out.println("Query executed...");
		      


	}

}
