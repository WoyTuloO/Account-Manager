/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accountmanager;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author wojte
 */
public class TableActionCellRenderer2 extends DefaultTableCellRenderer {
    
    @Override 
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {        
        // Call the super method to get the default rendering
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        // Create an ActionPanel and return it
        ActionPanel act = new ActionPanel();
        return act;
    }

    public static class TableActionCellEditor extends DefaultCellEditor {
    
        private TableActionEvt evt;
        
        public TableActionCellEditor(TableActionEvt event) {
            super(new JCheckBox());
            this.evt = event;
        }
        
        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            // Create an ActionPanel and initialize it with the event
            ActionPanel act = new ActionPanel();
            act.initEvt(evt, row);
            return act;
        }
    }
}