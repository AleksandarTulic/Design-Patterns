package Zad_2_2019_2_20;

public class X {
	private RobaDAO dao = new RobaDAOImpl();
	
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
