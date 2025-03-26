package Modulo07;

import java.util.Scanner;

public class Atividade03_lista01 {

	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		boolean donation = true;
		
		
		Limpatela();
		System.out.println("Programa para doador de sangue!");
		System.out.println("Informe o nome completo do doador: ");
		String fullName = read.nextLine();
		Limpatela();

		System.out.println("Informe idade: ");
		int age = read.nextInt();
		Limpatela();

		System.out.println("É a primeira doação de sangue (SIM / NAO) ");

		// donation = read.nextBoolean();
		donation = read.next().equalsIgnoreCase("NAO");
		System.out.println(donation);
		Limpatela();

		// Aceita idade 18 ate 69
		// condiça
		if (18 <= age && age <= 69) {
			if (age < 60) {
				System.out.println(fullName + " está apto a doar sangue!");
			} else {
				if (donation) {
					System.out.println(fullName + " está apto a doar sangue!");
				} else {
					System.out.println(fullName + " não está apto a doar sangue!");
				}
			}
		} else {
			System.out.println(fullName + " não está apto a doar sangue!");
		}
	}
}
