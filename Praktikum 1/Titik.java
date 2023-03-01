/*
 * File : Titik.java	22/2/2023
 * Penulis : Daffa Aulia Rizky Karunia (24060121130070)
 * Deskripsi : kelas yang berisi program Titik
 */
class Titik{
	double absis;
	double ordinat;
	static int counterTitik;
	
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

	void setAbsis(double a){
		absis = a;
	}

	void setOrdinat(double o){
		ordinat = o;
	}

	double getAbsis(){
		return absis;
	}

	double getOrdinat(){
		return ordinat;
	}

	int getCounterTitik(){
		return counterTitik;
	}
}
