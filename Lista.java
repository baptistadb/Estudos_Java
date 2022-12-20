package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> nomeLista = new ArrayList<>();
		
		System.out.println("Quantos nomes voce deseja inserir?");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite os nomes: ");
		
		for(int i = 0; i<n; i++) {
			String nome = sc.nextLine();
			nomeLista.add(nome);
		}
		
		System.out.println("Nomes Inseridos: ");
		
		for(String x : nomeLista) {
			System.out.println(x);
		}
		
		System.out.println("Remova um nome da lista: ");
		String del = sc.nextLine();
		nomeLista.remove(del);
		
		System.out.println("Lista atualizada: ");
		
		for(String x : nomeLista) {
			System.out.println(x);
		}
			
		//nomeLista.remove("Danilo");
		//nomeLista.removeIf(z -> z.charAt(0) == 'D');
			
		sc.close();
		
		

	}

}
