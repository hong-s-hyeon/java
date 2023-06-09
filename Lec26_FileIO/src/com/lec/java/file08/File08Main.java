package com.lec.java.file08;

import java.io.*;
import java.util.ArrayList;

/* Object Filter Stream
 Program <=== ObjectInputStream <=== FileInputStream <=== File
 Program ===> ObjectOutputStream ===> FileOutputStream ===> File

java.lang.Object
 └─ java.io.OutputStream
    └─ java.io.ObjectOutputStream
 
java.lang.Object
 └─ java.io.InputStream
     └─ java.io.ObjectInputStream


 Object Stream: 객체의 입출력을 위한 스트림
 사용법은 다른 Filter Stream(Buffered I/O, Data I/O)과 비슷
 Object 스트림의 입출력 대상이 되는 클래스는 Serializable 인터페이스를 구현
 클래스의 일부 멤버 변수를 직렬화(Serialization)의 대상에서 제외시키려면,
 transient 키워드를 사용
*/
public class File08Main {

    public static final String FILEPATH = "temp/member.dat";

    public static void main(String[] args) {
        System.out.println("Object Filter Stream");

        try(
            OutputStream out = new FileOutputStream(FILEPATH);
            InputStream in = new FileInputStream(FILEPATH);
            ObjectOutputStream oout = new ObjectOutputStream(out);
            ObjectInputStream oin = new ObjectInputStream(in);
                ){
            Member m1 = new Member("root", "root1234");
            Member m2 = new Member("guest", "guest");
            Member m3 = new Member("admin", "admin123456");

            oout.writeObject(m1);
            oout.writeObject(m2);
            oout.writeObject(m3);
            // 이 상태로만은 error
            //           >>java.io.NotSerializableException: com.lec.java.file08.Member
            //              Member class에  Serializable implements 하기

            // 파일로부터 Objecty 읽어오기
            Member dataRead;
// 방법1: 매번 readObject() 호출
//            dataRead = oin.readObject(); // >> Object 타입 >> downCasting!@!
//            dataRead = (Member)(oin.readObject());
//            dataRead.displayInfo();
//            // 할 때마다 그 다음 것을 읽어 온다
//            dataRead = (Member)(oin.readObject());
//            dataRead.displayInfo();
//            dataRead = (Member)(oin.readObject());
//            dataRead.displayInfo();
            // ✨✨✨✨✨✨
            // 하지만 우리는 얼마나 더 있는지 알 수 있어?? 모른다. 그래서 다음 방법 중요

// 방법2 : 무한루프로 readObject() 호출하고  EOFException 으로 잡기.
// EOFException 으로 끝까지 read한것을 체크
// EOF : End Of File
            while(true){
                dataRead = (Member)(oin.readObject());
                dataRead.displayInfo();
            }

        }catch (EOFException e){    // EOFException 는 IOException을 상속받았다.
            // 그래서 IOException 위로 catch를 잡아야 한다!!
            System.out.println("파일을 끝까지 읽었습니다.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // 우리는 이런 객체들을 List<> 에 담아서 쓴다! file09
        System.out.println("\n프로그램 종료");

    } // end main()

} // end class
















