package com.lec.optional02;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

import static java.util.Optional.of;

/* Optional<T>
 * 	자바의 고질적인 null 체크 피하기 위한 객체
 * 	Java8 에서 등장
 * 	null 값을 담을수 있는 값을 감싸는 래퍼객체
 * 	
 * class Optional<T> {
 * 		T value;
 * 		 ...
 * }
 * 
 * Optional 생성 메소드들
 * 		Optional.of(value) : value 가 null이면 NPE 발생 * 					
 * 		Optional.ofNullable(value) : value 가 null이면 empty Optional 생성
 * 		Optional.empty() : empty Optional 생성
 *
 *  Optional에 담길 값이 int, long, double 이라면 Boxing/Unboxing이 발생하는
 *  Optional<Integer>, Optional<Long>, Optional<Double>을 사용하지 말고,
 *  OptionalInt, OptionalLong, OptionalDouble을 사용하자.
 */

public class Optional02Main {
	public static void main(String[] args) {
		System.out.println("Optional<T> 생성");
		String str = "hello";

		Optional<String> o1, o2, o3;    // String 타입을 담을 수 있는 그릇.

		// 1. Optional.of(value) 를 사용하여 생성
		o1 = Optional.of(str);
		// Optional.of > static 메소드에 String타입 매개변수 => 그릇에 담는다

		System.out.println(o1);
		System.out.println(o1.get());    // Optional 내부 객체리턴
//		Optional.of(null); // value 가 null 이면 NPE
		System.out.println();

		// 2. Optional.ofNullable(value)
		// value 가 null이면 empty Optional 객체 반환
		o2 = Optional.ofNullable((str));
		System.out.println(o2);
		o2 = Optional.ofNullable(null);        // null을 담고 있는 Optional 객체
		System.out.println(o2);  // Optional.empty


//		System.out.println(o2.get());  // NoSuchElementException
		System.out.println();

		// 3.Optional.empty()  empty Optional 객체 반환
		o3 = Optional.empty();
		System.out.println(o3);    // Optional.empty
		System.out.println();

		// OptionalInt, OptionalDouble, OptionalLong
		System.out.println("OptionalInt, OptionalDouble, OptionalLong");
		Optional<Integer> optInteger = Optional.of(10);    // auto-boxing
		OptionalInt optInt = OptionalInt.of(10);            // auto-boxing 안해도됨. 인트를 담도록 만들엇자나
		OptionalLong optLong = OptionalLong.of(1234L);
		OptionalDouble optDouble = OptionalDouble.of(3.14);

		// int, double long만 제공한 이유? >> 적절하게 형변환 해서 담으라고~✨✨

		System.out.println(optInteger.get());       // auto-unboxing 발생
		System.out.println(optInt.getAsInt());        // auto-unboxing 발생 안함 >> 성능적으로 더 좋다
		System.out.println(optDouble.getAsDouble());
		System.out.println(optLong.getAsLong());


		System.out.println("\n프로그램 종료");
	} // end main()
} // end class










