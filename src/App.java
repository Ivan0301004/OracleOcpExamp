import java.util.Arrays;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String[] words = { "hello", "bye", "good" };

        System.out.println(SmashWords(words));

        System.out.println(Arrays.toString(multiplyNumbers(1, 10)));
        System.out.println(Arrays.toString(multiplyNumbers(2, 5)));

        System.out.println(isEven(7));
        System.out.println(isEven(6));

        System.out.println(countingSheep(3));

        String nums = "1 2 3 4 5";

        System.out.println(highAndLow(nums));
    }

    static String SmashWords(String... words) {
        /*
         * String res = "";
         * for (int i = 0; i < words.length; i++) {
         * res += words[i] + " ";
         * }
         * return res;
         */

        String res = "";

        for (String word : words) {
            res += word + " ";
        }
        return res.trim();
    }

    static int[] multiplyNumbers(int x, int n) {
        int[] res = new int[n];

        int j = 0;
        for (int i = 0; i < n; i++) {
            res[i] = (j += x);
        }
        return res;
    }

    static boolean isEven(int n) {
        return (n & 1) == 0;

    }

    public static String countingSheep(int num) {
        // Add your code here
        // if (num < 0)
        // return -1;

        String sheep = " sheep...";
        String res = "";
        for (int i = 1; i <= num; i++) {
            res += (i + sheep);
        }

        return res;
    }

    public static String highAndLow(String number) {
        int[] nums = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            nums[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        return "";
    }
}
