package exam_class_extends_check;

class ParentClass{
	protected int data;
	
	public ParentClass() {
		data = 100;
	}
	public void print() {
		System.out.println("수퍼 클래스의 print() 메소드");
	}
}
class ChildClass extends ParentClass{
	protected int data;
	
	public ChildClass() {
		data = 200 ;
	}
	public void print() {
		int data = 300;
		super.print();
		System.out.println("서브 클래스의 print() 메소드");
		System.out.println("서브 클래스의 print() 메소드");
		System.out.println("서브 클래스의 print() 메소드");
		System.out.println("서브 클래스의 print() 메소드");
	}
}
public class SuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
