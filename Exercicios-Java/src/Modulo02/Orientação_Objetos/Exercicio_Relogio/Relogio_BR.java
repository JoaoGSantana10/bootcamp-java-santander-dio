package Modulo02.Orientação_Objetos.Exercicio_Relogio;

public non-sealed class Relogio_BR extends Relogio{


    @Override
    public Relogio conversao(Relogio relogio) {
        this.segundos = relogio.getSegundos();
        this.minutos = relogio.getSegundos();
        switch (relogio){
            case Relogio_USA relogio_USA -> {
                this.horas = (relogio_USA.getPeriodoIndicador().equals("PM")) ?
                        relogio_USA.getHoras() + 12 :
                        relogio_USA.getHoras();
            }
            case Relogio_BR relogio_BR -> {
                this.horas = relogio_BR.getHoras();
            }
        }
        return this;
    }

}
