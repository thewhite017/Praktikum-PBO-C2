/**
 * File : MySQLPersonDAO.java 31/05/2023
 * Penulis : Daffa Aulia Rizky Karunia
 * Deskripsi : Implementasi PersonDAO untuk MySQL
 */

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
	public void savePerson(Person person) throws Exception{
		String name = person.getName();
		//membuat koneksi, nama db, user, password
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost/pbo" + "root & 15092003");
		//kerjakan mysql query
		String query = "INSERT INTO person(name) VALUES('"+name+"')";
		System.out.println(query);
		Statement s = con.createStatement();
		s.executeUpdate(query);
		//tutup koneksi database
		con.close();
	}
}