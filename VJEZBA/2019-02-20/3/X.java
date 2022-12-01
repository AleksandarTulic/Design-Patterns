package Zad_3_2019_20;

public class X {
	//private RobaDAO dao = new RobaDAOJdbcImpl();
	private RobaDAO dao = new RobaDAOTextImpl("MyTextDatabase.txt");
	
	public Roba getById(Long id) {
		return dao.getById(id);
	}
	
	public boolean insert(Roba roba) {
		return dao.insert(roba);
	}
	
	public boolean update(Long oldId, Roba roba) {
		return dao.update(oldId, roba);
	}
}
