package example;
class PrimitiveSawp{
	// x y를 교환하는 메소드
	public void change(int x,int y) {
		System.out.println("\nBefore Change X ="+ x + "Y = "+y);
		int temp = x ;
		x = y; 
		y = temp;
		System.out.println("After Change X ="+x+"Y="+y);
	}
}
public class PrimitiveSwapTest {

	public static void main(String[] args) {

		PrimitiveSawp ps = new PrimitiveSawp();
		
		int x= 4;
		int y =7;
		ps.change(x, y);
		
		
		
	}

}
