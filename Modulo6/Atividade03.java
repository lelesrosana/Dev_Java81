package Modulo6;

import java.util.Scanner;

public class Atividade03 {

	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void main(String[] args) {
		float salarioLiquido = 0;

		Scanner read = new Scanner(System.in);
		Limpatela();
		System.out.println("Informe o valor do Salário Bruto R$: ");
		float grossSalary = read.nextFloat();
		Limpatela();

		System.out.println("Informe o valor do Adicional Noturno R$: ");
		float additionalNight = read.nextFloat();
		Limpatela();

		System.out.println("Informe a quantidade de Horas Extras: ");
		float extraHours = read.nextFloat();
		Limpatela();

		System.out.println("Informe os Descontos do colaborador R$: ");
		float discount = read.nextFloat();
		Limpatela();

		salarioLiquido = grossSalary + additionalNight + (extraHours * 5) - discount;

		System.out.print(String.format("Salário Líquido: R$  %.2f  ", salarioLiquido));
	}
}