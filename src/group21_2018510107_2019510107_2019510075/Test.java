package group21_2018510107_2019510107_2019510075;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Test {

	static Connection connection;
	static String databaseName = "usersdatabase";
	static String url = "jdbc:mysql://localhost:3306/" + databaseName;
	static String username = "chnozata";
	static String password = "root";

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		try {
			IntroPage ip = new IntroPage();
			ip.setVisible(true);
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connected to the database");

		} catch (SQLException e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}

	}

}
