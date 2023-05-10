package CoreAPI.Strings;

public class EmptyStrings {
    public static void main(String[] args) {
        var mty = "";
        var blank = " ";
        var nonMty = "Gojira";

        System.out.println(mty.isEmpty());
        System.out.println(blank.isBlank());
        System.out.println(blank.isBlank());
        System.out.println(nonMty.isEmpty());
    }
}
