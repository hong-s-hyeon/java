package com.lec.java.lambda04;

import java.util.Comparator;
import java.util.function.*;

/*  자바 에서 제공하는 기본적인 함수형 인터페이스들 >> 함수형 인터페이스여야 lambda expression 쓰는것

    1. Runnable
       기존부터 존재하던 인터페이스
       매개변수 없슴.  리턴타입 void.

    2. Supplier<T>
       매개변수 없슴.  리턴타입 (T타입).

    3. Consumer<T>
       매개변수 있슴(T타입).  리턴타입 void. >> 인 추상메소드가 딱! 1개✨✨ 있다~ >> 이런걸 함수형 인터페이스라고 한다.

    4. Function<T, R>
       하나의 매개변수 (T타입).  리턴타입 (R타입).

    5. Predicate<T>
       하나의 매개변수 (T타입). 리턴타입 boolean

    6. UnaryOperator<T>
      하나의 매개변수(T타입).  리턴타입 (매개변수와 동일한 T타입)

    7. BinaryOperator<T>
      동일타입 매개변수2개 (T타입).  리턴타입 (매개변수와 동일한 T타입)

    8. BiPredicate<T, U>
      서로다른타입 매개변수2개 (T, U타입).  Boolean 리턴타입

    9. BiConsumer<T, U>
       서로다른타입 매개변수2개 (T, U타입).  리턴타입 void

    10. BiFunction<T, U, R>
       서로다른타입 매개변수2개 (T, U타입).  리턴타입 R타입

    11. Comparator<T>
        자바의 전통적인 인터페이스중 하나 객체의 우선순위 비교.
        동일타입 매개변수2개 (T타입).  리턴타입 정수
 */
public class Lambda04Main {
    public static void main(String[] args) {
        // Runnable
        System.out.println("Runnable");
        System.out.println("매개 변수없고, void 타입 리턴");
        {
            Runnable r = () -> System.out.println("Hello functional");
            r.run(); // run()이 추상 메소드구나~
        }
        System.out.println();

        //  Supplier<T>
        System.out.println("Supplier<T>");
        System.out.println("매개 변수가 없고,  T타입을 리턴하는 인터페이스");
        {
            Supplier<String> s = () -> "Hello Supplier";
            System.out.println(s.get());
        }
        System.out.println();
        // Consumer<T>
        System.out.println("Consumer<T>");
        System.out.println("T 타입을 받아서 void타입을 리턴하는 인터페이스");
        {
            Consumer<String> c = (str) -> System.out.println(str);
            c.accept("Hello Consumer");
        }
        System.out.println();
        // Function<T, R>
        System.out.println("Function<T, R>");
        System.out.println("T 타입을 받아서 R 타입을 리턴하는 인터페이스");
        {
            Function<String, Integer> f = (str) -> Integer.parseInt(str);
            int result = f.apply("1");
            System.out.println(result);
        }
        System.out.println();

        //  Predicate<T>
        System.out.println("Predicate<T>");
        System.out.println("T 타입을 받아서 리턴타입이 boolean 타입 리턴");
        {
            Predicate<String> p = (str) -> str.isEmpty();
            boolean result = p.test("hello");
            System.out.println(result);
        }
        System.out.println();

        // UnaryOperator<T>
        System.out.println("UnaryOperator<T>");
        System.out.println("T 타입 1개를 받아서 , 동일한 T 타입을 리턴하는 인터페이스");

        {
            UnaryOperator<Integer> uo = num -> num + num;
            int result = uo.apply(10);
            System.out.println(result);
        }
        System.out.println();

        // BinaryOperator<T>
        System.out.println("BinaryOperator<T>");
        System.out.println("T 타입을 2개 받아서 T타입을 리턴하는 인터페이스");
        {
            BinaryOperator<Integer> bo = (num1, num2) -> num1 + num2;
            int result = bo.apply(10, 20);
            System.out.println(result);
        }
        System.out.println();

        // BiPredicate<T, U>
        System.out.println("BiPredicate<T, U>");
        System.out.println("서로다른 T 타입, U 타입의 매개변수를 받아서 boolean값을 리턴하는 인터페이스");
        {
            BiPredicate<String, String> bp = (s1, s2) -> s1.equals(s2);
            boolean result = bp.test("zz", "zzz");
            System.out.println(result);
        }
        System.out.println();

        //  BiConsumer<T, U>
        System.out.println("BiConsumer<T, U>");
        System.out.println("서로 다른 T 타입, U 타입을 매개변수로 받고, void를 리턴하는 인터페이스");
        {
            BiConsumer<String, String> bc = (s1, s2) -> System.out.println(s1.concat(s2));
            bc.accept("Java", "Python");
        }
        System.out.println();

        // BiFunction<T, U, R>
        System.out.println("BiFunction<T, U, R>");
        System.out.println("서로 다른 T 타입, U타입 변수를 받아서, R 타입을 리턴하는 함수형 인터페이스");
        {
            BiFunction<String, Integer, Boolean> bf = (s, n) -> ("" + n).equals(s);
            boolean result = bf.apply("1", 1);
            System.out.println(result);
        }
        System.out.println();

        // Comparator<T>
        System.out.println("Comparator<T>");
        {
            Comparator<Integer> cp = (n1, n2) -> (n1 < n2) ? n2 : n1;


        }
        System.out.println();

    }
}















