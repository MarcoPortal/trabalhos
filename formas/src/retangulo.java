
public class retangulo extends figura{
	
	public retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	protected double base, altura;
	
	public double calculaArea() { 
		return base * altura; 
	}
	
	public double calculaPerimetro() { 
		return 2 * ( base + altura ); 
}
	
}
