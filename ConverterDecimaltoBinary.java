/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decimaltobinary;

/**
 *
 * @author ACER
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        // Contoh input desimal
        int decimalInput = 1234;
        
        // Memanggil method untuk konversi dan mencetak hasilnya
        String binaryOutput = convertDecimalToBinary(decimalInput);
        System.out.println("Desimal: " + decimalInput + " -> Biner: " + binaryOutput);
    }

    // Method untuk mengkonversi desimal ke biner
    public static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal = decimal / 2;
        }
        
        return binary.toString();
    }
}

