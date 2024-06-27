public enum BankNote {
    HUNDRED_DOLLAR_BILL(100),
    FIFTY_DOLLAR_BILL(50),
    TWENTY_DOLLAR_BILL(20),
    TEN_DOLLAR_BILL(10),
    FIVE_DOLLAR_BILL(5),
    TWO_DOLLAR_BILL(2),
    ONE_DOLLAR_BILL(1);
    private final int value;
    BankNote(int value){
        this.value=value;
    }
    public int getValue() {
        return value;
    }
}

