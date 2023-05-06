package com.lec.java.inner06;

public class Local02Main {

	public static void main(String[] args) {
		System.out.println("Local 내부 클래스의 활용");

		Person person = new Person("ABC");
		person.readAge(10);

		person.readAge(55);

		MyReadable  r = person.createInstance(16);
		r.readInfo();		// 외부 글래스에서도 local inner 클래스의 메소드 사용 가능

	} // end main()

} // end class Local02Main














