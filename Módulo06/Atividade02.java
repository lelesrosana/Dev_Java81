package Módulo06;

import java.util.Scanner;

public class Atividade02 {

	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void main(String[] args) {
		float mean = 0;

		Scanner read = new Scanner(System.in);
		Limpatela();
		System.out.println("Informe a Nota da P1: ");
		Float p1 = read.nextFloat();
		Limpatela();

		System.out.println("Informe a  nota da P2: ");
		Float p2 = read.nextFloat();
		Limpatela();

		System.out.println("Informe a nota da P3: ");
		Float p3 = read.nextFloat();
		Limpatela();

		System.out.println("Informe a nota da P4: ");
		Float p4 = read.nextFloat();
		Limpatela();

		mean = (p1 + p2 + p3 + p4) / 4;
		System.out.print(String.format("Média final do aluno : %.1f", mean));
	}
}