package org.example.exercicio18jpa.aplicacao;

import org.example.exercicio18jpa.dominio.Pessoa;

public class Programa {
    public static void main(String[] args) {
//        Pessoa p1 = new Pessoa(null,"Carlos da Silva","carlos@gmail.com");
//        Pessoa p2 = new Pessoa(null,"Joaquim Torres","joaquim@gmail.com");
//        Pessoa p3 = new Pessoa(null,"Ana Maria","ana@gmail.com");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();


        Pessoa pessoa = em.find(Pessoa.class, 2);
        System.out.println(pessoa);
        em.getTransaction().begin();
        // para remover tem que ser um objeto monitorado que é um objeto que acabou de ser inserido ou foi localizado no bd
        em.remoce(pessoa);
        em.getTransaction().commit();
//        em.getTransaction().begin();
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//        em.getTransaction().commit();
        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}
