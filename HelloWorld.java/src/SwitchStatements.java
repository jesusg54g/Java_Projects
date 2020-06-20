public class SwitchStatements {
    public static void main(String[] args) {

        String colorModeSelected = "Green";

        switch (colorModeSelected) {
            case  "light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case  "Night":
                System.out.println("Seleccionaste Night Mode");
                break;
            case  "Blue Dark":
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            case  "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
            default:
                System.out.println("Selecciona una opcion valida");
        }
    }
}
