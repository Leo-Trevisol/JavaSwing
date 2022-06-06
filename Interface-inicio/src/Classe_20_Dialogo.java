import javax.swing.JOptionPane;

public class Classe_20_Dialogo {

    public static void main(String args[]) {


        String firstNumber;
        String secondNumber;

        int number1;
        int number2;
        int sum = 0;


        firstNumber = JOptionPane.showInputDialog("Digite o primeiro numero");

        secondNumber = JOptionPane.showInputDialog("Digite o segundo numero");

        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);

        sum = number1 + number2;

        JOptionPane.showMessageDialog(null, "A soma : " + sum, "resultado", JOptionPane.PLAIN_MESSAGE);


        System.exit(0);

    }


}
