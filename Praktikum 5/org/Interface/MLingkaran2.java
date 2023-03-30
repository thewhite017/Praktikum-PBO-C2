/**
 * File : MLingkaran2.java 30/03/2023
 * Penulis : Daffa Aulia Rizky Karunia
 * Deskripsi : implementasi cara menghitung luas lingkaran
 */

import java.util.Scanner;

public class MLingkaran2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Masukkan jari-jari lingkaran = ");
		double jari = scan.nextDouble();
		Lingkaran l = new Lingkaran(jari);
		
		System.out.println("Luas lingkaran dengan jari-jari " + jari + " adalah " + l.hitungLuas());
	}
}