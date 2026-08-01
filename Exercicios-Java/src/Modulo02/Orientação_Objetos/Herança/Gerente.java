package Modulo02.Orientação_Objetos.Herança;

public non-sealed class Gerente extends Colaborador {

    private String login;

    private String password;

    private double comissao;

    public Gerente(String code, String name, String address, double salario, int age, String login,
                   String password, double comissao) {
        super(code, name, address, salario, age);
        this.login = login;
        this.password = password;
        this.comissao = comissao;
    }

    public Gerente() {
    }

    @Override
    public String getCode(){ // sobrescrita de métodos
        return "DF" + super.getCode(); // aqui eu poderia usar o this.code porque agora a variável é protected
    }

    @Override
    public double salarioTotal() {
        return this.salario + this.comissao;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double salarioTotal(double extra){ // sobrecarga de métodos
        return this.salarioTotal() + extra;
    }

}
