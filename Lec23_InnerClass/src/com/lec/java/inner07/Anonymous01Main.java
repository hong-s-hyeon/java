package com.lec.java.inner07;

/* Anonymous inner class(익명 내부 클래스):
 * 	이름이 없는 local inner class
 * 	이름이 없기 때문에 생성자로 만들 수가 없습니다.
 * 	클래스의 정의와 동시에 인스턴스를 생성합니다.
 *
 * 익명 내부 클래스:
 * 	인스턴스 생성과 동시에 이름없는 클래스가 정의됨.
 *
 * 	new 인터페이스() { 익명 클래스 내부 작성 };
 * 	new 부모클래스() { 익명 클래스 내부 작성 };
 *
 * 익명 내부 클래스 (Anonymous Inner class) 는
 * 인터페이스 뿐 아니라, 일반 클래스, 추상클래스 등도 가능하다.
 *  상속 받은 (이름없는) 클래스의 인스턴스를 생성.
 *  - 멤버 변수/ 메소드 선언
 *  - 메소드 오버라이딩
 */
public class Anonymous01Main {

    public static void main(String[] args) {
        System.out.println("Anonymous Inner Class(익명 내부 클래스)");

        Person p = new Person("QWERTY");
        MyReadable r = p.createInstance(20);
        r.readInfo();

        p.createInstance(44).readInfo();

        //------------------------------------------------
        System.out.println();

        // 원래는 new 인터페이스 안된다. 그러나, 익명클래스로 구현하면 new 생성자 가능
        MyReadable r2 = new MyReadable() {
            int a = 10;
            @Override
            public void readInfo() {
                System.out.println("readinfo()");
                System.out.println("a = " + a);
            }
        };
        r2.readInfo();
        System.out.println(r2); // Anonymous01Main$1@5fd0d5ae

        //------------------------------------------------
        System.out.println();

        int n = 12;
//        n += 12;    // local inner class 에서는
                    // final or effectively final 만 가능하다
                    // 즉, 값을 변경하면 안된다는 의미
        new MyReadable(){
            int a = 200;

            @Override
            public void readInfo() {
                System.out.println(100 + a + n);
            }
        }.readInfo();





        //---------------------
        System.out.println();
        System.out.println(new MyClass().methodA(30));
        System.out.println(new MyClass(){

            int d = 400;

            @Override
            int methodA(int c) {
                return a + b + c + d;
            }
        }.methodA(30));

        System.out.println();
        System.out.println(new MyAbstract() {
            @Override
            int methodA(int a) {
                return (n + d) * a;
            }
        }.methodA(10));

        System.out.println();
        System.out.println(new MyAbstract() {
            //알다싶히 맴버변수도 추가 가능
            double dd = 11.34;

            @Override
            int methodA(int a) {
                return 0;
            }


            // 익명클래스에서 새로운 메소드 추가 가능
            double methodA2(double d){
                return n + this.d * d;
            }
        }.methodA2(12.2));






        System.out.println("\n프로그램 종료");
    } // end main()

} // end class

//익명 내부 클래스 (Anonymous Inner class) 는
//인터페이스 뿐 아니라, 일반 클래스, 추상클래스 등도 가능하다.
//상속 받은 (이름없는) 클래스의 인스턴스를 생성.
//	- 멤버 변수/ 메소드 선언
//	- 메소드 오버라이딩 

abstract class MyAbstract {

    int n = 10;
    int d = 2;

    abstract int methodA(int a);

} // end class

class MyClass {

    int a = 10;
    int b = 20;

    int methodA(int c) {
        return a + b + c;
    }

} // end class












