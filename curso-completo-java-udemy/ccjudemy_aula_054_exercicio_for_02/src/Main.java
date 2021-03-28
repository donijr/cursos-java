import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		
		int N = sc.nextInt();
		int quantidadeIn = 0;
		int quantidadeOut = 0;
		
		
		for (int i = 0; i < N; i++) {
			
			int num = sc.nextInt();
			
			if (num >= 10 && num <= 20) {
				quantidadeIn++;
			} 
			else {
				quantidadeOut++;
			}
			
		}
		
		System.out.println(quantidadeIn + " in");
		System.out.println(quantidadeOut + " out");
		
		sc.close();

	}

}
