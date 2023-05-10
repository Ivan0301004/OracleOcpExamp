package CoreAPI.StringBuilder;


public class StringPool {
    public static void main(String[] args) {
        var x = "Hello";
        var y = "Hello";

        System.out.println("x == y : " + (x == y));

        var g = "Logi";
        var t = " Logi".trim();
        System.out.println("g.equals(t) :" + g.equals(t));

        var single = "hello world";
        var concat = "hello ";
        concat += "world";
        System.out.println("sinlge == concat : " + (single == concat));
        System.out.println("single.equals(concat) : " + single.equals(concat));

        var ko = "Logitech";
        var ot = new String("Logitech");

        System.out.println("kp == op : " + (ko == ot));
        System.out.println("ko.equals(ot) : " + ko.equals(ot));
    }
}
