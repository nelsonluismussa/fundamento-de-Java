import java.util.Scanner;

public class RepitacaoFor {

    public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		int soma = 0;
		for(int i = 0; i < 5; i ++) {
			System.out.println("numeros: ");
			int num = input.nextInt();
			soma +=num;
		}
		System.out.println("soma é: "+soma);
	
	

}
    
}
