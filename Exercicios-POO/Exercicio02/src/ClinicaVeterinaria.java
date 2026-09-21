public class ClinicaVeterinaria {

    public static void main(String[] args) {

        // Tutores
        Tutor tutor1 = new Tutor();
        tutor1.criar("Ana", "1111-1111");

        Tutor tutor2 = new Tutor();
        tutor2.criar("Carlos", "2222-2222");


        // Animais
        Animal animal1 = new Animal();
        animal1.criar("Rex", "Cachorro", 5, 20.0, tutor1);

        Animal animal2 = new Animal();
        animal2.criar("Mimi", "Gato", 3, 4.5, tutor1);

        Animal animal3 = new Animal();
        animal3.criar("Luna", "Cachorro", 2, 10.0, tutor2);


        // Veterinários
        Veterinario veterinario1 = new Veterinario();
        veterinario1.criar("Dr. João", "CRMV-1234");

        Veterinario veterinario2 = new Veterinario();
        veterinario2.criar("Dra. Maria", "CRMV-5678");


        // Consultas
        Consulta consulta1 = new Consulta();
        consulta1.criar(animal1, veterinario1, "Consulta de rotina");

        Consulta consulta2 = new Consulta();
        consulta2.criar(animal2, veterinario2, "Vacinação");

        Consulta consulta3 = new Consulta();
        consulta3.criar(animal3, veterinario1, "Avaliação geral");


        // Exibindo as consultas
        consulta1.exibirDados();
        System.out.println();

        consulta2.exibirDados();
        System.out.println();

        consulta3.exibirDados();


        // Desafio
        System.out.println("\nAlterando o peso de Rex...");

        animal1.alterarPeso(22.0);

        System.out.println("\nConsulta após alteração do peso:");
        consulta1.exibirDados();
    }
}