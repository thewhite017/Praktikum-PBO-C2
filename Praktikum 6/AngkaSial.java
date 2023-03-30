/**
 * File : AngkaSial.java 30/03/2023
 * Penulis : Daffa Aulia Rizky Karunia
 * Deskripsi : program penggunaan exception buatan sendiri
 *			Pengenalan klausa 'throw' dan 'throws'
 */
 
public class AngkaSial{
	public void cobaAngka(int angka) throws AngkaSialException{
		if (angka == 13){
			throw new AngkaSialException();
		}
		System.out.println(angka + " bukan angka sial.");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(14);
		}
		catch(AngkaSialException ase){
			//method getMessage() telah ada di class Exception
			System.out.println(ase.getMessage());
			System.out.println("hati-hati dalam memasukkan angka!");
		}
	}
}