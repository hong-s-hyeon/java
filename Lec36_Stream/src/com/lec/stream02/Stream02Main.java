package com.lec.stream02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Stream02Main {
	public static void main(String[] args) {


		int [] arr = {5, 2, 1, 4, 3, };

		// Arrays.stream(int[]) => IntStream 생성
		IntStream is = Arrays.stream(arr);

		// IntStream 의 메소드 sum(), count()
		int sum, min, max;
		long count;
		sum =  Arrays.stream(arr).sum();
		count =  Arrays.stream(arr).count();
		System.out.println("sum = " + sum + ", count = " + count);

		System.out.println();
		// min(), max() 은 OptionalInt 리턴
		min = Arrays.stream(arr).min().getAsInt();        // get()은 확실하게 empty 가 아닌 경우만 동작
		max = Arrays.stream(arr).max().getAsInt();
		System.out.println("min = " + min + ", max = " + max);

		System.out.println();
		// average() 은 OptionalDouble 리턴
		// 여기까지면 Optional 리턴
		double d = Arrays.stream(arr).average().orElse(0);
		System.out.println("d = " + d);
		Arrays.stream(arr).average().ifPresent(value -> System.out.println(value));
		IntStream.range(1, 10).forEach(i -> System.out.print(i + " "));

		System.out.println();
		// Integer collection  에 대해서는 곧바로 sum()  사용 불가
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

//		System.out.println(list.stream().sum());	// Integer 값을 단순히 sum하기 위해서 auto-unboxing이 안되
		// 여기서 Integer > int (primitive 타입)으로 변경
		System.out.println(list.stream().mapToInt(n->n.intValue()).sum());

		// map, filter, reduce 연산! stream03

		System.out.println("\n프로그램 종료");
	} // end main()
} // end class












