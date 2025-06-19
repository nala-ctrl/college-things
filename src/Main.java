import java.util.Scanner;
import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int n1, n2, mod;
        double base, pow;
        String msg = "";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite  um numero inteiro"));

        mod = n1 / n2;
        double poww = Math.pow(n1, n2);

        msg = msg + "resultado da divisao de " + n1 + " por " + n2 + " = " + mod + "\n";
        msg =msg + "resultado da potencia " + n1 + " + " + n2 + " = " + poww + "\n";
        JOptionPane.showMessageDialog(null, msg);

    }
}