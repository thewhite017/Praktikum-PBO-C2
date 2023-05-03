/**
 * File : Manajer.java 03/05/2023
 * Penulis : Daffa Aulia Rizky Karunia
 * Deskripsi : sub class dari Pegawai
 */
 
public class Manajer extends Pegawai{
	private int tunjangan = 700000;
	
	public Manajer(String nama){
		this.setNama(nama);
		this.tunjangan = tunjangan;
	}
	
	public void tampilData(){
		super.tampilData();
		System.out.println("Tunjangan : " + tunjangan);
	}
}