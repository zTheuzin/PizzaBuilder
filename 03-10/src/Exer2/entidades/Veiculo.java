package Exer2.entidades;

public class Veiculo {
    private String tipo;
    private String cor;
    private int quantiRoda;

    public Veiculo() { }

    public Veiculo(String tipo, String cor, int quantiRoda) {
        this.tipo = tipo;
        this.cor = cor;
        this.quantiRoda = quantiRoda;
    }

    public Veiculo(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
        this.quantiRoda = 4;
    }

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    public String getCor() {return cor;}
    public void setCor(String cor) {this.cor = cor;}
    public int getQuantiRoda() {return quantiRoda;}
    public void setQuantiRoda(int quantiRoda) {this.quantiRoda = quantiRoda;}

    @Override
    public String toString() {
        return "Tipo de Veículo: "
                + this.tipo + ", Cor: "
                + this.cor + ", Quantidade de Rodas: "
                + this.quantiRoda;
    }
}
