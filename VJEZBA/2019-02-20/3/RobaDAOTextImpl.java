package Zad_3_2019_20;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RobaDAOTextImpl implements RobaDAO{
	private String filename;
	
	public RobaDAOTextImpl(String filename) {
		this.filename = filename;
	}
	
	@Override
	public Roba getById(Long id) {
		List<String> arr = readFromFile();
		Roba roba = null;
		
		for (int i=0;i<arr.size();i++) {
			if (arr.get(i).equals(id + "")) {
				String naziv = arr.get(i + 1);
				Double kolicina = Double.parseDouble(arr.get(i + 2));
				roba = new Roba(id, naziv, kolicina);
			}
		}
		
		return roba;
	}

	@Override
	public boolean insert(Roba roba) {
		Roba flag = getById(roba.getId());
		return flag == null ? writeToFile(Arrays.asList(roba.getId() + "", roba.getNaziv(), roba.getKolicina() + ""), true) : false;
	}

	@Override
	public boolean update(Long oldId, Roba roba) {
		List<String> arr = readFromFile();
		boolean flag = false;
		
		for (int i=0;i<arr.size();i++) {
			if (arr.get(i).equals(oldId + "")) {
				arr.remove(i);
				arr.remove(i);
				arr.remove(i);
				arr.add(i, roba.getId() + "");
				arr.add(i, roba.getNaziv() + "");
				arr.add(i, roba.getKolicina() + "");
				flag = true;
			}
		}
		
		writeToFile(arr, false);
		
		return flag;
	}
	
	private boolean writeToFile(List<String> arr, boolean flag1) {
		boolean flag = false;
		
		try {
			File f = new File(filename);
			PrintWriter pw = new PrintWriter(new FileOutputStream(f, flag1));
			
			for (String i : arr)
				pw.println(i);
			
			pw.close();
			flag = true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	private List<String> readFromFile(){
		List<String> arr = new ArrayList<>();
		
		try {
			File f = new File(filename);
			if (f.exists())
				arr = Files.readAllLines(Paths.get(filename));
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return arr;
	}

}
