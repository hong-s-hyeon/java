package com.lec.java.file02;

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
            // FileOutputStream 인스턴스 생성
            // 해당 파일이 없으면, 새로 생성.
            //   ..      있었으면, 지우고 새로 생성.(덮어쓰기)
            out = new FileOutputStream("temp/copy_big_text.txt");

            int dataRead;
            int bytesCopied = 0;
            long startTime = System.currentTimeMillis();    // static 메소드네

            // 파일 복사
            //  InputStream 에서 한 byte 씩 읽어 들어와서
            //  OutputStream 에 한 byte 씩 쓰기
            while (true) {
                // 데이터 읽기: InputStream에 있는 read() 메소드 사용
                // read()는 InputStream 으로부터
                // 1byte 씩 읽어서 int(4byte) 에 담아 리턴한다
                // [ ... ][ ... ][ ... ][ 1byte ]
                dataRead = in.read();
                // 파일 읽기 Reads the next byte of data from the input stream.


                if (dataRead == -1) { // 더이상 읽을 것이 없으면 read() 는 -1 을 리턴한다.
//				If no byte is available because the end of the stream has been reached,
//				the value -1 is returned
                    // 더이상 파일에서 읽을 데이터가 없는 경우
                    break;
                }

                // 데이터 쓰기: OutputStream에 있는 write() 메소드 사용
                // write() 는
                // int(4byte)에 1byte씩 담아 OutputStream에 쓴다
                // [ ... ][ ... ][ ... ][ 1byte ]
                out.write(dataRead);
                bytesCopied++;
            } // end while

            long endTime = System.currentTimeMillis(); // 끝난 시간 저장
            long elapsedTime = endTime - startTime;

            System.out.println("읽고 쓴 바이트: " + bytesCopied);
            System.out.println("경과 시간(ms): " + elapsedTime);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 리소스 해제
            // 이거 자동으로 했으면 좋겟다... file03 >> try with resource
            try {
                if (out != null) out.close();
                if (in != null) in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("\n프로그램 종료");

    } // end main()

} // end class

