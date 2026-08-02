package Modulo02.Orientação_Objetos.Exercicio_Cinema_Ingresso;

public non-sealed class MeiaEntrada extends Ingresso {


    public MeiaEntrada(double valor, String nome, boolean dublado) {
        super(valor, nome, dublado);
    }

    @Override
    double valorReal() {
        return valor / 2;
    }
}
