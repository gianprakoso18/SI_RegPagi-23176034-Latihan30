/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan30;

/**
 *
 * @author gianp
 * NAMA     : Gian Prakoso
 * KELAS    : Sistem Informasi
 * NIM      : 23176034
 */
import java.util.Scanner;

public class Latihan30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kamu ngerjain sendiri latihan 17 sampe latihan 30 ini? Jawab (Yoi/Enggak): ");
        String jawab = scanner.nextLine().trim();
        
        if (jawab.equalsIgnoreCase("Yoi")) {
            System.out.println("Cakep Bener. Good Job");
        } else if (jawab.equalsIgnoreCase("Enggak")) {
            System.out.println("Tetep cakep sih.");
            System.out.println("Sing penting paham konsep nya yee.");
            System.out.println("Keep the code works dude");
        } else {
            System.out.println("Jawaban tidak valid!");
        }
        
        scanner.close();
    }
}