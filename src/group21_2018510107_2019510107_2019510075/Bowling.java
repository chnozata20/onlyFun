package group21_2018510107_2019510107_2019510075;

public class Bowling implements Game {

	private int bowlingId;
	private boolean availability;
	private int price;
	private int remainingTime = 0;

	public Bowling(int bowlingId, int availability, int price) {
		if (availability == 1)
			this.availability = true;
		else
			this.availability = false;
		this.bowlingId = bowlingId;
		this.price = price;
	}

	public int getAvailability() {
		if(availability) {
			return 1;
		}
		else return 0;
	}
	public int getBowlingId() {
		return bowlingId;
	}

	public void setBowlingId(int bowlingId) {
		this.bowlingId = bowlingId;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
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
