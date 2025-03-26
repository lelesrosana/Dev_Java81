package Modulo07;

import java.util.Scanner;

public class Atividade01_lista01 {

	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		Limpatela();
		System.out.println("O programa soma A + B e compara se o resultado é maior do que C. ");
		System.out.println("\nInforme o valor de A: ");
		int valueA = read.nextInt();
		Limpatela();

		System.out.println("Informe o valor de  B: ");
		int valueB = read.nextInt();
		Limpatela();

		System.out.println("Informe o valor de C: ");
		int valueC = read.nextInt();
		Limpatela();

		int sumNumbers = (valueA + valueB);

		if (sumNumbers > valueC) {
			System.out.println("A:" + valueA + "	B:" + valueB + "	C:" + valueC);
			System.out.println("A soma de A + B é maior do que C.\n" + valueA + " + " + valueB + " = " + valueC);
		} else if (sumNumbers < valueC) {
			System.out.println("A:" + valueA + "	B:" + valueB + "	C:" + valueC);
			System.out.println("A soma de A + B é menor do que C.\n"+ valueA + " + " + valueB + " = " + valueC);
		} else {
			System.out.println("A:" + valueA + "	B:" + valueB + "	C:" + valueC);
			System.out.println("A soma de A + B é igual a C.\n"+ valueA + " + " + valueB + " = " + valueC);
		}

	}

}
