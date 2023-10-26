package overloading;

public class CarConstuctorTest {

	public static void main(String[] args) {

		CarConstructor cc= new CarConstructor(60,1,"blue");
		CarConstructor cc2= new CarConstructor();
		
		System.out.println(cc.toSting());
		System.out.println(cc2.toSting());
		
	}

}
