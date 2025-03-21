package Modulo09;

import java.util.Scanner;

public class Atividade01 {
	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int integerNumber = 0, position = 0, count = 0;
		int[] vector = new int[] { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.println("Digite um número inteiro: ");
		integerNumber = read.nextInt();
		Limpatela();

		for (int i = 0; i < 10; i++) {
			if (vector[i] == integerNumber) {
				position = i;
				count++;
				i += 10; // força a saída.
			}
		}
		if (count == 1) {
			System.out.println("\nNúmero " + integerNumber + " está na posição " + (position) + "° do vetor.\n");

		} else {
			System.out.println("Valor não encontrado");
		}
	}
}
