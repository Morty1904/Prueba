import javax.swing.JOptionPane;

public class ejercicio10 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("intruduzca un numero: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("intruduzca un segundo nombre: "));
        int calc = Integer.parseInt(JOptionPane
                .showInputDialog("que operacion desea realizar : 1.suma 2.resta 3.multiplicacion 4.division"));
        int sol;
        switch (calc) {
            case 1:
                sol = num + num2;
                JOptionPane.showMessageDialog(null, "el resultado es " + sol);
                break;
            case 2:
                sol = num - num2;
                JOptionPane.showMessageDialog(null, "el resultado es " + sol);
                break;
            case 3:
                sol = num * num2;
                JOptionPane.showMessageDialog(null, "el resultado es " + sol);
                break;
            case 4:
                sol = num / num2;
                JOptionPane.showMessageDialog(null, "el resultado es " + sol);
                break;

            default:
                break;
        }
    }

}