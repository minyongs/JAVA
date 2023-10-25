package day7;
import java.util.Scanner;
import java.util.Random;
public class kawibawibo {

	  public static void main(String[] args) {
	        String[] kbb = new String[] { "가위", "바위", "보" };
	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();

	        boolean play = true;

	        while (play) {
	            int com = rand.nextInt(3) + 1;
	            System.out.println("가위(1), 바위(2), 보(3), 끝내기(4) 중 하나를 선택하세요");
	            System.out.print(">> ");
	            int input = sc.nextInt();

	            if (input == 4) {
	                play = false;
	                System.out.println("시스템을 종료합니다");
	                break;
	            }

	            if (input < 1 || input > 3) {
	                System.out.println("1~3 사이의 숫자를 선택하세요.");
	                continue;
	            }

	            System.out.println("사용자: " + kbb[input - 1]);
	            System.out.println("컴퓨터: " + kbb[com - 1]);

	            if (input == com) {
	                System.out.println("비겼습니다.");
	            } else if ((input == 1 && com == 2) || (input == 2 && com == 3) || (input == 3 && com == 1)) {
	                System.out.println("졌습니다.");
	            } else {
	                System.out.println("이겼습니다.");
	            }
	        }

	        sc.close();
	    }
	}
			
		
		
		
		

		
	


