import java.util.Scanner;

public class Switch {
    
    public static void main(String[] args) {
		 

		Scanner input = new Scanner(System.in);
		System.out.println("Dias Semanal: ");
		int opcoes = input.nextInt();

	switch (opcoes) {
		case 1:
			System.out.println("Domingo!");
			break;
		case 2:
			System.out.println("Segunda ferra");
			break;
		case 3:
			System.out.println("Terça ferra");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		default:
			System.out.println("Error");

		}

	}



}
