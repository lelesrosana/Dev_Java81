package Modulo08;

import java.util.Scanner;

public class Atividade02 {
	
	
	
	public static void limpatela() {   //  metodo pesquisado
		for (int i = 0; i < 50; i++)
			System.out.println();
	}
	
	
	
	public static void main(String[]args) {
		int evenNumber = 0, oddNumber = 0;
		Scanner read = new Scanner(System.in);
		
		
		System.out.println("O programa recebe 10 números inteiros e retorna a quantidade de pares e impares.");

		
		for(int i = 1; i <= 10; i ++) {
			System.out.println("Informe " + i + "° número: ");		
			int numberInput = read.nextInt();
			limpatela();
			
			if(numberInput % 2 == 0) {
				evenNumber ++;
	
			}else {
				oddNumber ++;		
			}
		}
		System.out.println("Total de números pares: " + evenNumber);
		System.out.println("Total de números impares: " + oddNumber);
		
	}
}
