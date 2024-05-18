package com.example.tp.model;
public class Calculo {
    public double valor1;
    public double valor2;

    public double getValor1() {
        return valor1;
    }
    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }
    public double getValor2() {
        return valor2;
    }
    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    public double getSum() {
        return  this.valor1 +  this.valor2;
    }
    public double getSub() {
        return  this.valor1 -  this.valor2;
    }
    public double getDiv() {
        return  this.valor1  / this.valor2;
    }
    public double getMul() {
        return  this.valor1  * this.valor2;
    }
    public double getExp() {
        double resultado = 1;
        for (double aux = valor2; aux >= 1; aux--) {
            resultado = resultado * this.valor1;
        }
    return resultado;
    }



}
