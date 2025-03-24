package curso.basico.java.aula01;

import java.util.Scanner;

public class EstruturaRepetitivaEnquanto {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num = 1;
		int soma = 0;

		while (num != -1) {
			System.out.println("numeros" + num);
			num = input.nextInt();
			if (num!=-1) {
				soma += num;
			}
			
		}
		System.out.println(soma);

		input.close();

	}

}
