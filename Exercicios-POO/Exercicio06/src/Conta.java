public class Conta {

    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {

        saldo = saldo + valor;

        System.out.println(
            "Depósito de R$ " + valor + " realizado."
        );

        exibirSaldo();
    }

    public void sacar(double valor) {

        if (valor <= saldo) {

            saldo = saldo - valor;

            System.out.println(
                "Saque de R$ " + valor + " realizado."
            );

        } else {

            System.out.println(
                "Saldo insuficiente para saque."
            );
        }

        exibirSaldo();
    }

    public boolean pagar(double valor) {

        if (valor <= saldo) {

            saldo = saldo - valor;

            System.out.println(
                "Valor pago: R$ " + valor
            );

            exibirSaldo();

            return true;

        } else {

            System.out.println(
                "Saldo insuficiente para pagamento."
            );

            return false;
        }
    }

    public void exibirDados() {

        System.out.println("Número da conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }

    public void exibirSaldo() {

        System.out.println(
            "Saldo atual: R$ " + saldo
        );
    }
}