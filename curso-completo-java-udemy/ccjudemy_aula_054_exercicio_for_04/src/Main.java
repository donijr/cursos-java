import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int  i = 0; i < N; i++) {
			int valor1 = sc.nextInt();
			int valor2 = sc.nextInt();
			
			if (valor2 == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double resultado = (double) valor1 / (double) valor2;
				System.out.printf("%.1f%n", resultado);
			}
			
		}
		
		sc.close();

	}

}
