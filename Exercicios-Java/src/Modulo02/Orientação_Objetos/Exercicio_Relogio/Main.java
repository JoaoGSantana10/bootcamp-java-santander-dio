package Modulo02.Orientação_Objetos.Exercicio_Relogio;

public class Main {
    public static void main(String[] args){

       Relogio relogio_br = new Relogio_BR();
       relogio_br.setSegundos(0);
       relogio_br.setMinutos(10);
       relogio_br.setHoras(17);

       System.out.println(relogio_br.getTime());
       System.out.println(new Relogio_USA().conversao(relogio_br).getTime());
    }
}
