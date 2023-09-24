package com.solidPrinciples.liskovSubstitution.interfaces;

import com.solidPrinciples.liskovSubstitution.exception.FraudDetectedException;

public interface IFraudChecker {

    void runChecks() throws FraudDetectedException;

}
