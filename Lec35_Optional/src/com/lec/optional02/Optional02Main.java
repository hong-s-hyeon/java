package com.lec.optional02;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

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
		
		Optional<String> o1, o2, o3;
		
		// 1. Optional.of(value) 를 사용하여 생성
		o1 = Optional.of(str);
		System.out.println(o1);
		System.out.println(o1.get());  // Optional 내부객체 리턴

//		Optional.of(null); // value 가 null 이면 NPE


		// 2. Optional.ofNullable(value)
		// value 가 null이면 empty Optional 객체 반환
		o2 = Optional.ofNullable(str);
		System.out.println(o2);

		o2 = Optional.ofNullable(null);
		System.out.println(o2);
		
		// 3.Optional.empty()  empty Optional 객체 반환
		o3 = Optional.empty();
		System.out.println(o3);

		// OptionalInt, OptionalDouble, OptionalLong
		Optional<Integer> optInteger = Optional.of(10);    // auto-boxing 발생
		OptionalInt optInt = OptionalInt.of(10);           // auto-boxing 발생 안함
		OptionalLong optLong = OptionalLong.of(1234L);
		OptionalDouble optionalDouble = OptionalDouble.of(3.14);

		System.out.println(optInteger.get());   // auto-unboxing 발생
		System.out.println(optInt.getAsInt());  // auto-unboxing 발생 안함

		System.out.println(optionalDouble.getAsDouble());
		System.out.println(optLong.getAsLong());

		System.out.println("\n프로그램 종료");
	} // end main()
} // end class









