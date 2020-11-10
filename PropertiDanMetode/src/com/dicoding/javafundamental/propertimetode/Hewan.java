/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.propertimetode;

/**
 *
 * @author ASUS
 */
public class Hewan {
       // Properti atau fields
 
    // Inisiasi dengan nilai inisial
    double tinggi = 20;
    double berat = 2;
 
    // Inisiasi melalui konstruktor
    int umur;
 
    // Konstruktor dengan parameter
    Hewan(int umur) {
        this.umur = umur;
    }
 
    void lari() {
        System.out.println("Berlari dengan sangat gesit..");
    }
 
    void jalan() {
        System.out.println("Berjalan dengan pelan..");
    }
 
    void makan() {
        System.out.println("Makan dengan menggunakan mulut..");
    }
 
    double getBerat() {
        return berat;
    }
    double getTinggi() {
        return tinggi;
    }
    int getUmur() {
        return umur;
    }
}