/*
    	Nama	: St.Hatijah H.Ilyas
	Stambuk : 13020180061
	Tanggal	: 12 April 2020
	Waktu	: 18.17 WITA
*/  

class Assert { 
public static void main(String args[]) 
{ 
	int age = Integer.parseInt(args[0]); 
	assert(age>0); 
		if (age >= 18) 
			System.out.println("Remaja"); 
		else
			System.out.println("Dewasa");
} 
} 
