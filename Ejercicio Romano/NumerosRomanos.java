import java.util.Scanner;

public class NumerosRomanos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Numero a convertir en romano entre 1 y 1000: \n");
		try {
			
			int numero = entrada.nextInt();
			if(numero>0&&numero<=1000)
				System.out.println(convetirNumero(numero));
			else
				System.out.println("Numero fuera de rango, ingresar solo numeros con valor entre 1 y 1000");
			
		} catch (java.util.InputMismatchException e) {
			System.out.println("Ingresar solo numeros");
		}
	}

	public static String convetirNumero(int num){
		int numeroEntero = num;
		String numeroRomano="";
		int unidad=numeroEntero%10;
		int decena=numeroEntero%100/10;
		int centena=numeroEntero/100;
		if(centena==10){
			return "M";
		}else{
			if(centena==9)
				numeroRomano+="CM";
			if(centena==8)
				numeroRomano+="DCCC";
			if(centena==7)
				numeroRomano+="DCC";
			if(centena==6)
				numeroRomano+="DC";
			if(centena==5)
				numeroRomano+="D";
			if(centena==4)
				numeroRomano+="CD";
			if(centena==3)
				numeroRomano+="CCC";
			if(centena==2)
				numeroRomano+="CC";
			if(centena==1)
				numeroRomano+="C";
			
			if(decena==9)
				numeroRomano+="XC";
			if(decena==8)
				numeroRomano+="LXXX";
			if(decena==7)
				numeroRomano+="LXX";
			if(decena==6)
				numeroRomano+="LX";
			if(decena==5)
				numeroRomano+="L";
			if(decena==4)
				numeroRomano+="XL";
			if(decena==3)
				numeroRomano+="XXX";
			if(decena==2)
				numeroRomano+="XX";
			if(decena==1)
				numeroRomano+="X";
			
			if(unidad==9)
				numeroRomano+="IX";
			if(unidad==8)
				numeroRomano+="VIII";
			if(unidad==7)
				numeroRomano+="VII";
			if(unidad==6)
				numeroRomano+="VI";
			if(unidad==5)
				numeroRomano+="V";
			if(unidad==4)
				numeroRomano+="IV";
			if(unidad==3)
				numeroRomano+="III";
			if(unidad==2)
				numeroRomano+="II";
			if(unidad==1)
				numeroRomano+="I";			
		}
		return numeroRomano;
	}
}
