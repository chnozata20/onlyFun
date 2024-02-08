package group21_2018510107_2019510107_2019510075;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login {

	private static String username;
	private static String password;
	public static User user;
	public static int id;

	public Login(String username, String password) throws SQLException {
		Login.password = password;
		Login.username = username;
	}

	public static boolean checkDatabase() throws Exception {
		Connection con = Test.connection;
		Statement st = con.createStatement();
		String sql = "SELECT * FROM usersdatabase.users where userName='" + username + "' and password='" + password
				+ "'";
		ResultSet rs = st.executeQuery(sql);
		if (rs.next()) {
			user = new User(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
			id=rs.getInt(1);
			ComputerPlace cp = new ComputerPlace();
			PlaystationPlace pp = new PlaystationPlace();
			OkeyPlace op = new OkeyPlace();
			BowlingPlace bp = new BowlingPlace();
			CinemaPlace cnmp = new CinemaPlace();
			updateDataBase();
			return true;
		} else {
			return false;
		}
	}
	public static void updateDataBase() throws Exception {
		Connection connection = Test.connection;
		Statement st = connection.createStatement();
		
		String sql = "DELETE FROM okey";
		st.executeUpdate(sql);
		
		sql = "INSERT INTO okey (idokey, desk_type, price, availability) VALUES (?, ?, ?, ?);";
		PreparedStatement statement = connection.prepareStatement(sql);
		for(int i = 1; i<= OkeyPlace.okeys.size(); i++) {
			statement.setInt(1, i);
			statement.setString(2, OkeyPlace.okeys.get(i-1).getDeskType());
			statement.setString(3, String.valueOf(OkeyPlace.okeys.get(i-1).getPrice()));
			statement.setInt(4, OkeyPlace.okeys.get(i-1).getAvailability());
			statement.executeUpdate();
			
		}
		
		sql = "DELETE FROM playstation";
		st.executeUpdate(sql);
		
		sql = "INSERT INTO playstation (idplaystation, price, availability) VALUES (?, ?, ?);";
		statement = connection.prepareStatement(sql);
		for(int i = 1; i<= PlaystationPlace.playstations.size(); i++) {
			statement.setInt(1, i);
			statement.setString(2, String.valueOf(PlaystationPlace.playstations.get(i-1).getPrice()));
			statement.setInt(3, PlaystationPlace.playstations.get(i-1).getAvailability());
			statement.executeUpdate();
		}
		
		sql = "DELETE FROM computers";
		st.executeUpdate(sql);
		
		sql = "INSERT INTO computers (idcomputers, graphic_card, monitor, cpu, ram, price, availability) VALUES (?, ?, ?, ?, ?, ?, ?);";
		statement = connection.prepareStatement(sql);
		for(int i = 1; i<= ComputerPlace.computers.size(); i++) {
			statement.setInt(1, i);
			statement.setString(2, ComputerPlace.computers.get(i-1).getGraphicCard());
			statement.setString(3, ComputerPlace.computers.get(i-1).getMonitor());
			statement.setString(4, ComputerPlace.computers.get(i-1).getProcessor());
			statement.setString(5, ComputerPlace.computers.get(i-1).getRam());
			statement.setString(6, String.valueOf(ComputerPlace.computers.get(i-1).getPrice()));
			statement.setInt(7, ComputerPlace.computers.get(i-1).getAvailability());
			statement.executeUpdate();
		}
		
		sql = "DELETE FROM bowling";
		st.executeUpdate(sql);
		
		sql = "INSERT INTO bowling (idbowling, availability, price) VALUES (?, ?, ?);";
		statement = connection.prepareStatement(sql);
		for(int i = 1; i<= BowlingPlace.bowlings.size(); i++) {
			statement.setInt(1, i);
			statement.setInt(2, BowlingPlace.bowlings.get(i-1).getAvailability());
			statement.setString(3, String.valueOf(BowlingPlace.bowlings.get(i-1).getPrice()));
			statement.executeUpdate();
		}
		
		sql = "DELETE FROM movies";
		st.executeUpdate(sql);
		
		sql = "INSERT INTO movies (idmovies, name, time) VALUES (?, ?, ?);";
		statement = connection.prepareStatement(sql);
		for(int i = 1; i<= CinemaPlace.movies.size(); i++) {
			statement.setInt(1, i);
			statement.setString(2, CinemaPlace.movies.get(i-1).getName());
			statement.setString(3, CinemaPlace.movies.get(i-1).getTime());
			statement.executeUpdate();
		}
		
		try {
			sql = "delete from usersdatabase.users where userId = " + String.valueOf(id);
			PreparedStatement ppst = connection.prepareStatement(sql);
			ppst.executeUpdate(sql);
			
			sql = "INSERT INTO users (userId ,userName, password, eMail, gender, credit) VALUES (?, ?, ?, ?, ?, ?);";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			statement.setString(2, user.getNickName());
			statement.setString(3, user.getPassword());
			statement.setString(4, user.getEmail());
			statement.setString(5, user.getGender());
			statement.setInt(6, user.getCredit());
			statement.executeUpdate();				
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Connection con = Test.connection;
		st = con.createStatement();
		sql = "SELECT * FROM usersdatabase.users where userName='" + username + "' and password='" + password
				+ "'";
		ResultSet rs = st.executeQuery(sql);
		if (rs.next()) {
			user = new User(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
			id=rs.getInt(1);
			ComputerPlace cp = new ComputerPlace();
			PlaystationPlace pp = new PlaystationPlace();
			OkeyPlace op = new OkeyPlace();
			BowlingPlace bp = new BowlingPlace();
			CinemaPlace cnmp = new CinemaPlace();
		}
		
		
	}

}
