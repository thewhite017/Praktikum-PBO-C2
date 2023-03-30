/**
 * File : Lingkaran.java 30/03/2023
 * Penulis : Daffa Aulia Rizky Karunia
 * Deskripsi : kelas implementasi IArea berupa cara menghitung luas lingkaran
 */
 
//mengambil konstanta
import static java.lang.Math.PI;

class Lingkaran implements IArea{
	private double jari;
	
	public Lingkaran(double r){
		jari = r;
	}
	
	public double hitungLuas(){
		return PI * jari * jari;
	}
}