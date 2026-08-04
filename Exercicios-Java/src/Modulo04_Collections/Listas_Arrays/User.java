package Modulo04_Collections.Listas_Arrays;

import java.util.Objects;

public class User {

    private int code;

    private String nome;

    public User(int code, String nome) {
        this.code = code;
        this.nome = nome;
    }

    public User() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Verifca se o objeto tem a mesma instância

    @Override
    public boolean equals(Object obj) {
        var isEqual = false;
        if (obj instanceof User user){
            if (this == user) isEqual = true;
            if (this.code == user.code && Objects.equals(this.nome, user.nome)); isEqual = true;
        }
        return isEqual;
    }

    // Retorna a lista formatada e mostra cada users com seu code e seu nome
    @Override
    public String toString(){
        return String.format("{ 'code:' %s, 'name:' %s}",this.code, this.nome);
    }

}
