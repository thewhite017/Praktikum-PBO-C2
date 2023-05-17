/**
 * File : Lingkaran.java 17/05/2023
 * Penulis : Daffa Aulia Rizky Karunia
 * Deskripsi : Implementasi lingkaran sebagai BangunDatar
 */
 
public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran (double jejari){
		this.jejari = jejari;
	}
	
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}
