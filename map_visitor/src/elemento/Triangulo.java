package elemento;

import visitor.VisitorIF;

public abstract class Triangulo implements ElementoConcretoIF {
    private double base;
    private double altura;

    protected Triangulo(double b, double h) {

        if (b <= 0 || h <= 0)
            throw new IllegalArgumentException("Base e altura devem ser > 0");
        
        this.base = b;
        this.altura = h;
    }   

    public double getBase() {
        return base;
    }
    
    public void setBase(double b) {
    	this.base = b;
    }
   

    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double h) {
    	this.altura = h;
    }
    
    @Override
    public double aceitaVisita(VisitorIF v) {
        return v.visitaTriangulo(this);
    }
    
    public abstract double getPerimetro();    
    
}
