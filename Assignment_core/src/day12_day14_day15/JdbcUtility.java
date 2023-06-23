package day12_day14_day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtility {
	public static Connection connectMysqlServer() throws Exception{
		String URL,Username,Password;
		URL = "jdbc:mysql://localhost:3306/assignment1?useSSL=false";
		Username = "root";
		Password = "28111996";
		return DriverManager.getConnection(URL, Username, Password);
	}
}
