
public class Cuadrado {
	private double lado;

	public Cuadrado(double arista) {
		this.lado = arista;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double arista) {
		this.lado = arista;
	}

	public void calcularArea(){
		double area = lado*lado;
		System.out.println("El area es de: "+ area);
	}

	public void calcularPerimetro(){
		double perimetro = lado*4;
		System.out.println("El perimetro es de: "+ perimetro);
	}

}
