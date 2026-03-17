package View;

import javax.swing.JOptionPane;
import controle.Controle;

public class Main {

    public static void main(String[] args) {

    	Controle redes = new Controle();

        int opcao = 0;

        while (opcao != 3) {

            opcao = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "1 - Ver IP\n2 - Ping Google\n3 - Sair"));

            switch (opcao) {

                case 1:
                    redes.ip();
                    break;

                case 2:
                    redes.ping();
                    break;

                case 3:
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");

            }
        }
    }
}