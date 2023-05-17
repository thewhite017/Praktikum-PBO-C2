/**
 * File : BangunDatarGenericTest.java 17/05/2023
 * Penulis : Daffa Aulia Rizky Karunia
 * Deskripsi : main class untuk generic bangun datar
 */
 
public class BangunDatarGenericTest{
	public static void main(String[] args){
		Lingkaran l = new Lingkaran(2);
		BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
		bdg.set(l);
	System.out.println("Keliling lingkaran : "+bdg.hitungKeliling());
	System.out.println("Tipe Generic : "+bdg.get().getClass().getName());
	}
}