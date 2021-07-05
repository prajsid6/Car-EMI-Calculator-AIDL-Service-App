// EMIInterface.aidl
package com.sidhu.emicalculator;

// Declare any non-default types here with import statements

interface EMIInterface {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    double CalculateEMI(double principalAmount, double rate, int tenure);
}