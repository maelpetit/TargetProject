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
        try {
            assert(add510.operate() == add105.operate());
        } catch (OperationsException e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void AddTest(){
        Addition add = new Addition(1000, 10000);
        try {
            assert(add.operate() == add.getFirstTerm() + add.getSecondTerm());
        } catch (OperationsException e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void Test(){
        try {
            double a = 0;
            double b = 1;
            Addition add = new Addition(a, b);
            assert(add.getFirstTerm() == a);
            //assert(add.getFirstTerm() + add.getSecondTerm() == a + b);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void TrueTest(){
        assert(true);
    }
}