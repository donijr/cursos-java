import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int codigoItem, quantidadeItem;
		double precoItem = 0, total;
		
		codigoItem = sc.nextInt();
		quantidadeItem = sc.nextInt();
		
		if (codigoItem == 1) {
			precoItem = 4.00;
		} else if (codigoItem == 2) {
			precoItem = 4.50;
		} else if (codigoItem == 3) {
			precoItem = 5.00;
		} else if (codigoItem == 4) {
			precoItem = 2.00;
		} else if (codigoItem == 5) {
			precoItem = 1.50;
		}
		
		total = quantidadeItem * precoItem;
		
		System.out.printf("Total: R$ ", total);
		
		sc.close();
	}
}
