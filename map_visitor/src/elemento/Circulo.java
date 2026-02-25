package elemento;

import visitor.VisitorIF;

public class Circulo implements ElementoConcretoIF{
	
	private double raio;
	
	public Circulo(double r) {
		this.raio = r;
	}
	
	public double getRaio() {
		return this.raio;
	}

	@Override
	public double aceitaVisita(VisitorIF v) {
		return v.visitaCirculo(this);
		
	}
}
