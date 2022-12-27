package exercicio;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2022-01-12");
		LocalDateTime d05 = LocalDateTime.parse("2022-01-12T05:30:08");
		Instant d06 = Instant.parse("2022-01-12T05:30:08Z");
		Instant d07 = Instant.parse("2022-01-12T05:30:08-03:00");
		LocalDate d08 = LocalDate.parse("12/01/1995", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
				
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		
	}

}
