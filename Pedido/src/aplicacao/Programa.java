package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItemPedido;
import entidades.Pedido;
import entidades.Produto;
import entidadesEnums.StatusPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento(DD/MM/AAAA): ");
		Date dataNasc = sdf1.parse(sc.next());
		System.out.println();
		Cliente cliente = new Cliente(nome, email, dataNasc);
		//System.out.println(cliente);
		
		System.out.println("Digite o status do pedido: ");
		String status = sc.nextLine();
		System.out.print("Status: " + status);
		StatusPedido statusPedido = StatusPedido.valueOf(sc.next());
		
		System.out.println("Quantos pedidos serao feitos? ");
		int qntdpedido = sc.nextInt();
		sc.nextLine();
		
		Pedido pedido = new Pedido(new Date(), statusPedido, cliente);
		
		for(int i = 0; i<qntdpedido;i++) {
			System.out.println("Digite os dados do pedido #"+(1+i));
			System.out.print("Nome do Produto: ");
			String nomeProd = sc.nextLine();
			System.out.print("Preco do Produto:");
			Double precoProd = sc.nextDouble();
			System.out.print("Quantidade do Produto:");
			int qntdProd= sc.nextInt();
			sc.nextLine();
			Produto produto = new Produto(nomeProd, precoProd);
			ItemPedido itempedido = new ItemPedido(qntdProd, precoProd, produto);
			pedido.addItem(itempedido);		
			
		}
		
		System.out.println();
		System.out.println(pedido);
		
		sc.close();

	}

}
