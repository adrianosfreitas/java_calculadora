package com.adriano.calculadora;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

    private Calculadora calculadora;

    @Before
    public void init() {
        this.calculadora = new Calculadora();
    }

    @Test
    public void testSomar() {
        Integer result  = this.calculadora.somar(2,5);
        Assert.assertEquals(result,Integer.valueOf(7));
    }

    @Test
    public void testSomarNeg() {
        Integer result  = this.calculadora.somar(-2,5);
        Assert.assertEquals(result,Integer.valueOf(3));
    }

    @Test
    public void testSubtrair() {
        Integer result  = this.calculadora.subtrair(6,4);
        Assert.assertEquals(result,Integer.valueOf(2));
    }

    @Test
    public void testMultiplicar() {
        Integer result  = this.calculadora.multiplicar(6,4);
        Assert.assertEquals(result,Integer.valueOf(24));
    }

    @Test
    public void testDividir() {
        Integer result  = this.calculadora.dividir(8,4);
        Assert.assertEquals(result,Integer.valueOf(2));
    }

   // @Test(expected = ArithmeticException.class)
    @Test
    public void testDividirZero() {
        Integer result = this.calculadora.dividir(8,0);
        Assert.assertNull(result);
    }
}