import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int A, B,resultado;
		resultado = 0;
		
		A = sc.nextInt();
		B = sc.nextInt();
		

		if (A > B) {
			resultado = A % B;
		} else if (B > A ) {
			resultado = B % A;
		}
		
		if (resultado == 0) {
			System.out.println("Sao Multiplos");
		} 
		else {
			System.out.println("Nao sao Multiplos");
		} 
				
		
		
		sc.close();

	}

}
