package Modulo02.Orientação_Objetos.Exercicio_Conta_Bancaria;

public class ContaBancaria {

    private double saldoAtual;
    private double limiteChequeEspecial;
    private boolean taxaJacobrada = false;

    public ContaBancaria(double saldoAtual){
        this.saldoAtual = saldoAtual;
        if (this.saldoAtual <= 500){
            this.limiteChequeEspecial = 50;
        } else {
            this.limiteChequeEspecial = saldoAtual * 0.5;
        }
    }

    public double consultarSaldo(){
        return this.saldoAtual;
    }

    public double consultarChequeEspecial(){
        return this.limiteChequeEspecial;
    }

    public boolean estaUsandoChequeEspecial(){
        /*
        outra forma mais simples:
        return saldoAtual < 0;
         */
        if (saldoAtual < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean sacar(double valor){
        if (saldoAtual - valor >= -limiteChequeEspecial){
            saldoAtual -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean pagarBoleto(double valor){
        /*
        opção diferente era só chamar o sacar(valor)
         */
        if (saldoAtual - valor >= -limiteChequeEspecial){
            saldoAtual -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor){
        if (valor > 0 ){
            double taxa = 0;
            if (estaUsandoChequeEspecial()){
                if (!taxaJacobrada){
                     taxa = -saldoAtual * 0.2;
                    taxaJacobrada = true;
                }
            }
            saldoAtual += valor - taxa;
            return true;
        } else {
            return false;
        }

    }







}
