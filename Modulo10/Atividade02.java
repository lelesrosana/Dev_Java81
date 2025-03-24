package Modulo10;

import java.util.Scanner;
import java.util.ArrayList;

public class Atividade02 {

	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		ArrayList<Integer> listValue = new ArrayList<Integer>();
		boolean continueQuest = true;

		listValue.add(0, 2);
		listValue.add(1, 5);
		listValue.add(2, 1);
		listValue.add(3, 3);
		listValue.add(4, 4);
		listValue.add(5, 9);
		listValue.add(6, 7);
		listValue.add(7, 8);
		listValue.add(8, 10);
		listValue.add(9, 6);

		do {
			Limpatela();
			System.out.println("Digite um valor inteiro para que seja verificado na lista: ");
			int checkNumber = read.nextInt();
			Limpatela();

			if (listValue.contains(checkNumber) == true) {
				System.out.println(
						"\nValor " + checkNumber + " localizado na posição: " + listValue.indexOf(checkNumber));
			} else {
				System.out.println("\nNão encontrado!");
			}
			System.out.println("\n\nDeseja continuar? (SIM / NÃO)");
			continueQuest = read.next().equalsIgnoreCase("SIM");
		} while (continueQuest);

		Limpatela();
		System.out.println("Fim da pesquisa. ");
	}
}
