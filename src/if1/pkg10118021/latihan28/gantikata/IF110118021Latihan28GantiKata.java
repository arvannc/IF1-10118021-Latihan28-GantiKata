/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118021.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author Arvan
 * NAMA     : M Arvan Nurcahyana
 * KELAS    : IF-1
 * NIM      : 10118021
 * Deskripsi Program : Ganti Kata
 */
public class IF110118021Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String kalimatAwal;
        String kalimatBaru;
        String gantiKata;
        String kataBaru;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program Ganti Kata");
        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = input.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = input.next();
        System.out.print("Menjadi Kata : ");
        kataBaru = input.next();
        
        kalimatBaru =  (kalimatAwal).replaceAll(gantiKata, kataBaru);
        
        System.out.println("\nHasil Formatting");
        System.out.println("Kalimat Awal : "+kalimatAwal);
        System.out.println("Kalimat Baru : "+kalimatBaru);
        System.out.println("(Developed by : M. Arvan Nurcahyana)");
    }
    
}
