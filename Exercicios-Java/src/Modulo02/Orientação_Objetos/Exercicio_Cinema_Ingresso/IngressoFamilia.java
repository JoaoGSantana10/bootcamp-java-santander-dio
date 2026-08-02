package Modulo02.Orientação_Objetos.Exercicio_Cinema_Ingresso;

public non-sealed class IngressoFamilia extends Ingresso {

    private int pessoas;

    public IngressoFamilia(double valor, String nome, boolean dublado, int pessoas) {
        super(valor, nome, dublado);
        this.pessoas = pessoas;
    }

    public int getPessoas() {
        return pessoas;
    }

    @Override
    double valorReal() {
        if (pessoas > 3){
            return (valor * pessoas) * 0.95;
        } else {
            return valor * pessoas;
        }
    }
}
