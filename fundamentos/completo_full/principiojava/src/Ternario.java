public class Ternario {
    public static void main(String[] args) {

		// Expressão Condicional ternária
		// Sintaxe:
		// (condição)? valor_se_verdadeiro: valor_se_for_falso;

		double preco = 232.42;
		double desconto = (preco <12.0)? preco * 0.1: preco * 0.03;
		System.out.println(desconto);

		// if else

		 preco = 232.42;
		

		if (preco < 12.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.03;
		}

		System.out.println(desconto);

	}

    
}
