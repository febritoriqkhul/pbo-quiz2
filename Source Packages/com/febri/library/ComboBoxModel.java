/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.febri.library;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Febri TK
 */
public class ComboBoxModel {
    private HashMap<String, Float> item = new HashMap<>();

    public ComboBoxModel() {
        this.item.put("Gula", new Float(30000));
        this.item.put("Kopi", new Float(10000));
        this.item.put("Susu", new Float(20000));
    }
    
    public ArrayList<String> getName(){
        ArrayList<String> string = new ArrayList<>();
        for(String items : this.item.keySet()){
            string.add(items);
        }
        return string;
    }
    
    public ArrayList<Float> getPrice(){
        ArrayList<Float> flt = new ArrayList<>();
        for(float items : this.item.values()){
            flt.add(items);
        }
        return flt;
    }
    
    public void tambahItem(String nama, float harga){
        this.item.put(nama, harga);
    }
}
