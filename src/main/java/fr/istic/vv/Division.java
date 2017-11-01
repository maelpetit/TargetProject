package fr.istic.vv;

import javax.management.OperationsException;

public class Division implements Operation {
    private double FirstTerm;
    private double SecondTerm;

    public Division(){
        FirstTerm = 0;
        SecondTerm = 1;
    }

    public Division(double first, double second){
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
        return FirstTerm / SecondTerm;
    }

    public String toString(){
        try {
            return FirstTerm + " / " + SecondTerm + " = " + operate();
        } catch (OperationsException e) {
            e.printStackTrace();
        }
        return null;
    }
}
