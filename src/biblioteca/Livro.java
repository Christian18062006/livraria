package biblioteca;

public class Livro {
	private String nome;
	private String nomeAutor;
	public Livro(String nomeLivro, String nomeAutor) {
		this.nome=nomeLivro;
		this.nomeAutor=nomeAutor;
	}
	@Override
	public String toString() {
		return(String.format("Nome do livro: %s nome do autor: %s", nome, nomeAutor));
	}

}
