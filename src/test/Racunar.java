package test;

public class Racunar {
	int kolicinaRAMa;
	int kapacitetHD;
	double brzinaProcesora;
	int dijagonalaMonitora;
	double nabavnaCijena;
	
	
	public Racunar(int kolicinaRAMa, int kapacitetHD, double brzinaProcesora, int dijagonalaMonitora,
			double nabavnaCijena) {
		this.kolicinaRAMa = kolicinaRAMa;
		this.kapacitetHD = kapacitetHD;
		this.brzinaProcesora = brzinaProcesora;
		this.dijagonalaMonitora = dijagonalaMonitora;
		this.nabavnaCijena = nabavnaCijena;
	}

	double izracunajCijenu() {
		return nabavnaCijena + (double)((nabavnaCijena/100) * 10);
	}

	public int getKolicinaRAMa() {
		return kolicinaRAMa;
	}

	public void setKolicinaRAMa(int kolicinaRAMa) {
		this.kolicinaRAMa = kolicinaRAMa;
	}

	public int getKapacitetHD() {
		return kapacitetHD;
	}

	public void setKapacitetHD(int kapacitetHD) {
		this.kapacitetHD = kapacitetHD;
	}

	public double getBrzinaProcesora() {
		return brzinaProcesora;
	}

	public void setBrzinaProcesora(double brzinaProcesora) {
		this.brzinaProcesora = brzinaProcesora;
	}

	public int getDijagonalaMonitora() {
		return dijagonalaMonitora;
	}

	public void setDijagonalaMonitora(int dijagonalaMonitora) {
		this.dijagonalaMonitora = dijagonalaMonitora;
	}

	public double getNabavnaCijena() {
		return nabavnaCijena;
	}

	public void setNabavnaCijena(double nabavnaCijena) {
		this.nabavnaCijena = nabavnaCijena;
	}

	@Override
	public String toString() {
		return "Racunar [kolicinaRAMa=" + kolicinaRAMa + ", kapacitetHD=" + kapacitetHD + ", brzinaProcesora="
				+ brzinaProcesora + ", dijagonalaMonitora=" + dijagonalaMonitora + ", nabavnaCijena=" + nabavnaCijena
				+ "]";
	}
	
	
}
