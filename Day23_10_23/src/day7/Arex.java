package day7;

public class Arex {

	public static void main(String[] args) {
		int sum=0;
		int num=1;
		int[] arr = new int[5];
		for(int i=1;i<arr.length;i++) {
			arr[i] = num++;
			if(i%2 ==0) {
			
				sum += arr[i];
				System.out.print(sum);
			}
			
		}
		
	}

}
