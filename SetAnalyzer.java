import java.util.ArrayList;
import java.util.HashSet;


public class SetAnalyzer<T> {

    // Empty constructor
    public SetAnalyzer() {

    }

    // intersection method accepts two generic arraylists of type T, computes their intersection from two lists
    public ArrayList<T> intersection(ArrayList<T> list1, ArrayList<T> list2) {
        //your work here

        // New Arraylist object for storing result of two intersection sets
        ArrayList<T> intersectionResult = new ArrayList<T>();
        // for loop checks whether the two sets are getting equal at any iteration
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                // If condition adds the common values in resultant arraylist after checking the equivalency
                if (list1.get(i).equals(list2.get(j))) {
                    intersectionResult.add(list1.get(i));
                }
            }
        }
        // returns Intersection of two lists result
        return intersectionResult;
    }


    // union method which accepts two generic arraylists of type T, computes their union from two lists
    public ArrayList<T> union(ArrayList<T> list1, ArrayList<T> list2) {
        //your work here
        // Hashset is used to store all the values and print the unique values from two files
        HashSet<T> unionResult = new HashSet<T>();
        // adding all values
        unionResult.addAll(list1);
        unionResult.addAll(list2);

        // returns Union of two lists result
        return new ArrayList(unionResult);
    }

}
