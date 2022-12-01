package Zad_3_2019_20;

public class Roba {
	private Long id;
	private String naziv;
	private Double kolicina;
	
	public Roba() {
	}

	public Roba(Long id, String naziv, Double kolicina) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.kolicina = kolicina;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Double getKolicina() {
		return kolicina;
	}

	public void setKolicina(Double kolicina) {
		this.kolicina = kolicina;
	}

	@Override
	public String toString() {
		return "Roba [id=" + id + ", naziv=" + naziv + ", kolicina=" + kolicina + "]";
	}
}
