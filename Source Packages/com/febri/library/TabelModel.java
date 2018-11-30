/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.febri.library;

import javax.swing.table.*;

/**
 *
 * @author Febri TK
 */
public class TabelModel extends DefaultTableModel{
    private String[] columns;

    public TabelModel() {
        this.columns = new String[]{
            "Nama", "Harga", "Jumlah"
        };
    }
    
    public String[] getColumnName(){
        return this.columns;
    }
}
