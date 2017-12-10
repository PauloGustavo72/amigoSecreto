package amigoSecreto.acao;

import java.util.List;
import java.util.Random;

import amigoSecreto.email.Email;
import amigoSecreto.model.Pessoa;

public class Sorteia {
	CadastraPessoa cadastraPessoa = new CadastraPessoa();
	Email email = new Email();

	Random gerador = new Random();

	public void sorteia(List<Pessoa> pessoas) {
		for (int i = 0; i < pessoas.size(); i++) {
			int idSorteado = gerador.nextInt(pessoas.size());

			if (pessoas.get(idSorteado).isJaFoiTirado() == false && pessoas.get(i) != pessoas.get(idSorteado)) {
				pessoas.get(i).setNomeDoSorteado(pessoas.get(idSorteado).getNome());
				pessoas.get(idSorteado).setJaFoiTirado(true);

			} else {
				int aux = 0;
				while (aux != 1) {
					idSorteado = gerador.nextInt(pessoas.size());
					if (pessoas.get(idSorteado).isJaFoiTirado() == false && pessoas.get(i) != pessoas.get(idSorteado)) {
						pessoas.get(i).setNomeDoSorteado(pessoas.get(idSorteado).getNome());
						pessoas.get(idSorteado).setJaFoiTirado(true);
						aux = 1;
					}
				}
			}
		}
	}
	
	public void mandaEmail(List<Pessoa> lista){
		for (int i = 0; i < lista.size(); i++) {
			email.mandaEmail(lista.get(i).getNome(), lista.get(i).getEmail(), lista.get(i).getNomeDoSorteado());
//			System.out.println(lista.get(i).getNome() + "\nNome do sorteado = " + 
//							    lista.get(i).getNomeDoSorteado()	);
		}
		
	}
}
