package TestCases;

public class StringArray {
    public static void main(String[] args) {
        char[] str = stringToArray("Yudith");

        for (char ch : str)
            System.out.print(ch + ", ");

        System.out.println();

        int[][] var4;
        int[][][] space;
    }

    static char[] stringToArray(String str) {
        char[] strArr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            strArr[i] = str.charAt(i);
        }
        return strArr;
    }
}
