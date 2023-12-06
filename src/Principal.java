import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String descricaoCompra;
        double limite;
        double valorCompra;
        int opcao = 1;

        System.out.println("Digite o limite do cartão:");
        limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        while (opcao != 0) {
            System.out.println("Digite a descrição da compra");
            descricaoCompra = leitura.next();

            System.out.println("Digite o valor da compra");
            valorCompra = leitura.nextDouble();

            Compra minhaCompra = new Compra(descricaoCompra, valorCompra);

            if (cartao.lancaCompra(minhaCompra) == true){
                System.out.println("Compra realizada!");
            } else {
                System.out.println("Saldo insuficiente!");
            }

            System.out.println("Digite 0 para sair ou 1 para continuar");
            opcao = leitura.nextInt();
        }
    }
}