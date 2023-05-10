package CoreAPI.Strings;



public class Replace {
    public static void main(String[] args) {
        String uno = "Gema guerita";
        String dos = "Zure guapa";

        System.out.println(uno.replace('g','K'));
        System.out.println(dos.replace('Z','G'));

        System.out.println(replaceWhitespace(uno));


    }

    public static String replaceWhitespace(String str){
        return str.replaceAll("\s","");
    }
}
