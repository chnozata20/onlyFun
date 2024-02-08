package group21_2018510107_2019510107_2019510075;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ComputerPlace {

	public static ArrayList<Computer> computers;

	public ComputerPlace() throws Exception {
		this.computers = new ArrayList<>();
		try {
			Connection con = Test.connection;	
			Statement statement = con.createStatement();
			String sql = "select * from usersdatabase.computers;";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				Computer computer = new Computer(rs.getInt(1), rs.getInt(7), rs.getInt(6), rs.getString(4), rs.getString(3),
						rs.getString(2), rs.getString(5));
				computers.add(computer);
			}
		} catch (Exception e) {
		}
	}

	public int numOfRowDataBaseTable() throws Exception {
		int counter = 0;
		try {
			Connection con = Test.connection;	
			Statement statement = con.createStatement();
			String sql = "select * from usersdatabase.computers;";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				
			}
		} catch (Exception e) {
		}
		return counter;
	}

	public void add(int price, String processor, String monitor, String graphicCar, String ram) {

	}

	public void delete(int id) {

	}
}
