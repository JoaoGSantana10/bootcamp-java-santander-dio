package Modulo02.Orientação_Objetos.Herança;

public sealed abstract class Colaborador permits Gerente, Vendedor {


    /*
    Uma classe abstrata não pode receber instância
    sealed é uma classe selada e as classes filhas tem que ter um not-sealed para definir que ela não é selada ou final
     */

    protected String code;

    protected String name;

    protected String address;

    protected double salario;

    protected int age;

    public Colaborador(String code, String name, String address, double salario, int age) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.salario = salario;
        this.age = age;
    }

    public Colaborador() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double salarioTotal();
}
