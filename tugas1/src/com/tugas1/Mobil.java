package com.tugas1;

public class Mobil extends Kendaraan {
    
    int kecepatan;
    int harga;
    private int plat;
    boolean kecelakaan;

    public Mobil(int kecepatan,int harga,boolean kecelakaan){
        this.kecepatan = kecepatan;
        this.harga = harga;
        this.kecelakaan = kecelakaan;
    }

    public void setPlat(int plat){
        this.plat=plat;
    }

    int getPlat(){
        return this.plat;
    }

    @Override
    void gas(){
        this.kecepatan += 10;
    }

    @OverrideOverloading
    void gas(int akselarasi,int waktu){
        this.kecepatan = this.kecepatan + akselarasi * waktu;
    }

    void rem(){
        this.kecepatan -= 10;
    }

    void kecelakaan(){
        if(this.kecelakaan){
            this.harga = this.harga - 1000000;
        } 
    }

    void tampil(){
        System.out.println("Data Mobil");
        System.out.println("Kecepatan : " + this.kecepatan);
        System.out.println("Harga : " + this.harga);
    }
}
