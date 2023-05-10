
public class Incre {

    public static void main(String[] args) {
        String[] lista = {"foo", "foobar23", "foo0042", "foo9", "foo099"};
        for (String cadenaEvaluar : lista) {
            String cadenaFinal = "";
            String numero      = extraerNumero(cadenaEvaluar);
            if (numero.equals(""))
                cadenaFinal = cadenaEvaluar += 1;
            else {
                String texto       = cadenaEvaluar.substring(0, cadenaEvaluar.length() - numero.length());
                String numeroCeros = extraerCerosNumero(numero);
                if (numeroCeros.equals("")) {
                    int numeroI = Integer.parseInt(numero) + 1;
                    cadenaFinal = texto + numeroI;
                } else {
                    String numeroEvaluar = numero.substring(numeroCeros.length(), numero.length());
                    int    numeroI       = Integer.parseInt(numeroEvaluar) + 1;
                    if (String.valueOf(numeroI).length() > numeroEvaluar.length()) {
                        cadenaFinal = texto + numeroCeros.substring(0, numeroCeros.length() - 1) + numeroI;
                    } else {
                        cadenaFinal = texto + numeroCeros.substring(0, numeroCeros.length()) + numeroI;
                    }
                }
            }
            System.out.println(cadenaEvaluar + "->" + cadenaFinal);
        }

    }

    public static String extraerNumero(String cadena) {
        String  numero = "";
        boolean letra  = false;
        for (int i = cadena.length() - 1; i >= 0; i--) {
            String caracter = String.valueOf(cadena.charAt(i));
            if (!letra && caracter.matches("[0-9]+"))
                numero = caracter + numero;
            else
                letra = true;
        }
        return numero;
    }


    public static String extraerCerosNumero(String cadena) {
        String numero = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            String caracter = String.valueOf(cadena.charAt(i));
            if (caracter.matches("[0]+"))
                numero = caracter + numero;
        }
        return numero;
    }
}
