/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.febri.library;

import java.util.*;

/**
 *
 * @author Febri TK
 */
public class TransaksiItem {
    private String code;
    private ArrayList<Items> item = new ArrayList<>();
    private float total;

    public TransaksiItem(String code, ArrayList<Items> item) {
        this.code = code;
        this.item = item;
    }
    
    public void setTotal(){
        float total = 0;
        for(Items item : this.item){
            total += item.jumlahHarga();
        }
        this.total = total;
    }
    
    public String tampilData(){
        setTotal();
        String output = "";
        output += "Kode\t\t: " + this.code +"\n";
        output += "Daftar Belanja : \n";
        for(Items item : this.item){
            output += "\t" + item.getNama() + "(x" + item.getJumlah() + ") : " + item.jumlahHarga() + "\n";
        }
        output += "Total\t\t: " + this.total;
        return output;
    }
}
