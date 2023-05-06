package com.lec.java.inner02;

public class Car {
	// 멤버 변수( outer )
	private String color;
	private Tire tire;

	// 생성자


	public Car(String color, int num) {
		this.color = color;
		this.tire = new Tire(num);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

	// 메소드
	public void displayCarInfo() {
		System.out.println("color: " + color);
	}

	public class Tire{

		private int tireNum;

		public Tire(int tireNum) {
			this.tireNum = tireNum;
		}

		public void displayInfo(){
			System.out.println("Car color : " + color);
			System.out.println("the number of tire : " + tireNum);
		}
	}

} // end class Car











