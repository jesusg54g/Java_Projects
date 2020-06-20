import com.sun.org.apache.xpath.internal.objects.XString;

public class NamingJava {
    public static void main(String[] args) {
        int cellphone = 3333777;
        int cellPhone = 5555666;
        System.out.println(cellphone);
        System.out.println(cellPhone);

        /* Los nombres de las variables pueden comenzar con letras, $ y "_",
           pero nunca con numeros
           */
        String $contryName = "Spain";
        String _backgroundColor = "Green";

        /* Los nombres de las variables pueden contener dentro de la cadena
           caracteres igualmente $ y "_", pero adicionalmente numeros mientras
           no esten al principio del nombre.
         */
        String currency$ = "MXN";
        String background_color = "BLUE";

        /* Las constantes se escriben en mayusculas y podemos separarlas, si
           poseen mas de una palabras, con "_".
         */
        int POSITION = -5;
        int MAX_WIDTH = 9999;
        int MIN_WIDTH = 1;

         /* Convencion del Camel Case en Java: Para nombrar variables o metodos
           en Java se utiliza la convencion del "Lower Camel Case", en el cual
           la primera letra utilizada es minisculas pero la primera letra de
           cada segunda palabra posterior que contenga el nombre se la variable
           sera mayusculas.
         */
         int soyUnNumeroInt = 10;

         /*
           En el caso de los nombres de clases o archivos usaremos el metodo
           "Upper Camel Case", en donde la primera letra de todas las palabras
           contenidas en el nombre de la clase las escribiremos en mayusculas
         */
         class SoyUnaClase {};

    }
}
