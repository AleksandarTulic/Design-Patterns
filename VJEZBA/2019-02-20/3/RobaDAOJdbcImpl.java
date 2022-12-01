package Zad_3_2019_20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RobaDAOJdbcImpl implements RobaDAO{
	private static final String SQL_SELECT_BY_ID = "select * from roba as r where r.id=?";
	private static final String SQL_INSERT = "insert into roba values(?, ?, ?)";
	private static final String SQL_UPDATE = "update roba as r set r.id=?,r.naziv=?,r.kolicina=? where r.id=?";
	
	@Override
	public Roba getById(Long id) {
		Roba roba = null;
		
		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/PSRoba?useUnicode=true&useJDBCCompliantTimezoneShift=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "localhost");
			ResultSet rs = null;
			PreparedStatement ps = c.prepareStatement(SQL_SELECT_BY_ID);
			ps.setLong(1, id);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				roba = new Roba(rs.getLong("id"), rs.getString("naziv"), rs.getDouble("kolicina"));
			}
			
			ps.close();
			c.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return roba;
	}

	@Override
	public boolean insert(Roba roba) {
		int res = 0;
		
		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/PSRoba?useUnicode=true&useJDBCCompliantTimezoneShift=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "localhost");
			PreparedStatement ps = c.prepareStatement(SQL_INSERT);
			ps.setObject(1, roba.getId());
			ps.setObject(2, roba.getNaziv());
			ps.setObject(3, roba.getKolicina());
			res = ps.executeUpdate();
			
			ps.close();
			c.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return res >= 1;
	}

	@Override
	public boolean update(Long oldId, Roba roba) {
		int res = 0;
		
		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/PSRoba?useUnicode=true&useJDBCCompliantTimezoneShift=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "localhost");
			PreparedStatement ps = c.prepareStatement(SQL_UPDATE);
			ps.setObject(1, roba.getId());
			ps.setObject(2, roba.getNaziv());
			ps.setObject(3, roba.getKolicina());
			ps.setObject(4, oldId);
			res = ps.executeUpdate();
			
			ps.close();
			c.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return res >= 1;
	}

}
