package ccjudemy_aula_37_exercicio_estrutura_condicional_01;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		int numero;
		
		numero =  sc.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
			
		}
		
		
		sc.close();

	}

}
