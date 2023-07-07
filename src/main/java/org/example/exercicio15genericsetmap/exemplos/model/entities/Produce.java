package org.example.exercicio15genericsetmap.exemplos.model.entities;

import java.util.Objects;

public class Produce {
    private String name;
    private Double price;

    public Produce(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produce produce = (Produce) o;
        return Objects.equals(name, produce.name) && Objects.equals(price, produce.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
