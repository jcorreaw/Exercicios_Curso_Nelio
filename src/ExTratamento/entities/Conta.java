package ExTratamento.entities;

import ExTratamento.exceptions.BusinessException;

public class Conta {
    private Integer numeroDaConta;
    private String titular;
    private Double saldo;
    private Double limiteDoSaque;

    public Conta(Integer numeroDaConta, String titular, Double saldo, Double limiteDoSaque) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteDoSaque = limiteDoSaque;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteDoSaque() {
        return limiteDoSaque;
    }

    public void deposito(Double valor){
        saldo += valor;
    }

    public void saque(Double valor){
        validaSaque(valor);
        saldo -= valor;
    }

    public void validaSaque(Double valor){
        if (getSaldo() < 0 ){
            throw new BusinessException("Nao pode realizar saque em conta zerada!");
        }
        if (valor > getLimiteDoSaque()){
            throw new BusinessException("O valor do saque nao pode ser superior ao limite do saque!");
        }
        if (valor > getSaldo()){
            throw new BusinessException("Erro de saque: Saldo insuficiente!");
        }
    }


}
