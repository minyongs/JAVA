package simplephoneinfo;
import java.util.Scanner;
public class PhoneBookVer02 {

	
	static Scanner keyboard = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("선택하세요. . . .");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.println("선택 :");
	}
	
	
	public static void readData() {
		System.out.println("이름 : ");
		String name = keyboard.nextLine();
		System.out.println("전화번호: ");
		String phone = keyboard.nextLine();
		System.out.println ("생년월일 :");
		String birthday = keyboard.nextLine();
		if(birthday.equals(""))
				birthday = null;
		Info i = new Info(name,phone,birthday);
		
		System.out.println("\n 입력된 정보 출력 .....");
		i.showPhoneinfo();}
		

	public static void main(String[] args) {

		int choice;
		
		while(true) {
			showMenu();
			choice = keyboard.nextInt();
			keyboard.nextLine();
			
			switch(choice) {
			case 1 : 
				readData();
				break;
				
			case 2 : 
				System.out.println("프로그램을 종료합니다");
				return;
			}
		}
	}

}