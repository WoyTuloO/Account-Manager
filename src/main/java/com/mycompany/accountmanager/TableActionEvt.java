/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.accountmanager;

/**
 *
 * @author wojte
 */
public interface TableActionEvt {
    public void edit(int row);
    public void remove(int row);
}
