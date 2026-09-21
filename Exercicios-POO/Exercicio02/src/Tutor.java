public class Tutor {

    private String nome;
    private String telefone;

    public Tutor() {
    }

    public Tutor(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void criar(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void exibirDados() {
        System.out.println("Tutor: " + nome);
        System.out.println("Telefone: " + telefone);
    }
}