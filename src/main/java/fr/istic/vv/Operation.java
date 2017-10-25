package fr.istic.vv;

import javax.management.OperationsException;

public interface Operation {

    double getFirstTerm();
    void setFirstTerm(double firstTerm);
    double getSecondTerm();
    void setSecondTerm(double secondTerm);
    double operate() throws OperationsException;
    String toString();
}
