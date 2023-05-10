package CoreAPI.StringBuilder;

public class Equality {
    public static void main(String[] args) {
        var one = new StringBuilder("q");
        var two = new StringBuilder("q");
        // var three = one.append("a");

        String four = one.toString();
        // String five = three.toString();
        String six = two.toString();

        boolean com = four.equals(six);

        System.out.println(com);

        System.out.println("Two : " + (one == two));
        // System.out.println(one == three);

        if (one.toString().equals(two.toString()))
            System.out.println("Are equals");
        else
            System.out.println("Are different");

    }
}
