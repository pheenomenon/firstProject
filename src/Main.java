import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {

    public static void main (String[] args) {
        //code : abcd
        String str = "abcd";
        permute(str,"");
    }
    public static void permute(String str, String prefix) {

        if(str.length() == 0) {
            System.out.println(prefix);
        }
        for(int i=0; i< str.length(); i++) {
            String remaining = str.substring(0,i) + str.substring(i+1);
            //System.out.println(i+ " -- " + str.substring(0,i)+ " -- "+str.substring(i+1) );
            permute(remaining, prefix + str.charAt(i));
        }
    }
}