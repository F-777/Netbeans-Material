/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriksexample;

/**
 *
 * @author ACER
 */
public class MatriksExample {
    public static void main(String[] args) {
        // Membuat matriks 3x3
        int[][] matriks = new int[3][3];

        // Mengisi matriks dengan nilai
        int counter = 1;
        for (int[] matrik : matriks) {
            for (int j = 0; j < matrik.length; j++) {
                matrik[j] = counter++;
            }
        }

        // Mencetak matriks
        System.out.println("Matriks:");
        for (int[] matrik : matriks) {
            for (int j = 0; j < matrik.length; j++) {
                System.out.print(matrik[j] + " ");
            }
            System.out.println();
        }
    }
}
