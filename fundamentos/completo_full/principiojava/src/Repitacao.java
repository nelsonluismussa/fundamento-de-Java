import java.util.Scanner;

public class Repitacao {
    	public static void main(String[] args) {

		int num = 1;
		int soma = 0;
		Scanner input = new Scanner(System.in);
		
		while(num!=0) {
			System.out.println("numero: ");
			num = input.nextInt();
			soma +=num;
		}
		System.out.println("Soma é: "+soma);

	}
    
}
