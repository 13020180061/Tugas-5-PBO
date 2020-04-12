/*
    	Nama	: St.Hatijah H.Ilyas
	Stambuk : 13020180061
	Tanggal	: 12 April 2020
	Waktu	: 13.50 WITA
*/  

import java.util.* ;

class Vektorr {

public static void main ( String[] args) {

//vector dengan inisialisasi kapasitasnya =5 
Vector<Integer> dataku = new Vector<Integer>(5);

dataku.addElement(10);
dataku.addElement(11);
dataku.addElement(12);
dataku.addElement(13);
dataku.addElement(14);

dataku.addElement(101);
System.out.println("\n=== Menampilkan Elemen ke dalam Vector ===");
System.out.println("capacity: "+ dataku.capacity() );
System.out.println("size: "+ dataku.size() );

for (int i=0; i < dataku.size(); i++){

System.out.println("dataku elemen ke " + i + " : "+dataku.elementAt(i));
}
 

dataku.addElement(101);

dataku.remove(2);
System.out.println("\n=== Menghapus Elemen Vector ===");
System.out.println("capacity: "+ dataku.capacity() );
System.out.println("size: "+ dataku.size() );

for (int i=0; i < dataku.size(); i++){

System.out.println("dataku elemen ke " + i + " : "+dataku.elementAt(i));
}
 
dataku.insertElementAt(500, 3); 
System.out.println("\n=== Menyisipkan Elemen ke dalam Vector ===");
System.out.println("capacity: "+ dataku.capacity() );
System.out.println("size: "+ dataku.size() );

for (int i=0; i < dataku.size(); i++){

System.out.println("dataku elemen ke " + i + " : "+dataku.elementAt(i));
}
}
}