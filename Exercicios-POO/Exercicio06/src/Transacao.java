public class Transacao {

    protected double valor;

    public Transacao(double valor) {
        this.valor = valor;
    }

    public void executar(Conta conta) {
        System.out.println("Executando transação.");
    }
}