package Modulo10;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Atividade03 {

	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Set<Integer> setNumber = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			Limpatela();
			System.out.println("Digite um valor inteiro: ");
			if (read.hasNextInt()) {
				setNumber.add(read.nextInt());
				Limpatela();

			} else {
				System.out.println("Entrada inválida");
			}
			// read.nextLine();
		}

		Iterator<Integer> Number = setNumber.iterator();
		while (Number.hasNext()) {
			System.out.println("Lista de números: ");
			System.out.println(Number.next());
		}
	}
}
