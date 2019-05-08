
import java.util.*;
import java.lang.*;
import java.io.*;


public class MinNextMin {
    public static void main (String[] args) {
        //code
        int[] inp = {14,21,17,3,6,7};
        min(inp);
        //System.out.println("printing min :" + ret);
    }

    public static void min(int[] input) {
        int min = input[0];
        int nextMin = min;
        for(int i=0;i<input.length;i++) {
            if(input[i] < min) {
                min =input[i];
            }
            else if(input[i] < nextMin) {
                nextMin = input[i];
            }
        }
        System.out.println("printing min :" + min);
        System.out.println("printing nextMin :" + nextMin);
    }
}