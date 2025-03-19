package Modulo07_lista01;

import java.util.Scanner;

public class Atividade04_lista01 {
	public static void main() {
		
		String characteristic01, characteristic02, characteristic03;
		
		Scanner read = new Scanner(System.in);
		
		
		System.out.println("O prorama analisa as características dos animais.");
		
		System.out.println("Escolha uma opção:  vertebrado ou invertebrado ");
		characteristic01 = read.nextLine();
		
		
		if (characteristic01.equals("vertebrado")){
			System.out.println("Escolha uma opção:  ave ou mamifero ");
			characteristic02 = read.nextLine();
			if(characteristic02.equals("ave")){
				System.out.println("Escolha uma opção: carnivoro ou onivoro ");
				characteristic03 = read.nextLine();
				if(characteristic03.equals("carnivoro")) {
					System.out.println("O animal escolhido é uma Agua.");
				}else {
					System.out.println("O animal escolhido é uma pomba.");
				}
			}else {
				System.out.println("Escolha uma opção: onivoro ou herbivoro ");
				characteristic03 = read.nextLine();
				if(characteristic03.equals("onivoro")) {
					System.out.println("O animal é um homem.");
				}else {
					System.out.println("O animal é uma vaca.");
				}
			}
			
		}else {
			System.out.println("Escolha uma opção: inseto ou anelideo ");
			characteristic02 = read.nextLine();
			if(characteristic02.equals("inseto")) {
				System.out.println("Escolha uma opção: hematofago ou herbivoro ");
				characteristic03 = read.nextLine();
				if(characteristic03.equals("hematofago")) {
					System.out.println("O animal é uma pulga.");
				}else {
					System.out.println("O animal é uma lagarta.");
				}
			}else
				System.out.println("Escolha uma opção: hematofago ou onivoro ");
				characteristic03 = read.nextLine();
				if(characteristic03.equals("onivoro")) {
					System.out.println("O animal é uma minhoca. ");
				}else {
					System.out.println("O animal é uma sanguessuga");
				}
		}	
		
	}
}
