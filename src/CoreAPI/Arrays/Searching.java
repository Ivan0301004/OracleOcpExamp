package CoreAPI.Arrays;

import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 32, 3};
        // 1  2  3  5 (6) 32 -> [0, 1, 2, 3, 5]
        Arrays.sort(numbers);

        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 5));
        System.out.println(Arrays.binarySearch(numbers, 6));
        System.out.println(Arrays.binarySearch(numbers, 7) + "\n\n");


        int[] test = {3, 2, 1};
        System.out.println(Arrays.binarySearch(test, 2));
        System.out.println(Arrays.binarySearch(test, 10));
    }
}
