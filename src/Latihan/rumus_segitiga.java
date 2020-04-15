/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Kevin Hendra William
 */
public class rumus_segitiga {
    public static void main(String[] args) {
        double luas;
        int alas,tinggi;
        
        Scanner baca= new Scanner(System.in);
        
        System.out.println("Rumus Menghitung segitiga");
        System.out.print("Input alas: ");
        alas = baca.nextInt();
        System.out.print("Input tinggi: ");
        tinggi = baca.nextInt();
        
        luas= Double.valueOf((alas*tinggi)/2);
        
        System.out.println("Luas: " + luas);
    }
    
}
