public class TesteAeroporto {

    public static void main(String[] args) {

        // Pessoas
        Pessoa pessoa1 = new Pessoa(
            "Carlos",
            "111.111.111-11",
            40
        );

        Pessoa pessoa2 = new Pessoa(
            "Mariana",
            "222.222.222-22",
            35
        );


        // Pilotos
        Piloto piloto1 = new Piloto(
            "João",
            "333.333.333-33",
            45,
            "BR001",
            5000,
            "LATAM"
        );

        Piloto piloto2 = new Piloto(
            "Fernanda",
            "444.444.444-44",
            38,
            "BR002",
            4200,
            "GOL"
        );


        // Passageiros
        Passageiro passageiro1 = new Passageiro(
            "Ana",
            "555.555.555-55",
            28,
            "PA12345",
            "Rio de Janeiro",
            12
        );

        Passageiro passageiro2 = new Passageiro(
            "Lucas",
            "666.666.666-66",
            30,
            "PB67890",
            "Salvador",
            18
        );


        // Aeronaves
        Aeronave aeronave1 = new Aeronave(
            "Airbus A320",
            "PT-ABC",
            180,
            piloto1,
            passageiro1
        );

        Aeronave aeronave2 = new Aeronave(
            "Boeing 737",
            "PT-XYZ",
            186,
            piloto2,
            passageiro2
        );


        // Aeroportos
        Aeroporto aeroporto1 = new Aeroporto(
            "Aeroporto de Guarulhos",
            "Guarulhos",
            "GRU",
            aeronave1
        );

        Aeroporto aeroporto2 = new Aeroporto(
            "Aeroporto de Congonhas",
            "São Paulo",
            "CGH",
            aeronave2
        );


        // Pessoas
        pessoa1.exibirDados();
        System.out.println();

        pessoa2.exibirDados();
        System.out.println();


        // Pilotos
        piloto1.exibirDados();
        piloto1.pilotar();
        System.out.println();

        piloto2.exibirDados();
        piloto2.pilotar();
        System.out.println();


        // Passageiros
        passageiro1.exibirDados();
        passageiro1.embarcar();
        System.out.println();

        passageiro2.exibirDados();
        passageiro2.embarcar();
        System.out.println();


        // Aeroportos e aeronaves
        aeroporto1.exibirDados();
        aeroporto1.liberarDecolagem();
        aeronave1.decolar();

        System.out.println();

        aeroporto2.exibirDados();
        aeroporto2.liberarDecolagem();
        aeronave2.decolar();
    }
}