package group21_2018510107_2019510107_2019510075;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PlaystationPlace {

	public static ArrayList<Playstation> playstations;

	public PlaystationPlace() {
		playstations = new ArrayList<>();
		try {
			Connection con = Test.connection;	
			Statement statement = con.createStatement();
			String sql = "select * from usersdatabase.playstation;";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				Playstation playstation = new Playstation(rs.getInt(1), rs.getInt(3), rs.getInt(2));
				playstations.add(playstation);
			}
		} catch (Exception e) {
		}
	}

	public ArrayList<Playstation> getPlaystations() {
		return playstations;
	}

	public void setPlaystations(ArrayList<Playstation> playstations) {
		PlaystationPlace.playstations = playstations;
	}

}
