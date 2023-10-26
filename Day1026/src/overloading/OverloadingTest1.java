package overloading;

public class OverloadingTest1 {

	public static void main(String[] args) {

		Mymath3 m3 = new Mymath3();
		
		System.out.println(m3.add(3, 5));
		System.out.println(m3.add(3.7, 4.2));
		System.out.println(m3.add(new int[] {10,20,30}));

	
		}}
		class Mymath3{
			int add(int a,int b) {
				return  a + b;
				
				
			}
			double add(double a,double b) {
				return a+b;
}
			int add(int[] a) {
				int sum = 0;
				for(int i =0;i<a.length;i++) {
					
					 sum += a[i];	
				}
				
				return sum;
				
				
			}
		}