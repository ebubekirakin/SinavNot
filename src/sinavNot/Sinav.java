package sinavNot;

public class Sinav {

	public static void main(String[] args) {
	
		int not = 64;
	       // 50 ve üzeri geçti
		   // 40-49 büt
		   // 0-39 kaldı
		
		if(not>=50) {
		
			System.out.println("Geçti");
		}
		
        if(not<50&&not>=40) {
			
			System.out.println("Büt");
			
		}
	    if(not<40) {
			
			System.out.println("Kaldı");
			
		}
	}

}
