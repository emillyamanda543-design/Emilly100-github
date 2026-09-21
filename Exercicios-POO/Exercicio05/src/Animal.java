public class Animal {

    private int id;
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private double peso;
    private boolean vacinado;

    private Dono dono;

    public Animal(int id, String nome, String especie,
                  String raca, int idade, double peso,
                  boolean vacinado, Dono dono) {

        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.vacinado = vacinado;
        this.dono = dono;
    }

    public void exibirDados() {
        System.out.println("Animal: " + nome + " (" + especie + ")");
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Vacinado: " + vacinado);
        System.out.println("Dono: " + dono.getNome());
    }

    public void atualizarPeso(double novoPeso) {
        this.peso = novoPeso;
    }

    public void tomarVacina() {
        this.vacinado = true;
        System.out.println(nome + " foi vacinado(a).");
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public Dono getDono() {
        return dono;
    }
}