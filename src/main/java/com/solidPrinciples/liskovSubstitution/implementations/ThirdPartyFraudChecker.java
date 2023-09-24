package com.solidPrinciples.liskovSubstitution.implementations;

import com.solidPrinciples.liskovSubstitution.exception.FraudDetectedException;
import com.solidPrinciples.liskovSubstitution.interfaces.IFraudChecker;

public class ThirdPartyFraudChecker implements IFraudChecker {
    // members omitted

    @Override
    public void runChecks() throws FraudDetectedException {
        // external system call omitted
    }
}
