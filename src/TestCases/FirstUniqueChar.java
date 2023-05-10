package TestCases;

public class FirstUniqueChar {
    public static void main(String[] args) {

        System.out.println(uniqueChar("loveleetcode"));
    }

    static int uniqueChar(String str) {
        if (str.length() == 0) return -1;

        int[] store = new int[26];

        for (char ch : str.toCharArray()) {
            store[ch - 'a']++;
        }

        for (int i = 0; i < store.length; i++) {
            if (store[str.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }
}
