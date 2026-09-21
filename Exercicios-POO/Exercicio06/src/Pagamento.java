public class Pagamento extends Transacao {

    private String descricao;

    public Pagamento(double valor, String descricao) {
        super(valor);
        this.descricao = descricao;
    }

    @Override
    public void executar(Conta conta) {

        if (conta.pagar(valor)) {
            System.out.println(
                "Pagamento realizado: " + descricao
            );
        }
    }
}