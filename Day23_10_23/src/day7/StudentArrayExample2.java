package day7;
import java.util.Scanner;
public class StudentArrayExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int 학생수 = 3;
		final int 과목수 = 3;//다차원행렬의 입력값이 몇개인지 잘 모르겠을때
		
		int[][] scores = new int[학생수][과목수];
		String[] subjectName = {"국어","영어","수학"};
		int total = 0;
		
		for(int i = 0; i< 학생수; i++) {
			for(int j = 0; j<과목수; j++) {
				System.out.print((i+1)+"번째 학생의"+subjectName[j]+"성적을 입력하시오:");
				scores[i][j] = sc.nextInt(); 
				
			}
		}
		sc.close();
		
		System.out.println("\n====== 3명의 학생 데이터 출력======");
		System.out.println("국어\t영어\t수학");
	    for (int i = 0; i < 학생수; i++) {
            System.out.print((i + 1) + "번 학생:\t");
            int 학생합계 = 0;
            double avg = 0 ;
            for (int j = 0; j < 과목수; j++) {
                System.out.print(scores[i][j] + "\t");
                학생합계 += scores[i][j];
                avg = 학생합계/3 ;
            }
            
            System.out.println("합계: " + 학생합계);
            System.out.println("평균: " + avg);
				
			}
			
			
			
			
		}
		
		
	
	}
	
	


