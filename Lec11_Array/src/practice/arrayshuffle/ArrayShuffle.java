package practice.arrayshuffle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayShuffle {
    public static void main(String[] args) {
        String str = "김유진 문승주 박찬미 유승연\n" +
                "윤은기 이승준 이유나 한상규\n";

        String [] arr = str.split("\\s+");
        List<String> list = Arrays.asList(arr);
        Collections.shuffle(list);

        System.out.println(list);
    }
}
