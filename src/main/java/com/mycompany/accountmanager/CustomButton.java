/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accountmanager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author wojte
 */
public class CustomButton extends JButton {
    
    private boolean mPress;
    
    
    
    public CustomButton(){
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent evt){
                mPress = true;
            }
            @Override
            public void mouseReleased(MouseEvent evt){
                mPress = false;
            }
        });
    }
    
    
    
}
