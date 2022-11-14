import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		int resposta, soma;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Algoritmo 'Soma': Os numeros serão somados ate que seja digitado o numero 0 para interromper o programa");
		System.out.println("Digite um numero: ");
		resposta = sc.nextInt();
		
		soma = 0;		
		while (resposta != 0 ) {	
			
			soma += resposta;
			System.out.println("Digite um numero: ");
			resposta = sc.nextInt();
			
		}
		
		System.out.println("Programa encerrado!");
		System.out.println(soma);
		sc.close();

	}

}
