package Modulo08;

import java.util.Scanner;

public class Atividade04 {

	public static void limpatela() { // metodo pesquisado
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		boolean continueQuest = true;
		int amount = 0, devBackend = 0, devFrontendMulher = 0, deveMobileHomem = 0, naoBinarioFull = 0;
		float average = 0;

		// Array - variavel do tipo reference pode inicializar com nulo, primitiva nao
		// aceita nulo.
		String[] identification = new String[] { "1° Mulher Cis", "2° Homem Cis", "3° Não Binário", "4° Mulher Trans",
				"5° Homem Trans", "6° Outros" };
		String[] developer = new String[] { "1° Backend", "2° Frontend", "3° Mobile", "FullStack" };

		System.out.println("Deseja iniciar a pesquisa? (SIM / NAO)");
		continueQuest = read.next().equalsIgnoreCase("SIM"); // comparando a resposta do usuário, ignorando maiusculo e
																// minusculo
		limpatela();

		while (continueQuest) { // usando o valor booleano para controle do while

			System.out.println("Informe a idade: ");
			int age = read.nextInt();
			read.nextLine(); // pesquisei consumir o enter
			limpatela();

			System.out.println("Identidade de Genero ");
			for (int i = 0; i < 6; i++) {
				System.out.println(identification[i]);
			}
			System.out.println("Informe um número correspondente: ");
			int identInput = read.nextInt();
			read.nextLine();
			limpatela();

			System.out.println("Pessoa desenvolvedora ");
			for (int i = 0; i < 4; i++) {
				System.out.println(developer[i]);
			}
			System.out.println("Informe um número correspondente: ");
			int deveInput = read.nextInt();
			read.nextLine();
			limpatela();

			amount++;
			average += age;

			if (deveInput == 1) {
				devBackend++;
			} else if ((identInput == 1 || identInput == 4) && deveInput == 2) {
				devFrontendMulher++;
			} else if ((identInput == 2 || identInput == 5) && deveInput == 3 && age < 40) {
				deveMobileHomem++;
			} else if (identInput == 3 && deveInput == 4 && age < 30) {
				naoBinarioFull++;
			}

			System.out.println("Deseja continuar a pesquisa? (SIM / NAO)");
			continueQuest = read.next().equalsIgnoreCase("SIM");
			limpatela();

			System.out.println(continueQuest);
			limpatela();

		}

		System.out.println("\nTodos os desenvolvedores Backend: " + devBackend);
		System.out.println("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: " + devFrontendMulher);
		System.out
				.println("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + deveMobileHomem);
		System.out.println(
				"\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + naoBinarioFull);
		System.out.println("\nO número total de participantes da pesquisa: " + amount);
		System.out.printf("%nA média da idade de participantes da pesquisa: %.2f%nsim", (float) average / amount);
		System.out.println("\n\nfim do programa");
	}
}