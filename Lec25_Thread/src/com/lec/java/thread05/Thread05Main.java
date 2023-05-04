package com.lec.java.thread05;

/* join() 
	 지정한 시간 동은 쓰레드가 실행되도록 둔다.
	 지정한 시간이 지나거나, 작업이 종료되면 (쓰레드가 종료되면)  join()을 호출한 쓰레드로 돌아와 실행을 한다
	 특정 쓰레드가 종료한 시점을 기다릴 필요가 있을때  사용
*/

public class Thread05Main {

	public static void main(String[] args) {
		System.out.println("join() 메소드\n");

		Thread th1 = new MyThread("One");
		Thread th2 = new MyThread("Two");

		th1.start();
		th2.start();

		try{
			th1.join();  // 현재 쓰레드는 th1 쓰레드가 끝날때까지 기다려준다.
			th2.join();
		} catch(InterruptedException e){
			System.out.println(e.getMessage());
		}


		System.out.println("여기는 언제 실행될까요");

	} // end main()

} // end class


// Thread 클래스를 상속받는 클래스 정의
class MyThread extends Thread {
	public MyThread() {}

	public MyThread(String name) {
		setName(name);  // 쓰레드 이름 지정
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(getName() + "-" + i);
		} // end for
		System.out.println("<<" + getName() + ">> 종료");
	} // run()

} // end class MyThread














