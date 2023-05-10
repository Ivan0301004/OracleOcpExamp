package CoreAPI.StringBuilder;

public class One {
    public static void main(String[] args) {
        /*
         * String alpha = "";
         * for (char cur = 'a'; cur <= 'z'; cur++) {
         * alpha += cur + " ";
         * }
         * 
         * System.out.println(alpha);
         */

         StringBuilder str = new StringBuilder();
         for(char x = 'a'; x <= 'z'; x++){
            str.append(x);
         }

         System.out.println(str);
    }
}
