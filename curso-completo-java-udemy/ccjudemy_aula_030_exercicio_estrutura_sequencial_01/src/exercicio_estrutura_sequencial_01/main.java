package exercicio_estrutura_sequencial_01;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		int num1, num2, soma;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();

	}

}
