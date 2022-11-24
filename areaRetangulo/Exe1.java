package exercicio;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Digite a largura do triangulo: ");
		retangulo.largura = sc.nextInt(); 		
		System.out.print("Digite a altura do triangulo: ");
		retangulo.altura = sc.nextInt(); 
		
		System.out.printf("AREA = " + retangulo.area()+"\n");
		System.out.printf("AREA = " + retangulo.perimetro());
		
		
		
		
		sc.close();		
		
	}

}
