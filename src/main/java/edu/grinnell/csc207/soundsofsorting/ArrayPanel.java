package edu.grinnell.csc207.soundsofsorting;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * A drawing panel for visualizing the contents of a @NoteIndices object.
 */
public class ArrayPanel extends JPanel {
    private NoteIndices notes;
   
    /**
     * Create a new <code>ArrayPanel</code> with the given notes and dimensions.
     * @param notes the note indices 
     * @param width the width of the panel
     * @param height the height of the panel
     */
    public ArrayPanel(NoteIndices notes, int width, int height) {
        this.notes = notes;
        this.setPreferredSize(new Dimension(width, height));
    }

    @Override
    public void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        int barWidth = width / notes.getNotes().length;
        Color[] barColors = {Color.CYAN, Color.CYAN.brighter(), Color.CYAN.darker(), 
                             Color.GREEN, Color.GREEN.brighter(), Color.GREEN.darker(), 
                             Color.BLUE, Color.BLUE.brighter(), Color.BLUE.darker()};
        for (int i = 0; i < notes.getNotes().length; i++) {
            if (notes.getNotes()[i] != null) {

                int x = i * barWidth;
                int barHeight = notes.getNotes()[i] * 10;
                int y = height - barHeight;
                if (notes.isHighlighted(i)) {
                    g.setColor(Color.RED);
                    g.fillRect(x, y, barWidth - 10, barHeight);
                } else {
                    g.setColor(barColors[i % barColors.length]);
                    g.fillRect(x, y, barWidth - 10, barHeight);
                }
                g.fillRect(x, y, barWidth - 10, barHeight);
        
                g.setColor(Color.BLACK);
                g.drawRect(x, y, barWidth - 10, barHeight);
            }
        } 
    }
}