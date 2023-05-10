package CoreAPI.Strings;

public class Length {
    public static void main(String[] args) {
        var s = "Fatima";
        int l = s.length();
        System.out.println(l); // 6

        char index = s.charAt(0);
        System.out.print(index);
        index = s.charAt(1);
        System.out.print(index);
        index = s.charAt(2);
        System.out.println(index);
    }
}
