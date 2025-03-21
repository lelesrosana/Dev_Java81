package Modulo09;

import java.util.Scanner;

public class Atividade03 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int[][] matrizx = new int[3][3];

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um número para a posição [" + linha + "][" + coluna + "]");
				matrizx[linha][coluna] = read.nextInt();
			}
		}
/*
		for (int i = 0; i < linha.length; i++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um número para a posição [" + linha + "][" + coluna + "]");
				matrizx[linha][coluna] = read.nextInt();
			}
		}
*/
	}

}
