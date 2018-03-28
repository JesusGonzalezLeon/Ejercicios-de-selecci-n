

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Menu menu = new Menu();
		boolean repetir=false;
		do{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el tamaño del lado de la figura: \n");
		try {
			double lado = entrada.nextDouble();
			Cubo cubo = new Cubo(lado);
			menu.menuInicial(cubo);
		} catch (Exception e) {
			System.out.println("Valor inadecuado");
			repetir=true;
		}
		}while(repetir);

	}

}
