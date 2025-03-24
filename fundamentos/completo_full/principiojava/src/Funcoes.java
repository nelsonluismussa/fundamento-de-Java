package curso.basico.java.aula01;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
    System.out.println("Numeros: ");
    int a = input.nextInt();
    int b = input.nextInt();
    
    int soma = max(a , b);
    System.out.println(soma);
	}
	
	public static int max(int a, int b) {
		int s = 0;
		s = a + b;
		return s;
	}

}
