package databasepack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Sqlwintascode {

	public static void main(String[] args) throws SQLException {
		

		        //create a connection
			    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MYDB","root","Emrakel11@");
			    //CreatE statement/Query  
			    Statement stmt=con.createStatement();
			    String s="INSERT INTO ADDRESS VALUES(9000, '5kilo', 'ADDIS ABABA', 'ADDIS ABABA', 444)";
			    //String s="UPDATE address SET CUST_ZIP=89089 WHERE CUST_ID=444";
			    //String s="Delete from address where CUST_ID=444";
			    //Execute statement/Query
			    stmt.execute(s);
			    //close connection
			    con.close();
			    System.out.println("Query executed...");
			    
			  }

			}
		
		
		
		
		
	
