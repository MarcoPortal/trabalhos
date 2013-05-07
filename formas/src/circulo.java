
public class circulo extends figura{
	
	public circulo(double raio) {
		super();
		this.raio = raio;
	}
	
	protected double raio;
	public static final double PI = 3.1415;
	
	public double calculaArea(){ 
		return PI * raio * raio; 
	}
	
	public double calculaPerimetro(){
		return 2 * PI * raio;
	}
	
}
