package exam_class_extends_check;


class Car{
	private String color;
	private int account;
	private String use;
	private String series;
	
	public Car(String color, int account) {
		this.color = color;
		this.account = account;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}
	
	public String show() {
		return String.format("[색상]"+color+"[생산수량] +account");
	}
}

class Monata extends Car{
	public Monata(String color,int account,String use,String series) {
		super(color,account);
		this.use = use;
		this.series = series;
	}
}
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
