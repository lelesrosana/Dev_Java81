package Modulo07;

import java.util.Scanner;

public class Atividade07_lista02 {

	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Programa de cálculos.\n");

		System.out.println("Digite primeiro valor: ");
		float numberOne = read.nextFloat();
		Limpatela();

		System.out.println("Digite segundo valor: ");
		float numberTwo = read.nextFloat();
		Limpatela();

		System.out.println("Digite um número entre 1 e 4 para selecionar o operação matemática: ");
		int operationCode = read.nextInt();
		Limpatela();

		switch (operationCode) {
		case 1:
			float result1 = numberOne + numberTwo;
			System.out.printf("Resultado: %.1f +  %.1f = %.1f %n", numberOne, numberTwo, result1);
			break;

		case 2:
			float result2 = numberOne - numberTwo;
			System.out.printf("Resultado: %.1f -  %.1f = %.1f %n", numberOne, numberTwo, result2);
			break;

		case 3:
			float result3 = numberOne * numberTwo;
			System.out.printf("Resultado: %.1f *  %.1f = %.1f %n", numberOne, numberTwo, result3);
			break;

		case 4:
			float result4 = numberOne / numberTwo;
			System.out.printf("Resultado: %.1f /  %.1f = %.1f %n", numberOne, numberTwo, result4);
			break;
		default:
			System.out.println("Valor inválido. Fim do programa.");
		}
	}
}
