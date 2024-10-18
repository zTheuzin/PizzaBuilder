package Exer3;

import Exer3.entidades.Relatorio;

public class Main {
    public static void main(String[] args) {

        Relatorio relatorioPadrao = Relatorio.builder().setTitulo("Relatório semanal").setCorpo("Este é o corpo do relatório semanal.").build();
        Relatorio relatorioCompleto = Relatorio.builder().setTitulo("Relatório mensal").setCorpo("Este é o corpo do relatório mensal.").setRodape("Este é o rodapé do relatório mensal.").build();

        System.out.println(relatorioPadrao);
        System.out.println("===================\n");
        System.out.println(relatorioCompleto);
    }
}