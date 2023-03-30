/**
 * File : AngkaSialException.java 30/03/2023
 * Penulis : Daffa Aulia Rizky Karunia
 * Deskripsi : Eksepsi yang menolak masukan angka 13
 */
 
public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial!");
	}
}