package group21_2018510107_2019510107_2019510075;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class OkeyPlace {

	public static ArrayList<Okey> okeys;

	public OkeyPlace() {
		this.okeys = new ArrayList<>();
		try {
			Connection con = Test.connection;
			Statement statement = con.createStatement();
			String sql = "select * from usersdatabase.okey;";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				Okey okey = new Okey(rs.getInt(1), rs.getInt(4), rs.getString(2), rs.getInt(3));
				okeys.add(okey);
			}
		} catch (Exception e) {
		}
	}

	public ArrayList<Okey> getOkeys() {
		return okeys;
	}

	public void setOkeys(ArrayList<Okey> okeys) {
		this.okeys = okeys;
	}
}
