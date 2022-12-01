package Zad_3_2019_20;

//Strategy interface
public interface RobaDAO {
	Roba getById(Long ig);
	boolean insert(Roba roba);
	boolean update(Long oldId, Roba roba);
}
