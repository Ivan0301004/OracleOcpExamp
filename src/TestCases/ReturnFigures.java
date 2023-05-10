package TestCases;

public class ReturnFigures {

    public static int digital_root(int n) {
        // ...
        int mod;
        int sum = 0;
        while (n != 0) {
            mod = n % 10;
            sum += mod;
            n /= 10;
        }

        if (sum >= 10) {
            return digital_root(sum);
        }
        return sum;
    }


    static int returnFigures(int n) {
        return (n != 0 && n % 9 == 0) ? 9 : n % 9;
    }


    public static void main(String[] args) {
        System.out.println(digital_root(16));
        System.out.println(digital_root(942));
        System.out.println(digital_root(132189));
        System.out.println(digital_root(493193));
    }

}
