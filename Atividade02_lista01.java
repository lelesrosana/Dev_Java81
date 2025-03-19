package Modulo07_lista01;

import java.util.Scanner;

public class Atividade02_lista01 {
	public static void main(String[]args) {

		Scanner read = new Scanner(System.in);
	
		System.out.println("O rpograma lê um número inteiro e indica se é par ou impar e inteiro ou negativo. ");
	
		System.out.println("Informe um valor: ");
		int numberInt = read.nextInt();
		
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