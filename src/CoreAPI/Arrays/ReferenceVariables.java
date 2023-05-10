package CoreAPI.Arrays;

import java.util.Arrays;
import java.util.Objects;

public class ReferenceVariables {
    public static void main(String[] args) {
        String[] bugs = {"Cricket", "Beetle", "Ladybug"};
        String[] red = bugs;

        System.out.println(bugs.equals(red));
        System.out.println(Arrays.toString(bugs));

        String[] strings = {"stringValues"};
        Object[] objects = strings;
        String[] againString = (String[]) objects;
//        againString[0] = new StringBuilder();  This doesn't compile
//        objects[0] = new StringBuilder();

        System.out.println(Arrays.toString(strings));


    }
}
