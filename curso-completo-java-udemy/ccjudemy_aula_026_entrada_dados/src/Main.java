import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double w;
		char z;
		
		//Pode ler dados na mesma linha separados por espaço.
		x = sc.next();
		y = sc.nextInt();
		w = sc.nextDouble();
		z = sc.next().charAt(0);
		
		System.out.println("Você Digitou: " + x);
		System.out.println("Você Digitou: " + y);
		System.out.println("Você Digitou: " + w);
		System.out.println("Você Digitou: " + z);

		
		sc.close();
	}

}
