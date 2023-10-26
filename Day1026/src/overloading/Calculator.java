package overloading;

public class Calculator {

	public static void main(String[] args) {
		

		Calculation cal = new Calculation();
		
		System.out.println(cal.add(4, 5));
		System.out.println(cal.add(cal.multiply(3, 5),6));
	}

}
class Calculation{
	

public int add(int x, int y) {
	System.out.println("정수 더하기");
	int result = x + y ;
	return result;
}	
public int minus(int x,int y) {
	int result = x - y;
	return result;
}
public int multiply(int x,int y) {
	int result = x *y;
	return result;
	
}
public double devide(int x,int y) {
	double result =(double)x*y;
	return result;
}

public int add(int[] a) {
	int sum = 0;
	for(int i=0; i<a.length;i++) {
		sum+=a[i];
		
	}
	return sum;
}
	public int add(int x,int y,int z) {
		int result = x + y + z;
		return result;
	}
}
