package fr.istic.vv;

import javax.management.OperationsException;

public class Multiplication implements Operation{
    private double FirstTerm;
    private double SecondTerm;

    public Multiplication(){
        FirstTerm = 0;
        SecondTerm = 0;
    }

    public Multiplication(double first, double second){
        FirstTerm = first;
        SecondTerm = second;
    }

    public double getFirstTerm() {
        return FirstTerm;
    }

    public void setFirstTerm(double firstTerm) {
        FirstTerm = firstTerm;
    }

    public double getSecondTerm() {
        return SecondTerm;
    }

    public void setSecondTerm(double secondTerm) {
        SecondTerm = secondTerm;
    }

    public double operate() throws OperationsException {
        return FirstTerm * SecondTerm;
    }

    public String toString(){
        try {
            return FirstTerm + " * " + SecondTerm + " = " + operate();
        } catch (OperationsException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean equals(Operation operation) {
        try {
            return this.operate() == operation.operate();
        } catch (OperationsException e) {
            e.printStackTrace();
        }
        return false;
    }
}
