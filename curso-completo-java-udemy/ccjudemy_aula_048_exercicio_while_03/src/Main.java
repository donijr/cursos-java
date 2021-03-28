import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int somaAlcool = 0;
		int somaGasolina = 0;
		int somaDiesel = 0;
		
		int codigo = 0;
		
		while (codigo != 4) {
			codigo = sc.nextInt();
			if (codigo == 1) {
				somaAlcool += 1;
			} else if (codigo == 2) {
				somaGasolina +=  1;
			} else if (codigo == 3) {
				somaDiesel += 1;
			} else if (codigo == 4) {
				System.out.println("MUITO OBRIGADO");
			}	
			
		}
		
		System.out.println("Alcool: " + somaAlcool);
		System.out.println("Gasolina: " + somaGasolina);
		System.out.println("Diesel: " + somaDiesel);
		sc.close();
	}

}
