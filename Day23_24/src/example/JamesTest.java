package example;

public class JamesTest {

	public static void main(String[] args) {

		//참조변수 필요
		James jam = new James();
		jam.age = 30;
		jam.name ="James";
		jam.isMarried = true;
		jam.child = 3;
		
		jam.printData();
	}

}
