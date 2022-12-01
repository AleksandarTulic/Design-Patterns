package Zad_2_2019_2_20;

public interface RobaDAO {
	Roba getById(Long ig);
	boolean insert(Roba roba);
	boolean update(Long oldId, Roba roba);
}
