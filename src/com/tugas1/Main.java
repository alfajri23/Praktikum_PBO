package com.tugas1;

public class Main {
    public static void main(String[] args) {
        Mobil toyota = new Mobil(100,50000000,true);
        toyota.setPlat(112233);
        toyota.gas(20,5);
        toyota.rem();
        toyota.kecelakaan();
        toyota.tampil();
        System.out.println("Plat : " + toyota.getPlat());
    }
}
