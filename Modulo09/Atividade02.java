package Modulo09;

import java.util.Scanner;

public class Atividade02 {

	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float average = 0;
		int[] vector = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um inteiro: ");
			vector[i] = read.nextInt();
			Limpatela();
			average += vector[i];
		}

		System.out.println("Elementos pares: ");
		for (int i = 0; i < 10; i++) {
			if (vector[i] % 2 == 0) {
				System.out.println(vector[i]);
			}
		}

		System.out.println("Elementos impares: ");
		for (int i = 0; i < 10; i++) {
			if (vector[i] % 2 != 0) {
				System.out.println(vector[i]);
			}
		}

		System.out.printf("Soma: %d ", (int) average);
		System.out.printf("%nMédia: %.2f%n", average / 10);
	}
}
