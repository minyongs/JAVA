package exam_polymorphism;
class Shape{
	String name;
	public Shape() {}
	public Shape(String name) {
		this.name = name;
	}
}

class Square extends Shape{
	public Square() {}
	public Square(String name) {
		super(name);
	}
}

class Triangle extends Shape{
	public Triangle() {}
	public Triangle(String name) {
		super(name);
	}
}
class Circle extends Shape{
	public Circle() {}
	public Circle(String name) {
		super(name);
	}
}

public class ShapeTest {

	public static void main(String[] args) {

		Square s = new Square();
		s.name = "정사각형";
				
		Triangle t = new Triangle();
		t.name = "삼각형";
		
		Circle c = new Circle();
		c.name = "원";
		
		Shape[] shapes = {s,t,c};
		
		for(int i = 0; i<shapes.length;i++){
			System.out.printf("%d번 인덱스의 도형 : %s\n",i,shapes[i].name);
		}
		}

}
