package net.sytes.codeline.domaci02;

public class SobaOld {

	private int brojKreveta;
	private int velicina;
	private boolean kupatilo;
	private boolean tv;
	private boolean klima;
	private int cenaPoDanu;
	
	public SobaOld() {}
	
	public SobaOld(int brojKreveta, int velicina, boolean kupatilo, boolean tv, boolean klima, int cenaPoDanu) {
		this.brojKreveta = brojKreveta;
		this.velicina = velicina;
		this.kupatilo = kupatilo;
		this.tv = tv;
		this.klima = klima;
		this.cenaPoDanu = cenaPoDanu;
	}

	public int getBrojKreveta() {
		return brojKreveta;
	}

	public void setBrojKreveta(int brojKreveta) {
		this.brojKreveta = brojKreveta;
	}

	public int getVelicina() {
		return velicina;
	}

	public void setVelicina(int velicina) {
		this.velicina = velicina;
	}

	public boolean isKupatilo() {
		return kupatilo;
	}

	public void setKupatilo(boolean kupatilo) {
		this.kupatilo = kupatilo;
	}

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	public boolean isKlima() {
		return klima;
	}

	public void setKlima(boolean klima) {
		this.klima = klima;
	}

	public int getCenaPoDanu() {
		return cenaPoDanu;
	}

	public void setCenaPoDanu(int cenaPoDanu) {
		this.cenaPoDanu = cenaPoDanu;
	}

	@Override
	public String toString() {
		return "Soba [brojKreveta=" + brojKreveta + ", velicina=" + velicina + ", kupatilo=" + kupatilo + ", tv=" + tv
				+ ", klima=" + klima + ", cenaPoDanu=" + cenaPoDanu + "]";
	}
	
}
