package Modulo07_lista01;

import java.util.Scanner;

public class Atividade01_lista01 {
	public static void main (String[]args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("O programa soma A + B e compara se o resultado maior do que C. ");
		
		System.out.println("Informe o valor de A: ");
		int valueA = read.nextInt();
		
		System.out.println("Informe o valor de  B: ");
		int valueB = read.nextInt();
		
		System.out.println("Informe o valor de C: ");
		int valueC = read.nextInt();
		
		int sumNumbers = (valueA + valueB);

		
		if(sumNumbers > valueC) {
			System.out.println("A soma de A + B é maior do que C.");
		} else if (sumNumbers < valueC ) {
			System.out.println("A soma de A + B é menos do que C.");
		} else {
			System.out.println("A soma de A + B é igual a C.");
		}
		
		
	}

}
