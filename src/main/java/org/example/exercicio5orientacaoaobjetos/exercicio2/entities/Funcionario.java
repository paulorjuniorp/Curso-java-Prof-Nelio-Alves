package org.example.exercicio5orientacaoaobjetos.exercicio2.entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido(){
        return salarioBruto - imposto;
    }
    public void aumentarSalario(double porcentagem){
        salarioBruto += salarioBruto * porcentagem / 100;
    }

    public String toString(){
        return nome
                +", R$ "
                + String.format("%.2f", salarioLiquido());
    }
}
