import calc.ChangeAdjustment;
import calc.IndividualChange;
import calc.IndividualChangeList;
import calc.Rounder;
import io.ConsolePrinter;
import io.FileReader;

import java.util.*;

/**
 * A simple app that allows the program to run.
 */
public class ChangeCalculatorApp {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader();
        ConsolePrinter consolePrinter = new ConsolePrinter();
        ArrayList<Double> fileData = fileReader.read("resources/data.txt");
        ArrayList<Integer> fileDataRounded = Rounder.rounder(fileData);
        IndividualChangeList individualChangeList = new IndividualChangeList(fileDataRounded);
        individualChangeList.countAll();
        IndividualChange result = individualChangeList.addAll();
        consolePrinter.Process(result);
        ChangeAdjustment adjustedResult = ChangeAdjustment.adjustment(result);
        consolePrinter.Process(adjustedResult);
    }

}
