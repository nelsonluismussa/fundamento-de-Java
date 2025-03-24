package curso.basico.java.aula01;

import java.util.Scanner;

public class OperadoresBitwise {

	public static void main(String[] args) {
		/**  
		 *  Operador           Significado
		 *     &                 Operação "E" bit a bit          
		 *     |				 Operação "OU" bit a bit
		 *     ^ 				 Operação "OU-exlusivo" bit a bit
		 */
		// Aplica-se em baixo nivel: arduino , interface de redes
     int n1 = 89;
     int n2 = 60;
     System.out.println(n1 & n2);
     System.out.println(n1 | n2);
     System.out.println(n1 ^  n2);
		
     //
     int mask = 32;
     Scanner input = new Scanner(System.in);
     int n = input.nextInt();
     
     if ((n & mask)!= 0) {
    	 System.out.println("6th bit és Verdade");
     }else {
    	 System.out.println("6th bit és falso");
 
     }
     
	}

}
