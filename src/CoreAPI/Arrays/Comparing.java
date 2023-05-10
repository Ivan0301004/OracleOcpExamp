package CoreAPI.Arrays;

import java.util.Arrays;

public class Comparing {
    /*
     * Java also provides methods to compare two arrays to determine which is “smaller.” First we
     * cover the compare() method, and then we go on to mismatch(). These methods are overloaded
     * to take a variety of parameters.
     */

    /**
     * If both arrays are the same length and have the same values in each spot in the same
     * order, return zero.
     * If all the elements are the same but the second array has extra elements at the end,
     * return a negative number.
     * If all the elements are the same, but the first array has extra elements at the end, return a
     * positive number.
     * If the first element that differs is smaller in the first array, return a negative number.
     * If the first element that differs is larger in the first array, return a positive number.
     */
    public static void main(String[] args) {

        System.out.println(
                Arrays.compare(new int[]{10}, new int[]{4})
        );

        // Using compare();

        int example1 = Arrays.compare(new int[]{1, 2}, new int[]{1});
        int example2 = Arrays.compare(new int[]{1, 2}, new int[]{1, 2});
        int example3 = Arrays.compare(new String[]{"a"}, new String[]{"aa"});
        int example4 = Arrays.compare(new String[]{"a"}, new String[]{"A"});
        int example5 = Arrays.compare(new String[]{"a"}, new String[]{null});

        System.out.println("Example 1 : " + example1);
        System.out.println("Example 2 : " + example2);
        System.out.println("Example 3 : " + example3);
        System.out.println("Example 4 : " + example4);
        System.out.println("Example 5 : " + example5);


        // Using mismatch();

        System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1}));
        System.out.println(Arrays.mismatch(new String[]{"a"}, new String[]{"A"}));
        System.out.println(Arrays.mismatch(new int[]{1, 2, 3}, new int[]{1, 4, 3}));

        // Using equals();

        System.out.println("Equals() : " + Arrays.equals(new int[]{1, 2, 3}, new int[]{1, 2}));


    }
}