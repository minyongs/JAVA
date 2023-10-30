package simplephoneinfo;
import java.util.Scanner;
public class PhoneBookManager {
Scanner sc = new Scanner(System.in);
private String name, phone, birth;
private Info[] infoArr;
private int count; int i;int idx;
PhoneBookManager(){
	infoArr = new Info[100];
	count = 0;
}


public void dataStore() {
	System.out.println("이름 :");
	String name = sc.nextLine();
	System.out.println("전화번호 :");
	String phone = sc.nextLine();
	System.out.println("생년월일 :");
	String birth = sc.nextLine();
	
	Info info = new Info(name,phone,birth);
	infoArr[count++] = info; 
	System.out.println("데이터의 입력이 완료되었습니다");
	
	
}
	
					
public void dataSearch() {
	System.out.println("데이터 검색을 시작합니다.");
	System.out.println("이름 :");
	String name = sc.nextLine();
	
	
	for(i=0; i<count; i++) {
		if(name.equals(infoArr[i].getName())) {
			infoArr[i].showPhoneinfo();
			System.out.println("데이터 검색이 완료되었습니다.");
			break;
		}
		
	}
	
}
			
		
public void dataDelete() {
	System.out.println("이름을 입력하세요:");
	name = sc.nextLine();
	for(i=0;i<count;i++) {
		if(name.equals(infoArr[i].getName())) {
			idx = i;
		}
	}
	for(i=idx; i<count-1; i++) {
		infoArr[i] = infoArr[i+1];
	

infoArr[count] = null;
count--;
System.out.println("데이터 삭제가 완료되었습니다.");
}}}
		


	


