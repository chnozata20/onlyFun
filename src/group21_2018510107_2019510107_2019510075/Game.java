package group21_2018510107_2019510107_2019510075;

public interface Game {

	boolean rent(int idNumber);
	boolean pay(int money, int userId);
	boolean getInfo(int id);
}
