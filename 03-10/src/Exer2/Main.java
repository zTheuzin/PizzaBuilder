package Exer2;

import Exer2.builders.VeiculoBuilder;
import Exer2.entidades.Veiculo;

public class Main {
    public static void main(String[] args) {
        comBuilder();
        semBuilder();
    }

    public static void comBuilder() {
        Veiculo moto = new VeiculoBuilder()
                .setTipo("Moto")
                .setCor("Vermelha")
                .setQuantiRoda(2)
                .build();

        Veiculo carro = new VeiculoBuilder()
                .setTipo("Carro")
                .setCor("Azul")
                .setQuantiRoda(4)
                .build();

        System.out.println(moto.toString());
        System.out.println(carro.toString());
    }

    public static void semBuilder() {
        Veiculo moto = new Veiculo("Moto", "Preta", 2);

        Veiculo carro = new Veiculo("Carro", "Branco");

        System.out.println(moto.toString());
        System.out.println(carro.toString());
    }
}
