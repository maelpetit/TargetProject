package fr.istic.vv;

import org.junit.Assert;
import org.junit.Test;

import javax.management.OperationsException;

import static org.junit.Assert.fail;

public class SubtractionTest {
    @Test
    public void SimpleSubtractionByZero(){
        double a = 10000;
        Subtraction sub = new Subtraction(a, 0);
        try {
            Assert.assertTrue(sub.operate() == a);
        } catch (OperationsException e) {
            fail();
        }
    }

    @Test
    public void SimpleCommut(){
        double a = 10000;
        double b = 1000;
        Subtraction sub1 = new Subtraction(a, b);
        Subtraction sub2 = new Subtraction(b, a);
        try {
            Assert.assertTrue(sub1.operate() == - sub2.operate());
        } catch (OperationsException e) {
            fail();
        }
    }

    @Test
    public void opposite(){
        double a = 10000;
        double b = 1000;
        Subtraction sub1 = new Subtraction(a, b);
        Subtraction sub2 = new Subtraction(-a, -b);
        Assert.assertTrue(sub1.equals(sub2));
    }

    @Test
    public void wrongCommut() {
        double a = 10000;
        double b = 1000;
        Subtraction sub1 = new Subtraction(a, b);
        Subtraction sub2 = new Subtraction(b, a);
        Assert.assertTrue(!sub1.equals(sub2));
    }

    @Test
    public void NegativeSubtraction(){
        double a = 1000;
        double b = 10000;
        Subtraction sub = new Subtraction(a, b);
        try {
            if(a < b){
                Assert.assertTrue(sub.operate() < 0);
            }else{
                Assert.assertTrue(sub.operate() >= 0);
            }

        } catch (OperationsException e) {
            fail();
        }
    }
}
