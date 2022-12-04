package exercicio;

import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		
			System.out.print("Quantos numeros voce vai digitar? ");
			int resposta = sc.nextInt();
			int[] vet = new int[resposta];
		
			System.out.println("Digite os numeros abaixo: ");
		
			for (int i=0; i<vet.length; i++) {
				sc.nextLine();
				vet[i] = sc.nextInt();
			}
			
			
			System.out.print("Valores: ");
			
			for (int i=0; i<vet.length; i++) {
				System.out.print(vet[i] +" ");
			}
			
			int soma = 0;
			for (int i=0; i<vet.length; i++) {
				soma += vet[i];
				
			}
			
			System.out.println();
			System.out.print("Soma: " + soma);
			System.out.println();
			System.out.println("Media: " + soma / resposta);
			
			
			
			
			
			sc.close();
	}
	
}
	


