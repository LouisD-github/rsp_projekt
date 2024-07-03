import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main_Buchhaltung {

	public static void main(String[] args) {

		try {
			Group X = new Group("Marketing");
			Group X1 = new Group("Management");
			Group X2 = new Group("Verkauf");
			boolean schleife = true;
			Scanner scanner = new Scanner(System.in);
			do {
				System.out.println("Wähle einen der Menüpunkt:\n1) Mitarbeiter hinzufügen\n2) Mitarbeiter entfernen\n"
						+ "3) Mitarbeitedetails anzeigen\n4) Gehaltsabrechnung\n5) Prämie hinzufügen\n6) Prämie hinzufügen \n7) Programm beenden");
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
					boolean rein2 =true;
					do {
						System.out.println("Welche Gruppe wollen Sie bearbeiten: Marketing, Management, Verkauf");
						x = new Scanner(System.in).nextLine();
						if(x.equals("Marketing")||x.equals("Management")||x.equals("Verkauf")) {
							rein =false;

						}
					}while(rein2);
					if(x2.equals("Verkauf")){
						X2.delMitarbeiter();
					}
					if(x2.equals("Management")){
						X1.delMitarbeiter();
					}
					if(x2.equals("Marketing")){
						X.delMitarbeiter();
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
						x3 = new Scanner(System.in).nextLine();
						if(x3.equals("Marketing")||x3.equals("Management")||x3.equals("Verkauf")) {
							if(x3.equals("Marketing")) {
								X.gehaltsabrechnung();
							} else if(x3.equals("Management")) {
								X1.gehaltsabrechnung();
							} else {
								X2.gehaltsabrechnung();
							}
						}
					}while(rein4);
					break;
				case 5 : break;
				case 6 : 
					String x7="";
					boolean rein7 =true;
					do {
						System.out.println("Welche Gruppe wollen Sie bearbeiten: Marketing, Managment, Verkauf");
						x7 = new Scanner(System.in).nextLine();
						if(x7.equals("Marketing")||x7.equals("Management")||x7.equals("Verkauf")) {
							rein7 =false;

						}
					}while(rein7);
					if(x7.equals("Verkauf")){
						X2.Lohnerhöhung();
					}
					if(x7.equals("Management")){
						X1.Lohnerhöhung();
					}
					if(x7.equals("Marketing")){
						X.Lohnerhöhung();
					}
					break;
				case 7 : schleife = false; break;
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

				for (String s : speicher) {
					System.out.println(s);}

				if(speicher[0].equals("Manager")) {
					//Gebjahr
					int d = Integer.parseInt(speicher[1]);
					//Geschlecht
					char c = speicher[4].charAt(0);
					//Gehalt, Zulage, ...
					int gehalt = Integer.parseInt(speicher[5]);
					
					Manager X = new Manager(d, speicher[2], speicher[3], speicher[0], c, gehalt);
				} else if(speicher[0].equals("Angestellter")) {
					//Gebjahr
					int d = Integer.parseInt(speicher[1]);
					//Geschlecht
					char c = speicher[4].charAt(0);
					//Gehalt, Zulage, ...
					int gehalt = Integer.parseInt(speicher[5]);
					
					Angestellter X = new Angestellter(d, speicher[2], speicher[3], speicher[0], c, gehalt);
				} else if(speicher[0].equals("Geschaftsführer")) {
					//Gebjahr
					int d = Integer.parseInt(speicher[1]);
					//Geschlecht
					char c = speicher[4].charAt(0);
					//Gehalt, Zulage, ...
					int gehalt = Integer.parseInt(speicher[5]);
					int zulage = Integer.parseInt(speicher[6]);
					
					Geschäftsführer X = new Geschäftsführer(d, speicher[2], speicher[3], speicher[0], c, gehalt, zulage);
				} else if(speicher[0].equals("Stundenlöhner")) {
					//Gebjahr
					int d = Integer.parseInt(speicher[1]);
					//Geschlecht
					char c = speicher[4].charAt(0);
					//Gehalt, Zulage, ...
					int sl = Integer.parseInt(speicher[5]);
					int as = Integer.parseInt(speicher[6]);
					
					Stundenlöhner X = new Stundenlöhner(d, speicher[2], speicher[3], speicher[0], c, sl, as);
				} else {
					throw new Exception("Fehler in der Mitarbeiter.txt");
				}

			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

