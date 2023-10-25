package example;
import java.util.Scanner;
public class ArrayTransmission01 {

	   public static void main(String[] args) {
	        final int STUDENTS = 5;
	        int[] scores = new int[STUDENTS];

	        getValues(scores); // 점수 입력을 위한 메서드 호출

	        double average = getAverage(scores); // 평균을 계산하기 위한 메서드 호출

	        System.out.println("평균 성적은 " + average + "입니다");
	    }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	 

	    // 입력을 받기 위한 메서드
	    private static void getValues(int[] scores) {
	        Scanner scan = new Scanner(System.in);
	        for (int i = 0; i < scores.length; i++) {
	            System.out.print("컴퓨터 점수를 입력하시오: ");
	            scores[i] = scan.nextInt();
	        }
	        scan.close();
	    }

	    // 평균을 구해 반환하는 메서드
	    private static double getAverage(int[] scores) {
	        int total = 0;
	        for (int i = 0; i < scores.length; i++) {
	            total += scores[i];
	        }
	        return (double) total / scores.length; // 평균을 계산하여 반환
	    }
	}
