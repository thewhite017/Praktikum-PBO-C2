/**
 * File : MKubus.java 08/03/2023
 * Penulis : Daffa Aulia Rizky Karunia
 * Deskripsi : driver class untuk poligon dan persegi panjang
 */
 
package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujurSangkar = new BujurSangkar(4);
		Kubus kubus = new Kubus(bujurSangkar);
		System.out.println("=======================");
		System.out.println("Luas Alas Kubus : " + kubus.hitungLuasAlas());
		System.out.println("Volume Kubus    : " + kubus.hitungVolume());
		System.out.println("=======================");
	}
}