package exam_class_extends_check;

class Person{
	private int age;
	private String name;
	
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	public String show() {
		return String.format("이름: "+name+"\n나이: "+ age);
		
	}
}

class Student extends Person{
	private int studentnum;
	
	public Student(String name, int age, int studentnum) {
		super(name,age);
		this.studentnum=studentnum;
	}
	
	public int getStudentnum() {
		return studentnum;
	}

	public void setStudentnum(int studentnum) {
		this.studentnum = studentnum;
	}

	public String show() {
		return super.show() + ", 학번 :"+studentnum;
	}
}

class Nationality extends Student{
	private String nation;
	
	
	public Nationality(String name,int age,int studentnum,String nation) {
		super(name,age,studentnum);
		this.nation =nation;
		
	}


	public String getNation() {
		return nation;
	}


	public void setNation(String nation) {
		this.nation = nation;
	}
	public String show() {
		return super.show() + ", 국적: "+ nation;
	}
}

public class StudentsInheritance {

	public static void main(String[] args) {
		

		Person person = new Person("홍길동",56);
		Student student = new Student("한늘봄",41,99010001);
		Nationality foreign = new Nationality("Olivia",39,97060004,"US");
		
		System.out.println("[사람"+person.show()+"]");
		System.out.println("[학생"+student.show()+"]");
		System.out.println("[외국학생"+foreign.show()+"]");
	}

}
