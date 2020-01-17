import java.util.*;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Elije una opci�n: \n1: Cuadrado \n2: Rect�ngulo \n3: Tri�ngulo \n4: Circulo \n");

		int figura = entrada.nextInt();

		switch (figura) {
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));

			System.out.println("El �rea del cuadrado es: " + Math.pow(lado, 2));
			break;

		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la Base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la Altura"));

			System.out.println("El �rea del rect�ngulo es: " + base * altura);
			break;

		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la Base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la Altura"));

			System.out.println("El �rea del Tri�ngilo es " + (base * altura) / 2);
			break;

		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Radio del circulo"));

			System.out.print("El �rea del c�rculo es ");
			System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));

			break;
		}
	}

}
