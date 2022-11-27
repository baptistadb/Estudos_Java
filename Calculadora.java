package exercicio;

import java.util.Scanner;

public class Calculadora{

	public static void main(String[] args) {
		
		
		double resultado = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		double num1 = sc.nextDouble();
		System.out.println("Digite o segundo numero: ");
		double num2 = sc.nextDouble();
			
		System.out.println("Selecione o operador: \n 1. Soma \n 2. Subtração \n 3. Multiplicação \n 4. Divisão");
		int operador = sc.nextInt();
		
		if (operador == 1) {
			resultado = num1 + num2;
		}
		
		else if (operador == 2) {
			resultado = num1 - num2;
		}
		
		else if (operador == 3) {
			resultado = num1 * num2;
		}
		else if (operador == 4) {
			resultado = num1 / num2;
		}
		
		System.out.printf("O resultado é: %.2f", resultado);
		
		sc.close();
		
		
	}

}
