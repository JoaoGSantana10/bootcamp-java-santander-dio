package Modulo02.Orientação_Objetos.Exercicio_Relogio;

public non-sealed class Relogio_USA extends Relogio {

    private String periodoIndicador;

    public String getPeriodoIndicador() {
        return periodoIndicador;
    }

    public void setDepoisDoMeiodia() {
        this.periodoIndicador = "PM";
    }

    public void setAntesDoMeiodia() {
        this.periodoIndicador = "AM";
    }

    public void setHoras(int horas) {
        setAntesDoMeiodia();
        if ((horas > 12) && (horas <= 23)) {
            setDepoisDoMeiodia();
            this.horas = horas - 12;
        } else if (horas > 24) {
            periodoIndicador = "AM";
            this.horas = 0;
        } else {
            this.horas = horas;
        }
    }

    @Override
    Relogio conversao(Relogio relogio) {
        this.minutos = relogio.getMinutos();
        this.segundos = relogio.getSegundos();
        switch (relogio) {
            case Relogio_USA relogio_USA -> {
                this.horas = relogio_USA.getHoras();
                this.periodoIndicador = relogio_USA.getPeriodoIndicador();
            }
            case Relogio_BR relogio_BR -> {
                this.setHoras(relogio_BR.getHoras());

            }
        }
        return this;
    }

    @Override
    public String getTime(){
        return super.getTime() + " " + this.periodoIndicador;
    }

}


