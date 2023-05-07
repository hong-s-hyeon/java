package com.lec.java.file03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 java.io.InputStream
  |__ java.io.FileInputStream
 java.io.OutputStream
  |__ java.io.FileOutputStream
*/

public class File03Main {

    public static void main(String[] args) {
        System.out.println("File IO 2");

        // Java 7부터 도입된 try-with-resource
        // try (리소스 생성) { ... }
        // catch (exception ) { ... }
        // 리소스를 close하는 코드가 없어도 자동으로 close가 실행
        //
        // java.lang.AutoCloseable 나
        //  └─ java.io.Closeable 을 상속받은 어떠한 객체라도
        //  try(리소스 생성) 안에 '선언' 되어 있으면
        //  try~catch 가 끝나기 전에 close() 됨.

        // InputStream, OutputStream 둘다 Closeable 을 상속(implements) 한다

        try(
                // FileInputStream 인스턴스 생성
                InputStream in =
                        new FileInputStream("temp/big_text.txt");
                // FileOutputStream 인스턴스 생성
                OutputStream out =
                        new FileOutputStream("temp/copy_big_text.txt");
                ){

            byte[] buff = new byte[1024];   // buffer 준비! 얘는 한번에 1024byte 담을수 잇다


            int lengthRead;
            int bytesCopied = 0;
            long startTime = System.currentTimeMillis();   // 현재 시간 저장

            while(true){
                lengthRead = in.read(buff);
                // 매개변수로 주어진 byte[] 배열의 길이 만큼 read한다.
                // 실제 읽어 들인 데이터는 매개변수 byte[] 에 담김.
                // 읽어들인 바이트 개수 리턴,  읽어들인게 없으면 -1 리턴.
                // 1024, 1024, ..., 483, -1 요런 느낌이겟다
                if(lengthRead == -1){
                    break;
                }
                // 데이터 쓰기
                out.write(buff, 0, lengthRead); // 바로 위에서 읽어들인 데이터만큼 write
                // 읽어들이는 buff, 읽어드리는 길이 File에서 읽은 길이(lengthRead)만큼 offset = 0
                bytesCopied+=lengthRead;
            } // end while

            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;    // 경과시간.

            System.out.println("읽고 쓴 바이트: " + bytesCopied);
            System.out.println("경과 시간(ms): " + elapsedTime);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }   // >>>> 여기는 in.close / out.close 할 필요 없다! 왜? try with resource 구문 때문에!
        // 	finally 에서 close 하지 않아도 자동으로 close() 된다.

        System.out.println("\n프로그램 종료");

    } // end main()

} // end class
















