package group21_2018510107_2019510107_2019510075;

public class Playstation implements Game {

	private int playstationId;
	private boolean availability;
	private int price;
	private int remainingTime = 0;

	
	public Playstation(int playstationId, int availability, int price) {
		this.playstationId = playstationId;
		if(availability==1)this.availability = true;
		else this.availability = false;
		this.price = price;
	}

	public int getPlaystationId() {
		return playstationId;
	}

	public void setPlaystationId(int playstationId) {
		this.playstationId = playstationId;
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
		this.remainingTime = time;
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
