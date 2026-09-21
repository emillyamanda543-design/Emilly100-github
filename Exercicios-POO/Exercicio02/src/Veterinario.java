public class Veterinario {

    private String nome;
    private String crmv;

    public Veterinario() {
    }

    public Veterinario(String nome, String crmv) {
        this.nome = nome;
        this.crmv = crmv;
    }

    public void criar(String nome, String crmv) {
        this.nome = nome;
        this.crmv = crmv;
    }

    public String getNome() {
        return nome;
    }

    public String getCrmv() {
        return crmv;
    }

    public void exibirDados() {
        System.out.println("Veterinário: " + nome);
        System.out.println("CRMV: " + crmv);
    }
}