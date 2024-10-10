package calc;

import java.util.*;

/**
 * This class Rounds the inputted amounts to the nearest whole number and returns an ArrayList of rounded amounts.
 * This Class follows the .5 and up or .4 and down rounding principle.
 */
public class Rounder {
   public static ArrayList<Integer> rounder(ArrayList<Double> notRoundedArr){
       ArrayList<Integer> roundedArr = new ArrayList<Integer>();
       int temp;
       for(int i=0;i<notRoundedArr.size();i++){
           roundedArr.add((int) Math.round(notRoundedArr.get(i)));
       }
       return roundedArr;
   }
}

