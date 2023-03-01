/*
 * File : OperasiTitik.java	1/3/2023
 * Penulis : Daffa Aulia Rizky Karunia (24060121130070)
 * Deskripsi : kelas yang berisi program OperasiTitik
 */
 
class OperasiTitik{
	private void refleksiSumbuX(Titik titik){
		double ordinat = titik.getOrdinat();
		ordinat = ordinat * -1;
		titik.setOrdinat(ordinat);
	}
	
	private void refleksiSumbuY(Titik titik){
		titik.setAbsis(-titik.getAbsis());
	}
	
	public Titik refleksiX(Titik titik){
		refleksiSumbuX(titik);
		return titik;
		
	}
	
	public Titik refleksiY(Titik titik){
		refleksiSumbuY(titik);
		return titik;
	}
}
