package calc;

/**
 * This Class Rounds the sum total of the Amounts to the nearest thousand. It also adjusts the BankNoteCounts of change
 * so that they correspond to the new adjusted sum total of amounts.
 */
public class ChangeAdjustment extends IndividualChange {
    public ChangeAdjustment(int amount){
        super(amount);
    }

    public ChangeAdjustment(int amount, BankNote firstBill, int count1, BankNote secondBill, int count2, BankNote thirdBill, int count3,
                            BankNote fourthBill, int count4, BankNote fifthBill, int count5, BankNote sixthBill, int count6, BankNote seventhBill, int count7) {
        super(amount, firstBill, count1, secondBill, count2, thirdBill, count3, fourthBill, count4, fifthBill, count5, sixthBill, count6, seventhBill, count7);
    }

    public static ChangeAdjustment adjustment(IndividualChange unadjustedChange) throws Exception {
        if (unadjustedChange.getAmount() < 0)
            throw new IllegalArgumentException();
        int length = String.valueOf(unadjustedChange.getAmount()).length();
        if(length > 4)
            length = 4;
        ChangeAdjustment adjustedChange = new ChangeAdjustment((int) (Math.round((float)unadjustedChange.getAmount()/(Math.pow(10,length-1)))*(Math.pow(10,length-1))));
        adjustedChange.adjustedCount(adjustedChange.getAmount(),unadjustedChange);
        return adjustedChange;
    }
    private void adjustedCount(int adjustedAmount, IndividualChange unadjustedChange){
        int amountDifference = adjustedAmount - unadjustedChange.getAmount();
        if (amountDifference < 0){
            IndividualChange changeDifference = new IndividualChange(Math.abs(amountDifference));
            changeDifference.count();
            this.addIndividualChange(unadjustedChange);
            this.subtractIndividualChange(changeDifference);
        }
        if (amountDifference >= 0){
            IndividualChange changeDifference = new IndividualChange(amountDifference);
            changeDifference.count();
            this.addIndividualChange(unadjustedChange);
            this.addIndividualChange(changeDifference);
        }
    }

}
