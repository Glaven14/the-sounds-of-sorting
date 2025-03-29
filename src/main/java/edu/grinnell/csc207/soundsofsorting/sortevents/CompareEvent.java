package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CompareEvent</code> logs a comparison a sort makes between two
 * indices in the array.
 */
public class CompareEvent<T> implements SortEvent<Integer> {

    public ArrayList<Integer> affected;

    public CompareEvent(int i, int j) {
        affected = new ArrayList<Integer>();
        affected.add(i);
        affected.add(j);
    }

    /**
     * Applies this event to the array.
     * @param arr the array to modify
     */
    @Override
    public void apply (Object[] arr) {
        ((Integer) arr[affected.get(0)]).compareTo((Integer) arr[affected.get(1)]);
    }

    /**
     * @return a list of the indices affected by this event
     */
    @Override
    public List<Integer> getAffectedIndices() {
        return affected;
    }

    
    /**
     * @return <code>true</code> iff this event is emphasized
     */
    @Override
    public boolean isEmphasized() {
        return false;
    }
}
