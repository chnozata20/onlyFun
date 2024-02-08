package group21_2018510107_2019510107_2019510075;

public class Seat implements Game {

	private int seatId;
	private boolean availability;
	private int price;

	public Seat(int seatId, int availability, int price) {
		this.seatId = seatId;
		if(availability==1)this.availability = true;
		else this.availability = false;
		this.price = price;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public boolean isAvailability() {
		return availability;
	}
	public int getAvailability() {
		if(availability) {
			return 1;
		}
		else return 0;
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

	@Override
	public boolean rent(int time) {
		// TODO Auto-generated method stub
		this.availability=false;
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
