/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.febri.library;

/**
 *
 * @author Febri TK
 */
public class Items {
    private String nama;//atribut untuk menyimpan nama barang
    private float harga;//atribut untuk menyimpan harga barang
    private int jumlah;//atribut untuk menyimpan jumlah barang
    
    //Contructor class items
    public Items(String nama, float harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    //Getter dari atribut nama
    public String getNama() {
        return nama;
    }
    
    //Setter dari atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    //Getter dari atribut harga
    public float getHarga() {
        return harga;
    }
    
    //Setter dari atribut harga
    public void setHarga(float harga) {
        this.harga = harga;
    }
    //Getter dari atribut jumlah
    public int getJumlah() {
        return jumlah;
    }
    
    //Setter dari atribut jumlah
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    //Method untuk menjumlahkan antara harga dan jumlah item
    public float jumlahHarga(){
        return this.harga * this.jumlah;
    }

    public String toString() {
        return "Items{" + "nama=" + nama + '}';
    }
}
