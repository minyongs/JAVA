package exam_class_extends_check;

class SuperX{
	private int x;
	public SuperX(int x) {
	this.x = x;
	System.out.println("x ="+x);
}
}
class SubY extends SuperX{
	private int y;
	public SubY(int x,int y) {
		super(x);
		this.y = y;
		System.out.println("y ="+y);
	}
}
public class Constructor {

	public static void main(String[] args) {

		new SubY(100,200);
	}

}
