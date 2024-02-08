package group21_2018510107_2019510107_2019510075;

public class Computer implements Game{
	private int pcId;
	private boolean availability;
	private int price;
	private String processor;
	private String monitor;
	private String graphicCard;
	private String ram;
	private int remainingTime = 0;
	
	public Computer(int pcId, int availability, int price, String processor, String monitor, String graphicCard,
			String ram) {
		this.pcId = pcId;
		if(availability==1)this.availability = true;
		else this.availability = false;
		this.price = price;
		this.processor = processor;
		this.monitor = monitor;
		this.graphicCard = graphicCard;
		this.ram = ram;
	}

	public int getPcId() {
		return pcId;
	}

	public void setPcId(int pcId) {
		this.pcId = pcId;
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

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getGraphicCard() {
		return graphicCard;
	}

	public void setGraphicCard(String graphicCard) {
		this.graphicCard = graphicCard;
	}

	public String getRam() {
		return ram;
	}
	

	public int getRemainingTime() {
		return remainingTime;
	}

	public void setRemainingTime(int remainingTime) {
		this.remainingTime = remainingTime;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	@Override
	public boolean rent(int price) {
		// TODO Auto-generated method stub
		this.remainingTime = price;
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
