/**
 * File : ArrayListTest.java 17/05/2023
 * Penulis : Daffa Aulia Rizky Karunia
 * Deskripsi : program penggunaan objek ArrayList
				sebagai collection class
 */

import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args){
		//Inisialisasi ArrayList yang hanya dapat
		//berisi objek String
		ArrayList<String> strings = new ArrayList<String>();
		//Menambah elemen
		strings.add("praktikum");
		strings.add("collection");
		strings.add("dan generics");
		//Menghapus elemen
		strings.remove("praktikum");
		//Iterasi pada keseluruhan ArrayList
		for(String s : strings){
			System.out.print(s+" ");
		}
	}
}