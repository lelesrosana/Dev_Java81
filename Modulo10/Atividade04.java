package Modulo10;

import java.util.Scanner;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Atividade04 {

	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Set<Integer> listValue = new HashSet<Integer>();
		boolean continueQuest = true;

		listValue.add(2); // Set nao usa indice
		listValue.add(5);
		listValue.add(1);
		listValue.add(3);
		listValue.add(4);
		listValue.add(9);
		listValue.add(7);
		listValue.add(8);
		listValue.add(10);
		listValue.add(6);

		do {
			Limpatela();
			System.out.println("Digite um valor para ser pesquisado na lista: ");
			int inputNumber = read.nextInt();
			Limpatela();

			if (listValue.contains(inputNumber)) {
				System.out.println("Número " + inputNumber + " encontrado! ");
			} else {
				System.out.println("O número " + inputNumber + " não foi encontrado! ");
			}
			System.out.println("\nDeseja continuar? (SIM / NÃO");
			continueQuest = read.next().equalsIgnoreCase("SIM");
		} while (continueQuest);
		Limpatela();
		System.out.println("Fim do programa.");
	}
}
