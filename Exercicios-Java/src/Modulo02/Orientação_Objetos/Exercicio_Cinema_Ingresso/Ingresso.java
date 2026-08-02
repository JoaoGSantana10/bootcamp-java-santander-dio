package Modulo02.Orientação_Objetos.Exercicio_Cinema_Ingresso;

public abstract sealed class Ingresso permits MeiaEntrada, IngressoFamilia {

    protected double valor;

    protected String nome;

    protected boolean dublado;

    public Ingresso(double valor, String nome, boolean dublado) {
        this.valor = valor;
        this.nome = nome;
        this.dublado = dublado;
    }


    public double getValor() {
        return valor;
    }


    public String getNome() {
        return nome;
    }


    public boolean isDublado() {
        return dublado;
    }


    abstract double valorReal ();
}
