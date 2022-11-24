package exercicio;

public class Retangulo {

	int altura;
	int largura;
	
	
	public int area() {
		
		return largura * altura;
		
	}
	
	public int perimetro() {
		
		return 2*(this.largura + this.altura);
	}
	

}
