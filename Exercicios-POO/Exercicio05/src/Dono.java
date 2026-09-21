import java.util.ArrayList;
import java.util.List;

public class Dono {

    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private String email;

    private List<Animal> animais = new ArrayList<>();

    public Dono(int id, String nome, String cpf,
                String telefone, String endereco, String email) {

        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void removerAnimal(Animal animal) {
        animais.remove(animal);
    }

    public void listarAnimais() {
        for (Animal animal : animais) {
            System.out.println(animal.getNome());
        }
    }

    public void exibirDados() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("E-mail: " + email);
    }
}