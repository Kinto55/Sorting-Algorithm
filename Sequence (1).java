import java.util.ArrayList;
import java.util.List;

public class Sequence {
    private ArrayList<Integer> values;

    public Sequence() {
        values = new ArrayList<Integer>();
    }

    /**
     * This constructor creates a Sequence whose inital values are set to the inputted list.
     * @param list The inital set of values for the Sequence.
     */
    public Sequence(List<Integer> list) {
        values = (ArrayList<Integer>) list;
    }

    /**
     * This method returns a Sequence that has this and another Sequence's values appended together.
     * @param other The other sequence that is appended.
     * @return Returns a new Sequence containing the appended values.
     */
    public Sequence append(Sequence other) {
        ArrayList<Integer> temp = new ArrayList<Integer>(values); 
        temp.addAll(other.values);
        return new Sequence(temp);
    }

    /**
     * Adds the inputted integer to the ArrayList of values.
     * @param n The integer to be added
     */
    public void add(int n) {
        values.add(n);
    }

    public String toString() {
        return values.toString();
    }
}
