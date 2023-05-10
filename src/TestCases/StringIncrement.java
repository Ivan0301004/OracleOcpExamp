package TestCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringIncrement {

    public static String incrementString(String str) {

        if (str.length() == 0) return "1";

        StringBuilder number = new StringBuilder();
        StringBuilder chars = new StringBuilder();

        int reverseCounter = str.length() - 1;
        while (reverseCounter >= 0 && Character.isDigit(str.charAt(reverseCounter))) {
            number.append(str.charAt(reverseCounter));
            reverseCounter--;
        }

        // reverse this string because we have pushed the digits in a reverse order
        number.reverse();
        // append to chars the left part of the string
        chars.append(str.substring(0, str.length() - number.length()));

        List<Integer> digits = new ArrayList<>();
        // fill the list with digits
        Arrays.stream(number.toString().split("")).filter(d -> d.length() > 0)
                .forEach(d -> digits.add(Integer.parseInt(d)));
        int[] digitsArray = digits.stream().mapToInt(i -> i).toArray(); // convert the ArrayList into the plain array
        // of integers

        digitsArray = incrementArrayByOne(digitsArray); // increment by 1

        if (number.length() == 0) return str + "1";

        String digitsString = Arrays.stream(digitsArray)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(""));

        return chars.append(String.join("", digitsString)).toString();
    }

    private static int[] incrementArrayByOne(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] += 1;
            if (array[i] == 10) {
                array[i] = 0;
            } else return array;
        }
        if (array.length > 0 && array[0] == 0) {
            int[] newArray = new int[array.length + 1];
            System.arraycopy(array, 0, newArray, 1, array.length);
            newArray[0] = 1;
            return newArray;
        }
        return array;
    }

    public static void main(String[] args) {
        String res = incrementString("");
        System.out.println(res);
    }
}
