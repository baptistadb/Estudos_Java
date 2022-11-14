package admEstoque;

import java.util.Scanner;

import entidade.Produto;

public class estoque {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome do produto: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço do produto: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		produto.qntd = sc.nextInt();
		
		System.out.println(produto);
		
		System.out.println("\n Opções: \n \n 1. Para adicionar quantidade a um produto \n 2. Para retirar a quantidade de um produto \n 3. Para encerrar o programa");
		int resposta = sc.nextInt();

		if (resposta == 1) {
			System.out.print("   Quantidade: ");
			int entrada_produto = sc.nextInt();
			produto.entrada(entrada_produto);
			System.out.println("   A quantidade de produtos agora e " + produto.qntd);
		}
		
		else if (resposta == 2) {
			
			System.out.print("   Quantidade: ");
			int saida_produto = sc.nextInt();
			produto.saida(saida_produto);
			System.out.println("   A quantidade de produtos agora e " + produto.qntd);
		}
		
		else {
			
			System.out.println("Programa encerrado!");
		}
		
		sc.close();
		
	}

}
