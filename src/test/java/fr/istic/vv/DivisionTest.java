package fr.istic.vv;

import org.junit.Test;

import javax.management.OperationsException;
import static org.junit.Assert.fail;

public class DivisionTest {
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
    public void DividedNumberBy100(){
        double a = 100000 ;
        a = (int) a ;
        int length = String.valueOf(a).length();
        Division add = new Division(a, 100);
        try {
            assert(add.operate() == (length-2));
        } catch (OperationsException e) {
            fail();
        }
    }
}
