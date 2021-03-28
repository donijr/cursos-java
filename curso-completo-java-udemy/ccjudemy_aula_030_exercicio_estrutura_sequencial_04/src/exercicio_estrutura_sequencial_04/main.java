package exercicio_estrutura_sequencial_04;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFuncionario, horas;
		double salario, valorHora;
		
		numFuncionario = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		
		
		salario = valorHora * horas;
		
		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}
