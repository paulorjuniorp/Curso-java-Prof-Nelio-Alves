package org.example.exercicio5orientacaoaobjetos.exercicio3.entities;

public class Estudante {
    public String nome;
    public double notaPrimeiroTrimestre;
    public double notaSegundoTrimestre;
    public double notaTerceiroTrimestre;

    public double notaFinal(){
        return notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;
    }

    public void resultado(){
        double resultado = notaFinal();
        if (resultado > 60.0){
            System.out.println("PASSOU");
        } else {
            System.out.println("REPROVOU");
            System.out.println("FALTAM " + (60.0 - resultado) + " PONTOS");
        }
    }
}
