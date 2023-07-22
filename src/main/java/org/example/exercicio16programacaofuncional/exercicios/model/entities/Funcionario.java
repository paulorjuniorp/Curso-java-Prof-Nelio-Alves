package org.example.exercicio16programacaofuncional.exercicios.model.entities;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private String email;
    private Double salario;

    public Funcionario(String nome, String email, Double salario) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(nome, that.nome) && Objects.equals(email, that.email) && Objects.equals(salario, that.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email, salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", salario=" + salario +
                '}';
    }
}
