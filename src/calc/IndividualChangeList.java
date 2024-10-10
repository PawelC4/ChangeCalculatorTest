package calc;

import java.util.*;

/**
 * In the IndividualChangeList you create a list of IndividualChange objects. Calculating the individual change of each
 * amount inputted and saving it on a arrayList. In this Class you can use the countAll method that counts the individual
 * change of all the objects in the list. This Class also returns an Individual Change that contains the sum of all bankNotes
 * calculated as change as well as the sum of the inputted amounts.
 */
public class IndividualChangeList {
    private ArrayList<IndividualChange> individualChangeList = new ArrayList<IndividualChange>();

    public IndividualChangeList(ArrayList<Integer> roundedArr){
        for(int i=0;i< roundedArr.size();i++)
            individualChangeList.add(new IndividualChange(roundedArr.get(i)));
    }
    public void countAll(){
        for(int i=0;i<individualChangeList.size();i++){
            individualChangeList.get(i).count();
        }
    }
    public IndividualChange addAll(){
        IndividualChange total = new IndividualChange(0);
        for (IndividualChange individualChange : individualChangeList) {
            total.addIndividualChangeAmount(individualChange);
            total.addIndividualChange(individualChange);
        }
        return total;
    }
    public IndividualChange getIndividualChange(int index){
        return this.individualChangeList.get(index);
    }
    public void addIndividualChange(IndividualChange individualChange){
        this.individualChangeList.add(individualChange);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IndividualChangeList that = (IndividualChangeList) o;
        return Objects.equals(individualChangeList, that.individualChangeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(individualChangeList);
    }

    public ArrayList<IndividualChange> getIndividualChangeList() {
        return individualChangeList;
    }
}