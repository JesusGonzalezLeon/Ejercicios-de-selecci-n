

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Menu {
	public void menuInicial(Cubo cubo){
		System.out.println("\nEl tamaño del lado es de: "+cubo.getLado());
		System.out.println("Operaciones: \nCalcular Area....1\nCalcular Perimetro...2\nCalcular Volumen...3\nCancelar...4\nSalir...5");
		System.out.println("(Ingrese el numero de la opcion correpondiente)");
		Scanner entrada = new Scanner(System.in);
		int opcion =0;
		try {
			opcion = entrada.nextInt();
		} catch (Exception e) {
		}
			switch (opcion) {
			case 1:
				cubo.calcularArea();
				menuSecundario(cubo);
				break;
			case 2:
				cubo.calcularPerimetro();
				menuSecundario(cubo);
				break;
			case 3:
				cubo.calcularVolumen();
				menuSecundario(cubo);
				break;
			case 4:
				boolean repetir=false;
				do{
				Scanner entrada1 = new Scanner(System.in);
				System.out.println("Ingrese el tamaño del lado de la figura: \n");
				try {
					double lado2 = entrada1.nextDouble();
					cubo.setLado(lado2);
					menuInicial(cubo) ;
				} catch (Exception e) {
					System.out.println("Valor inadecuado");
					repetir=true;
				}
				}while(repetir);
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Ingrese un numero correspondiente a las opiones");
				menuInicial(cubo);
				break;
			}

	}

	public void menuSecundario(Cubo cubo){
		System.out.println("\nEl tamaño del lado es de: "+cubo.getLado());
		System.out.println("Opciones: \nSalir al menu de operaciones....1\nIngresar nuevo tamaño...2\n");
		Scanner entrada = new Scanner(System.in);
		int opcion=0;
		try {
			opcion = entrada.nextInt();
		}catch (Exception e) {
		}
			switch (opcion) {
			case 1:
				menuInicial(cubo);
				break;
			case 2:
				boolean repetir=false;
				do{
				Scanner entrada1 = new Scanner(System.in);
				System.out.println("Ingrese el tamaño del lado de la figura: \n");
				try{
					double lado = entrada1.nextDouble();
					cubo.setLado(lado);
					menuInicial(cubo);
				} catch (Exception e) {
					System.out.println("Valor inadecuado");
					repetir=true;
				}
				}while(repetir);
				break;
			default:
				System.out.println("Ingrese un numero correspondiente a las opiones");
				menuSecundario(cubo);
				break;
			}
	}

}
