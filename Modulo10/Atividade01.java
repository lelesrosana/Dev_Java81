package Modulo10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Atividade01 {

	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println("");
	}

	public static void main(String[] args) {

		ArrayList<String> fiveColors = new ArrayList<String>();
		Scanner read = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			Limpatela();
			System.out.println("Digite uma cor: ");
			fiveColors.add(read.nextLine());
			Limpatela();
			if (i == 4) {
				System.out.println("Lista com todas as cores: ");

				for (String colors : fiveColors) {
					System.out.println(colors);
				}

				System.out.println("\n\nCores ordenadas por ordem alfabética: ");
				Collections.sort(fiveColors);
				for (String colors : fiveColors) {
					System.out.println(colors);
				}
			}
		}
	}
}
