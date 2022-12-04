package teste;

import java.util.Scanner;
import entidade.Operador;

public class Sys {

	public static void main(String[] args) {
		
		String nome;
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Cadastro de Conta\n");
		System.out.print("Primeiro passo:\nEscolha um numero para a conta e um nome para o titular.\n");	
		System.out.print("Numero da conta: ");
		int numConta= sc.nextInt();
		System.out.print("Nome do titular da conta: ");
		sc.nextLine();
		nome = sc.nextLine();
		System.out.print("Deseja fazer um deposito inicial? ");
		char resposta = sc.next().charAt(0);
		
		Operador op = new Operador(numConta, nome);
		
		if (resposta == 's') {
			System.out.println("Qual é o valor que será depositado?");
			double valor = sc.nextDouble();
			op.Deposito(valor);
			System.out.println(op);
			
		}
		
		else if(resposta == 'n') {
			System.out.println("Nome: " + op.getNome() + " Conta: " + op.getNumConta() + " Saldo atualizado: " + op.getSaldo());
		}
		
		System.out.println("Digite um valor para deposito?");
		double deposito = sc.nextDouble();
		op.Deposito(deposito);
		System.out.println(op);
		
		System.out.println("Digite um valor para saque?");
		double saque = sc.nextDouble();
		op.Saque(saque);
		System.out.println(op);
		
		
		
		sc.close();

	}

}