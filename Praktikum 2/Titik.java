/*
 * File : Titik.java	1/3/2023
 * Penulis : Daffa Aulia Rizky Karunia (24060121130070)
 * Deskripsi : kelas yang berisi program Titik
 */
 
class Titik{
	private double absis;
	private double ordinat;
	private static int counterTitik;
	
	Titik(double a, double o){
		absis = a;
		ordinat = o;
		counterTitik++;
	}

	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

	public void setAbsis(double a){
		absis = a;
	}

	public void setOrdinat(double o){
		ordinat = o;
	}

	public double getAbsis(){
		return absis;
	}

	public double getOrdinat(){
		return ordinat;
	}

	public int getCounterTitik(){
		return counterTitik;
	}
}
