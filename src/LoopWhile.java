import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?*/

		var scanner = new Scanner(System.in);
		int idade = 0;
		System.out.println("Digite a quantidade de alunos");
		var alunos = scanner.nextInt();
		var conta = alunos;
		while(alunos > 0) {
			System.out.println("Digite a idade do primero aluno");
			idade += scanner.nextInt();
			alunos--;
		}
		
		System.out.println("A média de idade dos alunos é de:" + (idade/ conta));
		scanner.close();
	}
	
}
