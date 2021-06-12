import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/

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
		
		System.out.println("A m�dia de idade dos alunos � de:" + (idade/ conta));
		scanner.close();
	}
	
}
