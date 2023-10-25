package example;

public class CarTest {

	public static void main(String[] args) {

		Car myCar = new Car();// 여기서 참조변수는 myCar
		//myCar.speed = 0;
		myCar.color = "red";
		myCar.gear = 1;
		myCar.setSpeed(50);
		
		
		
		myCar.speedUp(20);
		myCar.printData();
		
		System.out.println(myCar.toString());//전체가 다 나오게 출력
		System.out.println();
		
		Car yourCar = myCar; // 새로운 참조변수도 이전 참조변수의 값을 불러올 수 있다
		/*yourCar.speed = 0;
		yourCar.color = "BLACK";
		yourCar.gear = 15;*/
		myCar.carData((0), 1, "red");
		
		myCar.speedUp(20);
		myCar.printData();
		
		}
	  
	
	
	
	}


