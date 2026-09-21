public class TesteBanco {

    public static void main(String[] args) {

        // Contas
        Conta conta1 = new Conta(
            1001,
            "Ana",
            1000.0
        );

        Conta conta2 = new Conta(
            1002,
            "Carlos",
            2000.0
        );


        // Caixas eletrônicos
        CaixaEletronico caixa1 = new CaixaEletronico(
            "Agência Centro",
            1,
            conta1
        );

        CaixaEletronico caixa2 = new CaixaEletronico(
            "Agência Norte",
            2,
            conta2
        );


        // Transações da conta 1
        Transacao deposito1 = new Deposito(500.0);
        Transacao saque1 = new Saque(200.0);

        Transacao pagamento1 = new Pagamento(
            150.0,
            "Conta de energia"
        );


        // Transações da conta 2
        Transacao deposito2 = new Deposito(300.0);
        Transacao saque2 = new Saque(400.0);

        Transacao pagamento2 = new Pagamento(
            250.0,
            "Conta de internet"
        );


        System.out.println("=== CONTA 1 ===");

        conta1.exibirDados();

        System.out.println();

        caixa1.executarTransacao(deposito1);
        caixa1.executarTransacao(saque1);
        caixa1.executarTransacao(pagamento1);


        System.out.println("\n=== CONTA 2 ===");

        conta2.exibirDados();

        System.out.println();

        caixa2.executarTransacao(deposito2);
        caixa2.executarTransacao(saque2);
        caixa2.executarTransacao(pagamento2);
    }
}