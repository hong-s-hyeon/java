package com.lec.java.oop02;

/* 다형성의 유용성
	다형성에 의해서, 자식타입 객체가 부모타입으로 자동 형변환 가능!
	부모(조상)타입 만으로도 상속된 모~든 자손 타입들을 담을수 있다.
*/

public class Polymorphism02Main {

	public static void main(String[] args) {
		System.out.println("다형성의 사용 (유용성)");

		Vehicle car1 = new Vehicle();
		Vehicle car2 = new Car();
		Vehicle car3 = new HybridCar();


		Vehicle[] cars = new Vehicle[3];
		cars[0] = new Vehicle();
		cars[1] = new Car();
		cars[2] = new HybridCar();

		// 하나의 타입의 변수에 여러가지 타입의 오버라이딩 된 메소드가 각각 동작시킬수 있다.
		for (int i = 0; i < cars.length; i++) {
			System.out.println();
			cars[i].displayInfo();
		}


		// 다형성의 유용함 2
		// 다형성의 유용함은 매개변수, 혹은 리턴 타입에도 적용된다
		// println의 매개변수로 Object의 참조변수가 넘겨지면,
		// 내부적으로 해당 클래스의 toString() 메소드가 불리게 됨
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);

		Vehicle car4 = new Vehicle();
		driveCar(car4);

		Car car5 = new Car();
		driveCar(car5);

		Vehicle car6 = new HybridCar();
		driveCar(car6);

		System.out.println("\n 프로그램 종료");
	} // end main()

	public static void driveCar(Vehicle v){
		v.setSpeed(100);
		v.displayInfo();
	}

} // end class


// 다형성으로 인해 아래와 같은 불필요한 메소드 overloading을 줄일 수 있다.
//	public static void driveCar(Vehicle v) {
//	v.setSpeed(100);
//	v.displayInfo();
//  }
//	public static void driveCar(Car v) {
//		v.setSpeed(100);
//		v.displayInfo();
//	}
//	public static void driveCar(HybridCar v) {
//		v.setSpeed(100);
//		v.displayInfo();
//	}









































