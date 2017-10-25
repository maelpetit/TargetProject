package fr.istic.vv;

import org.junit.Test;

import javax.management.OperationsException;

import static org.junit.Assert.fail;

public class AdditionTest {

    @Test
    public void SimpleAdditionByZero(){
        double a = 10000;
        Addition add = new Addition(a, 0);
        try {
            assert(add.operate() == a);
        } catch (OperationsException e) {
            fail();
        }
    }

    @Test
    public void SimpleCommut(){
        double a = 10000;
        double b = 1000;
        Addition add510 = new Addition(a, b);
        Addition add105 = new Addition(b, a);
        try {
            assert(add510.operate() == add105.operate());
        } catch (OperationsException e) {
            fail();
        }
    }

    @Test
    public void PositiveAddition(){
        double a = 1000;
        double b = 10000;
        Addition add = new Addition(a, b);
        try {
            assert(add.operate() > 0);
        } catch (OperationsException e) {
            fail();
        }
    }
}