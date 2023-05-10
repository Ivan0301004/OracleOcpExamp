package CoreAPI.Strings;


/**
 * The equals() method checks whether two String objects contain exactly the same
 * characters in the same order. The equalsIgnoreCase() method checks whether two String
 * objects contain the same characters, with the exception that it ignores the characters’ case.
 * The method signatures are as follows:
 */

class Laptop {
    String model;
    String vendor;

    public Laptop(String model, String vendor) {
        this.model = model;
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return "Vendor : " + this.vendor + "\n" +
                "Model  : " + this.model + "\n";
    }

    public boolean equals(Laptop lap) {
        return this.model.equals(lap.model) && this.vendor.equals(lap.vendor);
    }
    

}


public class CheckingForEquality {

    public static void main(String[] args) {
        String str = "FATIMA";
        String str2 = "fatima";

        System.out.println(
                str.equals("FATIMA")
        );

        System.out.println(
                str.equals("Fatima")
        );

        System.out.println(
                str2.equalsIgnoreCase("fatima")
        );

        Laptop mac = new Laptop("MacBook Air M1", "Apple");
        Laptop mac2 = new Laptop("MacBook Air M1", "Apple");
        Laptop mini = new Laptop("Mac Mini M1", "Apple");

        System.out.println(mac);
        System.out.println(mac.equals(mac2));
        System.out.println(mini);
    }
}
