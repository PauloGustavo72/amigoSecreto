package amigoSecreto;

import amigoSecreto.acao.CadastraPessoa;
import amigoSecreto.model.Menu;

public class Start {

	public static void main(String[] args) {
		int sair = 0;
		int opcao = 0;
		Menu menu = new Menu();
		CadastraPessoa cadastraPesso = new CadastraPessoa();
		
		while (sair == 0) {
			opcao = menu.mostraMenu();
			switch (opcao) {
			
			case 1: {
				cadastraPesso.cadastrarPessoa();
				
				break;
			}
			case 2:{
				cadastraPesso.sorteiaTudo();
				
				
			}
			case 3:{
				sair = 0;
				break;
			}
			
			}
		}
	}

}
