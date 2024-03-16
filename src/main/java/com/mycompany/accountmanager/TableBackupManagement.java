/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accountmanager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wojte
 */
public class TableBackupManagement {
    public static void exportSave(){
        String path = (String)System.getProperty("user.home") + "/Documents/AccMgr/AccMgrSave.csv";
        JTable tmp = (JTable) DataStore.getInstance().getSharedData();
        DataStore.getInstance().setSharedData(null);
        int cols = tmp.getColumnCount() - 1;
        int rows = tmp.getRowCount();
        
        try{
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                String cell = (String)tmp.getValueAt(i, j);
                System.out.println(cell + " i:"+i + " j:" + j);
                if(cell == null) 
                    continue;
                writer.write(cell);
                if(j  < cols - 1) 
                    writer.write(',');
            }
            writer.newLine();
        }
        writer.close();
        
        }catch(Exception e){
            JFrame errorFrame = new JFrame();
            JOptionPane.showMessageDialog(errorFrame, "Error exporting data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            errorFrame.setVisible(true);
            errorFrame.dispose();
        }
    }
    
        public static void exportBackup(){
        String path = (String)System.getProperty("user.home") + "/Documents/AccMgr/PswdMgrBckUp.csv";
        JTable tmp = (JTable) DataStore.getInstance().getSharedData();
        DataStore.getInstance().setSharedData(null);
        int cols = tmp.getColumnCount() - 1;
        int rows = tmp.getRowCount();
        
        try{
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                String cell = (String)tmp.getValueAt(i, j);
                System.out.println(cell + " i:"+i + " j:" + j);
                if(cell == null) 
                    continue;
                writer.write(cell);
                if(j  < cols - 1) 
                    writer.write(',');
            }
            writer.newLine();
        }
        writer.close();
        
        }catch(Exception e){
            JFrame errorFrame = new JFrame();
            JOptionPane.showMessageDialog(errorFrame, "Error exporting data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            errorFrame.setVisible(true);
            errorFrame.dispose();
        }
    }
    
    
    public static DefaultTableModel importSave(JTable table){
        String path = (String)System.getProperty("user.home") + "/Documents/AccMgr/AccMgrSave.csv";
                
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while((line = reader.readLine()) != null){
                String[] Row = line.split(",");
                model.addRow(Row);
            }
            reader.close();
        
        }catch(Exception e){
            JFrame errorFrame = new JFrame();
            JOptionPane.showMessageDialog(errorFrame, "Error importing data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            errorFrame.setVisible(true);
            errorFrame.dispose();
        }
     return null; 
    }
    
    public static DefaultTableModel importBackup(JTable table){
        String path = (String)System.getProperty("user.home") + "/Documents/AccMgr/PswdMgrBckUp.csv";
                
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while((line = reader.readLine()) != null){
                String[] Row = line.split(",");
                model.addRow(Row);
            }
            reader.close();
        
        }catch(Exception e){
            JFrame errorFrame = new JFrame();
            JOptionPane.showMessageDialog(errorFrame, "Error importing data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            errorFrame.setVisible(true);
            errorFrame.dispose();
        }
        return null; 
    }
    
    public static DefaultTableModel initialImport(JTable table){
        
        String path = (String)System.getProperty("user.home") + "/Documents/AccMgr/AccMgrSave.csv";
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        try{
        BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while((line = reader.readLine()) != null){
                String[] Row = line.split(",");
                model.addRow(Row);
            }
            reader.close();
        return model;
        
        }catch(Exception e){
            System.out.println();
            return null;
        }
    }
}
