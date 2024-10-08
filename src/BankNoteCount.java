import java.util.Objects;

public class BankNoteCount {
    private int count;
    private final BankNote bankNote;
    public BankNoteCount(BankNote bankNote){
        this.bankNote=bankNote;
        count = 0;
    }
    public BankNoteCount(BankNote bankNote,int count){
        this.bankNote=bankNote;
        this.count = count;
    }
    public int getBankNoteCount(){
        return count;
    }
    public BankNote getBankNoteType(){
        return bankNote;
    }

    public void add(int addition){
        this.count += addition;
    }
    public boolean bankNoteCountHas(BankNote bankNote){
        return this.bankNote == bankNote;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankNoteCount that = (BankNoteCount) o;
        return count == that.count && bankNote == that.bankNote;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, bankNote);
    }
    @Override
    public String toString(){
        return "BankNoteCount: " + this.count + " " + this.bankNote;
    }

}
