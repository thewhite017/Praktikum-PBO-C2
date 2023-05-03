/**
 * File : Programmer.java 03/05/2023
 * Penulis : Daffa Aulia Rizky Karunia
 * Deskripsi : sub class dari Pegawai
 */
 
public class Programmer extends Pegawai{
	private int bonus = 450000;
	
	public Programmer(String nama){
		this.setNama(nama);
		this.bonus = bonus;
	}
	
	public void tampilData(){
		super.tampilData();
		System.out.println("Bonus : " + bonus);
	}
}