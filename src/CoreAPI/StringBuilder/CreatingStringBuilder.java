package CoreAPI.StringBuilder;

public class CreatingStringBuilder {
    public static void main(String[] args) {
        StringBuilder one = new StringBuilder("Logitech");
        // StringBuilder two = new StringBuilder(10);

        String sub = one.substring(one.indexOf("L"), one.indexOf("te"));
        int len = one.length();
        char ch = one.charAt(6);

        System.out.println(sub + " " + len + " " + ch);
        
    }
}
