package Modulo11;

import java.util.Scanner;
import java.util.Iterator;
import java.util.Stack;

public class Atividade02 {
	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		boolean continueQuest = true;

		Limpatela();
		System.out.println("**************************************************************");
		System.out.println("\n1 Adicionar livro" + "\n2 Para ver todos os livros da pilha"
				+ "\n3 Retirar um livro da pilha \r\n" + "\n0 Para finalizar\n");
		System.out.println("**************************************************************");

		while (continueQuest) {

			System.out.println("Escolha uma opção: ");
			int option = read.nextInt();
			read.nextLine();

			Limpatela();
			if (option == 1) {
				System.out.println("\nInforme o nome do livro que deseja asicionar: ");
				String aditionalBook = read.nextLine();
				pilha.push(aditionalBook);
				Limpatela();
			} else if (option == 2) {
				if (pilha.isEmpty()) {
					System.out.println("\nNão há livros");
				} else {
					System.out.println("\nColeção de livros:" + pilha);
				}
			} else if (option == 3) {
				pilha.pop();
				System.out.println("\nRetirando o livro do topo: " + pilha );
				
			} else if (option == 0) {
				continueQuest = false;
			} else {
				System.out.println("\nValor inválido. Tente novamente.");
			}
		}
		Limpatela();
		System.out.println("Fim da consulta.");
	}
}
