package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CopyEvent</code> logs a copy of a value into an index of the array.
 */
public class CopyEvent<T> implements SortEvent{

    public List<Integer> indecies;
    public List<T> values;

    public CopyEvent(int ind, T val) {
        indecies = new ArrayList<Integer>();
        values = new ArrayList<T>();
        indecies.add(ind);
        values.add(val);
    }

    /**
     * Applies this event to the array.
     * @param arr the array to modify
     */
    @Override
    public void apply (Object[] arr) {
        arr[indecies.get(0)] = values.get(0);
    }

    /**
     * @return a list of the indices affected by this event
     */
    @Override
    public List<Integer> getAffectedIndices(){
        return indecies;
    }

    
    /**
     * @return <code>true</code> iff this event is emphasized
     */
    @Override
    public boolean isEmphasized(){
        return true;
    }
}
