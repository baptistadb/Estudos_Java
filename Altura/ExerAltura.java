package teste;


import java.util.Scanner;
import entidade.Pessoas;

public class ExerAltura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos pessoas serao digitadas? ");
		int resp = sc.nextInt();
		Pessoas[] vet = new Pessoas[resp];
		
		
		for (int i=0; i<resp; i++){
			sc.nextLine();
			System.out.println("Digite os dados da  " + (i+1) + "º Pessoa");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vet[i] = new Pessoas(nome, idade, altura);
			
		}

		
		double medAltura = 0;
		
		for (int i=0; i<resp; i++){
			medAltura += vet[i].getAltura();
		}
		
		double media = medAltura / resp;
		
		System.out.printf("Media: = %.2f%n", media);
			
		sc.close();
	}
}