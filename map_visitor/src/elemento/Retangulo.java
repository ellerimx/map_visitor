package elemento;

import visitor.VisitorIF;

public class Retangulo {

	private double base;
	private double altura;
	
	public Retangulo(double b, double h) {
		this.base = b;
		this.altura = h;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setBase(double b) {
		this.base = b;
	}
	
	public void setAltura(double h) {
		this.altura = h;
	}
	
	public double aceitaVisita(VisitorIF v) {
		return v.visitaRetangulo(this);
	}
}
