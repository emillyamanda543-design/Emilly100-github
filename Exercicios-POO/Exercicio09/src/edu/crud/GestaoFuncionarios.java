package edu.crud;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GestaoFuncionarios {

    private int indice = 0;

    private Funcionario[] funcionarios =
        new Funcionario[50];

    private Scanner input =
        new Scanner(System.in);

    private DateTimeFormatter dtf =
        DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public void menu() {

        boolean executando = true;

        while (executando) {

            System.out.println();
            System.out.println("G E S T A O  D E  F U N C I O N A R I O S");
            System.out.println("(C)riar");
            System.out.println("(E)xibir");
            System.out.println("(R)emover");
            System.out.println("(A)tualizar");
            System.out.println("(S)air");

            System.out.print("Escolha sua opcao ==> ");

            String linha =
                input.nextLine().toUpperCase();

            if (linha.length() > 0) {

                char opcao =
                    linha.charAt(0);

                if (opcao == 'C') {

                    criar();

                } else if (opcao == 'E') {

                    exibir();

                } else if (opcao == 'R') {

                    excluir();

                } else if (opcao == 'A') {

                    atualizar();

                } else if (opcao == 'S') {

                    executando = false;
                }
            }
        }
    }


    public void criar() {

        if (indice >= funcionarios.length) {

            System.out.println(
                "Limite de funcionários atingido."
            );

            return;
        }

        System.out.println("Criar Funcionário");

        System.out.print("Nome: ");
        String nome =
            input.nextLine();

        System.out.print("Matrícula: ");
        String matricula =
            input.nextLine();

        System.out.print(
            "Data de admissão (dd/MM/yyyy): "
        );

        LocalDate admissao =
            LocalDate.parse(
                input.nextLine(),
                dtf
            );

        System.out.print(
            "Data de demissão (dd/MM/yyyy): "
        );

        LocalDate demissao =
            LocalDate.parse(
                input.nextLine(),
                dtf
            );

        System.out.print("Salário: ");
        float salario =
            Float.parseFloat(
                input.nextLine()
            );

        System.out.print("Horário: ");
        String horario =
            input.nextLine();

        Funcionario funcionario =
            new Funcionario(
                indice + 1,
                nome,
                matricula,
                admissao,
                demissao,
                salario,
                horario
            );

        funcionarios[indice] =
            funcionario;

        indice++;

        System.out.println(
            "Funcionário cadastrado."
        );
    }


    public void exibir() {

        System.out.print(
            "Digite a matrícula: "
        );

        String matricula =
            input.nextLine();

        boolean encontrou = false;

        for (int i = 0;
             i < funcionarios.length;
             i++) {

            Funcionario funcionario =
                funcionarios[i];

            if (funcionario != null &&
                funcionario
                    .getMatricula()
                    .equals(matricula)) {

                funcionario.exibir();

                encontrou = true;
            }
        }

        if (!encontrou) {

            System.out.println(
                "Funcionário não encontrado."
            );
        }
    }


    public void excluir() {

        System.out.print(
            "Digite a matrícula: "
        );

        String matricula =
            input.nextLine();

        boolean excluiu = false;

        for (int i = 0;
             i < funcionarios.length;
             i++) {

            Funcionario funcionario =
                funcionarios[i];

            if (funcionario != null &&
                funcionario
                    .getMatricula()
                    .equals(matricula)) {

                funcionarios[i] = null;

                excluiu = true;
            }
        }

        if (excluiu) {

            System.out.println(
                "Funcionário(s) removido(s)."
            );

        } else {

            System.out.println(
                "Funcionário não encontrado."
            );
        }
    }


    public void atualizar() {

        System.out.print(
            "Digite a matrícula: "
        );

        String matricula =
            input.nextLine();

        for (int i = 0;
             i < funcionarios.length;
             i++) {

            Funcionario funcionario =
                funcionarios[i];

            if (funcionario != null &&
                funcionario
                    .getMatricula()
                    .equals(matricula)) {

                System.out.print(
                    "Novo nome: "
                );

                funcionario.setNome(
                    input.nextLine()
                );

                System.out.print(
                    "Nova admissão (dd/MM/yyyy): "
                );

                funcionario.setAdmissao(
                    LocalDate.parse(
                        input.nextLine(),
                        dtf
                    )
                );

                System.out.print(
                    "Nova demissão (dd/MM/yyyy): "
                );

                funcionario.setDemissao(
                    LocalDate.parse(
                        input.nextLine(),
                        dtf
                    )
                );

                System.out.print(
                    "Novo salário: "
                );

                funcionario.setSalario(
                    Float.parseFloat(
                        input.nextLine()
                    )
                );

                System.out.print(
                    "Novo horário: "
                );

                funcionario.setHorario(
                    input.nextLine()
                );

                System.out.println(
                    "Funcionário atualizado."
                );

                return;
            }
        }

        System.out.println(
            "Funcionário não encontrado."
        );
    }


    public static void main(String[] args) {

        GestaoFuncionarios gestao =
            new GestaoFuncionarios();

        gestao.menu();
    }
}