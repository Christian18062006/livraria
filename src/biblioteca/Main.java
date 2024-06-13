package biblioteca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Livro livro;
		Livraria biblioteca=new Livraria("A arte de ler");
		int opcao=0;
		Scanner leitura=new Scanner(System.in);
		System.out.println("Bem-vindo a biblioteca.");
		while (opcao!=3) {
			System.out.println("Escolha a sua opção: 1. cadastrar um novo livro \n 2. exibir livros cadastrados \n 3. sair do sistema.");
			opcao=leitura.nextInt();
			leitura.nextLine();
			switch (opcao) {
			case 1: {
				System.out.println("Cadastro de livro.");
				System.out.println("digite o nome do livro.");
				String nomeLivro=leitura.nextLine();
				System.out.println("Digite o nome do autor.");
				String nomeAutor=leitura.nextLine();
				livro=new Livro(nomeLivro, nomeAutor);
				biblioteca.adicionarLivro(livro);
				System.out.println("livro cadastrado.");
				break;
			}
			case 2: {
				System.out.println("livros cadastrados.");
				biblioteca.exibirLivros();
				break;
			}
			case 3: {
				System.out.println("Até a próxima!");
				break;
			}
			default:
				throw new IllegalArgumentException("Opção inválida: " + opcao);
			}
		}
	}

}
