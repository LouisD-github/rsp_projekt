import java.util.Scanner;

public class Main_Buchhaltung {

	public static void main(String[] args) {

		try {
			Group X = new Group("Marketing");
			Group X1 = new Group("Managment");
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
						System.out.println("Welche Gruppe wollen Sie bearbeiten: Marketing, Managment, Verkauf");
						x = new Scanner(System.in).nextLine();
						if(x.equals("Marketing")||x.equals("Managment")||x.equals("Verkauf")) {
							rein =false;

						}
					}while(rein);
					if(x.equals("Verkauf")){
						X2.addMitarbeiter();
					}
					if(x.equals("Managment")){
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
						System.out.println("Welche Gruppe wollen Sie bearbeiten: Marketing, Managment, Verkauf");
						x = new Scanner(System.in).nextLine();
						if(x.equals("Marketing")||x.equals("Managment")||x.equals("Verkauf")) {
							rein =false;

						}
					}while(rein2);
					if(x2.equals("Verkauf")){
						X2.delMitarbeiter();
					}
					if(x2.equals("Managment")){
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
						System.out.println("Welche Gruppe wollen Sie bearbeiten: Marketing, Managment, Verkauf");
						x3 = new Scanner(System.in).nextLine();
						if(x3.equals("Marketing")||x3.equals("Managment")||x3.equals("Verkauf")) {
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
						System.out.println("Welche Gruppe wollen Sie die Gehaltsabrechnung erstellen: Marketing, Managment, Verkauf");
						x3 = new Scanner(System.in).nextLine();
						if(x3.equals("Marketing")||x3.equals("Managment")||x3.equals("Verkauf")) {
							if(x3.equals("Marketing")) {
								X.gehaltsabrechnung();
							} else if(x3.equals("Managment")) {
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
						if(x7.equals("Marketing")||x7.equals("Managment")||x7.equals("Verkauf")) {
							rein7 =false;

						}
					}while(rein7);
					if(x7.equals("Verkauf")){
						X2.Lohnerhöhung();
					}
					if(x7.equals("Managment")){
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
}

