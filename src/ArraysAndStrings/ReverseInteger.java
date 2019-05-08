package ArraysAndStrings;

public class ReverseInteger {
    public int reverse(int x) {

        String str = Integer.toString(x);
        char[] arr = str.toCharArray();
        int len = arr.length;
        char[] res = new char[len];

        int j = 0;
        if (x < 0) {
            res[j++] = '-';
        }

        for (int i = len - 1; j < len; j++) {
            res[j] = arr[i--];
        }

        int result = 0;
        try {
            result = Integer.parseInt(String.valueOf(res));
        } catch (NumberFormatException e) {
            result = 0;
        }

        int MIN_VAL = -2147483648;
        int MAX_VAL = 2147483647;
        if (result <= MIN_VAL || result >= MAX_VAL) {
            result = 0;
        }

        return result;
    }

}
