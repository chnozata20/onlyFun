package group21_2018510107_2019510107_2019510075;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CinemaPlace {

	public static ArrayList<Movie> movies;

	public CinemaPlace() {
		this.movies = new ArrayList<>();
		try {
			Connection con = Test.connection;	
			Statement statement = con.createStatement();
			String sql = "select * from usersdatabase.movies;";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				Movie movie = new Movie(rs.getInt(1), rs.getString(2), rs.getString(3));
				movies.add(movie);
			}
		} catch (Exception e) {
		}
	}

	public ArrayList<Movie> getMovies() {
		return movies;
	}

	public void setMovies(ArrayList<Movie> movies) {
		this.movies = movies;
	}

}
