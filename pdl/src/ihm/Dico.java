package ihm;

import java.util.Hashtable;
import java.util.Locale;

import javax.swing.JComponent;
import javax.swing.UIManager;


public class Dico {

	static String langue;

	public Dico (){

	}
	public String getlangue() {
		return langue;
	}

	public  void setLangue(String langue) {
		this.langue = langue;
	}

	public static final Hashtable<String, String> dico_anglais = new Hashtable<String,String>() {{
		put("Action",    "Action");
		put("Aide",    "Help");
		put("Ajouter / Modifier",    "Add / Modify");
		put("Ajouter un evenement",    "Add an event");
		put("Ajouter un pilote",    "Add a pilot");
		put("Ajouter une course",    "Add a race");
		put("Ajouter une voiture",    "Add a car");
		put("Ajouter",    "Add");
		put("Allemand",    "German");
		put("Anglais",    "English");
		put("Annuler",     "Cancel");
		put("Attention ! Tous les tops associes seront supprimes",    "Be careful ! All associated tops will be deleted too.");
		put("Attention",    "Be Careful");
		put("Bienvenue",      "Welcome");
		put("Caracteristiques de la voiture",    "Features of the car");
		put("Caracteristiques de l'essai",    "Test features");
		put("Caracteristiques de l'essai",    "Test's features");
		put("Caracteristiques de l'evenement",    "Features of the event");
		put("Caracteristiques",    "Features");
		put("Charger un evenement",    "Load an event");
		put("Charger une course",    "Load a race");
		put("Choisir au moins un essai a lancer",     "Select at least one test to run");
		put("Choix de la langue",    "Choose your language");
		put("Classement",    "Ranking");
		put("Commentaires sur la course :",    "Comments about the race :");
		put("Commentaires sur l'essai :",    "Comments about the test :");
		put("Commentaires",    "Comments");
		put("Continuer", "Continue");
		put("Couleur :",    "Color :");
		put("Couleur du casque",    "Helmet's color");
		put("Course",    "Race");
		put("Creer un evenement",    "Create an event");
		put("Creer une course",    "Create a race");
		put("Creer une voiture",    "Create a car");
		put("Depart automatique",    "Automatic start");
		put("Duree consecutive maximum par pilote :",    "Successive maximum duration for a pilot :");
		put("Duree totale maximum par pilote :",    "Total maximum duration for a pilot :");
		put("Edition",    "Edit");
		put("Etat :",    "State :");
		put("Export Tableur",    "Export Table");
		put("Fichier",    "File");
		put("Francais",    "French");
		put("Gestion de la course",    "Race management");
		put("Heure actuelle",    "Current hour");
		put("Heure de debut :",    "Post time :");
		put("Heure de fin :",    "End time :");
		put("Heure",    "Hour");
		put("Image du pilote",    "Pilot's picture");
		put("Importer une voiture",    "Load a car");
		put("Imprimer",    "Print");
		put("Informations concernant la course",    "Race informations");
		put("Informations concernant l'essai",    "Test informations");
		put("Informations generales",    "General informations");
		put("Informations pilotes",    "About pilots");
		put("Informations sur le pilote",    "Pilot informations");
		put("Informations",    "Informations");
		put("la course",    "the race");
		put("La longueur n'est pas numerique !!!!!",    "Track lenght must be a number !!!!!");
		put("Lancer la course",    "Launch the race");
		put("Lancer l'essai",    "Launch session");
		put("l'essai",    "the test");
		put("Lien vers l'image :",    "link to the picture :");
		put("Liste des tops",    "Top List");
		put("Longueur du circuit (m) :",    "Track Length (m) :");
		put("Modifier TOP",    "Modify TOP");
		put("Modifier",    "Modify");
		put("Nom de la course :",    "Name of the race :");
		put("Nom de l'essai :",    "Name of the test :");
		put("Nom de l'essai",    "Name of the test");
		put("Nom du circuit :",    "Name of the track :");
		put("Nom et prenom :",    "Name and first name :");
		put("Nombre de relai(s) incorrect",    "Incorrect number of relay(s)");
		put("Nombre de tour(s) incorrect !!!!!",    "Incorrect number of lap(s) !!!!!");
		put("Nombre de tour(s) par relai :",    "Number of laps by relay :");
		put("Nombre de tour(s) restant(s) :",      "Number of lap(s) left :");
		put("Nombre de tour(s)",    "Number of laps");
		put("Nombre de tours effectues :",    "Number of finished laps :");
		put("Nombre de tours maximum :",    "Number max of laps :");
		put("Numero de la voiture :",    "Car Number :");
		put("ou",    "or");
		put("Panneau de la voiture :",    "Car board");
		put("Par nombre de tours",    "Number of laps");
		put("Par temps",    "End time");
		put("Pilote actuel",    "Current pilot");
		put("Pilote au depart :",    "Pilot at first :");
		put("Pilote(s)",    "Racer(s)");
		put("Prenom",    "First name");
		put("Que souhaitez-vous faire ?",    "What do you want to do ?");
		put("Realise par Kavishan, Kevin, Philippe et Yann",    "Undertaken by Kavishan, Kevin, Philippe and Yann");
		put("Retour",    "Back");
		put("rien",    "nothing");
		put("Sauvegarder",    "Save");
		put("Seance d'essai",    "Test session");
		put("Seulement une case doit etre cochee",    "You must check only one box");
		put("Statistiques",    "Stats");
		put("STOP",    "STOP");
		put("Suivant",    "Next");
		put("Suppression",    "Deletion");
		put("Supprimer TOP",    "Delete TOP");
		put("Supprimer",    "Delete");
		put("sur",    "about");
		put("Temps :",    "Time :");
		put("Temps ecoule depuis le depart",    "Spent time since the departure");
		put("Temps ecoule",    "Spent time");
		put("Temps estime par tour :",    "Estimated time for a lap :");
		put("Temps par tour",    "Time for a lap");
		put("Temps restant a courir",    "Remaining time");
		put("Top depart pour toutes les voitures",    "Start for all cars");
		put("TOP",    "TOP");
		put("Tour",    "Lap");
		put("Type de fin :",    "End type :");
		put("Valider",    "Enter");
		put("Voiture activee",    "Activated car");
		put("Voiture(s)",    "Car(s)");
		put("Vous devez au moins avoir une voiture activee !!!!!",    "You must have at least one activated car !!!!!");
		put("Vous etes sur le point de lancer Chrono13",      "You are about to launch Chrono13");
		put("Vous n'avez aucun pilote",    "You have no pilot");
		put("Vous n'avez pas tout rempli !!!!!",    "You did not fill everything in !!!!!");
		put("Vous souhaitez :",    "You want :");
		put("Vue",    "View");
		put("",    "");
	}};

	public static final Hashtable<String, String> dico_allemand = new Hashtable<String,String>() {{
		put("Action",    "Aktie");
		put("Aide",    "Hilfe");
		put("Ajouter / Modifier",    "Hinzuf\u00FCgen / Modifizieren");
		put("Ajouter un evenement",    "Ein Ereignis hinzuf\u00FCgen");
		put("Ajouter un pilote",    "Ein Rennfahrer hinzuf\u00FCgen");
		put("Ajouter une course",    "Ein Rennen hinzuf\u00FCgen");
		put("Ajouter une voiture",    "Ein Auto hinzuf\u00FCgen");
		put("Ajouter",    "Hinzuf\u00FCgen");
		put("Allemand",    "Deutsch");
		put("Anglais",    "English");
		put("Annuler",     "Abbrechen");
		put("Attention ! Tous les tops associes seront supprimes",    "Achtung ! Alle vereigniten Tops werden beseitigt sein.");
		put("Attention",    "Achtung");
		put("Bienvenue",      "WillKommen");
		put("Caracteristiques de la voiture",    "Besonderheiten des Autos");
		put("Caracteristiques de l'essai",    "Testsbesonderheiten");
		put("Caracteristiques de l'essai",    "Versuchsbesonderheiten");
		put("Caracteristiques de l'evenement",    "Besonderheiten des Ereignis");
		put("Caracteristiques",    "Besonderheiten");
		put("Charger un evenement",    "Ein Ereignis laden");
		put("Charger une course",    "Ein Rennen laden");
		put("Choisir au moins un essai a lancer",     "W\u00E4hlen Sie mindesten einen Test zu laufen");
		put("Choix de la langue",    "Wahl der Sprache");
		put("Classement",    "Einordnen");
		put("Commentaires sur la course :",    "Kommentar auf der Renn");
		put("Commentaires",    "Rennenskomment\u00E4ren");
		put("Continuer", "Weitergehen");
		put("Couleur :",    "Farben :");
		put("Couleur du casque",    "Helm Farbe");
		put("Course",    "Rennen");
		put("Creer un evenement",    "Ein Ereignis schaffen");
		put("Creer une course",    "Ein Rennen schaffen");
		put("Creer une voiture",    "Ein Auto schaffen");
		put("Depart automatique",    "Automatisch Start");
		put("Duree consecutive maximum par pilote :",    "Maximal Konsecutiv Zeit f\u00FCr einen Rennfahrer :");
		put("Duree totale maximum par pilote :",    "Total maximal Zeit f\u00FCr einen Rennfahrer :");
		put("Edition",    "Ausgabe");
		put("Etat :",    "Stand :");
		put("Export Tableur",    "Tabelle Export");
		put("Fichier",    "Datei");
		put("Francais",    "Franz\u00F6sisch");
		put("Gestion de la course",    "Rennensverwaltung");
		put("Gestion de la course",    "Sie Wollen :");
		put("Heure actuelle",    "gegenw�rtige Stunde");
		put("Heure de debut :",    "Startzeit :");
		put("Heure de fin :",    "Endzeit :");
		put("Heure",    "Uhr");
		put("Image du pilote",    "Rennfahrersbild");
		put("Importer une voiture",    "Ein auto laden");
		put("Imprimer",    "Drucken");
		put("Informations concernant la course",    "Informationnen \u00FCber der Renn");
		put("Informations concernant l'essai",    "Informationnen \u00FCber den Test");
		put("Informations generales",    "Allgemeine Informationen");
		put("Informations pilotes",    "Informationnen \u00FCber dem Rennfahrer");
		put("Informations sur le pilote",    "Informationnen auf der Rennfahrer");
		put("Informations",    "Informationnen");
		put("La longueur n'est pas numerique !!!!!",    "Die Longe ist kein Numa !!!!!");
		put("Lancer la course",    "Die Rennen starten");
		put("Lancer l'essai",    "Die Versuch starten");
		put("l'essai",    "den Test");
		put("Lien vers l'image :",    "Link zum Bild :");
		put("Liste des tops",    "Toplist");
		put("Longueur du circuit (m) :",    "Longe des Umkreises (m) :");
		put("Modifier TOP",    "TOP modifizieren");
		put("Modifier",    "Modifizieren");
		put("Nom de la course :",    "Rennensname :");
		put("Nom de l'essai :",    "Testsname");
		put("Nom de l'essai",    "Versuchsname");
		put("Nom du circuit :",    "Spursname :");
		put("Nom et prenom :",    "Name und Vorname :");
		put("Nombre de relai(s) incorrect",    "Inkorrekt Relaisnuma(s)");
		put("Nombre de tour(s) / relais",    "Rundfahrtsanzahl");
		put("Nombre de tour(s) incorrect !!!!!",    "Inkorrekt Runderzahl !!!!!");
		put("Nombre de tour(s) par relai :",    "Runderzahl pro Relais :");
		put("Nombre de tour(s) restant(s) :",    "Runderzahl zu fahren :");
		put("Nombre de tours effectues :",    "Runderzahl gemacht :");
		put("Nombre de tours maximum :",    "Maximalrunderzahl :");
		put("Numero de la voiture :",    "Autosnuma :");
		put("ou",    "oder");
		put("Panneau de la voiture :",    "Autosinformationnen");
		put("Par nombre de tours",    "Von Runderzahl");
		put("Par temps",    "Von Zeit");
		put("Pilote actuel",    "Aktual Rennfahrer");
		put("Pilote au depart :",    "Zun\u00E4chst Rennfahrer :");
		put("Pilote(s)",    "Rennfahrer(n)");
		put("Prenom",    "Vorname");
		put("Que souhaitez-vous faire ?",    "Was wollen Sie tun ?");
		put("Realise par Kavishan, Kevin, Philippe et Yann",    "Ein Gesuch von Kavishan, Kevin, Philippe and Yann");
		put("Retour",    "Z\u00FCr\u00FCck");
		put("rien",    "nichts");
		put("Sauvegarder",    "Spreichern");
		put("Seance d'essai",    "Versuchssession");
		put("Seulement une case doit etre cochee",    "Sie M\u00FC nur ein Feld ankreuzen");
		put("Statistiques",    "Statistik");
		put("STOP",    "STOP");
		put("Suivant",    "Zun\u00E4chst");
		put("Suppression",    "Abschaffung");
		put("Supprimer TOP",    "TOP abschaffen");
		put("Supprimer",    "Abschaffen");
		put("Temps :",    "Zeit :");
		put("Temps ecoule depuis le depart",    "Zeit seit dem Start vergangen");
		put("Temps ecoule",    "Vergangen Zeit");
		put("Temps estime par tour :",    "geschatzte Zeit pro Zug :");
		put("Temps par tour",    "Runde");
		put("Temps restant a courir",    "Restaufzeit");
		put("Top depart pour toutes les voitures",    "Start f\u00FCr alle Autos");
		put("TOP",    "TOP");
		put("Tour",    "Runder");
		put("Type de fin :",    "Art der Ende :");
		put("Valider",    "Freigeben");
		put("Voiture activee",    "tetiges Auto");
		put("Voiture(s)",    "Auto(s)");
		put("Vous devez au moins avoir une voiture activee !!!!!",    "Sie m\u00FCssen mindesten ein activiertes Auto haben !!!!!");
		put("Vous etes sur le point de lancer Chrono13",      "Sie Fortgehen, um Chrono13 zu starten");
		put("Vous n'avez aucun pilote",    "Sie haben kein Rennfahrer");
		put("Vous n'avez pas tout rempli !!!!!",    "Sie haben nicht alles ausgef�llt !!!!!");
		put("Vous souhaitez :",    "Sie wollen :");
		put("Vue",    "Ansicht");
	}};


	public static final Hashtable<String, String> dico_francais = new Hashtable<String,String>() {{
		put("Action",    "Action");
		put("Aide",    "Aide");
		put("Ajouter / Modifier",    "Ajouter / Modifier");
		put("Ajouter un evenement",    "Ajouter un \u00E9v\u00E9nement");
		put("Ajouter un pilote",    "Ajouter un pilote");
		put("Ajouter une course",    "Ajouter une course");
		put("Ajouter une voiture",    "Ajouter une voiture");
		put("Ajouter",    "Ajouter");
		put("Allemand",    "Allemand");
		put("Anglais",    "Anglais");
		put("Annuler",     "Annuler");
		put("Attention ! Tous les tops associes seront supprimes",    "Attention ! Tous les tops associ\u00E9s seront supprim\u00E9s.");
		put("Attention",    "Attention");
		put("Bienvenue",      "Bienvenue");
		put("Caracteristiques de la voiture",    "Caract\u00E9ristiques de la voiture");
		put("Caracteristiques de l'essai",    "Caract\u00E9ristiques de l'essai");
		put("Caracteristiques de l'essai",    "Caract\u00E9ristiques de l'essai");
		put("Caracteristiques de l'evenement",    "Caract\u00E9ristiques de l'\u00E9v\u00E9nement");
		put("Caracteristiques",    "Caract\u00E9ristiques");
		put("Charger un evenement",    "Charger un \u009Ev\u009Enement");
		put("Charger un evenement",    "Charger un \u00E9v\u00E9nement");
		put("Choisir au moins un essai a lancer",    "Choisir au moins un essai a lancer");
		put("Choix de la langue",    "Choix de la langue");
		put("Classement",    "Classement");
		put("Commentaires sur la course :",    "Commentaires sur la course :");
		put("Commentaires sur l'essai :",    "Commentaires sur l'essai :");
		put("Commentaires",    "Commentaires");
		put("Continuer", "Continuer");
		put("Couleur :",    "Couleur :");
		put("Couleur du casque",    "Couleur du casque");
		put("Course",    "Course");
		put("Creer un evenement",    "Cr\u00E9er un \u00E9v\u00E9nement");
		put("Creer une course :",    "Cr\u00E9er une course :");
		put("Creer une voiture",    "Cr\u00E9er une Voiture");
		put("Depart automatique",    "D\u00E9part automatique");
		put("Duree consecutive maximum par pilote :",    "Dur\u00E9e cons\u00E9cutive maximum par pilote :");
		put("Duree totale maximum par pilote :",    "Dur\u00E9e totale maximum par pilote :");
		put("Edition",    "Edition");
		put("Etat :",    "Etat :");
		put("Export Tableur",    "Export Tableur");
		put("Fichier",    "Fichier");
		put("Francais",    "Fran\u00E7ais");
		put("Gestion de la course",    "Gestion de la course");
		put("Gestion de la course",    "Gestion de la course");
		put("Heure actuelle",    "Heure actuelle");
		put("Heure de debut :",    "Heure de d\u00E9but :");
		put("Heure de fin :",    "Heure de fin :");
		put("Heure",    "Heure");
		put("Image du pilote",    "Image du pilote");
		put("Importer une voiture",    "Importer une voiture");
		put("Imprimer",    "Imprimer");
		put("Informations concernant la course",    "Informations concernant la course");
		put("Informations concernant l'essai",    "Informations concernant l'essai");
		put("Informations generales",    "Informations g\u00E9n\u00E9rales");
		put("Informations pilotes",    "Informations pilotes");
		put("Informations sur le pilote",    "Informations sur le pilote");
		put("Informations",    "Informations");
		put("la course",    "la course");
		put("La longueur n'est pas numerique !!!!!",    "La longueur n'est pas num\u00E9rique !!!!!");
		put("Lancer la course",    "Lancer la course");
		put("Lancer l'essai",    "Lancer l'essai");
		put("l'essai",    "l'essai");
		put("Lien vers l'image :",    "Lien vers l'image :");
		put("Liste des tops",    "Liste des tops");
		put("Longueur du circuit (m) :",    "Longueur du circuit (m) :");
		put("Modifier TOP",    "Modifier TOP");
		put("Modifier",    "Modifier");
		put("Nom de la course :",    "Nom de la course :");
		put("Nom de l'essai :",    "Nom de l'essai :");
		put("Nom du circuit :",    "Nom du circuit :");
		put("Nom et prenom :",    "Nom et pr\u00E9nom :");
		put("Nombre de relai(s) incorrect",    "Nombre de relai(s) incorrect");
		put("Nombre de tour(s) incorrect !!!!!",    "Nombre de tour(s) incorrect !!!!!");
		put("Nombre de tour(s) par relai :",    "Nombre de tour(s) par relai :");
		put("Nombre de tour(s) restant(s) :",    "Nombre de tour(s) restant(s) :");
		put("Nombre de tour(s)",    "Nombre de tour(s)");
		put("Nombre de tours effectues :",    "Nombre de tours effectu\u00E9s :");
		put("Nombre de tours maximum :",    "Nombre de tours maximum :");
		put("Numero de la voiture :",    "Num\u00E9ro de la voiture :");
		put("ou",    "ou");
		put("Panneau de la voiture :",    "Panneau de la voiture :");
		put("Par nombre de tours",    "Par nombre de tours");
		put("Par temps",    "Par temps");
		put("Pilote actuel",    "Pilote actuel");
		put("Pilote au depart :",    "Pilote au d\u00E9part :");
		put("Pilote(s)",    "Pilote(s)");
		put("Prenom",    "Pr\u00E9nom");
		put("Que souhaitez-vous faire ?",    "Que souhaitez-vous faire ?");
		put("Realise par Kavishan, Kevin, Philippe et Yann",    "R\u00E9alis\u00E9 par Kavishan, Kevin, Philippe et Yann");
		put("Retour",    "Retour");
		put("rien",    "rien");
		put("Sauvegarder",    "Sauvegarder");
		put("Seance d'essai",    "S\u00E9ance d'essai");
		put("Seulement une case doit etre cochee",    "Seulement une case doit \u00EAtre coch\u00E9e");
		put("Statistiques",    "Statistiques");
		put("STOP",    "STOP");
		put("Suivant",    "Suivant");
		put("Suppression",    "Suppression");
		put("Supprimer TOP",    "Supprimer TOP");
		put("Supprimer",    "Supprimer");
		put("sur",    "sur");
		put("Temps :",    "Temps :");
		put("Temps ecoule depuis le depart",    "Temps \u00E9coul\u00E9 depuis le d\u00E9part");
		put("Temps ecoule",    "Temps \u00E9coul\u00E9");
		put("Temps estime par tour :",    "Temps estim\u00E9 par tour :");
		put("Temps par tour",    "Temps par tour");
		put("Temps restant a courir",    "Temps restant a courir");
		put("Top depart pour toutes les voitures",    "Top d\u00E9part pour toutes les voitures");
		put("TOP",    "TOP");
		put("Tour",    "Tour");
		put("Type de fin :",    "Type de fin :");
		put("Valider",    "Valider");
		put("Voiture activee",    "Voiture activ\u00E9e");
		put("Voiture(s)",    "Voiture(s)");
		put("Vous devez au moins avoir une voiture activee !!!!!",    "Vous devez au moins avoir une voiture activ\u00E9e !!!!!");
		put("Vous etes sur le point de lancer Chrono13",      "Vous \u00EAtes sur le point de lancer Chrono13");
		put("Vous n'avez aucun pilote",    "Vous n'avez aucun pilote");
		put("Vous n'avez pas tout rempli !!!!!",    "Vous n'avez pas tout rempli !!!!!");
		put("Vous souhaitez :",    "Vous souhaitez :");
		put("Vue",    "Vue");
		put("",    "");
	}};

	// fonction permettant de retourner un mot dans la langue que l'utilisateur souhaite
		public static String dansLedico(String base, String langues){
			String resultat = "";
			if (langue == "English") {
				resultat = dico_anglais.get(base);
			}
			else if (langue == "Deutsch") {
				resultat = dico_allemand.get(base);
			}
			else {
				resultat = dico_francais.get(base);
			}
			return resultat;
		}
		
		public static void langueSystem(String langue){
			if (langue == "English") {
				Locale.setDefault(Locale.ENGLISH);
				UIManager.getDefaults().setDefaultLocale(Locale.ENGLISH);
				JComponent.setDefaultLocale(Locale.ENGLISH);
			}
			else if (langue == "Deutsch") {
				Locale.setDefault(Locale.GERMAN);
				UIManager.getDefaults().setDefaultLocale(Locale.GERMAN);
				JComponent.setDefaultLocale(Locale.GERMAN);
			}
			else {
				Locale.setDefault(Locale.FRENCH);
				UIManager.getDefaults().setDefaultLocale(Locale.FRENCH);
				JComponent.setDefaultLocale(Locale.FRENCH);
			}
		}
}