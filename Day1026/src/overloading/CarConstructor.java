package overloading;

public class CarConstructor {
	private int speed;
	private int gear;
	private String color;
	
	
	public CarConstructor(int speed,int gear,String color) {
		this.speed =speed;
		this.gear = gear;
		this.color = color;
	}
	public CarConstructor() {
		this(0,1,"red");
	}
	
	public String toSting() {
		return("자동차 정보 [속도 = "+speed +",기어 ="+gear + ",색상 = "+color+"]");
	}
}
