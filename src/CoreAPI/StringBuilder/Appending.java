package CoreAPI.StringBuilder;

/**
 * Appending
 */
public class Appending {

    public static void main(String[] args) {

        var sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb);

        var str = new StringBuilder().append("This StringBuilder has ").append(90.90);
        str.append(" en dolares americanos y siempre es ").append(true);

        System.out.println(str);

        str.reverse();
        System.out.println(str);

        System.out.println(str.capacity());

    }
}