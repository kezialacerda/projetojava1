package EntradaDeDadosJ;

import javax.swing.JOptionPane;

public class ClassEntrada {

	public static void main(String[] args) {

		String turmas = JOptionPane.showInputDialog("Informe a quantidade de turmas"); /* Entrada de dados */
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		String salas = JOptionPane.showInputDialog("Informe a quantidade de salas");

		double turmasT = Double.parseDouble(turmas);
		double pessoasP = Double.parseDouble(pessoas);
		double salasS = Double.parseDouble(salas);

		double pessoa_por_sala = (pessoasP / salasS);
		double turma_por_sala = (turmasT / salasS);
		/* Confirmação */
		int solicitacao1 = JOptionPane.showConfirmDialog(null,
				"Deseja ver o resultado de quantos alunos terão por sala ?");
		if (solicitacao1 == 0) {
			JOptionPane.showMessageDialog(null, "Total de alunos por sala:  " + pessoa_por_sala); /* Saida de dados */
		}
		int solicitacao2 = JOptionPane.showConfirmDialog(null,
				"Deseja ver o resultado de quantas turmas terão por sala ?");
		if (solicitacao2 == 0) {

			JOptionPane.showMessageDialog(null, "Total de turma por sala: " + turma_por_sala);
		}
	}

}
