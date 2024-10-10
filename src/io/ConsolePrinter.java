package io;
/**
 * This Class prints out the results of the Program to the Console.
 */

import calc.BankNoteCount;
import calc.ChangeAdjustment;
import calc.IndividualChange;



public class ConsolePrinter implements PresentChangeCalculatorResults {

    @Override
    public void Process(IndividualChange result) {
        if (result.getClass() == ChangeAdjustment.class)
            System.out.println("Adjusted Total: $" + result.getAmount());
        else
            System.out.printf("%-15s",("Total : $" + result.getAmount()+ "\n"));
        for(BankNoteCount bankNoteCount: result.getBankNoteCountArr()){
            System.out.printf( " %-30s", bankNoteCount.getBankNoteType() + ": ");
            System.out.printf("%9s", "x" + bankNoteCount.getBankNoteCount() + "\n");
        } System.out.println();
    }
}
