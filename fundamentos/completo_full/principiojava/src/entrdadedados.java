public class entrdadedados {
        
	public static void main(String[] args) {
	 		/*
		 * Entrada de dados e saida de dados Para escrever na tela um texto qualquer
		 * 
		 */

		// Com quebra de linha ao final:
		System.out.println("Bom noite!");

		// sem quebra de linha ao final:
		System.out.print("Seja bem vindo!");

		int idade = 56;
		System.out.println("\nIdade:" + idade);

		double x = 10.23243;
		String nome = "Luis Mussa";
		char genero = 'M';
		boolean estadoCasado = false; // Corrigido o nome da variável
		idade = 30; // Adicionada uma idade para evitar erro

		System.out.printf("\nSalário %.1f:", x);
		System.out.printf("\nSalário %.4f", x);
		System.out.printf("\nNome Completo: %s, Idade: %d, Gênero: %c, Estado Casado: %b%n", nome, idade, genero,
				estadoCasado);
    

}
}
