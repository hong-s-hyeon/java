package com.lec.optional03;

/* Optional 의 주요 메소드
 *
 * -boolean isPresent()
 * 		내부객체가 null이 아닌지 확인한다. null이면 false를 반환한다.
 *
 * -void ifPresent(Consumer<T>)
 * 		Consumer<T>는 함수형 인터페이스 포스팅에서 봤듯 void 추상메서드를 갖고있다. null이 아닐때만 실행된다.
 *
 * -Optional<T> filter(Predicate<T>)
 * 	  내부객체가 해당 조건을 만족하는지 확인.  (Predicate 메소드는 boolean 을 리턴)
 *    Optional<U> 리턴
 *
 * -Optional<U> map(Function<T, U>)
 * 	  스트림과 같다. 내부 객체를 변환하는 용도로 사용한다.
 *    Optional<U> 리턴
 *
 * -T get()
 * 	  내부 객체를 반환한다. 다만 내부 객체가 null이면 NPE가 발생한다.
 * 	  null이 아니라는 확실한 경우에만 사용한다.
 *
 * -T orElse(T)
 * 	 내부 객체를 반환한다. 내부 객체가 null이면 인자로 들어간 기본값을 반환한다.
 *
 * -T orElseGet(Supplier<T>)
 * 	  orElse()와 동일한데 orElse()가 기본값 레퍼런스를 인자로 받는다면 orElseGet()은 내부 객체가 null일때 기본값을 반환할 객체를 인자로 받는다.
 *
 * -T orElseThrow(Supplier<U>)
 * 	 내부 객체가 null이면 인자로 전달받은 예외를 발생시킨다.
 *
 */

import common.Address;

import java.sql.SQLOutput;
import java.util.Optional;

// https://multifrontgarden.tistory.com/131?category=471239
public class Optional03Main {

	public static void main(String[] args) {

		System.out.println("Optional 의 주요 메소드");

		Address addr1 = new Address("역삼로");
		Address addr2 = null;
		Optional<Address> optAddr1, optAddr2;

//		optAddr2 = Optional.of(addr2);		// NullPointerException
		optAddr2 = Optional.ofNullable(addr2);

		System.out.println(optAddr2.isEmpty());
		System.out.println(optAddr2.isPresent());

		optAddr1 = Optional.of(addr1);
		System.out.println(optAddr1.isEmpty());
		System.out.println(optAddr1.isPresent());
		System.out.println();

		System.out.println("ifPresent : 존재한다면? consumer<T> 동작");
		optAddr1.ifPresent((s)-> System.out.println("주소 : " + s));
		System.out.println(optAddr1.get());
//		System.out.println(optAddr2.get()); // .NoSuchElementException
		System.out.println();

		System.out.println("orElse(T)");
		System.out.println(optAddr1.orElse(new Address("unKnown")));    // 애는 있기 때문에 있는거 나오고~
		System.out.println(optAddr2.orElse(new Address("unKnown")));    // 얘는 없었기 때문에 T타입의 것이 나오고
		System.out.println();

		System.out.println("orElseGet(Supplier<T>");
		System.out.println(optAddr2.orElseGet(() -> new Address("몰라요")));
		System.out.println();

		System.out.println("orElseThrow(T)");
//		optAddr2.orElseThrow(); // Exception in thread "main" java.util.NoSuchElementException: No value present
//		optAddr2.orElseThrow(()-> new NullPointerException("아무것도 없어"));

		System.out.println("filter(predicate<T>) >>> true 인 Optional 객체");
		System.out.println(optAddr1.filter(s-> s.getStreet().equals("역삼로")));
		System.out.println(optAddr1.filter(s-> s.getStreet().equals("강남대로")));

		System.out.println("map(function(T,R) >>> Optional[R]) -> ");
		System.out.println(optAddr1.map(s -> s.getStreet().length()));

		System.out.println("\n프로그램 종료");
	} // end main

} // end class
