package org.example.exercicio10enum.entities;

import org.example.exercicio10enum.enums.TrabalhadorNivel;

import java.util.List;

public class Trabalhador {
    private String nome;
    private TrabalhadorNivel trabalhadorNivel;
    private Double salarioBase;
    private Departamento departamento;
    private List<ContratoHora> contratoHoras;

    public Trabalhador() {
    }

    public Trabalhador(String nome, TrabalhadorNivel trabalhadorNivel, Double salarioBase, Departamento departamento, List<ContratoHora> contratoHoras) {
        this.nome = nome;
        this.trabalhadorNivel = trabalhadorNivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
        this.contratoHoras = contratoHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TrabalhadorNivel getTrabalhadorNivel() {
        return trabalhadorNivel;
    }

    public void setTrabalhadorNivel(TrabalhadorNivel trabalhadorNivel) {
        this.trabalhadorNivel = trabalhadorNivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratoHoras() {
        return contratoHoras;
    }

    public void setContratoHoras(List<ContratoHora> contratoHoras) {
        this.contratoHoras = contratoHoras;
    }

    @Override
    public String toString() {
        return "Trabalhador{" +
                "nome='" + nome + '\'' +
                ", trabalhadorNivel=" + trabalhadorNivel +
                ", salarioBase=" + salarioBase +
                ", departamento=" + departamento +
                ", contratoHoras=" + contratoHoras +
                '}';
    }
}
