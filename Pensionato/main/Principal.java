package main;

import java.util.Scanner;
import entidades.Pessoas;

public class Principal {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Pessoas[] vet = new Pessoas[10];
		
		System.out.println("Quantos quartos serão alugados?");
		int qntdQuarto = sc.nextInt();
			
		for(int i = 1; i<=qntdQuarto;i++) {
			System.out.println("Informações do Aluguel #" + (i) + ": ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Quarto desejado: ");
			int numQuarto = sc.nextInt();
			vet[numQuarto] = new Pessoas(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for(int i = 0; i<10; i++) {
			if (vet[i] != null) {
				System.out.println(i + ": " + vet[i]);
			}
		}
	
		
		sc.close();
	}

}