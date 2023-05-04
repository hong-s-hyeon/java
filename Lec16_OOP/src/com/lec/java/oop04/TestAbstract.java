package com.lec.java.oop04;

abstract class TestAbstract {

    int test;

    public int getTest(){return test;}

    // 추상 메소드
    // 수식어 리턴타입 메소드이름(매개변수들, ...);
    // 추상 메소드에는 abstract라는 키워드를 반드시 써 줘야 함.
    public abstract int testMethod();
}

// 추상 클래스를 상속받는 클래스는 반드시 추상메소드를 구현(implement)해야 함
// 추상 메소드의 본체({ ... })를 만들어줘야 함
class TestClass extends TestAbstract {

    @Override
    public int testMethod() {
        return test;
    }
}

//부모 추상메소드를 상속받아 '구현' 하지 않은 경우 자신도 추상(abstract) 로 남아야 한다
abstract class TestClass2 extends TestAbstract{
    int number;
}












