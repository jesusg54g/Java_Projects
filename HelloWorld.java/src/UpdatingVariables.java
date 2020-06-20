public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //Bono $200
        salary = salary + 200;
        System.out.println(salary);

        //Pension: $50 Descuento.

        salary = salary - 50;
        System.out.println(salary);

        //2 horas extra $30 c/u.
        //Comida: $45

        salary = salary + (30*2 - 45);
        System.out.println(salary);

        //Actualizando cadenas de texto.
        String employeeName = "Enrique Garcia";
        employeeName = employeeName + " Cobena";
        System.out.println(employeeName);

        employeeName = "Jesus " + employeeName;
        System.out.println(employeeName);





    }
}
