package biblioteca;

import java.util.ArrayList;

public class Livraria {
	private String nome;
	private ArrayList<Livro> livros;
	public Livraria(String nome) {
		this.nome=nome;
		livros=new ArrayList<Livro>();
	}
	public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}
	public void exibirLivros() {
		for (Livro livro : livros) {
			System.out.println(livro);
		}
	}

}
