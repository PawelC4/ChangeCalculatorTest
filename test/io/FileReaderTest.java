package io;

import io.FileReader;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void read()throws Exception {
        //given
        String fileName = "/Users/pawelcieslak/IdeaProjects/ChangeCalculatorV3/src/data.txt";
        //when
        FileReader fileReader = new FileReader();
        ArrayList<Double> arr2 = fileReader.read(fileName);
        //then
        assertEquals(List.of(333.3,422.2),arr2);
    }
}