package Service;

import java.sql.ResultSet;

import DAO.HelloJDBC;

public class JDBC_Service {

	public ResultSet AccessData() throws Exception{
		HelloJDBC obj = new HelloJDBC();
		ResultSet rs = obj.dataAccess();
		return rs;
	}
}
