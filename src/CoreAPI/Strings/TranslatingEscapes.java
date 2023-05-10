package CoreAPI.Strings;

/**
 * TranslatingEscapes
 */
public class TranslatingEscapes {
    public static void main(String[] args) {
        var str = "1\\t2";
        var str2 = "1\\s67";
        System.out.println(str2);
        System.out.println(str2.translateEscapes());
        System.out.println(str);
        System.out.println(str.translateEscapes());
    }
    
}