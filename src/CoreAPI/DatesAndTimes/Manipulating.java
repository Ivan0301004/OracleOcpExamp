package CoreAPI.DatesAndTimes;

import java.time.LocalDate;
import java.time.Month;

public class Manipulating {
    public static void main(String[] args) {
        String rgb = RgbToHex(-20, 275, 125);
        String hex = decToHex(275);
        System.out.println(rgb);


        uno();
    }

    static void uno() {
        var date = LocalDate.of(2023, Month.APRIL, 21);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusWeeks(2);
        System.out.println(date);
        date = date.plusMonths(2);
        System.out.println(date);
        date = date.plusYears(2);
        System.out.println(date);

    }


    static String decToHex(int n) {
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int mod;
        var res = new StringBuilder();

        if (n < 0)
            n = 0;
        else if (n > 255)
            n = 255;

        if (n == 0)
            return res.append(hex[0]).toString();

        while (n != 0) {
            mod = n % 16;
            res.append(hex[mod]);
            n /= 16;
        }
        return res.reverse().toString();
    }

    static String RgbToHex(int r, int g, int b) {
        return new StringBuilder()
                .append(toHex(r))
                .append(toHex(g))
                .append(toHex(b))
                .toString();
    }

    static String toHex(int n) {
        if (n < 0)
            n = 0;
        else if (n > 255)
            n = 255;

        String hex = String.format("%02x", n);
        return hex.toUpperCase();
    }
}
