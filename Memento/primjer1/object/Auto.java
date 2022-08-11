package primjer1.object;

public class Auto {
	private String proizvodjac;
	private String model;
	private Double cijena;
	
	public Auto(String proizvodjac, String model, Double cijena) {
		super();
		this.proizvodjac = proizvodjac;
		this.model = model;
		this.cijena = cijena;
	}
	
	public String getProizvodjac() {
		return proizvodjac;
	}
	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getCijena() {
		return cijena;
	}
	public void setCijena(Double cijena) {
		this.cijena = cijena;
	}

	@Override
	public String toString() {
		return "Auto [proizvodjac=" + proizvodjac + ", model=" + model + ", cijena=" + cijena + "]";
	}
}
