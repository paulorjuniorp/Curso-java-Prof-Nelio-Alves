package org.example.exercicio10enumcomposicao.entities;

import org.example.exercicio10enumcomposicao.enums.TrabalhadorNivel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private TrabalhadorNivel trabalhadorNivel;
    private Double salarioBase;
    private Departamento departamento;
    private List<ContratoHora> contratoHoras = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, TrabalhadorNivel trabalhadorNivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.trabalhadorNivel = trabalhadorNivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
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

    public void addContract(ContratoHora contratoHora){
        contratoHoras.add(contratoHora);
    }

    public void removeContract(ContratoHora contratoHora){
        contratoHoras.remove(contratoHora);
    }

    public double salario(Integer ano, Integer mes){
        Double soma = salarioBase;
        Calendar calendario = Calendar.getInstance();
        for (ContratoHora contratoHora : contratoHoras) {
            calendario.setTime(contratoHora.getDate());
            if ((calendario.get(Calendar.MONTH) + 1) == mes && calendario.get(Calendar.YEAR) == ano){
                soma += contratoHora.valorTotal();
            }
        }

        return soma;
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
