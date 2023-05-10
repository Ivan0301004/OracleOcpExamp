package CoreAPI.Strings;

import java.util.Arrays;
import java.util.List;

public class Index {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ivan", "Fatima", "Julieta");

        for (String x : names) {
            System.out.println("The position of " + x + " is " + names.indexOf(x));
        }

        System.out.println(names.indexOf("Fatima"));
        System.out.println(names.get(2));

        var name = "Mercedes";
        System.out.println(name.indexOf("d"));
        
    }
}
