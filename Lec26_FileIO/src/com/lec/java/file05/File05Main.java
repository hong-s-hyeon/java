package com.lec.java.file05;

/* Buffered Stream + Buffer 예제
Program <=== FilterInputStream <=== InputStream <=== Source
					↓ 상속					↓ 상속
Program <=== BufferedInputStream <=== FileInputStream <=== File

Program ===> FilterOutputStream ===> OutputStream ===> Source
					↓ 상속					↓ 상속
Program ===> BufferedOutputStream ===> FileOutputStream ===> File

java.io.InputStream
 |__ java.io.FilterInputStream
      |__ java.io.BufferedInputStream

java.io.OutputStream
 |__ java.io.FilterOutputStream
      |__ java.io.BufferedOutputStream
*/

import java.io.*;

public class File05Main {

	public static void main(String[] args) {
		System.out.println("Buffered Stream + Buffer");
		
		// TODO:
		// file03 패키지 참조
		// try with resource 구문으로 작성
		// in.read(buff) --> bin.read(buff);
		// out.write( , , ) --> bout.write( , , ); 사용
		// finally 필요 없슴

		try(
				// FileInputStream 인스턴스 생성
				InputStream in =
						new FileInputStream("temp/big_text.txt");
				BufferedInputStream bin =
						new BufferedInputStream(in);
				// FileOutputStream 인스턴스 생성
				OutputStream out =
						new FileOutputStream("temp/copy_big_text.txt");
				BufferedOutputStream bout =
						new BufferedOutputStream(out);
		){
			byte[] buff = new byte[1024];  // 버퍼준비

			int lengthRead;
			int bytesCopied = 0;
			long startTime = System.currentTimeMillis();

			// 파일복사
			while(true){
				// 데이터 읽기
				lengthRead = bin.read(buff);
				if(lengthRead == -1){
					break;
				}

				// 데이터 쓰기
				bout.write(buff, 0, lengthRead);   // 바로 위에서 읽어들인 데이터만큼 write
				bytesCopied += lengthRead;
			} // end while

			long endTime = System.currentTimeMillis();
			long elapsedTime = endTime - startTime;

			System.out.println("읽고 쓴 바이트: " + bytesCopied);
			System.out.println("경과 시간(ms): " + elapsedTime);

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		
		System.out.println("\n프로그램 종료");

	} // end main()

} // end class File05Main
















