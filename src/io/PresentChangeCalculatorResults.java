package io;
/**
 * This interface is used for every output class that is to present the Change Calculator Results.
 */

import calc.IndividualChange;

public interface PresentChangeCalculatorResults {
    void Process(IndividualChange result);
    // First implementation prints everything out to the console. So that Amount is printed in the first line and then
    // the BankNotes are written in order.
    // Second implementation prints everything to a file.

}
