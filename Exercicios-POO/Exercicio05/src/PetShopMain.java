public class PetShopMain {

    public static void main(String[] args) {

        // Donos
        Dono dono1 = new Dono(
            1,
            "Ana Silva",
            "111.111.111-11",
            "1199999-1111",
            "Rua A, 123",
            "ana@email.com"
        );

        Dono dono2 = new Dono(
            2,
            "Bruno Costa",
            "222.222.222-22",
            "1188888-2222",
            "Rua B, 456",
            "bruno@email.com"
        );


        // Doenças
        Doenca doenca1 = new Doenca(
            1,
            "Cinomose",
            "Febre, tosse e apatia",
            "Tratamento de suporte",
            "Alta"
        );

        Doenca doenca2 = new Doenca(
            2,
            "Otite",
            "Coceira e vermelhidão",
            "Antibiótico e limpeza",
            "Média"
        );


        // Veterinários
        Veterinario veterinario1 = new Veterinario(
            1,
            "Carlos Souza",
            "CRMV-12345",
            "Clínica Geral",
            "1197777-3333",
            "carlos@vet.com"
        );

        Veterinario veterinario2 = new Veterinario(
            2,
            "Mariana Lima",
            "CRMV-67890",
            "Dermatologia",
            "1196666-4444",
            "mariana@vet.com"
        );


        // Animais
        Animal animal1 = new Animal(
            1,
            "Thor",
            "Cachorro",
            "Labrador",
            3,
            28.5,
            true,
            dono1
        );

        Animal animal2 = new Animal(
            2,
            "Miau",
            "Gato",
            "Siamês",
            2,
            4.2,
            false,
            dono1
        );

        Animal animal3 = new Animal(
            3,
            "Rex",
            "Cachorro",
            "Pastor Alemão",
            5,
            32.0,
            true,
            dono2
        );

        Animal animal4 = new Animal(
            4,
            "Luna",
            "Gato",
            "Persa",
            4,
            3.8,
            false,
            dono2
        );


        // Relação Dono - Animal
        dono1.adicionarAnimal(animal1);
        dono1.adicionarAnimal(animal2);

        dono2.adicionarAnimal(animal3);
        dono2.adicionarAnimal(animal4);


        // Donos e seus animais
        System.out.println("\n== DONOS ==");

        dono1.exibirDados();
        dono1.listarAnimais();

        System.out.println();

        dono2.exibirDados();
        dono2.listarAnimais();


        // Veterinários
        System.out.println("\n== VETERINÁRIOS ==");

        veterinario1.exibirDados();

        System.out.println();

        veterinario2.exibirDados();


        // Atendimentos
        System.out.println("\n== CONSULTAS ==");

        veterinario1.atender(animal1, doenca1);
        veterinario2.atender(animal2, doenca2);

        veterinario1.agendarConsulta(animal3);
        veterinario2.agendarConsulta(animal4);


        // Outros comportamentos
        System.out.println("\n== ALTERAÇÕES ==");

        animal2.tomarVacina();

        animal3.atualizarPeso(33.5);
        animal3.exibirDados();


        // Doenças
        System.out.println("\n== DOENÇAS ==");

        doenca1.exibirDados();

        System.out.println();

        doenca2.exibirDados();
    }
}