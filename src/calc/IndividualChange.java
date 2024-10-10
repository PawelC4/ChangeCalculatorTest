package calc;
import java.util.*;

/**
 * The Individual Change class creates an ArrayList of BankNoteCount objects. In this method you create a list of all
 * banknote types. By using the count method you iterate through the inputted individual amount and Start counting what
 * and how many banknotes are needed to make up the individual amount.
 */
public class IndividualChange {
    private int amount;
    private ArrayList<BankNoteCount> bankNoteCountArr = new ArrayList<BankNoteCount>();

    public IndividualChange(int amount) {
        this.amount = amount;
        for (BankNote i : BankNote.values())
            bankNoteCountArr.add(new BankNoteCount(i));
    }
    public IndividualChange(int amount,ArrayList<Integer> countList) {
        this.amount = amount;
        int c = 0;
        for (BankNote i : BankNote.values()) {
            bankNoteCountArr.add(new BankNoteCount(i, countList.get(c)));
            c++;
        }
    }
    // Created a manually inputted Constructor for Test Case use.
    public IndividualChange(int amount, BankNote firstBill, int count1, BankNote secondBill, int count2, BankNote thirdBill, int count3,
                            BankNote fourthBill, int count4, BankNote fifthBill, int count5, BankNote sixthBill, int count6, BankNote seventhBill, int count7){
        this.amount = amount;
        bankNoteCountArr.add(new BankNoteCount(firstBill,count1));
        bankNoteCountArr.add(new BankNoteCount(secondBill,count2));
        bankNoteCountArr.add(new BankNoteCount(thirdBill,count3));
        bankNoteCountArr.add(new BankNoteCount(fourthBill,count4));
        bankNoteCountArr.add(new BankNoteCount(fifthBill,count5));
        bankNoteCountArr.add(new BankNoteCount(sixthBill,count6));
        bankNoteCountArr.add(new BankNoteCount(seventhBill,count7));
    }


    //a count method that counts how many banknotes for the amount
    public void count() {
        int tempAmount = amount;
        for (int i = 0; i < bankNoteCountArr.size(); i++) {
            bankNoteCountArr.get(i).add(tempAmount / bankNoteCountArr.get(i).getBankNoteType().getValue());
            tempAmount = tempAmount % bankNoteCountArr.get(i).getBankNoteType().getValue();
        }
    }

    public ArrayList<BankNoteCount> getBankNoteCountArr() {
        return bankNoteCountArr;
    }
    public BankNote getBankNoteType(BankNoteCount bankNoteCount){
            return bankNoteCount.getBankNoteType();
    }
//    public int getBankNoteIndex(calc.BankNote bankNote){
//        calc.BankNoteCount correctBankNoteCount;
//        for(calc.BankNoteCount bankNoteCount: bankNoteCountArr){
//            if (bankNoteCount.bankNoteCountHas(bankNote)){
//                return bankNoteCountArr.indexOf(bankNoteCount);
//            }
//        }
//        return -1;
//    }

    public int getCountByBankNoteType(BankNote bankNote)throws Exception {
        for (int i = 0; 0 < bankNoteCountArr.size() + 1; i++) {
            if (bankNoteCountArr.get(i).getBankNoteType().equals(bankNote))
                return bankNoteCountArr.get(i).getBankNoteCount();
        }
        throw new Exception("No calc.BankNote of such type");
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public void addIndividualChange(IndividualChange otherIndividualChange){
        for (int i = 0; i < bankNoteCountArr.size(); i++) {
            this.bankNoteCountArr.get(i).add(otherIndividualChange.bankNoteCountArr.get(i).getBankNoteCount());
        }
    }
    public void subtractIndividualChange(IndividualChange otherIndividualChange) {
        for (int i = 0; i < bankNoteCountArr.size(); i++) {
            this.bankNoteCountArr.get(i).subtract(otherIndividualChange.bankNoteCountArr.get(i).getBankNoteCount());
        }
    }
    public void addIndividualChangeAmount(IndividualChange otherIndividualChange){
        this.amount += otherIndividualChange.amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IndividualChange that = (IndividualChange) o;
        return amount == that.amount && Objects.equals(bankNoteCountArr, that.bankNoteCountArr);
    }

    @Override
    public int hashCode() {

        return Objects.hash(amount, bankNoteCountArr);
    }
    public String toString(){
        return "calc.IndividualChange: " + this.amount + " " + this.bankNoteCountArr.toString();
    }
}

