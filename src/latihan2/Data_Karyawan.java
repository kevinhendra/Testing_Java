/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Kevin Hendra William
 */
public class Data_Karyawan {
    public static void main(String[] args) throws IOException {
        String nama, alamat;
        int usia, gaji;
        
        Scanner a = new Scanner(System.in);
        
        System.out.println("Pendataan Karyawan");
        System.out.print("Masukkan Nama: ");
        nama = a.next();
        System.out.print("Masukkan Umur: ");
        usia = a.nextInt();
        System.out.print("Masukkan Alamat: ");
        alamat = a.next();
        System.out.print("Masukkan Gaji: ");
        gaji = a.nextInt();
        System.out.println("\n\n\n");
        System.out.println("----Data Anda----");
        System.out.println("Nama Anda : " + nama);
        System.out.println("Umur Anda : " + usia);
        System.out.println("Alamat Anda : " + alamat);
        System.out.println("Gaji Anda : " + gaji);
    }
    
}
