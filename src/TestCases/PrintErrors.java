package TestCases;

import java.util.Collection;

public class PrintErrors {
    public static void main(String[] args) {

        System.out.println(
                errors("aaabbbbhaijjjm")
        );
        System.out.println(
                errors("aaaxbbbbyyhwawiwjjjwwm")
        );

        System.out.println(printError("aaaxbbbbyyhwawiwjjjwwm"));
    }

    static String errors(String str) {
        char[] box = str.toCharArray();
        int chars = 0;

        for (char c : box) {
            if (c >= 'a' && c <= 'm') {
                chars++;
            }
        }

        return (box.length - chars) + "/" + box.length;
    }

    static String printError(String str) {
        var errs = str.chars()
                .filter(ch -> ch > 'm')
                .count();
        return errs + "/" + str.length();
    }
}
