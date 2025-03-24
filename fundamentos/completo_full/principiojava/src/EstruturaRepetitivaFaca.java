package curso.basico.java.aula01;

import java.util.Scanner;

public class EstruturaRepetitivaFaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char resp = 'S';
		int soma = 0;
		
		int num;
		do {
			System.out.println("digite sómente numeros:");
			num = input.nextInt();
			soma +=num;
			System.out.println("A soma é :"+soma);
			System.out.println("Deseja repetir:");
			resp = input.next().charAt(0);
			
			
		}while(resp!='N');
		
		
	}

}
