package aed.h2.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.TimeZone;

public class DbConnectionHelper {

	protected static String username = "sa";
	protected static String password = "";
	//TODO CHANGE URL
	protected static String databaseUrl = "jdbc:h2:mem:polaflix"; //<-- HAVE TO CHANGE THIS
	
	public static void setUsername(String username) {
		DbConnectionHelper.username = username;
	}

	public static void setPassword(String password) {
		DbConnectionHelper.password = password;
	}

	public static void setConnectionUrl(String connectionUrl) {
		DbConnectionHelper.databaseUrl = connectionUrl;
	}
	
	public static Connection createConnection() throws SQLException {
		
		TimeZone timeZone = TimeZone.getTimeZone("GMT+1:00");
		TimeZone.setDefault(timeZone);
		
		Properties connectionProps = new Properties();
		connectionProps.put("user", username);
		connectionProps.put("password", password);
		connectionProps.put("serverTimezone","UTC");
		
		return DriverManager.getConnection(databaseUrl, connectionProps); 

	}

}
