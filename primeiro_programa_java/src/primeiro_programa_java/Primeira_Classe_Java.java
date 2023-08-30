package primeiro_programa_java;

import javax.swing.JOptionPane;

public class Primeira_Classe_Java {
 /* main é um método auto executável em java*/
	public static void main(String[] args) {
		
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros:"); // showInputDialog é uma caixa que apresenta uma mensagem e recebe uma entrada (variável)
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas:");
	
		double QtdCarros = Double.parseDouble(carros); // converte string(caracteres) em double( num real)
		double QtdPessoas = Double.parseDouble(pessoas);
		
		int divisao = (int) (QtdCarros / QtdPessoas);
		 
		double resto = QtdCarros % QtdPessoas;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");// tela de confirmação
		
		if(resposta==0) {
		
			JOptionPane.showMessageDialog(null,"A divisão é de : " +divisao +" por pessoa"+" \n E Sobrou: " +resto+" Carros"); // Exibe uma mensagem ao usuário.
		}
		
		if(resposta==1) {
		
		JOptionPane.showMessageDialog(null,"Tudo bem, vamos começar de novo"); // Exibe uma mensagem ao usuário.
		}
		
	}
}
