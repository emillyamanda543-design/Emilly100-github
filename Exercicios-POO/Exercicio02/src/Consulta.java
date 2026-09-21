public class Consulta {

    private Animal animal;
    private Veterinario veterinario;
    private String descricao;

    public Consulta() {
    }

    public Consulta(Animal animal, Veterinario veterinario, String descricao) {
        this.animal = animal;
        this.veterinario = veterinario;
        this.descricao = descricao;
    }

    public void criar(Animal animal, Veterinario veterinario, String descricao) {
        this.animal = animal;
        this.veterinario = veterinario;
        this.descricao = descricao;
    }

    public void exibirDados() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Veterinário: " + veterinario.getNome());
        animal.exibirDados();
    }
}