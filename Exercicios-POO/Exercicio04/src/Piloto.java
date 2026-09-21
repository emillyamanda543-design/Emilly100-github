public class Piloto extends Pessoa {

    private String breve;
    private int horasVoo;
    private String companhia;

    public Piloto(String nome, String cpf, int idade,
                  String breve, int horasVoo, String companhia) {

        super(nome, cpf, idade);

        this.breve = breve;
        this.horasVoo = horasVoo;
        this.companhia = companhia;
    }

    public void pilotar() {
        System.out.println(nome + " está pilotando a aeronave.");
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Brevê: " + breve);
        System.out.println("Horas de voo: " + horasVoo);
        System.out.println("Companhia: " + companhia);
    }
}