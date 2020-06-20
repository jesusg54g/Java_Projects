public class IfStatement {
    public static void main(String[] args) {
        boolean ifBluetoothEnable = false;
        int fileSended = 3;

        if (ifBluetoothEnable) {
            // Send file
            fileSended++;
            System.out.println("File Sended!");
        }
            else {
                System.out.println("Please turn on your Bluetooth!");
            }
    }
}
