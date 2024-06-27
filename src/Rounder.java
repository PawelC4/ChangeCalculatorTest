import java.util.*;

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

