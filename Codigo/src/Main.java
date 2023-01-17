import entity.Livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Livro livro = new Livro();

        int op = 0;

        while (true) {
            System.out.print("LIVRARIA PDP\n1 - Cadastrar um novo livro | 2 - SAIR\nR: ");
            try {
                op = input.nextInt();
                input.nextLine();

                if (op < 1 || op > 2) {
                    System.out.println("Opção inválida");
                }

            } catch (Exception e) {
                System.out.println("Opção inválida");
                input.nextLine();
            }

            if (op == 1) {
                inserirLivro(input, livro);
            } else if (op == 2) {
                System.out.println("Até a próxima");
                break;
            }

        }
    }

        private static void inserirLivro (Scanner input, Livro livro){
            System.out.println("=== LIVRO ===");
            System.out.print("Nome do livro: ");
            livro.setNome(input.nextLine());
            System.out.print("Autor(a): ");
            livro.setAutor(input.nextLine());
            System.out.print("Preço: ");
            livro.setPreco(input.nextDouble());
            input.nextLine();
            System.out.print("Tipo da promoção: ");
            livro.setTipo_promocao(input.nextLine().charAt(0));

            if (livro.getTipo_promocao() == 'A') {
                livro.setDataPromocaoInicio("10/01/2023");
                livro.setDataPromocaoFim("15/01/2023");
                livro.setPrecoComDesconto(livro.getPreco() - 0.05);
                livro.setPorcentagem(5);
            } else if (livro.getTipo_promocao() == 'B') {
                livro.setDataPromocaoInicio("10/01/2023");
                livro.setDataPromocaoFim("20/01/2023");
                livro.setPrecoComDesconto(livro.getPreco() - 0.10);
                livro.setPorcentagem(10);
            } else if (livro.getTipo_promocao() == 'C') {
                livro.setDataPromocaoInicio("11/01/2023");
                livro.setDataPromocaoFim("30/01/2023");
                livro.setPrecoComDesconto(livro.getPreco() - 0.15);
                livro.setPorcentagem(15);
            }

            System.out.println("\n\n========= RELATÓRIO =========");
            System.out.println("Nome: " + livro.getNome());
            System.out.println("Autor(a): " + livro.getAutor());
            System.out.printf("Preço Original: %.2f\n", livro.getPreco());
            System.out.printf("Preço promocional: %.2f\n", livro.getPrecoComDesconto());
            System.out.println("Porcentagem aplicada: " + livro.getPorcentagem() + " %");
            System.out.println("Data de início da promoção: " + livro.getDataPromocaoInicio());
            System.out.println("Data fim da promoção: " + livro.getDataPromocaoFim());
            System.out.println("==============================\n\n");
        }
}