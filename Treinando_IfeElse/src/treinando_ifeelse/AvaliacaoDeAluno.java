package treinando_ifeelse;

public class AvaliacaoDeAluno {

	public static void main(String[] args) {
		String nomeDoAluno = "Julio César";
		int nota1 = 10;
		int nota2 = 9;
		int nota3 = 8;
		int nota4 = 5;
		int avaliacao = nota1 + nota2 + nota3 + nota4;
		int mediaAv = avaliacao / 4;

		if (mediaAv >= 7) {
			System.out.println(
					"Hey "  + nomeDoAluno + " sua nota foi " + mediaAv + ", então você está aprovado!");
		} else {
			System.out.println(
					"Senti muito" + " " + nomeDoAluno + " " + ", sua nota foi " + mediaAv + "você está reprovado...");
		}

	}
}