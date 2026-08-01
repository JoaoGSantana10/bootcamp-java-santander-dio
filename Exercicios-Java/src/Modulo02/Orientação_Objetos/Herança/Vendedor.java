package Modulo02.Orientação_Objetos.Herança;

public non-sealed class Vendedor extends Colaborador{

    private double porcentagemVendas;
    private double qtdeVendas;

    public Vendedor(String code, String name, String address, double salario, int age,
                    double porcentagemVendas, double soldAmount) {
        super(code, name, address, salario, age);
        this.porcentagemVendas = porcentagemVendas;
        this.qtdeVendas = soldAmount;
    }

    public Vendedor() {
    }

    @Override
    public String getCode(){ //sobrescrita de métodos
        return "RJ" + super.getCode();
    }

    @Override
    public double salarioTotal() {
        return this.salario + (qtdeVendas * porcentagemVendas) / 100;
    }

    public double getPorcentagemVendas() {
        return porcentagemVendas;
    }

    public void setPorcentagemVendas(double porcentagemVendas) {
        this.porcentagemVendas = porcentagemVendas;
    }

    public double getQtdeVendas() {
        return qtdeVendas;
    }

    public void setQtdeVendas(double qtdeVendas) {
        this.qtdeVendas = qtdeVendas;
    }
}
