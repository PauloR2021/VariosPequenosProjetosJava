package application;


import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		double resultado = 0.0;
		
		System.out.println("Digite um Número: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite a Operação: ");
		String operacao = sc.next();
		
		System.out.println("Digite o Segundo Número");
		double num2 = sc.nextDouble();
		
		
		switch(operacao) {
		
			case "+" :
				
				resultado = num1 + num2;
				break;
			
			case "-":
				resultado = num1 - num2;
				break;
			
			case "*":
				resultado = num1 * num2;
				break;
			
			case "/":
				resultado = num1 / num2;
				break;
			
			default:
				System.out.println("Operação não foi Realizada!!s");
		}
		
		
		
		 System.out.println(num1+" "+operacao+" "+num2+": "+resultado);

	}

}
