/**
 * File : LambdaList.java 05/06/2023
 * Penulis : Daffa Aulia Rizky Karunia
 * Deskripsi : Implementasi lambda pada list, digunakan sebagai parameter
				pada method
 */
 
import java.util.ArrayList;

public class LambdaList{
	public static void main(String[] args){
		ArrayList<String> mahasiswaList = new ArrayList<>();
		mahasiswaList.add("Adi");
		mahasiswaList.add("Bambang");
		mahasiswaList.add("Cici");
		mahasiswaList.add("Didi");
		
		//Lambda digunakan sebagai parameter
		mahasiswaList.forEach((nama) -> System.out.println(nama));
	}
}