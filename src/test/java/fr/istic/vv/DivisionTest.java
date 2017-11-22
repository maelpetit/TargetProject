package fr.istic.vv;

import org.junit.Assert;
import org.junit.Test;

import javax.management.OperationsException;
import static org.junit.Assert.fail;

public class DivisionTest{
    @Test
    public void SimpleDivisionByOne(){
        double a = 10000;
        Division add = new Division(a, 1);
        try {
            Assert.assertTrue(add.operate() == a);
        } catch (OperationsException e) {
            fail();
        }
    }

    @Test
    public void OneDividedByNumber(){
        double a = 10000;
        Division add = new Division(1,a);
        try {
            Assert.assertTrue(add.operate() < 1);
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
            Assert.assertTrue(add.operate() == 100);
        } catch (OperationsException e) {
            fail();
        }
    }

    @Test
    public void Simplification(){
        Division div1 = new Division(4, 2);
        Division div2 = new Division(8, 4);
        Assert.assertTrue(div1.equals(div2));
    }
}
