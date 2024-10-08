public class ConsolePrinter implements PresentChangeCalculatorResults{

    @Override
    public void Process(IndividualChange result) {
        System.out.println("Total : $" + result.getAmount());
        for(BankNoteCount bankNoteCount: result.getBankNoteCountArr()){
            System.out.println(bankNoteCount.getBankNoteType() + ": x" + bankNoteCount.getBankNoteCount());
        }
    }

}
