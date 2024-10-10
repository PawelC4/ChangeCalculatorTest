package calc;

import calc.BankNote;
import calc.IndividualChange;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndividualChangeTest {

    @Test
    void count() throws Exception {
        //given
        int amount = 40882;
        //when
        IndividualChange individualChange = new IndividualChange(amount);
        individualChange.count();
        //then
        assertEquals(408,individualChange.getCountByBankNoteType(BankNote.HUNDRED_DOLLAR_BILL));
        assertEquals(1,individualChange.getCountByBankNoteType(BankNote.FIFTY_DOLLAR_BILL));
        assertEquals(1,individualChange.getCountByBankNoteType(BankNote.TWENTY_DOLLAR_BILL));
        assertEquals(1,individualChange.getCountByBankNoteType(BankNote.TEN_DOLLAR_BILL));
        assertEquals(0,individualChange.getCountByBankNoteType(BankNote.FIVE_DOLLAR_BILL));
        assertEquals(1,individualChange.getCountByBankNoteType(BankNote.TWO_DOLLAR_BILL));
        assertEquals(0,individualChange.getCountByBankNoteType(BankNote.ONE_DOLLAR_BILL));
        assertEquals(amount,individualChange.getAmount());
    }
}