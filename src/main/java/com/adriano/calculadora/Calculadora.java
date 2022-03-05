package com.adriano.calculadora;

public class Calculadora {

    public Integer somar(Integer n1, Integer n2){
        return n1 + n2;
    }

    public Integer subtrair(Integer n1, Integer n2){
        return n1 - n2;
    }

    public Integer multiplicar(Integer n1, Integer n2){
        return n1 * n2;
    }

    public Integer dividir(Integer n1, Integer n2) {
        try {
            return n1 / n2;
        } catch(ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("Operação inválida" + ae.getMessage());
            return null;
        }
    }
    public Integer dividir2(Integer n1, Integer n2) {
        return n1 / n2;
    }
}
