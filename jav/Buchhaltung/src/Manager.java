import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;

public class Manager extends Mitarbeiter {

	private double gehalt;

	public Manager(int _GebJahr, String _Vorname, String _Nachname, String _Beruf, char _Geschlecht, double _Gehalt) throws Exception {
		super(_GebJahr, _Vorname, _Nachname, _Beruf, _Geschlecht);
		setGehalt(_Gehalt);
	}

	public void Lohnerhöhung(double prozent) throws Exception {
		if(prozent < 0 || prozent > 10) {
			throw new Exception("Prozent Eingabe muss größer als 0 und kleiner als 10 sein");
		} else {
			prozent = (prozent / 100);
			gehalt += gehalt * prozent;
		}
	}

	@Override
	public String Gehaltsabrechnung() {
		String str = "";
		if(super.getGeschlecht() == 'M') {
			str = "Gehaltsabrechnung für den " + LocalDate.now() + " von Herrn " + super.getNachname()
			+ " " + super.getVorname() +  " (" + super.getMnr() + "): " + getGehalt()
			+"\nWeiterhin Prämie: "+super.getPrämie()+"\nInsgesamt: "+(getGehalt()+getPrämie());; 
		}
		else if(super.getGeschlecht() == 'W') {
			str = "Gehaltsabrechnung für den " + LocalDate.now() + " von Frau " + super.getNachname()
			+ " " + super.getVorname() +  " (" + super.getMnr() + "): " + getGehalt()
			+"\nWeiterhin Prämie: "+super.getPrämie()+"\nInsgesamt: "+(getGehalt()+getPrämie());
		}
		else if(super.getGeschlecht() == 'D') {
			str = "Gehaltsabrechnung für den " + LocalDate.now() + " von " + super.getNachname()
			+ " " + super.getVorname() +  " (" + super.getMnr() + "): " + getGehalt()
			+"\nWeiterhin Prämie: "+super.getPrämie()+"\nInsgesamt: "+(getGehalt()+getPrämie());
		}
		try {
			LocalDate d = LocalDate.now();
			BufferedWriter writer = new BufferedWriter(new FileWriter("texts/Gehaltsabrechnung_"+d.getMonth()+"_"+d.getYear()+".txt"));
			writer.write(str);
			writer.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return str;
	}

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) throws Exception {
		if(gehalt <= 0) {
			throw new Exception("Gehalt kann nicht kleiner als 0 sein");
		}
		this.gehalt = gehalt;
	}

	@Override
	public String toString() {
		return super.toString()+"Gehalt: "+ gehalt;
	}

	@Override
	public void Lohnerhöhung() {
		// TODO Auto-generated method stub
		
	}

	
	//toString
	
}
