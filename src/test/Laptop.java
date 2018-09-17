package test;

public class Laptop extends Racunar{
	
	int trajanjeBaterije;
	
	double izracunajCijenu() {
		return nabavnaCijena + (double)((nabavnaCijena/100) * 15);
	}

	public Laptop(int kolicinaRAMa, int kapacitetHD, double brzinaProcesora, int dijagonalaMonitora,
			double nabavnaCijena, int trajanjeBaterije) {
		super(kolicinaRAMa, kapacitetHD, brzinaProcesora, dijagonalaMonitora, nabavnaCijena);
		this.trajanjeBaterije = trajanjeBaterije;
	}

	@Override
	public String toString() {
		return "Laptop [trajanjeBaterije=" + trajanjeBaterije + ", kolicinaRAMa=" + kolicinaRAMa + ", kapacitetHD="
				+ kapacitetHD + ", brzinaProcesora=" + brzinaProcesora + ", dijagonalaMonitora=" + dijagonalaMonitora
				+ ", nabavnaCijena=" + nabavnaCijena + "]";
	}
	
}
