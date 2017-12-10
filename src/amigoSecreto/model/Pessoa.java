package amigoSecreto.model;

public class Pessoa {
	
	private String nome;
	private String email;
	private String celular;
	private boolean jaFoiTirado;
	//private boolean temAmigoSecreto;
	private String nomeDoSorteado;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public boolean isJaFoiTirado() {
		return jaFoiTirado;
	}
	public void setJaFoiTirado(boolean jaFoiTirado) {
		this.jaFoiTirado = jaFoiTirado;
	}
//	public boolean isTemAmigoSecreto() {
//		return temAmigoSecreto;
//	}
//	public void setTemAmigoSecreto(boolean temAmigoSecreto) {
//		this.temAmigoSecreto = temAmigoSecreto;
//	}
	public String getNomeDoSorteado() {
		return nomeDoSorteado;
	}
	public void setNomeDoSorteado(String nomeDoSorteado) {
		this.nomeDoSorteado = nomeDoSorteado;
	}
	
	
	
}
