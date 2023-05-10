package CoreAPI.Arrays;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 4, 56, 7, 8, 45};
        Arrays.sort(nums);

        Arrays.stream(nums)
                .asLongStream()
                .forEach(x -> System.out.print(x + " "));

        System.out.println();


        String[] nam = {"1", "54", "3", "9", "2", "10"};
        Arrays.sort(nam);

        for (String i : nam)
            System.out.print(i + " ");

    }
}

