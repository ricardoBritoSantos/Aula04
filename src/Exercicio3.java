import java.util.Scanner;

//03 - Crie um programa capaz de calcular a tabuada de um número digitado pelo usuário.
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var scanner = new Scanner(System.in);
		System.out.print("Digite a tabuada que deseja calcular: ");
		var tabuada = scanner.nextInt();
		var i = 0;
		while(i <= 10) {
			System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
			i++;
		}
		
		scanner.close();
	}

}
