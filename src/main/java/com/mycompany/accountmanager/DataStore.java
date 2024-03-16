/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accountmanager;

public class DataStore {
    private static DataStore instance;
    private Object sharedData;

    public static DataStore getInstance() {
        if (instance == null) {
            instance = new DataStore();
        }
        return instance;
    }

    public Object getSharedData() {
        return sharedData;
    }

    public void setSharedData(Object sharedData) {
        this.sharedData = sharedData;
    }
}
