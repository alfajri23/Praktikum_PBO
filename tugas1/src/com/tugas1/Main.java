package com.tugas1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //tanpa exception
        Mobil toyota = new Mobil(100,50000000,true);

        Scanner input = new Scanner(System.in);
        System.out.printf("Masukkan jumlah mobil toyota : ");
        int plat1 = input.nextInt();

        toyota.setPlat(plat1);
        toyota.gas(20,5);
        toyota.rem();
        toyota.kecelakaan();
        toyota.tampil();
        System.out.println("Jumlah : " + toyota.getPlat());

        //dengan exception
        
        Mobil kijang = new Mobil(150,10000000,false);
        System.out.printf("Masukkan jumlah mobil kijang : ");

        try{
            int plat2 = input.nextInt();
            kijang.setPlat(plat2);
        }catch(InputMismatchException e){
            System.err.println(e);
        }
        
        kijang.gas(20,5);
        kijang.rem();
        kijang.kecelakaan();
        kijang.tampil();
        System.out.println("Jumlah : " + kijang.getPlat());


    }
}
