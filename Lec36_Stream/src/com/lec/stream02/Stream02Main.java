package com.lec.stream02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Stream02Main {
	public static void main(String[] args) {
		
		
		int [] arr = {5, 2, 1, 4, 3};

		// Arrays.stream(int[]) => IntStream 생성
		IntStream is = Arrays.stream(arr);

		// IntStream 의 메소드 sum(), count()
		int sum, min, max;
		long count;

		sum = Arrays.stream(arr).sum();
		count = Arrays.stream(arr).count();
		System.out.println("sum = " + sum + ", count = " + count);

		// min(), max() 은 OptionalInt 리턴
		min = Arrays.stream(arr).min().getAsInt();  // get() 은 확실하게 empty 가 아닌 경우만 동작
		max = Arrays.stream(arr).max().getAsInt();
		System.out.println("min = " + min + ", max = " + max);

		// average() 은 OptionalDouble 리턴
		Arrays.stream(arr).average().ifPresent(v -> System.out.println(v));

		IntStream.range(1, 10).forEach(i -> System.out.print(i + " "));
		System.out.println();


		System.out.println();
		// Integer collection  에 대해서는 곧바로 sum()  사용 불가
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

//		System.out.println(list.stream().sum());
		System.out.println(list.stream().mapToInt(n -> n.intValue()).sum());


		System.out.println("\n프로그램 종료");
	} // end main()
} // end class












