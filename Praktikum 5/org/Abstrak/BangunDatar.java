/**
 * File : BangunDatar.java 29/03/2023
 * Penulis : Daffa Aulia Rizky Karunia
 * Deskripsi : kelas abstrak yang berisi abstraksi bangun datar
 */

public abstract class BangunDatar{
	protected double luas;
	
	public abstract double hitungLuas(double sisi);
	
	protected void setLuas(double Luas){
		this.luas = Luas;
	}
	
	public double getLuas(){
		return luas;
	}
}