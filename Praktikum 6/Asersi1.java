/**
 * File : Asersi1.java 30/03/2023
 * Penulis : Daffa Aulia Rizky Karunia
 * Deskripsi : program untuk menunjukkan asersi
 */
 
public class Asersi1{
	public static void main(String[] args){
		int x = 0;
		if (x > 0){
			System.out.println("x bilangan positif");
		}
		else{
			assert(x < 0) : "ada kesalahan kode";
			System.out.println("x bilangan negatif");
		}
	}
}