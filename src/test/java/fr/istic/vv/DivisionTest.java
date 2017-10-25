package fr.istic.vv;

import org.junit.Test;

import javax.management.OperationsException;
import static org.junit.Assert.fail;

public class DivisionTest{
    @Test
    public void SimpleDivisionByOne(){
        double a = 10000;
        Division add = new Division(a, 1);
        try {
            assert(add.operate() == a);
        } catch (OperationsException e) {
            fail();
        }
    }

    @Test
    public void OneDividedByNumber(){
        double a = 10000;
        Division add = new Division(1,a);
        try {
            assert(add.operate() < 1);
        } catch (OperationsException e) {
            fail();
        }
    }

    @Test
    public void DividedNumber(){
        double a = 100000 ;
        double b = 1000 ;

        Division add = new Division(a,b);
        try {
            assert(add.operate() == 100);
        } catch (OperationsException e) {
            fail();
        }
    }
}
