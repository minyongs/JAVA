package day7;
import java.util.Scanner;
public class RepetitiveExample {
//메뉴에 있는 연산자를 선택하고 피연산자 두개를 입력받아 사칙연산을 하는 프로그램 코드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		double result = 0.0;

		
		while(true) {
			System.out.println("연산자를 1~4로,종료는 5를 선택해 주세요");
			System.out.println("1.+");
			System.out.println("2.-");
			System.out.println("3.*");
			System.out.println("4./");
			System.out.println("5.종료");
			System.out.println("선택>>");

			int input = sc.nextInt();
		
			if(input == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			
			System.out.println("사칙연산할 두 수를 입력하세요:");
			a =sc.nextInt();
			b =sc.nextInt();
			
			if (a < 1 || a >5 || b < 1 || b >5) {
	                System.out.println("1~5 사이의 숫자를 입력해 주세요.");
	                continue;
			}
		
		
			switch (input) {
			case 1: 
				result = a + b;
				break;
			case 2:
				result = a - b;
				break;
			case 3 :
				result = a*b;
				break;
			case 4 :
				result = (a/b);
				break;	
			
			}
			
			System.out.println(result);
			}
		
			
		}
		
		
		
	}

