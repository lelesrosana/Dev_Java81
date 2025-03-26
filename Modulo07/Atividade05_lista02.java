package Modulo07;

import java.util.Scanner;

public class Atividade05_lista02 {

	public static void Limpatela() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int value, amount;
		float priceToPay, soma = 0;
		boolean endBuy = true;
		String[] product = new String[] { "1° Cachorro Quente", "2° x-Salada", "3° X-Bacon", "4° Bauru",
				"5° Refrigerante", "6° Suco de laranja" };

		Limpatela();
		System.out.println("Cardápio da lanchonete: ");
		do {
			for (int i = 0; i < 6; i++) {
				System.out.println(product[i]);
			}
			System.out.println("\n\ninforme o código do produto, valor de 1 a 6: ");
			value = read.nextInt();
			Limpatela();

			System.out.println("Digite a quantidade desejada: ");
			amount = read.nextInt();
			Limpatela();

			switch (value) {
			case 1:
				priceToPay = 10.0f * amount;
				System.out.printf("Produto: Cachorro Quente / Preço R$: %.2f%n", priceToPay);
				soma += priceToPay;
				break;

			case 2:
				priceToPay = 15.0f * amount;
				System.out.printf("Produto: x-Salada / Preço R$: %.2f%n", priceToPay);
				soma += priceToPay;
				break;
			case 3:
				priceToPay = 18.0f * amount;
				System.out.printf("Produto: X-Bacon	/ Preço R$: %.2f%n", priceToPay);
				soma += priceToPay;
				break;
			case 4:
				priceToPay = 12.0f * amount;
				System.out.printf("Produto:  Bauru / Preço R$: %.2f%n", priceToPay);
				soma += priceToPay;
				break;
			case 5:
				priceToPay = 8.0f * amount;

				System.out.printf("Produto: Refrigerante / Preço R$: %.2f%n", priceToPay);
				soma += priceToPay;
				break;
			case 6:
				priceToPay = 13.0f * amount;
				System.out.printf("Produto: Suco de laranja	/ Preço R$: %.2f%n", priceToPay);
				soma += priceToPay;
				break;
			default:
				System.out.print("Opção inválida.\n");
			}

			System.out.println("\n\nDeseja finalizar o pedido? (SIM / NAO):");
			endBuy = read.next().equalsIgnoreCase("SIM");
			Limpatela();

		} while (endBuy == false);

		System.out.printf("\n\nPedido finalizado. Valor a pagar R$: %.2f%n", soma);
		System.out.println("Obrigada, Volte sempre!");

	}
}
