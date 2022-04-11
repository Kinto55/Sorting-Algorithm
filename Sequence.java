import java.util.ArrayList;
import java.util.List;

public class Sequence {
    private ArrayList<Integer> values;

    public Sequence() {
        values = new ArrayList<Integer>();
    }


    public Sequence(List<Integer> list) {
        //WHAT IT DOES: creates a list to the inital set of values for the Sequence.
        //HOW IT WORKS: establishes the inital set of values for the Sequence
        values = (ArrayList<Integer>) list;
    }

    public Sequence append(Sequence other) {
        //WHAT IT DOES: This method returns a Sequence that has this and another Sequence's values appended together.
        //HOW TI WORKS: another sequence that is appended .returns a new Sequence containing the appended values.
        ArrayList<Integer> temp = new ArrayList<Integer>(values); 
        temp.addAll(other.values);
        return new Sequence(temp);
    }

    /**
     * Adds the inputted integer to the ArrayList of values.
     * @param n The integer to be added
     */
    public void add(int n) {
        //WHAT IT DOES: Adds the inputted integer to the ArrayList of values.
        //HOW IT WORKS: Adds a proper intiger to the paramater
        values.add(n);
    }

    public String toString() {
        return values.toString();
    }
}
