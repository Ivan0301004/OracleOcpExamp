package TestCases;

import java.util.Arrays;

public class AreTheSame {
    public static void main(String[] args) {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};

        int[] x = {1, 2, 3, 4};
        int[] y = {9, 4, 1, 162};


        System.out.println(comp(a, b));
        System.out.println(comp(x, y));

    }

    static boolean comp(int[] a, int[] b) {
        if ((a == null || b == null) || (a.length != b.length))
            return false;

        int[] a2 = new int[a.length];
        boolean flag = true;

        for (int i = 0; i < a.length; i++) {
            a2[i] = a[i] * a[i];
        }

        Arrays.sort(a2);
        Arrays.sort(b);

        for (int i = 0; i < a2.length; i++) {
            if (a2[i] == b[i]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }

        if (flag)
            return true;
        else
            return false;
    }

    static boolean sonMismo(int[] a, int b[]) {
        return a != null && b != null && a.length == b.length &&
                Arrays.equals(Arrays.stream(a)
                .map(i -> i * i)
                .sorted()
                .toArray(), Arrays.stream(b)
                .sorted()
                .toArray());
    }
}

