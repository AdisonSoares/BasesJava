package br.geekuniversity.secao25.view;
import br.geekuniversity.secao25.helper.Utils;
import br.geekuniversity.secao25.model.Produto;

import java.util.*;

/**
 * @Projeto_mercado
 */
public class Mercado {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Produto> produtos;
    private static Map<Produto, Integer> carrinho;

    public static void main(String[] args) {
        produtos = new ArrayList<Produto>();
        carrinho = new HashMap<Produto, Integer>();
        Mercado.menu();
    }
    private static void menu() {
        System.out.println("============================================");
        System.out.println("=============== Menu Principal =============");
        System.out.println("================== Mercado =================");
        System.out.println("============================================");

        System.out.println("Selecione uma das opcoes:");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produto");
        System.out.println("3 - Comprar produto");
        System.out.println("4 - Visualizar carrinho");
        System.out.println("5 - Sair do sistema");

        int opcao = 0;

        try {
            opcao = Integer.parseInt(Mercado.sc.nextLine());
        } catch (InputMismatchException e) {
            Mercado.menu();
        } catch (NumberFormatException f) {
            Mercado.menu();
        }

        switch (opcao) {
            case 1:
                Mercado.cadastrarProduto();
                break;
            case 2:
                Mercado.listarProdutos();
                break;
            case 3:
                Mercado.comprarProduto();
                break;
            case 4:
                Mercado.visualizarCarrinho();
                break;
            case 5:
                System.out.println("Finalizando sistema!");
                Utils.pausar(2);
                System.exit(0);
            default:
                System.out.println("Opcao invalida!");
                Utils.pausar(2);
                Mercado.menu();
                break;
        }
    }
    private static void cadastrarProduto() {
        System.out.println("Cadastro de produto");
        System.out.println("=====================");
        System.out.printf("Informe o nome do produto: ");
        String nome = Mercado.sc.nextLine();
        System.out.printf("Informe o preco do produto: ");
        Double preco = Mercado.sc.nextDouble();
        Produto produto = new Produto(nome, preco);
        Mercado.produtos.add(produto);
        System.out.printf("Produto cadastrado com sucesso!");
        Utils.pausar(1);
        Mercado.menu();
    }
    private static void listarProdutos() {
        if (Mercado.produtos.size() > 0) {
            System.out.println("Listagem de produtos\n");
            for (Produto p : Mercado.produtos) {
                System.out.println(p + "\n");
            }
        } else {
            System.out.print("Nao existe produto em estoque!");
        }
        Utils.pausar(2);
        Mercado.menu();
    }
    private static void comprarProduto() {
        if (Mercado.produtos.size() > 0) {
            System.out.println("Informe o codigo do produto: ");
            System.out.println("=======Produtos Disponiveis========");
            for (Produto p : Mercado.produtos) {
                System.out.println(p);
                System.out.println("================================");
            }
            int codigo = Integer.parseInt(Mercado.sc.nextLine());
            boolean tem = false;

            for (Produto p : Mercado.produtos) {
                System.out.printf("Valor do codigo: "+p.getCodigo());
                int indCodigo = p.getCodigo();
                if(indCodigo == codigo) {
                    int quant = 0;
                    try {
                        quant = Mercado.carrinho.get(p);
                        //Se tiver o produto no carrinho, atualiza quantidade
                        Mercado.carrinho.put(p, quant + 1);
                    } catch (NullPointerException e) {
                        //Primeiro produto no carrinho
                        Mercado.carrinho.put(p, 1);
                    }
                    System.out.println("Produto adicionado no carrinho!");
                    tem = true;
                }
                if (tem) {
                    System.out.println("Deseja adicionar outro produto no carrinho? ");
                    System.out.print("Informe 1 para sim ou 0 para nao: ");
                    int op = Integer.parseInt(Mercado.sc.nextLine());
                    if (op == 1) {
                        Mercado.comprarProduto();
                    } else {
                        System.out.println("Aguarde enquanto o pedido esta sendo fechado!");
                        Utils.pausar(2);
                        Mercado.fecharPedido();
                    }
                } else {
                    System.out.println("Produto especificado nao encontrado!");
                    Utils.pausar(2);
                    Mercado.menu();
                }
            }
        } else {
            System.out.println("Nao existe produto cadastrado no mercado!");
            Utils.pausar(2);
            Mercado.menu();
        }
    }
    private static void visualizarCarrinho() {
        if (Mercado.carrinho.size() > 0) {
            System.out.println("Produtos no carrinho: ");
            for (Produto p : Mercado.carrinho.keySet()) {
                System.out.println("Produto: " + p + "\nQuantidade: " + Mercado.carrinho.get(p));
            }
        } else {
            System.out.printf("Nao existe produto no carrinho!");
        }
        Utils.pausar(2);
        Mercado.menu();
    }
    private static void fecharPedido() {
        Double valorTotal = 0.0;
        System.out.println("Produtos do carrinho");
        System.out.println("===================");
        for (Produto p : Mercado.carrinho.keySet()) {
            int quant = Mercado.carrinho.get(p);
            valorTotal += p.getPreco() * quant;
            System.out.println(p);
            System.out.println("Quantidade: " + quant);
            System.out.println("===================");
        }
        System.out.println("Fatura fechada no valor de R$: " + Utils.doubleParaString(valorTotal));
        Mercado.carrinho.clear();
        System.out.println("Pagamento finalizado com sucesso!");
        Utils.pausar(5);
        Mercado.menu();
    }
}
