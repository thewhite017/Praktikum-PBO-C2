/**
 * File : Asersi2.java 30/03/2023
 * Penulis : Daffa Aulia Rizky Karunia
 * Deskripsi : program untuk demo asersi yang akan menolak input jari-jari
 *			lingkaran yang bernilai nol
 */
 
//class Lingkaran
class Lingkaran{
	private double jari;
	public Lingkaran(double jari){
		this.jari = jari;
	}
	
	public double hitungKeliling(){
		double keliling = 2 * Math.PI * jari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jari = 0;
		assert(jari > 0) : "jari-jari tidak boleh nol!!";
		Lingkaran l = new Lingkaran(jari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("Keliling lingkaran = " + kelilingLingkaran);
	}
}