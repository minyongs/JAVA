package simplephoneinfo;
import java.util.Scanner;
public class PhoneInfoMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		
		
		
		PhoneBookManager pm = new PhoneBookManager();
		while(true) {
		System.out.println("선택하세요. . . .");
		System.out.println("1. 데이터 입력");
		
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.println("선택 :");
		
		int input = sc.nextInt();
		sc.nextLine();
		
		switch(input){
			case 1 :pm.dataStore();
			break;
			case 2 :pm.dataSearch();
			break;
			case 3 :pm.dataDelete();
			break;
			case 4 :
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다");
		}
	}

}}
