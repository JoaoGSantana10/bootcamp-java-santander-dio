package Modulo02.Orientação_Objetos.Exercicio_Pet_Shop;

public class Pet {

    private final String nome;
    private boolean limpo;

    public Pet(String nome){
        this.nome = nome;
        this.limpo = false;
    }

    public String getNome(){
        return nome;
    }

    public void setLimpo(boolean limpo){
        this.limpo = limpo;
    }

    public boolean getlimpo(){
        return limpo;
    }


}
