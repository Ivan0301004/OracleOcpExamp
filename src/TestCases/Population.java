package TestCases;

public class Population {
    public static void main(String[] args) {

        int n = 50;
        int ini = 1000;
        double x = 0.02;

        double ans = ini + ((ini * x) + n);
        System.out.println(ans);

        System.out.println(
                nbYear(1000, 2, 50, 1200)
        );

        System.out.println(
                nbYear(1500, 5, 100, 5000)
        );

        System.out.println(
                nbYear(1500000, 2.5, 10000, 2000000)
        );


    }

    static int nbYear(int p0, double percent, int aug, int p) {
        int i = 0;
        int res = p0;
        double per = percent / 100;
        int ope;

        while (res <= p) {
            ope = (int) ((res * per) + aug);
            res += ope;
            i++;
        }

        return i;
    }
}
