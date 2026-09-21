public class Saque extends Transacao {

    public Saque(double valor) {
        super(valor);
    }

    @Override
    public void executar(Conta conta) {
        conta.sacar(valor);
    }
}