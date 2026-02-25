package visitor;

import elemento.Circulo;

public class VisitorCalcularArea implements VisitorIF {
	
	//calculo da area do circulo
	public double visitaCirculo(Circulo c) {
		return 3.14 * c.getRaio() * c.getRaio();
		
	}
	
	//add area das outras figuras
	

}
