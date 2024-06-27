import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IndividualChangeListTest {

    @Test
    void countAll() throws Exception{
            //given
            ArrayList<Integer> expectedArr = new ArrayList<>();
            expectedArr.add(168);expectedArr.add(1809);
            IndividualChangeList individualChangeList = new IndividualChangeList(expectedArr);
            //when
            individualChangeList.countAll();

            IndividualChange expectedResult = new IndividualChange(168,BankNote.HUNDRED_DOLLAR_BILL,1,
                    BankNote.FIFTY_DOLLAR_BILL,1,BankNote.TWENTY_DOLLAR_BILL,0,BankNote.TEN_DOLLAR_BILL,1,
                    BankNote.FIVE_DOLLAR_BILL,1,BankNote.TWO_DOLLAR_BILL,1,BankNote.ONE_DOLLAR_BILL,1);
            IndividualChange expectedResult2 = new IndividualChange(1809,BankNote.HUNDRED_DOLLAR_BILL,18,
                BankNote.FIFTY_DOLLAR_BILL,0,BankNote.TWENTY_DOLLAR_BILL,0,BankNote.TEN_DOLLAR_BILL,0,
                BankNote.FIVE_DOLLAR_BILL,1,BankNote.TWO_DOLLAR_BILL,2,BankNote.ONE_DOLLAR_BILL,0);
            //then
            assertEquals(List.of(expectedResult.getBankNoteCountArr(),expectedResult2.getBankNoteCountArr()),List.of(individualChangeList.getIndividualChange(0).getBankNoteCountArr(),individualChangeList.getIndividualChange(1).getBankNoteCountArr()));

    }

        @Test
        void addAll () {
            //given
            ArrayList<Integer> expectedArr = new ArrayList<>();
            IndividualChangeList individualChangeListActual = new IndividualChangeList(expectedArr);
            individualChangeListActual.addIndividualChange(new IndividualChange(168,BankNote.HUNDRED_DOLLAR_BILL,1,
                            BankNote.FIFTY_DOLLAR_BILL,1,BankNote.TWENTY_DOLLAR_BILL,0,BankNote.TEN_DOLLAR_BILL,1,
                            BankNote.FIVE_DOLLAR_BILL,1,BankNote.TWO_DOLLAR_BILL,1,BankNote.ONE_DOLLAR_BILL,1));
            individualChangeListActual.addIndividualChange(new IndividualChange(1809,BankNote.HUNDRED_DOLLAR_BILL,18,
                    BankNote.FIFTY_DOLLAR_BILL,0,BankNote.TWENTY_DOLLAR_BILL,0,BankNote.TEN_DOLLAR_BILL,0,
                    BankNote.FIVE_DOLLAR_BILL,1,BankNote.TWO_DOLLAR_BILL,2,BankNote.ONE_DOLLAR_BILL,0));

            //when
            IndividualChange actualTotal = individualChangeListActual.addAll();
            IndividualChange expectedTotal = new IndividualChange(1977,BankNote.HUNDRED_DOLLAR_BILL,19,
                    BankNote.FIFTY_DOLLAR_BILL,1,BankNote.TWENTY_DOLLAR_BILL,0,BankNote.TEN_DOLLAR_BILL,1,
                    BankNote.FIVE_DOLLAR_BILL,2,BankNote.TWO_DOLLAR_BILL,3,BankNote.ONE_DOLLAR_BILL,1);
            //then
            assertEquals(expectedTotal,actualTotal);
        }
}
