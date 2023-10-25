package day7;
import java.util.Scanner;
public class KorMathEng {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int [][] personInfo = new int[3][4];
		int[][] score = new int[3][4];
		int sum = 0;
		double avg;
		
		for(int i = 0;i<3;i++) {
		     System.out.println("사람 " + (i + 1) + "의 점수를 입력하세요");
	           
	   
	            System.out.print("국어 점수: ");
	            personInfo[i][0] = sc.nextInt();
	            System.out.print("영어 점수: ");
	            personInfo[i][1] = sc.nextInt();
	            System.out.print("수학 점수: ");
	            personInfo[i][2] = sc.nextInt();
	           
	            sum += personInfo[i][i];
	            avg = sum /3 ;
	            
	            System.out.println("합계:"+sum+"평균:"+avg);
	            
	            
	            
		
		}
		for(int i = 0; i<3; i++) {
			
		}
			
			
		}
		
	}


