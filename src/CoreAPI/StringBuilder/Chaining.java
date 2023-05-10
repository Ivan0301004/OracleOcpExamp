package CoreAPI.StringBuilder;

public class Chaining {
    public static void main(String[] args) {
        StringBuilder sp = new StringBuilder("Start");
        sp.append("+middle");
        StringBuilder same = sp.append("+end");
        System.out.println(same);

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");

        b.append("f").append("g");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
