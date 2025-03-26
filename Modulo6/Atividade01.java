package Modulo6;

import java.util.Scanner;

public class Atividade01 {

	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int count = 0;
		Limpatela();
		System.out.println("O programa informa o reajuste salarial. \n");

		while (count >= 0) {

			System.out.println("Informe o valor do Salário R$: ");
			float wage = read.nextFloat();
			Limpatela();

			System.out.println("Informe o valor do Abono R$: ");
			float salaryBonus = read.nextFloat();
			Limpatela();

			float newSalary = wage + salaryBonus;

			System.out.print(String.format("O Novo salário é RS: %.2f%n", newSalary));

			System.out.println("\nPara continuar digite 1 ou -1 para sair.");
			count = read.nextInt();
			Limpatela();

		}
	Limpatela();
	System.out.println("\nPesquisa finalizada.");
	}

}