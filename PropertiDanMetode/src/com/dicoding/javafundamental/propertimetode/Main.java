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
public class Main {
   public static void main(String[] args) {
 
        // Kita tambahkan 1 argumen dengan nilai int 2
        // Nilai tersebut adalah nilai yang digunakan untuk inisiasi variabel umur
        Hewan buaya = new Hewan(2);
       buaya.makan();
        buaya.jalan();
        buaya.lari();
 
        // Contoh penggunaan fungsi getUmur
        System.out.println("Umurnya adalah " + buaya.getUmur());
        // Perhitungan indeks massa tubuh (BMI)
        // berat(kg) / ( tinggi(m) * tinggi(m) )
        double bmi = buaya.getBerat() / ((buaya.getTinggi() * 0.01) * (buaya.getTinggi() * 0.01));
        System.out.println("Indeks massa tubuhnya adalah " + bmi);
    }
}