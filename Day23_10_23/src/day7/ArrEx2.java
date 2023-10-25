package day7;

public class ArrEx2 {

	public static void main(String[] args) {
		int num = 1 ;
		/*int[][] arr3 =new int[2][];
		arr3[0] = new int[] {1,5};
		arr3[1] = new int[3];
		
		for(int i = 0;i <arr3.length; i++) {
			for(int k = 0; k< arr3[i].length; k++) {
				System.out.print("arr3[" + i +"][" + k + "] =" + arr3[i][k] 
						+" ");
			}
			System.out.println();*/
		int[][] arr =new int[5][5];
		for(int i = 0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]= num++;
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println( );
			
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0;j <=i;j++) {
				
				sum+=arr[i][j];
				}
			
		
				
			}
		System.out.println(sum);
		}
	            
		
	}


