package CoreAPI.Strings;

public class Indentation {
    public static void main(String[] args) {
        var block = """
                a
                b
                c
                """;

        var concat = " a\n" + "  b\n" + " c";

        System.out.println(block.length());
        System.out.println(concat.length());
        System.out.println(block.indent(12));
        System.out.println(concat.indent(-1));
        System.out.println(concat.indent(-4));
        System.out.println(concat.stripIndent());
    }
}
