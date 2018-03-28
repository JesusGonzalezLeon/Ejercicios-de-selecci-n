
public class Cubo extends Cuadrado{

	public Cubo(double arista) {
		super(arista);
	}
	public void calcularVolumen(){
		double volumen = getLado();
		volumen = volumen*volumen*volumen;
		System.out.println("El volumen es de: "+ volumen);
	}
}
