/*
    	Nama	: St.Hatijah H.Ilyas
	Stambuk : 13020180061
	Tanggal	: 12 April 2020
	Waktu	: 15.10 WITA
*/  

public class Exception{

public static void main(String args[]){
int i[] = new int[2];

try{
System.out.println("Access element three :" + i[3]);
}

catch(ArrayIndexOutOfBoundsException e){
System.out.println("Exception thrown :" + e);
}

finally{
i[0] = 7;
System.out.println("First element value: " +i[0]);
System.out.println("The finally statement is executed");
     }
   }
}