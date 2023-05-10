package CoreAPI.MathAPI;

import java.util.ArrayList;
import java.util.List;

public class RandomNumbers {
    public static void main(String[] args) {
        int ran = (int) (Math.random() * 5d);

        System.out.println(ran);

        List<Integer> nums = new ArrayList<>();
        int i = 0;

        while (i < 6) {
            nums.add((int) (Math.random() * 6));
            i++;
        }

        nums.stream()
                .forEach(j -> System.out.print(j + " "));
        System.out.println();

        int num = 9;

        System.out.println(sum(num, num));

    }

    static int sum(int a, int b) {
        return a + b;
    }
}
