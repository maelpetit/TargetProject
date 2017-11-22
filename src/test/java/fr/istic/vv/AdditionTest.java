package fr.istic.vv;

import org.junit.Assert;
import org.junit.Test;

import javax.management.OperationsException;

import static org.junit.Assert.fail;

public class AdditionTest {

    @Test
    public void SimpleAdditionByZero(){
        double a = 10000;
        Addition add = new Addition(a, 0);
        try {
            Assert.assertTrue(add.operate() == a);
        } catch (OperationsException e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void SimpleCommut(){
        double a = 10000;
        double b = 1000;
        Addition add510 = new Addition(a, b);
        Addition add105 = new Addition(b, a);
        Assert.assertTrue(add510.equals(add105));
    }

    @Test
    public void AddTest(){
        Addition add = new Addition(1000, 10000);
        try {
            Assert.assertTrue(add.operate() == add.getFirstTerm() + add.getSecondTerm());
        } catch (OperationsException e) {
            e.printStackTrace();
            fail();
        }
    }

}