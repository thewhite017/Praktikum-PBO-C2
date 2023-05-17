/**
 * File : MapTest.java 17/05/2023
 * Penulis : Daffa Aulia Rizky Karunia
 * Deskripsi : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 */
 
import java.util.*;

public class MapTest{
	public static void main(String[] args){
		//kunci -> integer, nilai -> string
		Map<Integer, String> map = new HashMap<Integer, String>();
		//Menempatkan elemen kunci dan nilai
		map.put(1, "satu");
		map.put(2, "dua");
		//Mengambil elemen pertama
		System.out.println("Elemen Pertama : "+map.get(1));
		//Mengambil keseluruhan kunci sebagai objek collection set
		Set<Integer> key = map.keySet();
		System.out.println("Menampilkan seluruh elemen : ");
		for(Integer i : key){
			System.out.print(i + "." + map.get(i) + "\n");
		}
	}
}