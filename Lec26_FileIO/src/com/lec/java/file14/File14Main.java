package com.lec.java.file14;

public class File14Main {

	public static void main(String[] args) {
		System.out.println("시스템 정보 확인");

		System.out.println();
		System.out.println(System.getProperty("os.name"));			// Windows 11
		System.out.println(System.getProperty("os.arch"));			// amd64
		System.out.println(System.getProperty("os.version"));		// 10.0

		System.out.println();
		System.out.println(System.getProperty("java.home"));		// C:\DevRoot\JDK\jdk-17.0.5 << jdk 경로
		System.out.println(System.getProperty("java.version"));		// 17.0.5

		System.out.println();
// current working directory
		System.out.println(System.getProperty("user.dir"));			// C:\DevRoot\javaworkspace\workspace\JavaWork

// user home directory("내 문서"가 있는 폴더)
		System.out.println(System.getProperty("user.home"));		// C:\Users\shh04

		System.out.println();
		System.out.println(System.getProperty("file.separator"));	// \






		System.out.println("\n프로그램 종료");
		
	} // end main()

} // end class














