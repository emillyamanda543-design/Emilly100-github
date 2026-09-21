import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Dinossauro skeep = new Dinossauro(
            10,
            10,
            25,
            "Feliz"
        );

        while (true) {

            skeep.exibirCaracteristicas();

            System.out.println("\nEscolha uma opção:");
            System.out.println("P - Pular");
            System.out.println("C - Correr");
            System.out.println("M - Comer");
            System.out.println("A - Cantar");
            System.out.println("S - Tomar Sol");
            System.out.println("O - Ficar na Sombra");

            String opcao = scan.nextLine().toUpperCase();

            char escolha = opcao.charAt(0);

            switch (escolha) {

                case 'P':
                    skeep.pular();
                    break;

                case 'C':
                    skeep.correr();
                    break;

                case 'M':
                    skeep.comer();
                    break;

                case 'A':
                    skeep.cantar();
                    break;

                case 'S':
                    skeep.tomarSol();
                    break;

                case 'O':
                    skeep.ficarNaSombra();
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}