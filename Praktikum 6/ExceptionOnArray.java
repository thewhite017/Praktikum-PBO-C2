/**
 * File : ExceptionOnArray.java 30/03/2023
 * Penulis : Daffa Aulia Rizky Karunia
 * Deskripsi : program penggunaan eksepsi menggunakan class library Java
 */
 
public class ExceptionOnArray{
	public static void main(String[] args){
		//instantiasi object array integer
		Integer[] arrayInteger = new Integer[4];
		try{
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
		}
		catch(ArrayIndexOutOfBoundsException exception){
			exception.printStackTrace();
		}
		finally{
			System.out.println("cleaning up code...");
		}
	}
}