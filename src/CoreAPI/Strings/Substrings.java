package CoreAPI.Strings;

import java.util.Arrays;

public class Substrings {
    public static void main(String[] args) {

        var name = "Nakamura";
        System.out.println(name.substring(4));
        System.out.println(name.substring(name.indexOf("k")));
        System.out.println(name.substring(name.indexOf("a")));
        System.out.println("The length is " + name.length());
        System.out.println(name.substring(4, 8));
        System.out.println(name.substring(4, 6));
        System.out.println("Nothing inside : " + name.substring(4, 4));


        int size = lengthOfTheLastString("Yudith Mercado       ");
        System.out.println(size);
        int[] p = {1, 2, 3, 4};
    }

    static int lengthOfTheLastString(String str) {
        String[] st = str.split(" ");
        return st[st.length - 1].trim().length();
    }
}
