package fr.istic.vv;

import javax.management.OperationsException;

import static org.junit.Assert.fail;

/**
 * Hello world!
 *
 */
public class TargetApp
{
    public static void main( String[] args )
    {
        Division division = new Division();
        Addition addition = new Addition();
        Multiplication multiplication = new Multiplication();
        Subtraction subtraction = new Subtraction();
    }
}
