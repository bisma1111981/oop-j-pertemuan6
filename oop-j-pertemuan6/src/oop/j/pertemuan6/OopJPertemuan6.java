/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.j.pertemuan6;

import java.util.Scanner;

/**
 *
 * @author LAB F
 * TGL : 15 April 2025
 */
public class OopJPertemuan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VolumeBalok vb = new VolumeBalok();
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Hitung Volume Balok");
        System.out.print("Nilai Panjang: ");
        vb.panjang = inp.nextInt();
        System.out.print("Nilai Lebar: ");
        vb.lebar = inp.nextInt();
        System.out.print("Nilai Tinggi: ");
        vb.tinggi = inp.nextInt();
        System.out.print("Nilai Volumenya: ");
        System.out.print("V = P * L * T: ");
        System.out.printf(" = %d * %d * %d\n", vb.panjang, vb.lebar, vb.tinggi);
        System.out.printf(" = %d",vb.Volume ());
    }
    
}
