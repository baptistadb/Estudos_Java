import java.util.Scanner;

public class testeFor {

	public static void main(String[] args) {
		

		int resposta, i, valor;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Algoritmo 'SomaFor': Determine uma quantidade de valores que serão somados e impresso ao final.");
		System.out.println("Quantos numeros serão digitados?");
		resposta = sc.nextInt();
		
		int soma = 0;
		for(i=0; i < resposta ; i++) {
			
			System.out.println("Digite os valores:");
			valor = sc.nextInt();
			
			soma += valor;
			
			
		}
		
		System.out.println("Soma dos valores: ");
		System.out.println(soma);		
		
		sc.close();
		

	}

}
