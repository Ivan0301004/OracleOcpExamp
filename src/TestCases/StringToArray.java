package TestCases;

import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {

        String nums = "3 4 56 12 3 5 6 34";
        String highAndLow = MinAndMax(nums);
        System.out.print("Max & Min : " + highAndLow);

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        evenArraySum(arr, arr2);

    }


    static String MinAndMax(String nums) {
        String[] tes = nums.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String val : tes) {
            int num = Integer.parseInt(val);
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }
        return String.valueOf(max) + " " + String.valueOf(min);
    }

    static String minMaxSolution(String numbers) {
        String[] num2 = numbers.split(" ");
        int[] arrInt = new int[num2.length];

        for (int i = 0; i < num2.length; i++) {
            arrInt[i] = Integer.parseInt(num2[i]);
        }

        Arrays.sort(arrInt);

        String max = String.valueOf(arrInt[arrInt.length - 1]);
        String min = String.valueOf(arrInt[0]);

        return max + " " + min;
    }

    static void evenArraySum(int[] first, int[] second) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < first.length; i++) {
            if ((first[i] & 1) == 0 && (second[i] & 1) == 0)
                evenSum += first[i] + second[i];
            else
                oddSum += first[i] + second[i];
        }
        System.out.println("The even sum is : " + evenSum);
        System.out.println("The odd  sum is : " + oddSum);
    }
}
