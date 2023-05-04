package com.lec.java.inner08;

/*
  위와 같이 특정 추상 메소드만 implement 하는 목적으로 설계되는 인터페이스의 이름은
  보통 ~ able 로 작명 경우가 많다.
  자바에서 제공하는 대표적으로 많이 사용하는 이러한 인터페이스들.
  Serializable, Cloneable, Readable, Appendable, Closeable,
  AutoCloseable, Observable, Iterable, Comparable, Runnable,
  Callable, Repeatable,
 */

public interface Calculable {
    public abstract double operate(double x, double y);
}
