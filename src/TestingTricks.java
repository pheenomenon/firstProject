import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestingTricks {


    public static void main(String args[]) {
        String test = "abcd";
        int val = test.charAt(2);
        int i = 0;
        /*while (i < 128) {
            System.out.println("ASCII val of : " + (char) i + " " + "is : " + i);
            i++;

        }*/
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();

        //System.out.println("string charat :" + test.charAt(2) + " " + val);
        System.out.println(firstUniqChar("leetcode"));
    }

    public static int firstUniqChar(String s) {

        int[] charSet = new int[26];
        char[] cArr = s.toCharArray();
        int res = -1;
        int len = s.length();

        for (char c : cArr) {
            charSet[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (charSet[i] == 1) {
                res = i;
                break;
            }
        }
        return res;
    }
}




