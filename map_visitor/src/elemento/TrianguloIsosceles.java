package elemento;

public class TrianguloIsosceles extends Triangulo{
	
	private double lado;
	
	public TrianguloIsosceles(double l, double b, double h) {
		super(b,h);
		this.lado = l;
	}
	
	public double getLado() {
		return lado;
	}
		
	public double getPerimetro() {
		return 2 * lado + getBase();
	}
}
