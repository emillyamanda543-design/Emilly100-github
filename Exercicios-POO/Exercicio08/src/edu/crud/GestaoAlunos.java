package edu.crud;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GestaoAlunos {

    private int indice = 0;

    private Aluno[] alunos = new Aluno[50];

    private Scanner input =
        new Scanner(System.in);

    private DateTimeFormatter dtf =
        DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public void menu() {

        boolean executando = true;

        while (executando) {

            System.out.println();
            System.out.println("G E S T A O  D E  A L U N O S");
            System.out.println("Menu de Opcoes");
            System.out.println("(C)riar");
            System.out.println("(E)xibir");
            System.out.println("(L)istar Todos");
            System.out.println("(R)emover");
            System.out.println("(A)tualizar");
            System.out.println("(S)air");

            System.out.print("Escolha sua opcao ==> ");

            String linha =
                input.nextLine().toUpperCase();

            if (linha.length() > 0) {

                char opcao = linha.charAt(0);

                if (opcao == 'C') {

                    criar();

                } else if (opcao == 'E') {

                    exibir();

                } else if (opcao == 'L') {

                    listarTodos();

                } else if (opcao == 'R') {

                    excluir();

                } else if (opcao == 'A') {

                    atualizar();

                } else if (opcao == 'S') {

                    executando = false;

                } else {

                    System.out.println("Opcao invalida.");
                }
            }

            if (executando) {
                System.out.print(
                    "Tecle <ENTER> para continuar..."
                );

                input.nextLine();
            }
        }
    }


    public void criar() {

        if (indice >= alunos.length) {

            System.out.println(
                "Limite de alunos atingido."
            );

            return;
        }

        System.out.println("Criando Aluno");

        System.out.println(
            "Digite o RA do Aluno:"
        );

        String ra = input.nextLine();

        if (procurarPorRa(ra) != null) {

            System.out.println(
                "Já existe aluno com este RA."
            );

            return;
        }

        System.out.println(
            "Digite o Nome do Aluno:"
        );

        String nome = input.nextLine();

        System.out.println(
            "Digite o Nascimento do Aluno " +
            "no formato (dd/mm/yyyy):"
        );

        String textoNascimento =
            input.nextLine();

        LocalDate nascimento =
            LocalDate.parse(
                textoNascimento,
                dtf
            );

        Aluno aluno = new Aluno(
            indice + 1,
            ra,
            nome,
            nascimento
        );

        alunos[indice] = aluno;

        indice++;

        System.out.println(
            "Aluno cadastrado com sucesso."
        );
    }


    public void exibir() {

        System.out.println(
            "Exibir Dados do Aluno"
        );

        System.out.println(
            "Digite o RA do Aluno:"
        );

        String ra = input.nextLine();

        Aluno aluno =
            procurarPorRa(ra);

        if (aluno != null) {

            System.out.println(
                "D A D O S  D O  A L U N O"
            );

            System.out.println(aluno);

        } else {

            System.out.println(
                "Aluno com RA " +
                ra +
                " não foi encontrado."
            );
        }
    }


    public void listarTodos() {

        System.out.println(
            "L I S T A  D E  A L U N O S"
        );

        boolean encontrou = false;

        for (int i = 0;
             i < alunos.length;
             i++) {

            if (alunos[i] != null) {

                System.out.println(
                    alunos[i]
                );

                encontrou = true;
            }
        }

        if (!encontrou) {

            System.out.println(
                "Nenhum aluno cadastrado."
            );
        }
    }


    public void excluir() {

        System.out.println(
            "Excluir Aluno"
        );

        System.out.println(
            "Digite o RA do Aluno:"
        );

        String ra =
            input.nextLine();

        int posicao =
            indicePorRa(ra);

        if (posicao >= 0) {

            alunos[posicao] = null;

            System.out.println(
                "Aluno excluido com sucesso."
            );

        } else {

            System.out.println(
                "Aluno com RA " +
                ra +
                " não foi encontrado."
            );
        }
    }


    public void atualizar() {

        System.out.println(
            "Atualizar Aluno"
        );

        System.out.println(
            "Digite o RA do Aluno:"
        );

        String ra =
            input.nextLine();

        int posicao =
            indicePorRa(ra);

        if (posicao >= 0) {

            System.out.println(
                "Digite o novo nome do Aluno:"
            );

            String nome =
                input.nextLine();

            System.out.println(
                "Digite a nova data de nascimento " +
                "no formato (dd/mm/yyyy):"
            );

            String textoNascimento =
                input.nextLine();

            LocalDate nascimento =
                LocalDate.parse(
                    textoNascimento,
                    dtf
                );

            Aluno aluno =
                alunos[posicao];

            aluno.setNome(nome);
            aluno.setNascimento(nascimento);

            System.out.println(
                "Aluno atualizado com sucesso."
            );

        } else {

            System.out.println(
                "Aluno com RA " +
                ra +
                " não foi encontrado."
            );
        }
    }


    public int indicePorRa(String ra) {

        for (int i = 0;
             i < alunos.length;
             i++) {

            Aluno aluno =
                alunos[i];

            if (aluno != null &&
                aluno.getRa() != null &&
                aluno.getRa().equals(ra)) {

                return i;
            }
        }

        return -1;
    }


    public Aluno procurarPorRa(String ra) {

        for (int i = 0;
             i < alunos.length;
             i++) {

            Aluno aluno =
                alunos[i];

            if (aluno != null &&
                aluno.getRa() != null &&
                aluno.getRa().equals(ra)) {

                return aluno;
            }
        }

        return null;
    }


    public static void main(String[] args) {

        GestaoAlunos gestao =
            new GestaoAlunos();

        gestao.menu();
    }
}