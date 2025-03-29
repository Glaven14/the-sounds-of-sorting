package edu.grinnell.csc207.soundsofsorting;

/**
 * A collection of indices into a Scale object.
 * These indices are the subject of the various sorting algorithms
 * in the program.
 */
public class NoteIndices {

    Integer[] notes;
    boolean[] highlight;
    /**
     * @param n the size of the scale object that these indices map into
     */
    public NoteIndices(int n) {
        notes = new Integer[n];
        highlight = new boolean[n];
    }
    
    /**
     * Reinitializes this collection of indices to map into a new scale object
     * of the given size.  The collection is also shuffled to provide an
     * initial starting point for the sorting process.
     * @param n the size of the scale object that these indices map into
     */
    public void initializeAndShuffle(int n) {
        notes = new Integer[n];
        //TODO: Figure out shuffle
    }
    
    /** @return the indices of this NoteIndices object */
    public Integer[] getNotes() { 
        return notes;
    }
    
    /**
     * Highlights the given index of the note array
     * @param index the index to highlight
     */
    public void highlightNote(int index) {
        if (index < highlight.length) {
            highlight[index] = true;
        }
    }
    
    /**
     * @param index the index to check
     * @return true if the given index is highlighted
     */
    public boolean isHighlighted(int index) {
        if (index < highlight.length) {
            return false;
        }
        return highlight[index];
    }
    
    /** Clears all highlighted indices from this collection */
    public void clearAllHighlighted() {
        for (int i = 0; i < highlight.length; i++) {
            highlight[i] = false;
        }
    }
}
