/*
    	Nama	: St.Hatijah H.Ilyas
	Stambuk : 13020180061
	Tanggal	: 12 April 2020
	Waktu	: 14.52 WITA
*/  

public class Array1dimensi{
	public static void main(String[]args) {
		int n = 10;
		long fib[] = new long[n];
		
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i = 2; i < n; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		System.out.println("\n==Menampilkan Bilangan Fibonacci ==");
		for (int i = 0; i < n; i++) {
			System.out.print(fib[i] +  " ");
		}
	}

}