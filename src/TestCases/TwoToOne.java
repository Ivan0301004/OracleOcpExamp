package TestCases;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TwoToOne {
    public static void main(String[] args) {
        System.out.println(
                twoToOne("xyaabbbccccdefww", "xxxxyyyyabklmopq")
        );

        System.out.println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
    }

    static String twoToOne(String s1, String s2) {

        String str = s1.concat(s2);
        char[] string = str.toCharArray();
        Arrays.sort(string);

        String res = new String();

        for (int i = 0; i < string.length; i++) {
            if (i == 0 || string[i] != string[i - 1]) {
                res += (string[i]);
            }
        }
        return res;
    }

    static String longest(String s1, String s2) {
        return Arrays.stream(s1.concat(s2).split(""))
                .collect(Collectors.toCollection(TreeSet::new))
                .stream()
                .collect(Collectors.joining());
    }
}
