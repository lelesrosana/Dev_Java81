package Modulo09;

import java.util.Scanner;

public class Atividade03 {

	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int[][] matrizx = new int[3][3];

		for (int linha = 0; linha < matrizx.length; linha++) {
			Limpatela();
			for (int coluna = 0; coluna < matrizx.length; coluna++) {
				System.out.println("Digite um número para a posição [" + linha + "][" + coluna + "]");
				matrizx[linha][coluna] = read.nextInt();
			}
			Limpatela();
		}

		int i = 0, j = 0;
		while (i < 1) {

			while (j < 3) {

				System.out.println(" posição [" + matrizx[i] + "," + matrizx[j] + "]");
				i++;
				j += 1;
				System.out.println(i + "," + j);

			}

		}

		/*
		 * } for (int coluna = 0; coluna < matrizx.length; coluna ++) {
		 * 
		 * for (int linha = 0; linha < matrizx[coluna].length; linha ++) {
		 * System.out.println(matrizx[linha][coluna]); }
		 */
	}
}
