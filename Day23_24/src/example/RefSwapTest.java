package example;
public class RefSwap{
	public int x;//인스턴스변수(멤버변수)
	
	public void change(RefSwap rs2){//RefSwap rs2 를 매개변수로 받음
		System.out.println("\nBefore change x = " + rs2.x);
		rs2.x = 200;
		System.out.println("After Change x = " + rs2.x);
	}
	
	
	
}
public class RefSwapTest {

	public static void main(String[] args) {

		RefSwap rs = new RefSwap();
		rs.x = 10;
		System.out.println("Main Before Calling x = "+rs.x);
		rs.change(rs);
		System.out.println("\nMain Before Calling x = "+rs.x);
	}

}
