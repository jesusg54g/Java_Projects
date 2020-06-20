public class IncrementDecrement {
    public static void main(String[] args) {

        int lives = 5;
        lives = lives - 1;
        System.out.println(lives);  //4

        lives--;
        System.out.println(lives);  //3

        lives++;
        System.out.println(lives);  //4

        //Prefija
        // Gana un regalo por ganar una videa
        int gift = 100 + lives++;  //postfijo: Se toma primero el valor de la variable
        // y luego el incremento. En el ejemplo anterior gift va a representar la suma
        // de 100 mas el valor actual de lives, sin embargo no considerara el incremento
        // en la suma. Por otro lado al checar luego el valor de lives si podremos
        // observar que su valor incremento, pero el incremento se vio reflejado en este
        // caso luego de la suma.
        System.out.println(gift);

        int gift2 = 100 + ++lives;  //prefijo: En el caso de prefijo primero se realiza
        // el incremento de la variable y posteriormente se hace las suma.
        System.out.println(gift2);

    }
}
