package Exer1.entidades;

import Exer1.builders.PizzaBuilder;

import java.util.List;

public class Pizza {
    private String massa;
    private String tamanho;
    private List<String> ingredientes;
    private boolean bordaRecheadaCheddar;

    public Pizza(String massa, String tamanho, List<String> ingredientes, boolean bordaRecheadaDoce) {
        this.massa = massa;
        this.tamanho = tamanho;
        this.ingredientes = ingredientes;
        this.bordaRecheadaCheddar = bordaRecheadaCheddar;
    }

    @Override
    public String toString() {
        return "Pizza [Massa: " + massa + ", Tamanho: " + tamanho + ", Ingredientes: " + ingredientes +
                ", Borda recheada Com Cheddar: " + (bordaRecheadaCheddar ? "Sim" : "Não") + "]";
    }

    public String getMassa() {
        return massa;
    }

    public String getTamanho() {
        return tamanho;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public boolean isBordaRecheadaDoce() {
        return bordaRecheadaCheddar;
    }

    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }
}