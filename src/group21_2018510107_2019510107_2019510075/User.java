package group21_2018510107_2019510107_2019510075;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class User {

	private String nickName;
	private String password;
	private String email;
	private String gender;
	private int credit = 0;

	public User(String nickName, String password, String email, String gender, int credit) {
		this.nickName = nickName;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.credit = credit;
	}
	
	boolean add() {
		try {
			Connection connection = Test.connection;
			String sql = "INSERT INTO users (userName, password, eMail, gender, credit) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, this.nickName);
			statement.setString(2, this.password);
			statement.setString(3, this.email);
			statement.setString(4, this.gender);
			statement.setInt(5, this.credit);
			statement.executeUpdate();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

}
