/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accountmanager;

/**
 *
 * @author wojte
 */
public class ThreadControl {

    private static ThreadControl instance;
    private boolean status = true;

    private ThreadControl() {}

    public static ThreadControl getInstance() {
        if (instance == null) {
            instance = new ThreadControl();
        }
        return instance;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
  

