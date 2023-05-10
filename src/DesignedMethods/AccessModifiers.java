package DesignedMethods;

public class AccessModifiers {
    public static void main(String[] args) {
        System.out.println(hjke(1));
        System.out.println(215 / 25);
    }

    static String hjke(int a) {
        String fruit = "";
        if (a < 2)
            fruit = "Orange";
        return fruit;
    }
}