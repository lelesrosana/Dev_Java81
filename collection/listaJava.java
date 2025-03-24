package collection;

import java.util.Scanner;
import java.util.ArrayList;


public class listaJava {
	public static void main(String[]args) {
		
		Scanner read = new Scanner (System.in);	
		ArrayList<Double>notas = new ArrayList<Double>();
		
		
		System.out.println("DIgite primeiro nota");
		notas.add(read.nextDouble());
		
		notas.add(7.0);
		
		System.out.println(notas);
		
		for (Double nota: notas) {
			System.out.println(nota);
		}

		notas.sort(null);
		
		System.out.println("----------------------");
		
		for(Double nota : notas) {
			System.out.println(nota);
		
		}
		
		System.out.println("A posição da nota é: "+ notas.indexOf(read.nextDouble()));
	}
	
}
