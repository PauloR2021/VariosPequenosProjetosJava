package application;

import java.util.Locale;
import java.util.Scanner;

public class conversorDeTemperatura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite sua Temperatura em Celsius: ");
		double celsius = sc.nextDouble();
		
		sc.close();
		
		double fahrenheit = (celsius * 9/5) + 32;
		System.out.printf("A temperatura de " +celsius+ " Celsius.Para Fahrenheit é de : "+fahrenheit);
	}

}
