package Modulo02.Orientação_Objetos.Exercicio_Relogio;

public abstract sealed class Relogio permits Relogio_BR, Relogio_USA {

    protected int horas;

    protected int minutos;

    protected int segundos;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas >= 24) {
            this.horas = 24;
            return;
        }
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 60) {
            this.minutos = 60;
            return;
        }
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 60) {
            this.segundos = 60;
            return;
        }
        this.segundos = segundos;
    }

    public String getTime(){
        return format(horas) + ":" + format(minutos) + ":" + format(segundos);
    }

    private String format(int valor){
        return valor < 9 ? "0" + valor : String.valueOf(valor);
    }

    abstract Relogio conversao(Relogio relogio);
}