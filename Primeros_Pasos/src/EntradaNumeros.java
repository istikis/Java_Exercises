import javax.swing.*;

public class EntradaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1 = JOptionPane.showInputDialog("Introduce un n�mero");

		double num2 = Double.parseDouble(num1);

		System.out.print("La ra�z de " + num2 + " es ");

		System.out.printf("%1.2f", Math.sqrt(num2));

		// System.out.printf("%1.4f",x/3);

	}

}
