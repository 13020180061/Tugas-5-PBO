/*
    	Nama	: St.Hatijah H.Ilyas
	Stambuk : 13020180061
	Tanggal	: 12 April 2020
	Waktu	: 16.28 WITA
*/  

public class arrayy22 {

	public static void main(String[] args){
		int[] angka = new int[100];

		int x = 1;
		//untuk memberi nilai pada tiap index
		for (int i = 0; i < angka.length; i++) {
			angka[i] = x;
			x++;
		}

		int total = 0;
		//untuk menjumlahkan nilai 1-100
		for (int i = 0; i < angka.length; i++) {
			total+=angka[i];
		}

		System.out.println(total);
	}

}