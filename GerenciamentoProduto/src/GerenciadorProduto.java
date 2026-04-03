import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorProduto {
    Scanner sc = new Scanner(System.in);

    ArrayList<String> listaProdutos = new ArrayList<>();

    public void CadastrarProduto(String nomeProduto) {
        try {
            listaProdutos.add(nomeProduto);
            System.out.printf("O produto: %s foi cadastrado com sucesso!\n", nomeProduto);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar produto: " + e);
        }

    }

    public void ListarProduto() {
        System.out.println("Produtos cadastrados: ");

        for (int i = 0; i < listaProdutos.size(); i++) {
            System.out.printf("[%s] - %s\n", i+1, listaProdutos.get(i));
        }


    }

    public void AtualizarProduto(int posicao, String novoNome) {

        if (posicao < 0 || posicao >= listaProdutos.size()) {
            System.out.println("Indice invalido");
            return;
        }

        String valorAntigo = listaProdutos.get(posicao);
        listaProdutos.set(posicao, novoNome);

        System.out.printf("Produto '%s' atualizado para '%s'", valorAntigo,novoNome);




    }

    public void DeletarProduto(){

        System.out.print("Digite o nome do produto para deletar: ");
        String deletarProduto = sc.nextLine();

        if (listaProdutos.contains(deletarProduto)){
            System.out.printf("O produto %s foi removido.\n", deletarProduto);
            listaProdutos.remove(deletarProduto);
        } else {
            System.out.println("O produto não está na lista.");
        }

    }

}
