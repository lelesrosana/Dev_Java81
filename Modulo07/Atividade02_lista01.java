package Modulo07;

import java.util.Scanner;

public class Atividade02_lista01 {
	
	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}
	
	public static void main(String[]args) {

		Scanner read = new Scanner(System.in);
	
		System.out.println("O programa lê um número inteiro e indica se ele é par ou impar e se é inteiro ou negativo. ");
	
		System.out.println("Informe um valor: ");
		int numberInt = read.nextInt();
		Limpatela();
		
		if(numberInt % 2 == 0 || numberInt == 0) {
			if(numberInt > 0){ 
				System.out.println("O número informado é par e positivo.");
			}else if(numberInt == 0){
				System.out.println("O número informado é par e neutro.");
			}else {
				System.out.println("O número informado é par e negativo.");
			}
		
		}else {
			if(numberInt > 0){
				System.out.println("O número informado é impar e positivo.");
			}else {
				System.out.println("O número informado é impar e negativo.");
			}
		}
	}
}