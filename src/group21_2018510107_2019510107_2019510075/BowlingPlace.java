package group21_2018510107_2019510107_2019510075;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BowlingPlace {

	public static ArrayList<Bowling> bowlings;

	public BowlingPlace() {
		BowlingPlace.bowlings = new ArrayList<>();
		try {
			Connection con = Test.connection;
			Statement statement = con.createStatement();
			String sql = "select * from usersdatabase.bowling;";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				Bowling bowling = new Bowling(rs.getInt(1), rs.getInt(2), rs.getInt(3));
				bowlings.add(bowling);
			}
		} catch (Exception e) {
		}
	}

	public static ArrayList<Bowling> getBowlings() {
		return bowlings;
	}

	public static void setBowlings(ArrayList<Bowling> bowlings) {
		BowlingPlace.bowlings = bowlings;
	}


}
