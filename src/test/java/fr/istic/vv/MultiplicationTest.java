package fr.istic.vv;

import org.junit.Assert;
import org.junit.Test;

import javax.management.OperationsException;

import static org.junit.Assert.fail;

public class MultiplicationTest {
    @Test
    public void SimpleMultiplicationByZero(){
        double a = 10000;
        Multiplication mul = new Multiplication(a, 0);
        try {
            Assert.assertTrue(mul.operate() == 0);
        } catch (OperationsException e) {
            fail();
        }
    }

    @Test
    public void SimpleCommut(){
        double a = 10000;
        double b = 1000;
        Multiplication mul1 = new Multiplication(a, b);
        Multiplication mul2 = new Multiplication(b, a);
        Assert.assertTrue(mul1.equals(mul2));
    }

    @Test
    public void PositiveMultiplication(){
        double a = 1000;
        double b = 10000;
        Multiplication mul = new Multiplication(a, b);
        try {
            Assert.assertTrue(mul.operate() > a);
        } catch (OperationsException e) {
            fail();
        }
    }
}
