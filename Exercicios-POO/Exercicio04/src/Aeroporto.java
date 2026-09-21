public class Aeroporto {

    private String nome;
    private String cidade;
    private String codigo;
    private Aeronave aeronave;

    public Aeroporto(String nome, String cidade,
                     String codigo, Aeronave aeronave) {

        this.nome = nome;
        this.cidade = cidade;
        this.codigo = codigo;
        this.aeronave = aeronave;
    }

    public void liberarDecolagem() {
        System.out.println(
            "Decolagem liberada no aeroporto " + nome + "."
        );
    }

    public void exibirDados() {
        System.out.println("Aeroporto: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Código: " + codigo);

        aeronave.exibirDados();
    }
}