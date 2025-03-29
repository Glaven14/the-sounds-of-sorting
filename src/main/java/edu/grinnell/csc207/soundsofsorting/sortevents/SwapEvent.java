package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>SwapEvent</code> logs a swap between two indices of the array.
 */
public class SwapEvent<T> implements SortEvent<T> {
    
    public ArrayList<Integer> affected;
/**
 * @param i
 * @param j
 */
    public SwapEvent(int i, int j) {
        affected = new ArrayList<Integer>();
        affected.add(i);
        affected.add(j);
    }

    /**
     * Applies this event to the array.
     * @param arr the array to modify
     */
    @Override
    public void apply(Object[] arr) {
        T temp = (T) arr[affected.get(0)];
        arr[affected.get(0)] = arr[affected.get(1)];
        arr[affected.get(1)] = temp; 
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
        return true;
    }
}
