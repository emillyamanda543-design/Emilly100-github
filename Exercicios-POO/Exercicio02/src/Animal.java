public class Animal {

    private String nome;
    private String especie;
    private int idade;
    private double peso;
    private Tutor tutor;

    public Animal() {
    }

    public Animal(String nome, String especie, int idade, double peso, Tutor tutor) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
        this.tutor = tutor;
    }

    public void criar(String nome, String especie, int idade, double peso, Tutor tutor) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
        this.tutor = tutor;
    }

    public String getNome() {
        return nome;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void alterarPeso(double novoPeso) {
        this.peso = novoPeso;
    }

    public void exibirDados() {
        System.out.println("Animal: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);

        if (tutor != null) {
            System.out.println("Tutor: " + tutor.getNome());
        }
    }
}