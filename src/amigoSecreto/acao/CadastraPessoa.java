package amigoSecreto.acao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import amigoSecreto.model.Pessoa;

public class CadastraPessoa {

	static List<Pessoa> pessoas = new ArrayList<>();
	
	public void cadastrarPessoa(){
		String nome = JOptionPane.showInputDialog("Qual é o nome da pessoa que deseja adicionar ?");
		String email = JOptionPane.showInputDialog("Digite o E-mail:");
		String celular = JOptionPane.showInputDialog("Digite o número do celular");
	
		Pessoa p = new Pessoa();
		p.setNome(nome);
		p.setEmail(email);
		p.setCelular(celular);
		
		pessoas.add(p);
	
	}
	
	public void sorteiaTudo(){
		Sorteia sorteia = new Sorteia();
		sorteia.sorteia(pessoas);
		sorteia.mandaEmail(pessoas);
	}
	
	
	
	
	
	
}
