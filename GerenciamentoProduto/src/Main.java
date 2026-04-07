import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GerenciadorProduto gProdutos = new GerenciadorProduto();
        boolean continuarRodando = true;

        do {
            System.out.println("Escolha a operação desejada: ");
            System.out.println("[1] Cadastrar Produto  |  [2] Listar Produto");
            System.out.println("[3] Atualizar Produto  |  [4] Deletar Produto");
            System.out.print("[0] Sair do Programa   :  ");
            int opcaoUsuario = sc.nextInt();

            switch (opcaoUsuario){
                case 1:
                    sc.nextLine(); // Limpar o cache do nextLine buffer
                    System.out.println("C A D A S T R O   D E   P R O D U T O S");
                    System.out.print("Informe o nome do produto: ");
                    String nomeProduto = sc.nextLine();
                    gProdutos.CadastrarProduto(nomeProduto);
                    break;
                case 2:
                    System.out.println("L I S T A   D E   P R O D U T O S");
                    gProdutos.ListarProduto();
                    break;
                case 3:
                    System.out.println("A T U A L I Z A Ç Ã O   D E   P R O D U T O S");
                    gProdutos.ListarProduto();
                    sc.nextLine();

                    System.out.print("Informe o número do produto que deseja atualizar: ");
                    int indice = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Informe o novo nome do produto: ");
                    String novoNome = sc.nextLine();
                    gProdutos.AtualizarProduto(indice - 1, novoNome);
                    break;
                case 4:
                    System.out.println("D E L E T A R   P R O D U T O S");
                    gProdutos.DeletarProduto();
                    break;
                case 0:
                    System.out.println("P R O G R A M A   E N C E R R A D O");
                    continuarRodando = false;
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;

            }


        } while (continuarRodando);
    }
}