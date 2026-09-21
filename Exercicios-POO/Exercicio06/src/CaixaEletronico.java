public class CaixaEletronico {

    private String local;
    private int numero;
    private Conta conta;

    public CaixaEletronico(String local, int numero, Conta conta) {

        this.local = local;
        this.numero = numero;
        this.conta = conta;
    }

    public void executarTransacao(Transacao transacao) {

        transacao.executar(conta);
    }

    public void exibirDados() {

        System.out.println("Caixa: " + numero);
        System.out.println("Local: " + local);
    }
}