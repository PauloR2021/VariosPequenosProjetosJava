package application;

import java.util.Random;
import java.util.Scanner;

public class jogoAdivinha {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Random random = new Random();
		
		int aleatorio = random.nextInt(0,10);
		
		
		while(true) {
			
			System.out.print("Digite um Número de 0 À 10: ");
			
			int numero = sc.nextInt();
			
			
			if(aleatorio == numero) {
				System.out.println("Parabens! Voce Acertou o numero aleatorio " +aleatorio);
				break;
			}
			else {
				System.out.println("Você errou o número...");
			}
			
			
		}
		
		
	}

}
