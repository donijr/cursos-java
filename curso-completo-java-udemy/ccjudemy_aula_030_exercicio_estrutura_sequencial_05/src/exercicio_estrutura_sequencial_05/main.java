package exercicio_estrutura_sequencial_05;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, quantidadePeca1;
		int codigoPeca2, quantidadePeca2;
		double valorPeca1, totalPeca1;
		double valorPeca2, totalPeca2;
		double totalPagar;
		
		codigoPeca1 = sc.nextInt();
		quantidadePeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		codigoPeca2 = sc.nextInt();
		quantidadePeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		totalPeca1 = quantidadePeca1 * valorPeca1;
		totalPeca2 = quantidadePeca2 * valorPeca2;
		
		totalPagar = totalPeca1 + totalPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPagar);
		
		
		
		
		
		sc.close();

	}

}
