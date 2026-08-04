package Modulo04_Collections.Set;

import java.util.Objects;

import static java.util.Objects.hash;
import static java.util.Objects.isNull;

public class User {

    private int id;

    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("{'id': %s, 'name': %s}", id, name);
    }

    @Override
    public boolean equals(Object obj) { // O equals verifica igualdade entre objetos
        if (obj == this) return true; // Verifica se tem o mesmo endereço de memória
        if ((isNull(obj)) || (!(obj instanceof User user))) return false;
        // Verifica se tem a mesma instância do usuário nesse caso verifica se o usuário não tem a mesma instância
        return this.id == user.getId() && Objects.equals(user.getName(), this.name);
    }

    @Override
    public int hashCode() { // Gera um hash dos objetos mas podemos ter objetos com o mesmo hashCode
        return hash(this.id, this.name);
    }

}
