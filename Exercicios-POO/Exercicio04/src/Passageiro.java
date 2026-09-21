public class Passageiro extends Pessoa {

    private String numeroPassaporte;
    private String destino;
    private int numeroAssento;

    public Passageiro(String nome, String cpf, int idade,
                      String numeroPassaporte, String destino, int numeroAssento) {

        super(nome, cpf, idade);

        this.numeroPassaporte = numeroPassaporte;
        this.destino = destino;
        this.numeroAssento = numeroAssento;
    }

    public void embarcar() {
        System.out.println(nome + " está embarcando para " + destino + ".");
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Passaporte: " + numeroPassaporte);
        System.out.println("Destino: " + destino);
        System.out.println("Assento: " + numeroAssento);
    }
}