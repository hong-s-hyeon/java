package com.lec.java.file02;
// 파일 복사의 기본 동작 예제

/* FileIO
 Program <=== InputStream <=== Source
 Program ===> OutputStream ===> Source
 Program <=== FileInputStream <=== File
 Program ===> FileOutputStream ===> File

족보(exception, collection, input/out stream)
 java.io.InputStream
  |__ java.io.FileInputStream: 파일로부터 데이터를 읽어오는 통로
 java.io.OutputStream
  |__ java.io.FileOutputStream: 파일로 데이터를 쓰는 통로
*/


import java.io.*;

public class File02Main {

    public static void main(String[] args) {
        System.out.println("File IO");

        InputStream in = null;
        OutputStream out = null;

        try {
            in = new FileInputStream("temp/big_text.txt");
            // throws java.io.FileNotFoundException >> exception handling

            out = new FileOutputStream("temp/copy_big_text.txt");
            // FileOutputStream 인스턴스 생성
            // 해당 파일이 없으면, 새로 생성.
            //   ..      있었으면, 지우고 새로 생성.
            int dataRead; // 읽어온 데이터
            int bytesCopied = 0; // 몇 바이트 읽어왓는지 확인하기 위해서
            long startTime = System.currentTimeMillis(); // 현재 시간 저장

            // 파일 복사
            //  InputStream 에서 한 byte 씩 읽어 들어와서
            //  OutputStream 에 한 byte 씩 쓰기
            while(true){
                dataRead = in.read();
                // 1byte 씩 읽어온다는데, 왜 4byte짜리 int를 쓰지??????
                // 데이터 읽기: InputStream에 있는 read() 메소드 사용
                // read()는 InputStream 으로부터
                // 1byte 씩 읽어서 int(4byte) 에 담아 리턴한다
                // [ ... ][ ... ][ ... ][ 1byte ]
                if(dataRead == -1){ // 더이상 읽을 것이 없으면 read() 는 -1 을 리턴한다.
                    // 더이상 파일에서 읽을 데이터가 없는 경우
//                    If no byte is available
//                    because the end of the stream has been reached,
//                    the value -1 is returned.
                    break;
                }

                out.write(dataRead);
                // 데이터 쓰기: OutputStream에 있는 write() 메소드 사용
                // write() 는
                // int(4byte)에 1byte씩 담아 OutputStream에 쓴다
                // [ ... ][ ... ][ ... ][ 1byte ]

                bytesCopied++;
            }
            long endTime = System.currentTimeMillis();  // 끝난 시간 저장
            long elapsedTime = endTime - startTime;     // 경과 시간

            System.out.println("읽고 쓴 바이트: " + bytesCopied);
            System.out.println("경과 시간(ms): " + elapsedTime);
            // 수행후에 실제 생성된 파일의 크기를 보자 1,978,086 byte 인가?

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 리소스 해제       >> 이런거 자동으로 해주는 try구문없나? >> file03: try with resource
            try {
                if(out != null) out.close();
                if(in != null) in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        System.out.println("\n프로그램 종료");

    } // end main()

} // end class

