package Modulo11;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Atividade01 {

	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		boolean continueQuest = true;

		Limpatela();
		System.out.println("********************************************************");
		System.out.println("\n1 Para distribuir uma senha " + "\n2 Para ver a fila" + "\n3 Para chamar a próxima senha"
				+ "\n0 Para finalizar\n");
		System.out.println("********************************************************");

		while (continueQuest == true) {
			System.out.println("\nEscolha uma opção: ");
			int option = read.nextInt();
			read.nextLine(); // le a quebra e linha para evitar erro no Scanner read ( InputMismatchException
								// )

			Limpatela();
			if (option == 1) {
				System.out.println("\nInforme seu nome: ");
				String customerName = read.nextLine();
				fila.add(customerName);
				Limpatela();
			} else if (option == 2) {
				System.out.println("\nFila de espera: " + fila);
			} else if (option == 3) {
				if (fila != null) {
					String service = fila.poll();
					System.out.println("\nExibe próximo a receber atendimento: " + service);
					System.out.println("\nFila atualizada: " + fila);
				} else {
					System.out.println("\nFila vazia.");
				}
			} else if (option == 0) {
				continueQuest = false;
			} else {
				System.out.println("\nOpção inválida. Tente novamente.");
			}

		}
		Limpatela();
		System.out.println("\nFim do programa.");
	}
}
