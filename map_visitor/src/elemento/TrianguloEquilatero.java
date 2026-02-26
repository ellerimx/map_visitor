package elemento;

//import visitor.VisitorIF;

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

	/*
	public double aceitaVisita(VisitorIF v) {
		return v.visitaTriangulo(this);
	}*/

	@Override
	public double getPerimetro() {
		return 3*lado;
	}
}
