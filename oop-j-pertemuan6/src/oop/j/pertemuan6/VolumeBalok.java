/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.j.pertemuan6;

/**
 *
 * @author LAB F
 * TGL ; 15 April 2025
 */
public class VolumeBalok {
   public int panjang, lebar, tinggi;
   private int hasil;
   
   public int Volume(){
       this.hasil = this.panjang*this.lebar*this.tinggi;
       return  this.hasil;
   }
   
   
}
