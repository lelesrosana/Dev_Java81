package Modulo07_lista01;

import java.util.Scanner;

public class Atividade03_lista01 {
	public static void main(String[]args) {
				
		Scanner read = new Scanner(System.in);
		
		System.out.println("Programa para doador de sangue!");
		
		System.out.println("Infomre o nome completo do doador: ");
		String fullName = read.nextLine();
		
		System.out.println("Informe idade: ");
		int age = read.nextInt();
		
		System.out.println("É a primeira doação de sangue (true / false) ");	
		boolean donation = read.nextBoolean();
		
		
		// Aceita idade 18 ate 69
		// condição de nao ser a primeira vez, idade 60 ate 69
		
		if (18 <= age  && age <= 69) {
			if(age < 60 ){
				System.out.println(fullName + " está apto a dora sangue!");
			}else {
				if( donation == false) {
					System.out.println(fullName + " está apto a dora sangue!");
				} else {
					System.out.println(fullName + " não está apto a dora sangue!");
				}	
			}		
		}else {
			System.out.println(fullName + " não está apto a dora sangue!");
			
		}	
	}	
}
