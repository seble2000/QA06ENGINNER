package databasepack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnect {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MYDB","root","Emrakel11@");
		    Statement stmt=con.createStatement();
		   // String s="INSERT INTO ADDRESS VALUES(10000, 'piassa', 'ADDIS ABABA', 'ADDIS ABABA',222)"; to insert
		   // String s="UPDATE address SET CUST_STATE='BOLE' WHERE CUST_ID=222";
		    String s="DELETE FROM address WHERE CUST_ID=222";
		    stmt.execute(s);
		    con.close();
		    System.out.println("success");
	}

}
 