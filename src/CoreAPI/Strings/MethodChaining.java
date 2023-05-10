package CoreAPI.Strings;

/**
 * MethodChaining
 */
public class MethodChaining {
    public static void main(String[] args) {
        String res = "Animal   ".trim().toLowerCase().replace('a', 'A');
        System.out.println(res);
        String abc = "abc".toUpperCase().replace("B", "2").replace('C', '3');
        System.out.println(abc);
    }

}