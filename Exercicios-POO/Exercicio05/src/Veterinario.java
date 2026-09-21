public class Veterinario {

    private int id;
    private String nome;
    private String crmv;
    private String especialidade;
    private String telefone;
    private String email;

    public Veterinario(int id, String nome, String crmv,
                       String especialidade, String telefone,
                       String email) {

        this.id = id;
        this.nome = nome;
        this.crmv = crmv;
        this.especialidade = especialidade;
        this.telefone = telefone;
        this.email = email;
    }

    public void atender(Animal animal, Doenca doenca) {

        System.out.println(
            "Veterinário " + nome
            + " atendeu " + animal.getNome()
            + " com diagnóstico de "
            + doenca.getNome() + "."
        );
    }

    public void agendarConsulta(Animal animal) {

        System.out.println(
            "Consulta agendada para "
            + animal.getNome()
            + " com o(a) Dr(a). "
            + nome + "."
        );
    }

    public void exibirDados() {
        System.out.println("Veterinário: " + nome);
        System.out.println("CRMV: " + crmv);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Telefone: " + telefone);
        System.out.println("E-mail: " + email);
    }

    public String getNome() {
        return nome;
    }
}