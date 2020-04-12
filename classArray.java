/*
    	Nama	: St.Hatijah H.Ilyas
	Stambuk : 13020180061
	Tanggal	: 12 April 2020
	Waktu	: 14.24 WITA
*/  

import java.util.Arrays; 

public class classArray { 
    public static void main (String args []){ 
        int [] angka = {8, 43, 78, 67, 21, 2 ,19};
	int [] angka1 = {12, 56, 90, 34, 8, 17, 11};
    
        Arrays.sort(angka); 
        System.out.println("\n== Menggunakan Method Sort dari class Arrays ==");
        for (int i = 0; i < angka.length; i++){ 
        System.out.print(angka[i] + " "); 
        } 
	
	System.out.println("\n\n== Menggunakan Method BinarySearch dari class Arrays ==");
	System.out.println("Angka 78 terdapat di index ke " 
                + java.util.Arrays.binarySearch(angka, 78)); 
        System.out.println("Angka 2 terdapat di index ke " + 
                java.util.Arrays.binarySearch(angka, 2));

	System.out.println("\n\n== Menggunakan Method  equals dari class Arrays ==");
	System.out.println("Apakah Array Angka dan Angka1 Equal? " + 
    		java.util.Arrays.equals(angka, angka1)); 
    } 
}