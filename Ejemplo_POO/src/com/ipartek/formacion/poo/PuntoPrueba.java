package com.ipartek.formacion.poo;

public class PuntoPrueba {
	public static void main(String[] args) {
		int valorX = -5;
		
		Punto p = new Punto();
		
		try {
			p.setX(valorX);
		} catch (PuntoException e) {
			System.out.println("Me has pasado un n�mero negativo para la X y no es v�lido");
			System.out.println("Lo dejo a 1");
			p.setX(1);
		}
		
		System.out.println(p);
	}
}
