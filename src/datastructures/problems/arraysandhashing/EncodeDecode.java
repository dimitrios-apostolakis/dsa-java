package datastructures.problems.arraysandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecode {

    //time comp O(m) for each | space comp O(m+n) for each
    public static String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for (String s : strs){
            sb.append(s.length()).append("#").append(s);
        }
        return  sb.toString();
    }

    public static void main(String[] args) {
        List<String> strs = Arrays.asList("leet", "code", "love", "you");
        String encodedStr = encode(strs);
        System.out.println(encodedStr);
    }
}
