import java.util.*;
public class ChangeCalculatorApp {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader();
        ConsolePrinter consolePrinter = new ConsolePrinter();
        ArrayList<Double> fileData = fileReader.read("/Users/pawelcieslak/IdeaProjects/ChangeCalculatorV3/src/data.txt");
        ArrayList<Integer> fileDataRounded = Rounder.rounder(fileData);
        IndividualChangeList individualChangeList = new IndividualChangeList(fileDataRounded);
        individualChangeList.countAll();
        IndividualChange result = individualChangeList.addAll();
        consolePrinter.Process(result);
    }

}
