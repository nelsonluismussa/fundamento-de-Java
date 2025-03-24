package curso.basico.java.aula01;

public class EstruturaCondicionalComposta {

	public static void main(String[] args) {

		float media = -1;
		String informacao = "";
		if (media >= 0 && media <= 6) {
			informacao = "Reprovado!";
		} else if (media >= 7 && media < 9.9) {
			informacao = "em recuperacao";
		} else if (media >= 10 && media < 16) {
			informacao = "Aprovado";
		} else if (media >= 16 && media <= 20) {
			informacao = "Dispensado";
		} else if (media < 0 || media >= 21) {
			informacao = "inválido";
		}
		System.out.println(informacao);
	}

}
