package exercicio;

import java.util.Scanner;

public class ExeMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o tamanho da matriz?");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[][] mat = new int[n][n];
		
		for(int i=0; i<mat.length; i++) {
			for (int a=0; a<mat[i].length; a++) {
				mat[i][a] = sc.nextInt();
				
			}
		}
		
		System.out.println("Diagonal Principal: ");
		for(int i=0; i<mat.length;i++) {	
			System.out.println(mat[i][i]);
		}
		
		int numNegativo = 0;
		for(int i=0; i<mat.length;i++) {	
			for(int a=0; a<mat[i].length;a++) {
				if (mat[i][a]<0) {
					numNegativo++;
				}
			}
		}		
		
		System.out.println("Numeros negativos: " + numNegativo);
		
		sc.close();

	}

}
