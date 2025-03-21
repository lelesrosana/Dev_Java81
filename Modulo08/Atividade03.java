package Modulo08;

import java.util.Scanner;

public class Atividade03 {
	/*
	 * Tentativa de implementando com uma função para limpar a tela usando recursos
	 * da tabela ASCII \33 quando combinado modifica a saída do terminal [H mover o
	 * cursor para o canto superior [2J para apagar todo o conteúdo public static
	 * void limpandoTela() { System.out.print("\033[H\033[2J"); System.out.flush();
	 * // comando para a limpeza de buffer
	 */

	public static void limpatela() { // metodo pesquisado
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int age = 0, lessTwentyOne = 0, moreFifty = 0;

		System.out.println("Escolha o valor 1 para inicializar ou -1 para finalizar a contagem: ");
		int cont = read.nextInt();
		limpatela();

		if (cont >= 0) {
			System.out.println("\nDigite uma idade: ");
			age = read.nextInt();

			while (age >= 0) {
				limpatela();
				if (age < 21) {
					lessTwentyOne++;
				} else if (age > 50) {
					moreFifty++;
				}
				System.out.println("Digite uma idade ou -1 para finalizar a pesquisa: ");
				age = read.nextInt();
				limpatela();
			}
			System.out.println("\nPesquisa finalizada.");

		} else {
			System.out.println("Pesquisa finalizada.");

		}
		System.out.println("\nTotal de pessoas menores de 21 anos: " + lessTwentyOne);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + moreFifty);
	}

}
