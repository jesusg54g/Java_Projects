public class Funciones {
    // Las funciones y metodos se declaran por fueran del metodo main y por
    // dentro de la clase para que puedan ser usados dentro de la clase y el metodo
    // main por igual.
    public static void main(String[] args) {
        double y = 3;

        //Area de un circulo.
        //PI * r^2

       System.out.println(circleArea(y));

        //Area de una esfera.
        //4 * PI * r^2

        System.out.println(sphereArea(y));

        //Volumen de una esfera
        //(4/3) * PI * r^3

        System.out.println(sphereVolume(y));

        System.out.println("PESOS A DOLARES: " + converToDolar(200, "MXN"));
        System.out.println("PESOS A DOLARES: " + converToDolar(1000, "COP"));

    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolume(double r) {
        return (4/3)*Math.PI*Math.pow(r,3);
    }

    /**
     * Descripción: Función que especificando su moneda convierte
     * una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de Moneda: Solo acepta o esta validado para MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dolares
     * */
    public static double converToDolar(double quantity, String currency) {
        //MXN COP
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }

}
