package DAO;
import java.sql.*;
import java.util.*;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;*/

public class HelloJDBC {

	public static ResultSet dataAccess() throws Exception{
		
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/training_basic";
			String username = "root";
			String password = "Slimshadyjr99";
			
			//Step 1:
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("select*from associate_info\r\n"
					+ "where Associate_Name like \"A%\";");
			return rs;
		

	}

}
