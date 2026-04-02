//GERENCIADOR

import java.util.ArrayList;

public class GerenciadorProduto {


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
            System.out.printf("[%s] - %s\n", i + 1, listaProdutos.get(i));
        }


    }
}
