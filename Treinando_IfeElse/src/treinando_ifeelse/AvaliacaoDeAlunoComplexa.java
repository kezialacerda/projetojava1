package treinando_ifeelse;

public class AvaliacaoDeAlunoComplexa {

	public static void main(String[] args) {
		int nota1 = 10;
		int nota2 = 2;
		int nota3 = 10;
		int nota4 = 6;
		int avaliacao = nota1 + nota2 + nota3 + nota4;
		int mediaAv = avaliacao / 4;
		if (mediaAv >= 7 && nota1 >= 6 && nota2 >= 6 && nota3 >= 6 && nota4 >= 6) {
			System.out.println("Você foi aprovado e não precisa fazer recuperação de nenhuma avaliação");
		} else if (mediaAv >= 7 && (nota1 < 6 || nota2 < 6 || nota3 < 6 || nota4 < 6)) {
			System.out.println("Você foi aprovado mais precisa recuperar alguma avaliação");
		} else {
			System.out.println("Você está reprovado");
		}
	}
}
