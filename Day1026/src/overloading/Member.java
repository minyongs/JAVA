package overloading;

public class Member {
	private String name;
	private int age;
	
	public Member() {// 디폴트 생성자 안에 this 홍길동이 있으니 name을 홍길동으로 초기화
		this("홍길동");
		System.out.println("Member() 생성자 실행");
	}
	public Member(String name) {
		this (name,20);
		System.out.println("Member(name) 생성자 실행");
		
	}
	public Member(String name, int age) {
		this.name =name;
		this.age = age;
		System.out.println("Member(name,age) 생성자 실행");
	}
	public String toString() {
		return "이름 : "+name + "나이:"+age;
	}
}

