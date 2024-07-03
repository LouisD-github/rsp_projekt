import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;

public class Group {
	Mitarbeiter[] XListe = new Mitarbeiter[10];
	private Mitarbeiter[] Liste;
	private String GruppenBezeichnung;

	public Group(String _GruppenBezeichnung) throws Exception {
		setListe(XListe);
		setGruppenBezeichnung(_GruppenBezeichnung);
	}

	public Mitarbeiter[] getListe() {
		return Liste;
	}

	public void setListe(Mitarbeiter[] X) {

		Liste = X;
	}

	public String getGruppenBezeichnung() {
		return GruppenBezeichnung;
	}

	public void setGruppenBezeichnung(String gruppenBezeichnung) throws Exception {

		if(gruppenBezeichnung==null) {
			throw new Exception("Gruppen Name kann nicht unbennant sein");

		}else {
			GruppenBezeichnung = gruppenBezeichnung;
		}


	}

	public void addMitarbeiter() throws Exception {
		String x="";
		boolean rein = true;
		do {
			System.out.println("Was für einen Mitarbeiter wollen sie erstellen: Angestellter,Manager,Stundenlöhner,Geschäftsführer");
			x = new Scanner(System.in).nextLine();
			if(x.equals("Geschäftsführer")||x.equals("Manager")||x.equals("Angestellter")||x.equals("Stundenlöhner")) {
				rein =false;

			}
		}while(rein);


		if(x.equals("Angestellter")) {
			System.out.println("Gebutsjahr:");
			int GebJahr = new Scanner(System.in).nextInt();
			System.out.println("Vorname:");
			String Vorname = new Scanner(System.in).nextLine();
			System.out.println("Nachname:");
			String Nachname = new Scanner(System.in).nextLine();

			String Beruf =x;

			System.out.println("Geschlecht (Grossbuchstaben):");
			String y = new Scanner(System.in).nextLine();
			char Geschlecht = y.charAt(0);
			System.out.println("Gehalt:");
			double Gehalt = new Scanner(System.in).nextDouble();
			Angestellter X = new Angestellter(GebJahr,Vorname,Nachname,Beruf,Geschlecht,Gehalt);

			for (int i = 0; i < XListe.length;) {
				if(XListe[i] ==null) {

					this.XListe[i] =X;
					return;
				}
				else {
					i++;	
				}
			} 

		}
		if(x.equals("Manager")) {
			System.out.println("Gebutsjahr:");
			int GebJahr = new Scanner(System.in).nextInt();
			System.out.println("Vorname:");
			String Vorname = new Scanner(System.in).nextLine();
			System.out.println("Nachname:");
			String Nachname = new Scanner(System.in).nextLine();

			String Beruf = x;

			System.out.println("Geschlecht (Grossbuchstaben)");
			String y = new Scanner(System.in).nextLine();
			char Geschlecht = y.charAt(0);
			System.out.println("Gehalt:");
			double Gehalt = new Scanner(System.in).nextDouble();
			Manager X = new Manager(GebJahr,Vorname,Nachname,Beruf,Geschlecht,Gehalt);

			for (int i = 0; i < XListe.length;) {
				if(XListe[i] ==null) {

					this.XListe[i] =X;
					return;
				}
				else {
					i++;	
				}
			}
		}

		if(x.equals("Geschäftsführer")) {
			System.out.println("Gebutsjahr:");
			int GebJahr = new Scanner(System.in).nextInt();
			System.out.println("Vorname:");
			String Vorname = new Scanner(System.in).nextLine();
			System.out.println("Nachname:");
			String Nachname = new Scanner(System.in).nextLine();

			String Beruf = x;

			System.out.println("Geschlecht (Grossbuchstaben):");
			String y = new Scanner(System.in).nextLine();
			char Geschlecht = y.charAt(0);
			System.out.println("Gehalt:");
			double Gehalt = new Scanner(System.in).nextDouble();
			System.out.println("Zulage:");
			double Zulage = new Scanner(System.in).nextDouble();
			Geschäftsführer X = new Geschäftsführer(GebJahr,Vorname,Nachname,Beruf,Geschlecht,Gehalt,Zulage);

			for (int i = 0; i < XListe.length;) {
				if(XListe[i] ==null) {

					this.XListe[i] =X;
					return;
				}
				else {
					i++;	
				}
			}
		}

		if(x.equals("Stundenlöhner")) {
			System.out.println("Gebutsjahr:");
			int GebJahr = new Scanner(System.in).nextInt();
			System.out.println("Vorname:");
			String Vorname = new Scanner(System.in).nextLine();
			System.out.println("Nachname:");
			String Nachname = new Scanner(System.in).nextLine();

			String Beruf = x;

			System.out.println("Geschlecht (Grossbuchstaben):");
			String y = new Scanner(System.in).nextLine();
			char Geschlecht = y.charAt(0);
			System.out.println("Stundenlohn:");
			double Stundenlohn = new Scanner(System.in).nextDouble();
			System.out.println("Stundenanzahl:");
			int Stundenzahl = new Scanner(System.in).nextInt();
			Stundenlöhner X = new Stundenlöhner(GebJahr,Vorname,Nachname,Beruf,Geschlecht,Stundenlohn,Stundenzahl);

			for (int i = 0; i < XListe.length;) {
				if(XListe[i] ==null) {

					this.XListe[i] =X;
					return;
				}
				else {
					i++;	
				}
			}
		}
	}

	public void delMitarbeiter() throws Exception {
		System.out.println("Geben Sie den Name des Mitarbeiters an welcher entfernt werden soll: ");
		for (int i = 0; i < XListe.length; i++) {
			System.out.print(XListe[i].getVorname() + " ");
		}
		String x = "";
		boolean schleife = true;
		do {
			x = new Scanner(System.in).nextLine();
			for(int j = 0; j < XListe.length; j++) {
				if(XListe[j].getNachname() == x) {
					XListe[j] = null;
					return;
				}
			}
			System.out.println("Name nicht in der Liste");
		} while(schleife);


	}

	public void toSting2() {
		for (Mitarbeiter mitarbeiter : XListe) {
			if(mitarbeiter==null) {  
				return; 
			}
			System.out.println(mitarbeiter.toString());
		}

	}

	public void gehaltsabrechnung() {
		for (int i = 0; i < Liste.length; i++) {
			System.out.println(Liste[i].Gehaltsabrechnung());
		}
	}

	public void Lohnerhöhung() throws Exception {

		System.out.println("1.Einzelner Mitarbeiter");
		System.out.println("2.Gruppe");

		int x = new Scanner(System.in).nextInt();

		switch(x) {
		case 1:
			System.out.println("Geben sie die Mitarbeiternummer ein");
			String Y = new Scanner(System.in).nextLine();
			for (Mitarbeiter mitarbeiter : XListe) {
				if(mitarbeiter.getMnr().equals(Y)) {

					mitarbeiter.Lohnerhöhung();
				}

			}

			break;
		case 2: 
			for (Mitarbeiter mitarbeiter : XListe) {
				if(mitarbeiter==null) {

					return; 
				}
				System.out.println("Wie viel Prozent pro Job");
				System.out.println("Manager: ");
				int x1 = new Scanner(System.in).nextInt();
				System.out.println("Geschäftsführer: ");
				int x2 = new Scanner(System.in).nextInt();
				System.out.println("Angestellter: ");
				int x3 = new Scanner(System.in).nextInt();
				System.out.println("Stundenlöhner (Neuer Stundenlohn): ");
				int x4 = new Scanner(System.in).nextInt();

				if(mitarbeiter instanceof Angestellter) {


					((Angestellter)mitarbeiter).Lohnerhöhung(x3);

				}
				if(mitarbeiter instanceof Stundenlöhner) {

					((Stundenlöhner)mitarbeiter).setStundenlohn(x4);
				}
				if(mitarbeiter instanceof Manager) {

					((Manager)mitarbeiter).Lohnerhöhung(x1);
				}
				if(mitarbeiter instanceof Geschäftsführer) {

					((Geschäftsführer)mitarbeiter).Lohnerhöhung(x2);
				}
			}
			break;
		}
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////7

	public void Durchschnitt() throws Exception {
		System.out.println("Wählen sie die Option der Durchschnitts aus");
		System.out.println("1)Durchschnitts Alter"
				+ "\n2)Durchschnitts Gehalt"
				+"\n3)Anzahl Aller Mitarbeiter");
		String s = new Scanner(System.in).nextLine();
		if(s.equals("1")) {
			double temp = 0;
			int Zähler =0;
			for (Mitarbeiter mitarbeiter : Liste) {
				if(mitarbeiter==null) {


				}else {
					temp = temp + mitarbeiter.getGebJahr();
					Zähler++;

				}

			}
			temp= temp/Zähler;
			System.out.println("Durchschnitts Alter: "+(temp-2024));
		}
		if(s.equals("2")) {
			double temp = 0;
			int Zähler =0;
			for (Mitarbeiter mitarbeiter : Liste) {
				if(mitarbeiter==null) {


				}else {
					if(mitarbeiter instanceof Manager) {
						temp = temp + ((Manager)mitarbeiter).getGehalt();

					}
					if(mitarbeiter instanceof Angestellter) {
						temp = temp + ((Angestellter)mitarbeiter).getGehalt();

					}
					if(mitarbeiter instanceof Stundenlöhner) {
						temp = temp + ((Stundenlöhner)mitarbeiter).getGehalt();

					}
					if(mitarbeiter instanceof Geschäftsführer) {
						temp = temp + ((Geschäftsführer)mitarbeiter).getGehalt();

					}

					Zähler++;

				}

			}
			temp= temp/Zähler;
			System.out.println("Durchschnitts Gehalt: "+temp);
		}
		if(s.equals("3")) {

			Mitarbeiter Filler = new Manager(2002,"Filler","Filler","Manager",'D',1);

			System.out.println( "Mitarbeiter: "+(Filler.getAnzahlMitarbeiter()-1)
					+"\nWeiblich: "+Filler.getWeiblich()
					+"\nMännlich: "+Filler.getMännlich()
					+"\nDivers: "+(Filler.getDivers()-1));
		}

	}

	public void addMitarbeiter2(Mitarbeiter m) {
		for (int i = 0; i < XListe.length;) {
			if(XListe[i] == null) {

				this.XListe[i] = m;
				return;
			}
			else {
				i++;	
			}

		}
	}
}

