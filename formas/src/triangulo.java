
public class triangulo extends figura {
	
	private double[] lados;
	
	public triangulo(double lado1, double lado2, double lado3) { // construtor
		lados = new double[3];
		
		lados[0] = lado1;
		lados[1] = lado2;
		lados[2] = lado3;
		
	}	
		
	
	public double calculaArea(){ 
		double semiperimetro = calculaPerimetro() / 2;
		double delta = semiperimetro * (semiperimetro - lados[0])
                                     * (semiperimetro - lados[1])
	                                 * (semiperimetro - lados[2]);
	return Math.sqrt(delta);
	}
	
	public double calculaPerimetro(){
		return lados[0] + lados[1] + lados[2];
	}
}
