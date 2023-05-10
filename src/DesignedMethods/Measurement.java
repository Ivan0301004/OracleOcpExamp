package DesignedMethods;

public class Measurement {

    public static void main(String[] args) {

        System.out.println(getHeight());
        System.out.println(getHeight2());
        System.out.println(getHeight3());
    }

    static int getHeight() {
        int t = 9;
        return t;
    }

    static long getHeight2() {
        long t = 9L;
        return t;
    }

    static String getHeight3() {
        int t = 89;
        return String.valueOf(t);
    }
}
