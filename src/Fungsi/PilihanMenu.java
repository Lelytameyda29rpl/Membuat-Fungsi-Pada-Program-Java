/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fungsi;
import java.util.Scanner;//library untuk inputan keyboard
/**
 *
 * @author MOKLET-2
 */
public class PilihanMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Untuk mengambil input dari keyboard
        Scanner masukan = new Scanner(System.in);
        //Mendeklarasikan Variabel
        int pilihan=9;
        //Perulangan
        do {
        //Pernyataan
            System.out.println("\nMENU LUAS BANGUN\n");
            System.out.println("1. Menghitung Luas Persegi ");
            System.out.println("2. Menghitung Luas Persegi Panjang");
            System.out.println("3. Keluar");
            //User memasukkan nilai Variabel
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = masukan.nextInt();
        //Percabangan
        switch(pilihan){
            case 1 : luasPersegi();break;
            case 2 : luasPersegiPanjang();break;
        }
        //Perulangan
        }while(pilihan != 3);
        }
        //method luasPersegi
        private static void luasPersegi(){
        //Untuk mengambil input dari keyboard
            Scanner masukan = new Scanner(System.in);
        //Mendeklarasikan Variabel
            float sisi,luas;
        //User memasukkan nilai Variabel
            System.out.print("Masukkan nilai sisi : ");
            sisi = masukan.nextFloat();
        //Rumus
            luas = sisi * sisi;
        //Perintah untuk menghasilkan output program
            System.out.println("Luas Persegi adalah: " + luas);
        }
        //method luasPersegiPanjang
        private static void luasPersegiPanjang(){
        //Untuk mengambil input dari keyboard
            Scanner masukan = new Scanner(System.in);
        //Mendeklarasikan Variabel
            float panjang, lebar, luas;
        //User memasukkan nilai Variabel
            System.out.print("Masukkan nilai panjang : ");
            panjang = masukan.nextFloat();
            System.out.print("Masukkan nilai lebar : ");
            lebar = masukan.nextFloat();
        //Rumus
            luas = panjang * lebar;
        //Perintah untuk menghasilkan output program
            System.out.println("Luas Persegi Panjang adalah: " + luas);
                
    }
    
}
