package fr.istic.vv;

import org.junit.Test;

import javax.management.OperationsException;

import static org.junit.Assert.fail;

public class SubtractionTest {
    @Test
    public void SimpleSubtractionByZero(){
        double a = 10000;
        Subtraction sub = new Subtraction(a, 0);
        try {
            assert(sub.operate() == a);
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
            assert(sub1.operate() == - sub2.operate());
        } catch (OperationsException e) {
            fail();
        }
    }

    @Test
    public void NegativeSubtraction(){
        double a = 1000;
        double b = 10000;
        Subtraction sub = new Subtraction(a, b);
        try {
            if(a < b){
                assert(sub.operate() < 0);
            }else{
                assert(sub.operate() >= 0);
            }

        } catch (OperationsException e) {
            fail();
        }
    }
}
