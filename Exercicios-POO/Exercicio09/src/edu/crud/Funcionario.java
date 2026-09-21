package edu.crud;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {

    private long id;
    private String nome;
    private String matricula;
    private LocalDate admissao;
    private LocalDate demissao;
    private float salario;
    private String horario;

    public Funcionario(long id, String nome, String matricula,
                       LocalDate admissao, LocalDate demissao,
                       float salario, String horario) {

        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.admissao = admissao;
        this.demissao = demissao;
        this.salario = salario;
        this.horario = horario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getAdmissao() {
        return admissao;
    }

    public void setAdmissao(LocalDate admissao) {
        this.admissao = admissao;
    }

    public LocalDate getDemissao() {
        return demissao;
    }

    public void setDemissao(LocalDate demissao) {
        this.demissao = demissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void exibir() {

        DateTimeFormatter dtf =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Admissão: " + admissao.format(dtf));
        System.out.println("Demissão: " + demissao.format(dtf));
        System.out.println("Salário: R$ " + salario);
        System.out.println("Horário: " + horario);
        System.out.println("--------------------------");
    }
}