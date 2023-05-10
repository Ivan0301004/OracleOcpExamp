package CoreAPI.StringBuilder;

public class DeletingConst {
    public static void main(String[] args) {
        var str = new StringBuilder("Good Ivanov ❤️ Fatima");

        str.delete(0, 5);
        str.deleteCharAt(7);
        
        System.out.println(str);
    }
}
