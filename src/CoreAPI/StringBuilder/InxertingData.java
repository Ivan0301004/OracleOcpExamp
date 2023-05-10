package CoreAPI.StringBuilder;

public class InxertingData {
    public static void main(String[] args) {
        var str = new StringBuilder("Ivan");
        str.insert(0, "Good ");
        str.insert(str.length(), "ov");
        str.insert(str.length()," ❤️ Fatima");

        System.out.println(str);

        var other = str;
        System.out.println(other);
    }
}
