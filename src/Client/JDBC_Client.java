package Client;

import java.sql.ResultSet;
import java.util.Scanner;

import Service.JDBC_Service;

public class JDBC_Client {

	public static void main(String[] args) throws Exception {
		System.out.println("This program prints the name of all associate who's name starts with A.");
		JDBC_Service server = new JDBC_Service();
		ResultSet rs = server.AccessData();
		while(rs.next()) {
			System.out.print(rs.getString("Associate_Name")+" ");
			System.out.print(rs.getString("Associate_Location")+" ");
			System.out.print(rs.getString("Associate_track")+" ");
			System.out.println();
		}
		

	}

}
