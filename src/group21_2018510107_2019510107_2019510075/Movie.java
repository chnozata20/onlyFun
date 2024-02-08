package group21_2018510107_2019510107_2019510075;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Movie {

	private int id;
	private String name;
	private String time;
	public  ArrayList<Seat> seats;

	
	public Movie(int id, String name, String time) {
		seats = new ArrayList<>();
		this.id = id;
		this.name = name;
		this.time = time;
		try {
			Connection con = Test.connection;	
			Statement statement = con.createStatement();
			String sql = "select * from usersdatabase.seats"+String.valueOf(id)+";";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				Seat seat = new Seat(rs.getInt(1), rs.getInt(2), rs.getInt(3));
				seats.add(seat);
			}
		} catch (Exception e) {
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
