package day7;

public class ArrayInArraySum {

	public static void main(String[] args) {
		
		
		
		System.out.println("============실행 전===========");
		int[][] before = new int[][] {{10,10,10,10,0},{30,30,30,30,0},
		{40,40,40,40,0},{50,50,50,50,0},{0,0,0,0,0}
		};
		for(int i=0;i<before.length;i++) {
			for(int j =0;j<before[i].length;j++) {
			System.out.print(before[i][j]+"\t");
			
		}
		
		System.out.println();
		
	}
		for(int i=0; i<before.length-1; i ++){
			for(int j = 0; j<before[i].length -1;j++) {
				before[i][4] += before[i][j];//현재 행의 값을 마지막 열의 값에 더함
				before[4][j] += before[i][j];//현재 열의 값을 마지막 행의 값에 더함
			}
		}

	}}
