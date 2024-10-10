package io;
/**
 * This Class reads in the amounts from a file and returns an Arraylist of type Double.
 */

import java.util.*;
import java.io.*;
public class FileReader {
    public ArrayList<Double> read(String fileName)throws Exception{
        Scanner file = new Scanner(new File(fileName));
        ArrayList<Double> arr = new ArrayList<Double>();
        while(file.hasNext()){
            arr.add(file.nextDouble());
        }
        return arr;
    }
}
