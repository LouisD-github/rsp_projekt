import java.io.BufferedReader;
import java.io.FileReader;
import java.time.chrono.ChronoLocalDate;
import java.util.Scanner;

public class Main_Buchhaltung {
	public static Group X;
	public static Group X1;
	public static Group X2;
	public static Mitarbeiter[] EheM;

	public static void main(String[] args) {
		try {
			EheM = new Mitarbeiter[99];
			X = new Group("Marketing");
			X1 = new Group("Management");
			X2 = new Group("Verkauf");
			boolean schleife = true;
			try {
				einlesen();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			Scanner scanner = new Scanner(System.in);
			do {
				System.out.println("Wähle einen der Menüpunkt:\n1) Mitarbeiter hinzufügen\n2) Mitarbeiter entfernen\n"
						+ "3) Mitarbeitedetails anzeigen\n4) Gehaltsabrechnung\n5) Längster Mitarbeiter\n6) Prämie hinzufügen\n7) Durschnitt jeder Gruppe \n8) Programm beenden");
				int i = scanner.nextInt();
				switch(i) {

				case 1 : 
					//////////////////////////////////////////////////////////////////////////////////////////
					String x="";
					boolean rein =true;
					do {
						System.out.println("Welche Gruppe wollen Sie bearbeiten: Marketing, Management, Verkauf");
						x = new Scanner(System.in).nextLine();
						if(x.equals("Marketing")||x.equals("Management")||x.equals("Verkauf")) {
							rein =false;

						}
					}while(rein);
					if(x.equals("Verkauf")){
						X2.addMitarbeiter();
					}
					if(x.equals("Management")){
						X1.addMitarbeiter();
					}
					if(x.equals("Marketing")){
						X.addMitarbeiter();
					}
					; break;
					/////////////////////////////////////////////////////////////////////////////////////////////////
				case 2 :
					/////////////////////////////////////////////////////////////////////////////////////////
					String x2="";
					Mitarbeiter temp = null;
					boolean rein2 =true;
					do {
						System.out.println("Welche Gruppe wollen Sie bearbeiten: Marketing, Management, Verkauf");
						x = new Scanner(System.in).nextLine();
						if(x.equals("Marketing")||x.equals("Management")||x.equals("Verkauf")) {
							rein =false;

						}
					}while(rein2);
					if(x2.equals("Verkauf")){
						temp=X2.delMitarbeiter();
						for(int j = 0; j<EheM.length;j++) {
							if(EheM[j] == null) {
								EheM[j] = temp;
							}
						}
					}
					if(x2.equals("Management")){
						temp=X1.delMitarbeiter();
						for(int j = 0; j<EheM.length;j++) {
							if(EheM[j] == null) {
								EheM[j] = temp;
							}
						}
					}
					if(x2.equals("Marketing")){
						temp=X.delMitarbeiter();
						for(int j = 0; j<EheM.length;j++) {
							if(EheM[j] == null) {
								EheM[j] = temp;
							}
						}
					}
					break;
					////////////////////////////////////////////////////////////////////////////////////////////////
				case 3 :
					/////////////////////////////////////////////////////////////////////////////////////////
					String x3="";
					boolean rein3 =true;
					do {
						System.out.println("Welche Gruppe wollen Sie bearbeiten: Marketing, Management, Verkauf");
						x3 = new Scanner(System.in).nextLine();
						if(x3.equals("Marketing")||x3.equals("Management")||x3.equals("Verkauf")) {
							rein3 =false;

						}
					}while(rein3);
					if(x3.equals("Verkauf")){
						X2.toSting2();
					}
					if(x3.equals("Managment")){
						X1.toSting2();
					}
					if(x3.equals("Marketing")){
						X1.toSting2();
					}

					////////////////////////////////////////////////////////////////////////////////////////////////
					break;
				case 4 : 
					boolean rein4 =true;
					do {
						System.out.println("Welche Gruppe wollen Sie die Gehaltsabrechnung erstellen: Marketing, Management, Verkauf");
						System.out.println("Um das Menü zuverlassen: 'Exit'");
						x3 = new Scanner(System.in).nextLine();
						if(x3.equals("Marketing")||x3.equals("Management")||x3.equals("Verkauf")||x3.equals("Exit")){
							if(x3.equals("Marketing")) {
								X.gehaltsabrechnung();
							} else if(x3.equals("Management")) {
								X1.gehaltsabrechnung();
							} else if(x3.equals("Verkauf")) {
								X2.gehaltsabrechnung();
							} else if(x3.equals("Exit")){
								rein4 = false;
							}
						}
					}while(rein4);
					break;
				case 5 :
					Mitarbeiter alt=X.längersterMitabeiter();
					Mitarbeiter alt2=X1.längersterMitabeiter();
					Mitarbeiter alt3=X2.längersterMitabeiter();
					if(alt.getEintrittsdatum().isBefore((ChronoLocalDate) alt2)) {
						if(alt.getEintrittsdatum().isBefore((ChronoLocalDate) alt3)) {
							System.out.println("Ältester Mitarbeiter: " + alt);
						} else if(alt2.getEintrittsdatum().isBefore((ChronoLocalDate) alt3)) {
							if(alt2.getEintrittsdatum().isBefore((ChronoLocalDate) alt)) {
								System.out.println("Ältester Mitarbeiter: " + alt2);
							}
							else if(alt3.getEintrittsdatum().isBefore((ChronoLocalDate) alt2)) {
								if(alt3.getEintrittsdatum().isBefore((ChronoLocalDate) alt)) {
									System.out.println("Ältester Mitarbeiter: " + alt3);
								}
							}
						}
					}
					break;
				case 6 : 
					String x6="";
					boolean rein6 =true;
					do {
						System.out.println("Welche Gruppe wollen Sie bearbeiten: Marketing, Managment, Verkauf");
						x6 = new Scanner(System.in).nextLine();
						if(x6.equals("Marketing")||x6.equals("Management")||x6.equals("Verkauf")) {
							rein6 =false;

						}
					}while(rein6);
					if(x6.equals("Verkauf")){
						X2.Lohnerhöhung();
					}
					if(x6.equals("Management")){
						X1.Lohnerhöhung();
					}
					if(x6.equals("Marketing")){
						X.Lohnerhöhung();
					}
					break;
				case 7 :
					/////////////////////////////////////////////////////////////////////////////////////////
					String x7="";
					boolean rein7 =true;
					do {
						System.out.println("Welche Gruppe wollen Sie bearbeiten: Marketing, Management, Verkauf");
						x7 = new Scanner(System.in).nextLine();
						if(x7.equals("Marketing")||x7.equals("Management")||x7.equals("Verkauf")) {
							rein7 =false;

						}
					}while(rein7);
					if(x7.equals("Verkauf")){
						X2.Durchschnitt();
					}
					if(x7.equals("Managment")){
						X1.Durchschnitt();
					}
					if(x7.equals("Marketing")){
						X1.Durchschnitt();
					}

					////////////////////////////////////////////////////////////////////////////////////////////////

					break;
				case 8 : schleife = false; break;
				default : System.out.println("Falsche Eingabe."); break;
				} 
			} while(schleife);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void einlesen() throws Exception {
		String dateipfad = "texts/Mitarbeiter.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(dateipfad))) {
			String zeile;
			while ((zeile = br.readLine()) != null) {
				String[] speicher = zeile.split(";");

				if(speicher[0].equals("Manager")) {
					//Gebjahr
					int d = Integer.parseInt(speicher[1]);
					//Geschlecht
					char c = speicher[4].charAt(0);
					//Gehalt, Zulage, ...
					int gehalt = Integer.parseInt(speicher[5]);

					Manager Z = new Manager(d, speicher[2], speicher[3], speicher[0], c, gehalt);
					gruppehinzufügen(Z, speicher[7]);
				} else if(speicher[0].equals("Angestellter")) {
					//Gebjahr
					int d = Integer.parseInt(speicher[1]);
					//Geschlecht
					char c = speicher[4].charAt(0);
					//Gehalt, Zulage, ...
					int gehalt = Integer.parseInt(speicher[5]);

					Angestellter Z = new Angestellter(d, speicher[2], speicher[3], speicher[0], c, gehalt);
					gruppehinzufügen(Z, speicher[7]);
				} else if(speicher[0].equals("Geschaftsführer")) {
					//Gebjahr
					int d = Integer.parseInt(speicher[1]);
					//Geschlecht
					char c = speicher[4].charAt(0);
					//Gehalt, Zulage, ...
					int gehalt = Integer.parseInt(speicher[5]);
					int zulage = Integer.parseInt(speicher[6]);

					Geschäftsführer Z = new Geschäftsführer(d, speicher[2], speicher[3], speicher[0], c, gehalt, zulage);
					gruppehinzufügen(Z, speicher[7]);
				} else if(speicher[0].equals("Stundenlöhner")) {
					//Gebjahr
					int d = Integer.parseInt(speicher[1]);
					//Geschlecht
					char c = speicher[4].charAt(0);
					//Gehalt, Zulage, ...
					int sl = Integer.parseInt(speicher[5]);
					int as = Integer.parseInt(speicher[6]);

					Stundenlöhner Z = new Stundenlöhner(d, speicher[2], speicher[3], speicher[0], c, sl, as);
					gruppehinzufügen(Z, speicher[7]);
				} else {
					throw new Exception("Fehler in der Mitarbeiter.txt");
				}

			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void gruppehinzufügen(Mitarbeiter mitarbeiter, String gruppe) throws Exception {
		switch (gruppe) {
		case "Marketing":
			X.addMitarbeiter2(mitarbeiter);
			break;
		case "Management":
			X1.addMitarbeiter2(mitarbeiter);
			break;
		case "Verkauf":
			X2.addMitarbeiter2(mitarbeiter);
			break;
		default:
			throw new Exception("Ungültige Gruppe: " + gruppe);
		}
	}

}

