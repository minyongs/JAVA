package overloading;

public class Car{
	private String model;
	private String color;
	private int maxSpeed;
	public Car(String model,String color,int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public String toString() {
		return String.format("모델 :%s  색상:%s  속도:%d",model,color,maxSpeed);
		
	}
	

}