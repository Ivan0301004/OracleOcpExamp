package CoreAPI.Strings;

/**
 * %s
 * %d
 * %f
 * %n
 * Description
 * Applies to any type, commonly String values
 * Applies to integer values like int and long
 * Applies to floating-­point values like float and double
 * Inserts a line break using the system-­dependent line separator
 */

public class FormattingValues {
    public static void main(String[] args) {
        var name = "Ivanov";
        var id = 5;

        System.out.println(String.format("Hello %s, ID: %d\n", name, id));
        System.out.println("Hello %s your Id is : %d\n".formatted(name, id));
        example();
        example2();

        System.out.println("\n");

        var pi = 3.14159265359;
        System.out.format("[%f]\n", pi);
        System.out.format("[%12.8f]\n", pi);
        System.out.format("[%012f]\n", pi);
        System.out.format("[%12.2f]\n", pi);
        System.out.format("[%.3f]\n", pi);

    }

    public static void example() {
        var name = "James";
        var money = 10_990.89;
        var tall = 180;

        System.out.printf(
                "%s has %.2f in the bank and his tall is %d centimeters\n", name, money, tall);
    }

    public static void example2() {
        var name = "Ivan";
        var score = 90.25;
        var total = 10;
        System.out.println(
                String.format("%s:%n Score: %.2f out of %d\n", name, score, total));
    }
}
