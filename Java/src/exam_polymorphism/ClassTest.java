package exam_polymorphism;
class A{
	int a = 10;
	
	void b() {
		System.out.println("A");
	}
}

class AA extends A{
	int a = 20;
	
	@Override
	void b() {
		System.out.println("AA");
	}
	void c() {
		System.out.println("C");
	}
}

class BB extends A{
	int a = 30;
	
	@Override
	void b() {
		System.out.println("BB");
	}
	
	void d() {
		System.out.println("D");
	}
}
public class ClassTest {

	public static void main(String[] args) {

		A z = new AA();//(업캐스팅)부모타입에게 AA 의 주소를 줌 근데 A 타입이니까 접근범위 축소
		System.out.println(z.a);//부모클래스의 a 를 부름
		z.b();//오버라이딩 했기 때문에 AA
		
		((AA)z).c();//((AA)z).c();: z를 AA로 다운캐스팅하여 c 메서드를 호출하고 "C"를 출력
		System.out.println(((AA)z).a);//다시 AA로 다운캐스팅한 후 a를 출력하면 AA 클래스의 변수 a인 20이 출력
		
		AA a1 =(AA)z;//AA a1 = (AA)z;: z를 AA로 다운캐스팅하여 a1에 대입
		System.out.println(a1.a);//a1은 AA 타입이므로 a를 출력하면 AA 클래스의 변수 a인 20이 출력
		a1.c();//a1.c();: a1을 통해 c 메서드를 호출하고 "C"를 출력
		
		A q = new BB();//업캐스팅 형변환 생략 가능
		System.out.println(q.a);//z는 이제 BB 객체를 가리키고 있지만 정적 타입은 여전히 A이므로 부모 클래스 A의 변수 a인 10을 출력합니다.
		q.b();
		
		((BB)q).d();
		System.out.println(((BB)q).a);
		
		BB b1 = (BB)q;
		b1.d();
		System.out.println(b1.a);
	}

}
