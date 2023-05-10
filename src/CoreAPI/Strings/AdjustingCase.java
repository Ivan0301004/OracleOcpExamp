package CoreAPI.Strings;

/**
 * These methods do what they say. The toUpperCase() method converts any lowercase
 * characters to uppercase in the returned string. The toLowerCase() method converts any
 * uppercase characters to lowercase in the returned string. These methods leave alone any
 * characters other than letters. Also, remember that strings are immutable, so the original
 * string stays the same.
 */

public class AdjustingCase {
    public static void main(String[] args) {
        String name = "Zurehiby";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
    }
}
