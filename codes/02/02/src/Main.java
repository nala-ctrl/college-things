import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        int num;
        char op = 0;
        String msg = "", msgEntr = " Digite 1 para par/impar\n Digite 2 para positivo/negativo";

        //entrada de dados

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
        op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

        //processamento

        switch (op)
        {
            //sai de resultados
            case '1': {
                if (num % 2 == 0) {
                    msg = msg + num + " eh par.\n";
                } else {
                    msg = msg + num + " eh impar.\n";
                }
                break;
            }
            case '2': {
                if (num > 0) {
                    msg = msg + num + " e positivo.\n";
                } else {
                    msg = msg + num + " eh negativo. \n";
                }
                break;
            }
            default: JOptionPane.showMessageDialog(null, "opcao invalida, calculos nao realizados");
        }
        if (op == '1' || op == '2' ) {
            JOptionPane.showMessageDialog(null, msg);
        }
    }

}