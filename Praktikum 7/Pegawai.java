/**
 * File : Pegawai.java 03/05/2023
 * Penulis : Daffa Aulia Rizky Karunia
 * Deskripsi : super class
 */
 
public class Pegawai{
	private String nama;
	private int gajiPokok = 5000000;
	
	public void setNama(String nama){
		this.nama = nama;
	}
	
	public void tampilData(){
		System.out.printf("Nama : %s, Gaji Pokok : %d, ", nama, gajiPokok);
	}
}