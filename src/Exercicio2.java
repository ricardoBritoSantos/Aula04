import java.util.Scanner;

//02 - Crie um programa que exija que o usuário digite a senha 42. Enquanto o usuário não acertar a senha, deve ser exibida a mensagem "Qual é a resposta para a vida, o universo e tudo mais?"


public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var scanner = new Scanner(System.in);
		System.out.print("Digite a senha: ");
		var senha = scanner.nextInt();
		
		while(!(senha == 42)) {
			System.out.println("Qual é a resposta para a vida, o universo e tudo mais?");
			System.out.print("Digite a senha: ");
			senha = scanner.nextInt();
		}

	}

}
