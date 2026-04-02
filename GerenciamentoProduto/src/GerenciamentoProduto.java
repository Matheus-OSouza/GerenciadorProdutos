import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorProduto {

    ArrayList<String> listaLivros = new ArrayList<>();

    public void CadastrarProduto(String nomeLivro) {
        try {
            listaLivros.add(nomeLivro);
            System.out.printf("O livro: %s foi cadastrado com sucesso!\n", nomeLivro);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar livro: " + e);
        }

    }

    public void ListarProduto() {
        System.out.println("Livros cadastrados: ");

        for (int i = 0; i < listaLivros.size(); i++) {
            System.out.printf("[%s] - %s\n", i+1, listaLivros.get(i));
        }


    }

    public void AtualizarProduto(int posicao, String novoNome) {

        if (posicao < 0 || posicao >= listaLivros.size()) {
            System.out.println("Indice invalido");
            return;
        }

        String valorAntigo = listaLivros.get(posicao);
        listaLivros.set(posicao, novoNome);

        System.out.printf("Livro '%s' atualizado para '%s'", valorAntigo,novoNome);




    }

    public void DeletarProduto() {
        listaLivros.clear();
    }

}
