package CoreAPI.StringBuilder;

public class Replace {
    public static void main(String[] args) {
        var str = new StringBuilder("Good Ivanov ❤️ Fatima");

        str.replace(0, 4, "The Boyfriends are : ");
        System.out.println(str);

        str.replace(0, str.length(), "Some Day");
        System.out.println(str);
    }
}
