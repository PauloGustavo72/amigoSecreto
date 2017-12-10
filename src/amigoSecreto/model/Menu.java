package amigoSecreto.model;

import javax.swing.JOptionPane;

public class Menu {
	
	
	
	public int mostraMenu(){
	int opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Pessoa\n"
															+ "2 - Convidar Todo Mundo\n"
															+ "3 - Sair\n"));
	return opcao;
	}
	
	
	
}
