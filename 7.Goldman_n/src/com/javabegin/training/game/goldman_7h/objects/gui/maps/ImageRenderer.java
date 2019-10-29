package com.javabegin.training.game.goldman_7h.objects.gui.maps;


import com.javabegin.training.game.goldman_7h.abstracts.AbstractGameObject;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class ImageRenderer extends DefaultTableCellRenderer {

    private JLabel lbl = new JLabel();
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                   boolean hasFocus, int row, int column) {

        lbl.setText(null);
        lbl.setIcon(((AbstractGameObject) value).getIcon());
        
        return lbl;
    }
}