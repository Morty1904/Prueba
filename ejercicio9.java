import javax.swing.JOptionPane;

public class ejercicio9 {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");

        if (nombre != null && !nombre.isEmpty()) {
            String mensaje = "¡Hola, " + nombre + "! Ten un buen día";
            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresó un nombre.");
        }
    }
}
