package Exer2.builders;

import Exer2.entidades.Veiculo;

public class VeiculoBuilder {
    private Veiculo veiculo;

    public VeiculoBuilder() {this.veiculo = new Veiculo();}
    public VeiculoBuilder setTipo(String tipo) {
        this.veiculo.setTipo(tipo);
        return this;
    }

    public VeiculoBuilder setCor(String cor) {
        this.veiculo.setCor(cor);
        return this;
    }

    public VeiculoBuilder setQuantiRoda(int quantiRoda) {
        this.veiculo.setQuantiRoda(quantiRoda);
        return this;
    }
    public Veiculo build() {return this.veiculo;}
}
