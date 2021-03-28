import java.util.Locale;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		float x, y;
		
		x = sc.nextFloat();
		y = sc.nextFloat();
		
		if (x == 0.0f && y == 0.0f) {
			System.out.println("Origem");
		} 
		else if (x == 0.0f) {
			System.out.println("Eixo X");
		} 
		else if (y == 0.0f) {
			System.out.println("Eixo Y");
		} 
		else if (y > 0.0f && x > 0.0f) {
			System.out.println("Q1");
		}
		else if (y > 0.0f  && x < 0.0f) {
			System.out.println("Q2");
		}
		else if (y < 0.0f && x < 0.0f) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		sc.close();
		

	}

}
