package TestCases;

import java.util.Arrays;

public class MediaShortedArrays {
    public static void main(String[] args) {
        int[] n = {1, 3};
        int[] n2 = {2, 7};
        System.out.println(shorted(n, n2));
    }

    static double shorted(int[] num, int[] nums) {
        int[] concat = new int[num.length + nums.length];
        double sum = 0;
        int x = 0;

        for (int i = 0; i < num.length; i++) {
            concat[x++] = num[i];
        }
        for (int i = 0; i < nums.length; i++) {
            concat[x++] = nums[i];
        }

        for (int j = 0; j < concat.length; j++) {
            sum += concat[j];
        }

        return sum / (double) concat.length;
    }
}
