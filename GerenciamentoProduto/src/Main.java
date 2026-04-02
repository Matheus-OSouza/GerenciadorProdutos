import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GerenciamentoProduto glivros = new GerenciamentoProduto();
        boolean continuarRodando = true;

        System.out.println("Bem-vindo ao sistema de gerenciamento de livros");
        do {
            System.out.println("[1] -  Cadastrar Livro");
            System.out.println("[2] -  Listar Livros");
            System.out.println("[3] -  Atualizar Livro");
            System.out.println("[4] -  Deletar Livro");
            System.out.println("[0] -  Sair do programa");

            System.out.println("informe uma opção do menu: ");
            int opcaoUsuario = sc.nextInt();

            switch (opcaoUsuario) {
                case 1:
                    sc.nextLine(); //limpar o cache do nextline Buffer
                    System.out.println("\nCADASTRO DE LIVROS");
                    System.out.println("Informe o nome do livro: ");
                    String nomeLivro = sc.nextLine();

                    glivros.CadastrarLivro(nomeLivro);
                    break;
                case 2:
                    glivros.ListarLivro();
                    break;
                case 3:
                    //1. etapa -> exibir livros
                    glivros.ListarLivro();
                    sc.nextLine();

                    //2. declarar o livro a ser atualizado
                    System.out.print("\nInforme o número do livro que deseja atualizar: ");
                    int indice = sc.nextInt();
                    sc.nextLine();

                    //3. Informar o nome do livro
                    System.out.println("\nInforme o nome do novo livro:");
                    String novoNome = sc.nextLine();

                    //4. chamada do método para atualizar (índice, novo nome do livro)
                    glivros.AtualizarLivros(indice - 1, novoNome);

                    break;
                case 4:
                    glivros.DeletarLivros();
                    System.out.println("\nLivros deletados com sucesso!\n");
                    break;
                case 0:
                    continuarRodando = false;
                    System.out.println("\nObrigado por usar o programa!");
                    break;






            }
        } while (continuarRodando);

    }
}
