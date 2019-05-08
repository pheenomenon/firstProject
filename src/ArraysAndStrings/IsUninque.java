package ArraysAndStrings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IsUninque {
    public static void main(String args[]) {
        String input = "kahani";
        char[] strtochar = input.toCharArray();
        System.out.println("11111 :" + isUniqueUsingHash(strtochar));
    }

    static boolean isUniqueUsingHash(char[] inp){
        boolean isUniq = true;
        HashMap<Character,Integer> lookupTable = new HashMap<>();
        for(char ch : inp) {
            if(lookupTable.containsKey(ch)){
                int newVal = lookupTable.get(ch);
                lookupTable.put(ch,++newVal);
            } else {
                lookupTable.put(ch,1);
            }
        }

        Set entryset = lookupTable.entrySet();
        Iterator<Map.Entry<Character,Integer>> itr = entryset.iterator();

        while(itr.hasNext()) {
            Map.Entry<Character,Integer> entry = itr.next();
            System.out.println("Value is : " + entry.getValue());
            if(entry.getValue() > 1) {
                isUniq = false;
            }
        }


        return isUniq;
    }
}
