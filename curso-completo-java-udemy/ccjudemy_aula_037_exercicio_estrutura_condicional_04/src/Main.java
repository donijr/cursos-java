import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, tempoJogo;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			tempoJogo = horaFinal - horaInicial;
			
		} 
		else {
			tempoJogo = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + tempoJogo + " HORA(S)");
		sc.close();
		

	}

}
