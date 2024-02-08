package group21_2018510107_2019510107_2019510075;

public class Okey implements Game {

	private int okeyId;
	private boolean availability;
	private String deskType;
	private int price;
	private int remainingTime = 0;

	public Okey(int okeyId, int availability, String deskType, int price) {
		this.okeyId = okeyId;
		if (availability == 1)this.availability = true;
		else this.availability = false;
		this.deskType = deskType;
		this.price = price;
	}

	public int getOkeyId() {
		return okeyId;
	}

	public void setOkeyId(int okeyId) {
		this.okeyId = okeyId;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	public int getAvailability() {
		if(availability) {
			return 1;
		}
		else return 0;
	}
	public String getDeskType() {
		return deskType;
	}

	public void setDeskType(String deskType) {
		this.deskType = deskType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRemainingTime() {
		return remainingTime;
	}

	public void setRemainingTime(int remainingTime) {
		this.remainingTime = remainingTime;
	}

	@Override
	public boolean rent(int price) {
		// TODO Auto-generated method stub
		this.remainingTime = price;
		this.availability = false;
		return true;
	}

	@Override
	public boolean pay(int money, int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
