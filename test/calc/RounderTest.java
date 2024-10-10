package calc;

import calc.Rounder;
import io.FileReader;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class RounderTest {
    @Test
    void rounder() throws Exception {
        //given
        io.FileReader fileReader = new FileReader();
        ArrayList<Double> notRoundedArray = fileReader.read("/Users/pawelcieslak/IdeaProjects/ChangeCalculatorV3/src/data.txt");
        //when
        Rounder rounder = new Rounder();
        ArrayList<Integer> roundedArr = rounder.rounder(notRoundedArray);
        //then
        assertEquals(List.of(333,422),roundedArr);
    }
}