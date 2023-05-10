package CoreAPI.Strings;

public class Whitespaces {
    public static void main(String[] args) {
        String mac = "Macbook Air M1";
        String mac2 = "\tMacbook Air M1";

        String re = mac.strip();
//        String re2 = mac2.strip();
        String re3 = mac.trim();

        System.out.println(re);
        System.out.println(mac2);
        System.out.println(re3);
    }
}
