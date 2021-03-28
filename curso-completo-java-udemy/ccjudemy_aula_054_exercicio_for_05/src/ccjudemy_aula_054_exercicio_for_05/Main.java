package ccjudemy_aula_054_exercicio_for_05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int N = sc.nextInt();
		int fatorial = 1;
		
		if (N == 0 ) {
			System.out.println(fatorial);
		}
		else {
			for (int i = N; i >= 1; i--) {
				fatorial = fatorial * i;
				
			}
			System.out.println(fatorial);
		}
		sc.close();

	}

}
