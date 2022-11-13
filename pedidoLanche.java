import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int pedido;
		
		System.out.println("Cardapio: \n\n 1. X-Salada: R$ 18,00 \n 2. X-Bacon: R$ 20,00 \n 3. X-Burguer: 16,50 \n 4. Refrigerante: 5,00");
		pedido = sc.nextInt();
		
		if (pedido == 1) {
			System.out.println("Voce escolheu um X-Salada");
		}
		else if (pedido == 2) {
			System.out.println("Voce escolheu um X-Bacon");
		}
		else if (pedido == 3) {
			System.out.println("Voce escolheu um X-Burguer");
		}
		else if (pedido == 4) {
			System.out.println("Voce escolheu um Refrigerante");
		}
		
				
	}

}
