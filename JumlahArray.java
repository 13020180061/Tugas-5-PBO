/*
    	Nama	: St.Hatijah H.Ilyas
	Stambuk : 13020180061
	Tanggal	: 12 April 2020
	Waktu	: 16.01 WITA
*/  

import java.util.Scanner;
public class JumlahArray{
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      int n;
      int jum = 0;

      System.out.print("Jumlah Bilangan : ");
      n = scanner.nextInt();
      
      System.out.println("Input Bilangan");
      for (int i=0; i<n; i++)
      {
          jum = jum + scanner.nextInt();
      }
      System.out.println("Hasil Penjumlahan : "+jum);
   }
}
 