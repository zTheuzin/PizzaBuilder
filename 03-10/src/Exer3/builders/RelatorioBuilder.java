package Exer3.builders;

import Exer3.entidades.Relatorio;

public class RelatorioBuilder {

    public String titulo;
    public String corpo;
    public String rodape;

    public RelatorioBuilder setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public RelatorioBuilder setCorpo(String corpo) {
        this.corpo = corpo;
        return this;
    }

    public RelatorioBuilder setRodape(String rodape) {
        this.rodape = rodape;
        return this;
    }

    public Relatorio build(){
        return new Relatorio(this);
    }
}