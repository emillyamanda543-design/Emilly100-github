package view;

import javax.swing.JOptionPane;
import Controller.KillController;

public class Main {

    public static void main(String[] args) {

        KillController controller = new KillController();

        int opcao = 0;

        while (opcao != 4) {

            opcao = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "1 - Listar Processos\n2 - Matar por PID\n3 - Matar por Nome\n4 - Sair"));

            switch (opcao) {

                case 1:
                    controller.listaProcessos();
                    break;

                case 2:
                    String pid = JOptionPane.showInputDialog("Digite o PID");
                    controller.mataPid(pid);
                    break;

                case 3:
                    String nome = JOptionPane.showInputDialog("Digite o nome do processo");
                    controller.mataNome(nome);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}