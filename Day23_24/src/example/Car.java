package example;

public class Car {
	//멤버변수(어떠한 요소들이 있는지?)
	private int speed;
	public void setSpeed(int s) {
		speed = s;
		if(s>0) {
			speed = s;
		}
			else {
				speed = 0;
		}
	}
	private int gear;
	public void setGear(int g) {
		gear = g ;
		if(g>0) {
			gear = g;
		}
		else {
			gear = 0;
		}
	
	}
	public int getGear() {
		return gear;
		
	}
	public String color;
    // 메소드 (기능구현)
	public void speedUp(int s) {
		speed += s;//매개변수 s 를 받아서
	}
	public void speedDown(int s) {
		speed -= s;
	}
	public void printData() {
		System.out.println("속도: "+ speed +" 기어: "+ gear + " 색상: " + color);
		
	}
	public void carData(int s, int g, String c) {
		speed = s;
		gear = g;
		color = c;
	}
	public String toString() {
		return "속도:" + speed + "기어: " + gear + " 색상: " + color;
				
	}
}
