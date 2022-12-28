package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidadeEnums.NivelCargo;
import entidades.ContratoHora;
import entidades.Departamento;
import entidades.Trabalhador;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Digite o nome do departamento: ");
		String dep = sc.nextLine();
		
		System.out.println();
		System.out.println("Digite os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Cargo: ");
		String cargoTrabalhador = sc.nextLine();
		System.out.print("Salario Base: ");
		double salBase = sc.nextDouble();
		Trabalhador trab = new Trabalhador(nomeTrabalhador, NivelCargo.valueOf(cargoTrabalhador), salBase, new Departamento(dep));
		
		System.out.println("Quantos contratos esse trabalhador terá? ");
		int numContrato = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<numContrato; i++) {
			System.out.println("Dados do contrato " + (i+1));
			System.out.print("Data(DD/MM/AAAA): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por Hora: ");
			double valorHora = sc.nextDouble();
			System.out.print("Duracao: ");
			int duracao = sc.nextInt();
			sc.nextLine();
			ContratoHora ch = new ContratoHora(dataContrato, valorHora, duracao);
			trab.addContrato(ch);
		}
		
		System.out.println();
		System.out.print("Digite o mes e o ano para calcular os ganhos (MM/AAAA): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		System.out.println("Nome: " + trab.getNome());
		System.out.println("Departamento: " + trab.getDepartamento().getNome());
		System.out.println("Beneficios: " + mesEAno + ": " + String.format("%.2f", trab.recebidos(ano, mes)));
		
		
		sc.close();

	}
}