public class Aeronave {

    private String modelo;
    private String prefixo;
    private int capacidade;
    private Piloto piloto;
    private Passageiro passageiro;

    public Aeronave(String modelo, String prefixo, int capacidade,
                    Piloto piloto, Passageiro passageiro) {

        this.modelo = modelo;
        this.prefixo = prefixo;
        this.capacidade = capacidade;
        this.piloto = piloto;
        this.passageiro = passageiro;
    }

    public void decolar() {
        System.out.println("A aeronave " + prefixo + " está decolando.");
    }

    public void exibirDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Prefixo: " + prefixo);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Piloto: " + piloto.nome);
        System.out.println("Passageiro: " + passageiro.nome);
    }
}