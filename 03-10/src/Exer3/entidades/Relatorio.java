package Exer3.entidades;

import Exer3.builders.RelatorioBuilder;

public class Relatorio {

    public String titulo;
    public String corpo;
    public String rodape;

    public Relatorio(RelatorioBuilder builder){
        this.titulo = builder.titulo;
        this.corpo = builder.corpo;
        this.rodape = builder.rodape;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Título: ").append(titulo).append("\n");
        sb.append("Corpo: ").append(corpo).append("\n");
        if(rodape != null && !rodape.isEmpty()){
            sb.append("Rodapé: ").append(rodape).append("\n");
        }
        return sb.toString();
    }
    public static RelatorioBuilder builder(){
        return new RelatorioBuilder();
    }
}