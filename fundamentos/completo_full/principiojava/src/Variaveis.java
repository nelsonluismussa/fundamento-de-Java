package curso.basico.java.aula01;

import java.util.Locale;
import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.GERMAN);
		
		int idade = 10;
		double salario = 343.34;
		
		System.out.printf("Salario: %.2f%n", salario);
		
		// saida de dados 
		System.out.println("Olá, Mundo!");
		System.out.print("Bom dia!");
		
		System.out.println();
		System.out.println("--------------------------------------------");
		
		String produto1 = "TV";
		String produto2 = "Leptop";
		
		int ano = 10;
		int codigo = 3434;
		char genero = 'F';
		
		double preco1 = 3323.2;
		double preco2 = 32.232;
		 salario = 23.2323;
		 
		 int a = 10;
		 float b = 12.2f;
		 
	     int soma =  a + (int) b;
	     
	     System.out.println(soma);
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Genero: ");
		char sexo = input.next().charAt(0);
		
		
		input.close();
		
		

	}

}
