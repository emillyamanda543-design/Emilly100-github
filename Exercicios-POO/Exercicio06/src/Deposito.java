public class Deposito extends Transacao {

    public Deposito(double valor) {
        super(valor);
    }

    @Override
    public void executar(Conta conta) {
        conta.depositar(valor);
    }
}