package exercicio;

import java.util.Scanner;

public class ExercicioNegativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int resposta = sc.nextInt();
		int[] vet = new int[resposta];
		
		System.out.println("Digite os numeros abaixo: ");
		
		for (int i=0; i<resposta; i++) {
			sc.nextLine();
			vet[i] = sc.nextInt();
			
		}
		
		System.out.println("Numeros negativos digitados: ");
		for (int i=0; i<vet.length; i++) {
			if(vet[i]<0) {
				System.out.println(vet[i]);				
			}
			
		}
				
		sc.close();
		
	}

}
