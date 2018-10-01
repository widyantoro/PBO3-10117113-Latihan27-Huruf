/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan27.huruf;

import java.util.Scanner;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program meratakan sebuah kalimat 
 */
public class PBO310117113Latihan27Huruf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimat;
        Scanner scn = new Scanner (System.in);
        System.out.print("Masukan kalimat : ");
        kalimat = scn.nextLine();
        System.out.println("");
        System.out.println("==========HASIL FORMATTING==========");
        System.out.println("Huruf Besar : "+kalimat.toUpperCase());
        System.out.println("Huruf Kecil : "+kalimat.toLowerCase());
    }
    
}
