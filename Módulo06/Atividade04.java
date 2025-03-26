package Módulo06;

import java.util.Scanner;

public class Atividade04 {
	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		Limpatela();
		System.out.println("Digite o 1° número: ");
		Float n1 = read.nextFloat();
		Limpatela();

		System.out.println("Digite o 2° número: ");
		Float n2 = read.nextFloat();
		Limpatela();

		System.out.println("Digite o 3° número: ");
		Float n3 = read.nextFloat();
		Limpatela();

		System.out.println("Digite o 4° número: ");
		Float n4 = read.nextFloat();
		Limpatela();

		float productDifference = ((n1 * n2) - (n3 * n4));
		System.out.println("1° número:" + n1 +"	2° número:" + n2 + "	3° número:" + n3 + "	4° número:" + n4 );
		System.out.println("\nDiferença entre o produto dos dois primeiros números com o produto dos dois últimos é: " + productDifference);
	}
}