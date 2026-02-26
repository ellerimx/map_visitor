package elemento;

public class TrianguloEquilatero extends Triangulo {
	
	private double lado;

    public TrianguloEquilatero(double l, double b, double h) {
    	super(b,h);
        this.lado = l;
    }

	public double getLado() {
		return lado;
	}

	public void setLado(double l) {
		this.lado = l;
	}

	@Override
	public double getPerimetro() {
		return 3*lado;
	}
}
