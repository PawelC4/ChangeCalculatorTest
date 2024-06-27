import org.junit.jupiter.api.Test;
import java.util.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class RounderTest {
    @Test
    void rounder() throws Exception {
        //given
        FileReader fileReader = new FileReader();
        ArrayList<Double> notRoundedArray = fileReader.read("/Users/pawelcieslak/IdeaProjects/ChangeCalculatorV3/src/data.txt");
        //when
        Rounder rounder = new Rounder();
        ArrayList<Integer> roundedArr = rounder.rounder(notRoundedArray);
        //then
        assertEquals(List.of(333,422),roundedArr);
    }
}