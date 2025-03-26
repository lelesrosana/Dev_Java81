package Modulo07;

import java.util.Scanner;

public class Atividade06_lista02 {
	
	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}
	
	public static void main(String[]args) {		
		Scanner read = new Scanner(System.in);
		String collaboratorName;
		int identificationCode;
		float currentWage;
		
		Limpatela();
		System.out.println("O sistema analisa uma tabela de funcionários e devolve o reajuste salarial do respectivo funcionário");
		System.out.println("Informe o nome do colaborador: ");
		collaboratorName = read.nextLine();
		Limpatela();
		
		System.out.println("Infome o código identificador: ");
		identificationCode = read.nextInt();
		Limpatela();
		
		System.out.println("Infore o salário atual: ");
		currentWage = read.nextFloat();
		Limpatela();
		
		switch (identificationCode) {
		case 1: 
			currentWage += currentWage*0.1;
			System.out.printf("\nNome do colaborador: " + collaboratorName + "\nCargo: Gerente\nSalário Reajustado R$: %.2f%n", currentWage);
			break;
		case 2: 
			currentWage += currentWage*0.07;
			System.out.printf("\nNome do colaborador: " + collaboratorName + "\nCargo: Vendedor\nSalário Reajustado R$: %.2f%n", currentWage);
			break;
		case 3: 
			currentWage += currentWage*0.09;
			System.out.printf("\nNome do colaborador: " + collaboratorName + "\nCargo: Supervisor\nSalário Reajustado R$: %.2f%n", currentWage);
			break;
		case 4: 
			currentWage += currentWage*0.06;
			System.out.printf("\nNome do colaborador: " + collaboratorName + "\nCargo: Motorista\nSalário Reajustado R$: %.2f%n", currentWage);
			break;		
		case 5: 
			currentWage += currentWage*0.05;
			System.out.printf("\nNome do colaborador: " + collaboratorName + "\nCargo: Estoquista\nSalário Reajustado R$: %.2f%n", currentWage);
			break;	
		case 6: 
			currentWage += currentWage*0.08;
			System.out.printf("\nNome do colaborador: " + collaboratorName + "\nCargo: Técnico de TI\nSalário Reajustado R$: %.2f%n", currentWage);
			break;
		default: 
			System.out.println("\nValor inválido. Fim da pesquisa.");
		}	
	}
}
