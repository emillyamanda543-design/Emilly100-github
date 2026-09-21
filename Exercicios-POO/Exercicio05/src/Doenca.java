public class Doenca {

    private int id;
    private String nome;
    private String sintomas;
    private String tratamento;
    private String nivelGravidade;

    public Doenca(int id, String nome, String sintomas,
                  String tratamento, String nivelGravidade) {

        this.id = id;
        this.nome = nome;
        this.sintomas = sintomas;
        this.tratamento = tratamento;
        this.nivelGravidade = nivelGravidade;
    }

    public void exibirDados() {
        System.out.println("Doença: " + nome);
        System.out.println("Sintomas: " + sintomas);
        System.out.println("Tratamento: " + tratamento);
        System.out.println("Gravidade: " + nivelGravidade);
    }

    public void definirTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public void alterarGravidade(String gravidade) {
        this.nivelGravidade = gravidade;
    }

    public String getNome() {
        return nome;
    }
}