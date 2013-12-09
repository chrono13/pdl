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
		put("Bienvenue",      "Welcome");
		put("Vous etes sur le point de lancer Chrono13",      "You are about to launch Chrono13");
		put("Annuler",     "Cancel");
		put("Continuer", "Continue");
		put("Choix de la langue",    "Choose your language");
		put("Francais",    "French");
		put("Allemand",    "German");
		put("Anglais",    "English");
		put("Valider",    "Enter");
		put("Creer une course",    "Create a race");
		put("Creer une voiture",    "Create a car");
		put("Gestion de la course",    "Race management");
		put("Vous souhaitez :",    "You want :");
		put("Ajouter une course",    "Add a race");
		put("Charger une course",    "Load a race");
		put("Retour",    "Back");
		put("Course",    "Race");
		put("Caracteristiques",    "Features");
		put("Nom de la course :",    "Name of the race :");
		put("Nom du circuit :",    "Name of the track :");
		put("Longueur du circuit (m) :",    "Track Length (m) :");
		put("Voiture(s)",    "Car(s)");
		put("Seance d'essai",    "Test session");
		put("Importer une voiture",    "Load a car");
		put("Lancer l'essai",    "Launch session");
		put("Lancer la course",    "Launch the race");
		put("Sauvegarder",    "Save");
		put("Suppression",    "Deletion");
		put("Attention ! Tous les tops associes seront supprimes",    "Be careful ! All associated tops will be deleted too.");
		put("Ajouter une voiture",    "Add a car");
		put("Numero de la voiture :",    "Car Number :");
		put("Couleur :",    "Color :");
		put("Image du pilote",    "Pilot's picture");
		put("Voiture activee",    "Activated car");
		put("Nombre de tour(s)",    "Number of laps");
		put("Temps estime par tour :",    "Estimated time for a lap :");
		put("Pilote(s)",    "Racer(s)");
		put("Pilote au depart :",    "Pilot at first :");
		put("Ajouter un pilote",    "Add a pilot");
		put("Informations sur le pilote",    "Pilot informations");
		put("Nom et prenom :",    "Name and first name :");
		put("Couleur du casque",    "Helmet's color");
		put("Ajouter / Modifier",    "Add / Modify");
		put("Caracteristiques de l'essai",    "Test features");
		put("Heure de debut :",    "Post time :");
		put("Heure de fin :",    "End time :");
		put("Depart automatique",    "Automatic start");
		put("Type de fin :",    "End type :");
		put("Par nombre de tours",    "Number of laps");
		put("ou",    "or");
		put("Par temps",    "End time");
		put("Nombre de tours maximum :",    "Number max of laps :");
		put("Duree totale maximum par pilote :",    "Total maximum duration for a pilot :");
		put("Duree consecutive maximum par pilote :",    "Successive maximum duration for a pilot :");
		put("Commentaires sur la course :",    "Comments about the race :");
		put("Informations concernant l'essai",    "Test informations");
		put("Informations concernant la course",    "Race informations");
		put("Fichier",    "File");
		put("Edition",    "Edit");
		put("Vue",    "View");
		put("Aide",    "Help");
		put("Temps",    "Time");
		put("Heure",    "Hour");
		put("Temps ecoule depuis le depart",    "Spent time since the departure");
		put("Nombre de tour(s) restant(s) :",      "Number of lap(s) left :");
		put("Temps restant a courir",    "Remaining time");
		put("TOP",    "TOP");
		put("Temps par tour",    "Time for a lap");
		put("STOP",    "STOP");
		put("Informations pilotes",    "About pilots");
		put("Panneau de la voiture",    "Car board");
		put("Etat",    "State");
		put("Informations",    "Informations");
		put("Pilote actuel",    "Current pilot");
		put("Nombre de tour(s) par relai :",    "Number of laps by relay :");
		put("Nombre de tours effectues :",    "Number of finished laps :");
		put("Liste des tops",    "Top List");
		put("Statistiques",    "Stats");
		put("Suivant",    "Next");
		put("Realise par Kavishan, Kevin, Philippe et Yann",    "Undertaken by Kavishan, Kevin, Philippe and Yann");
		put("Ajouter un evenement",    "Add an event");
		put("Creer un evenement",    "Create an event");
		put("Nom de l'essai",    "Name of the test");
		put("Commentaires sur l'essai :",    "Comments about the test :");
		put("Prenom",    "First name");
		put("Commentaires",    "Comments");
		put("sur",    "about");
		put("la course",    "the race");
		put("La longueur n'est pas numerique !!!!!",    "Track lenght must be a number !!!!!");
		put("l'essai",    "the test");
		put("Nom de l'essai :",    "Name of the test :");
		put("Caracteristiques de l'essai",    "Test's features");
		put("Ajouter",    "Add");
		put("Supprimer",    "Delete");
		put("Modifier",    "Modify");
		put("Caracteristiques de l'evenement",    "Features of the event");
		put("Que souhaitez-vous faire ?",    "What do you want to do ?");
		put("Charger un evenement",    "Load an event");
		put("Caracteristiques de la voiture",    "Features of the car");
		put("Lien vers l'image :",    "link to the picture :");
		put("Attention",    "Be Careful");
		put("Vous n'avez pas tout rempli !!!!!",    "You did not fill everything in !!!!!");
		put("Nombre de relai(s) incorrect",    "Incorrect number of relay(s)");
		put("Vous devez au moins avoir une voiture activee !!!!!",    "You must have at least one activated car !!!!!");
		put("Vous n'avez aucun pilote",    "You have no pilot");
		put("rien",    "nothing");
		put("Action",    "Action");
		put("Classement",    "Ranking");
		put("Heure actuelle",    "Current hour");
		put("Temps ecoule",    "Spent time");
		put("Informations generales",    "General informations");
		put("Tour",    "Lap");
		put("Top depart pour toutes les voitures",    "Start for all cars");
		put("",    "");
		put("",    "");
		put("",    "");
		put("",    "");
	}};

	public static final Hashtable<String, String> dico_allemand = new Hashtable<String,String>() {{
		put("Bienvenue",      "WillKommen");
		put("Vous etes sur le point de lancer Chrono13",      "Sie Fortgehen, um Chrono13 zu starten");
		put("Annuler",     "Abbrechen");
		put("Continuer", "Weitergehen");
		put("Choix de la langue",    "Wahl der Sprache");
		put("Francais",    "Franz\u00F6sisch");
		put("Allemand",    "Deutsch");
		put("Anglais",    "English");
		put("Valider",    "Freigeben");
		put("Vous souhaitez :",    "Sie wollen :");
		put("Creer une course",    "Ein Rennen schaffen");
		put("Creer une voiture",    "Ein Auto schaffen");
		put("Gestion de la course",    "Rennensverwaltung");
		put("Gestion de la course",    "Sie Wollen :");
		put("Ajouter une course",    "Ein Rennen hinzuf\u00FCgen");
		put("Charger une course",    "Ein Rennen laden");
		put("Retour",    "Z\u00FCr\u00FCck");
		put("Course",    "Rennen");
		put("Caracteristiques",    "Besonderheiten");
		put("Nom de la course :",    "Rennensname :");
		put("Nom du circuit :",    "Spursname :");
		put("Longueur du circuit (m) :",    "Longe des Umkreises (m) :");
		put("Voiture(s)",    "Auto(s)");
		put("Seance d'essai",    "Versuchssession");
		put("Importer une voiture",    "Ein auto laden");
		put("Lancer l'essai",    "Die Versuch starten");
		put("Lancer la course",    "Die Rennen starten");
		put("Sauvegarder",    "Spreichern");
		put("Suppression",    "Abschaffung");
		put("Attention ! Tous les tops associes seront supprimes",    "Achtung ! Alle vereigniten Tops werden beseitigt sein.");
		put("Ajouter une voiture",    "Ein Auto hinzuf\u00FCgen");
		put("Numero de la voiture :",    "Autosnuma :");
		put("Couleur :",    "Farben :");
		put("Image du pilote",    "Rennfahrersbild");
		put("Voiture activee",    "tetiges Auto");
		put("Nombre de tour(s) / relais",    "Rundfahrtsanzahl");
		put("Temps estime par tour :",    "geschatzte Zeit pro Zug :");
		put("Pilote(s)",    "Rennfahrer(n)");
		put("Pilote au depart :",    "Zun\u00E4chst Rennfahrer :");
		put("Ajouter un pilote",    "Ein Rennfahrer hinzuf\u00FCgen");
		put("Informations sur le pilote",    "Informationnen auf der Rennfahrer");
		put("Nom et prenom :",    "Name und Vorname :");
		put("Couleur du casque",    "Helm Farbe");
		put("Ajouter / Modifier",    "Hinzuf\u00FCgen / Modifizieren");
		put("Caracteristiques de l'essai",    "Versuchsbesonderheiten");
		put("Heure de debut :",    "Startzeit :");
		put("Heure de fin :",    "Endzeit :");
		put("Depart automatique",    "Automatisch Start");
		put("Type de fin :",    "Art der Ende :");
		put("Par nombre de tours",    "Von Runderzahl");
		put("ou",    "oder");
		put("Par temps",    "Von Zeit");
		put("Nombre de tours maximum :",    "Maximalrunderzahl :");
		put("Duree totale maximum par pilote :",    "Total maximal Zeit f\u00FCr einen Rennfahrer :");
		put("Duree consecutive maximum par pilote :",    "Maximal Konsecutiv Zeit f\u00FCr einen Rennfahrer :");
		put("Commentaires sur la course :",    "Kommentar auf der Renn");
		put("Informations concernant l'essai",    "Informationnen \u00FCber den Test");
		put("Informations concernant la course",    "Informationnen \u00FCber der Renn");
		put("Fichier",    "Datei");
		put("Edition",    "Ausgabe");
		put("Vue",    "Ansicht");
		put("Aide",    "Hilfe");
		put("Temps",    "Zeit");
		put("Heure",    "Uhr");
		put("Temps ecoule depuis le depart",    "Zeit seit dem Start vergangen");
		put("Temps restant a courir",    "Restaufzeit");
		put("TOP",    "TOP");
		put("Temps par tour",    "Runde");
		put("STOP",    "STOP");
		put("Informations pilotes",    "Informationnen \u00FCber dem Rennfahrer");
		put("Panneau de la voiture",    "Autosinformationnen");
		put("Etat",    "Stand");
		put("Informations",    "Informationnen");
		put("Pilote actuel",    "Aktual Rennfahrer");
		put("Nombre de tour(s) par relai :",    "Runderzahl pro Relais :");
		put("Nombre de tours effectues :",    "Runderzahl gemacht :");
		put("Liste des tops",    "Toplist");
		put("Statistiques",    "Statistik");
		put("Suivant",    "Zun\u00E4chst");
		put("Realise par Kavishan, Kevin, Philippe et Yann",    "Ein Gesuch von Kavishan, Kevin, Philippe and Yann");
		put("Ajouter un evenement",    "Ein Ereignis hinzuf\u00FCgen");
		put("Creer un evenement",    "Ein Ereignis schaffen");
		put("Nom de l'essai",    "Versuchsname");
		put("Prenom",    "Vorname");
		put("Commentaires",    "Rennenskomment\u00E4ren");
		put("La longueur n'est pas numerique !!!!!",    "Die Longe ist kein Numa !!!!!");
		put("l'essai",    "den Test");
		put("Nom de l'essai :",    "Testsname");
		put("Caracteristiques de l'essai",    "Testsbesonderheiten");
		put("Ajouter",    "Hinzuf\u00FCgen");
		put("Supprimer",    "Abschaffen");
		put("Modifier",    "Modifizieren");
		put("Caracteristiques de l'evenement",    "Besonderheiten des Ereignis");
		put("Que souhaitez-vous faire ?",    "Was wollen Sie tun ?");
		put("Charger un evenement",    "Ein Ereignis laden");
		put("Caracteristiques de la voiture",    "Besonderheiten des Autos");
		put("Lien vers l'image :",    "Link zum Bild :");
		put("Attention",    "Achtung");
		put("Vous n'avez pas tout rempli !!!!!",    "Sie haben nicht alles ausgefüllt !!!!!");
		put("Nombre de relai(s) incorrect",    "Inkorrekt Relaisnuma(s)");
		put("Vous devez au moins avoir une voiture activee !!!!!",    "Sie m\u00FCssen mindesten ein activiertes Auto haben !!!!!");
		put("Vous n'avez aucun pilote",    "Sie haben kein Rennfahrer");
		put("rien",    "nichts");
		put("Action",    "Aktie");
		put("Classement",    "Einordnen");
		put("Heure actuelle",    "gegenwärtige Stunde");
		put("Temps ecoule",    "Vergangen Zeit");
		put("Nombre de tour(s) restant(s) :",    "Runderzahl zu fahren :");
		put("Informations generales",    "Allgemeine Informationen");
		put("Tour",    "Runder");
		put("Top depart pour toutes les voitures",    "Start f\u00FCr alle Autos");
		put("",    "");
		put("",    "");
	}};


	public static final Hashtable<String, String> dico_francais = new Hashtable<String,String>() {{
		put("Bienvenue",      "Bienvenue");
		put("Vous etes sur le point de lancer Chrono13",      "Vous \u00EAtes sur le point de lancer Chrono13");
		put("Annuler",     "Annuler");
		put("Continuer", "Continuer");
		put("Choix de la langue",    "Choix de la langue");
		put("Francais",    "Fran\u00E7ais");
		put("Allemand",    "Allemand");
		put("Anglais",    "Anglais");
		put("Valider",    "Valider");
		put("Vous souhaitez :",    "Vous souhaitez :");
		put("Creer une course :",    "Cr\u00E9er une course :");
		put("Creer une voiture",    "Cr\u00E9er une Voiture");
		put("Gestion de la course",    "Gestion de la course");
		put("Gestion de la course",    "Gestion de la course");
		put("Ajouter une course",    "Ajouter une course");
		put("Charger un evenement",    "Charger un \u009Ev\u009Enement");
		put("Retour",    "Retour");
		put("Course",    "Course");
		put("Caracteristiques",    "Caract\u00E9ristiques");
		put("Nom de la course :",    "Nom de la course :");
		put("Nom du circuit :",    "Nom du circuit :");
		put("Longueur du circuit (m) :",    "Longueur du circuit (m) :");
		put("Voiture(s)",    "Voiture(s)");
		put("Seance d'essai",    "S\u00E9ance d'essai");
		put("Importer une voiture",    "Importer une voiture");
		put("Lancer l'essai",    "Lancer l'essai");
		put("Lancer la course",    "Lancer la course");
		put("Sauvegarder",    "Sauvegarder");
		put("Suppression",    "Suppression");
		put("Attention ! Tous les tops associes seront supprimes",    "Attention ! Tous les tops associ\u00E9s seront supprim\u00E9s.");
		put("Ajouter une voiture",    "Ajouter une voiture");
		put("Numero de la voiture :",    "Num\u00E9ro de la voiture :");
		put("Couleur :",    "Couleur :");
		put("Lien vers l'image :",    "Lien vers l'image :");
		put("Voiture activee",    "Voiture activ\u00E9e");
		put("Nombre de tour(s)",    "Nombre de tour(s)");
		put("Temps estime par tour :",    "Temps estim\u00E9 par tour :");
		put("Pilote(s)",    "Pilote(s)");
		put("Pilote au depart :",    "Pilote au depart :");
		put("Ajouter un pilote",    "Ajouter un pilote");
		put("Informations sur le pilote",    "Informations sur le pilote");
		put("Nom et prenom :",    "Nom et pr\u00E9nom :");
		put("Couleur du casque",    "Couleur du casque");
		put("Ajouter / Modifier",    "Ajouter / Modifier");
		put("Caracteristiques de l'essai",    "Caract\u00E9ristiques de l'essai");
		put("Heure de debut :",    "Heure de d\u00E9but :");
		put("Heure de fin :",    "Heure de fin :");
		put("Depart automatique",    "D\u00E9part automatique");
		put("Type de fin :",    "Type de fin :");
		put("Par nombre de tours",    "Par nombre de tours");
		put("ou",    "ou");
		put("Par temps",    "Par temps");
		put("Nombre de tours maximum :",    "Nombre de tours maximum :");
		put("Duree totale maximum par pilote :",    "Dur\u00E9e totale maximum par pilote :");
		put("Duree consecutive maximum par pilote :",    "Dur\u00E9e cons\u00E9cutive maximum par pilote :");
		put("Commentaires sur la course :",    "Commentaires sur la course :");
		put("Informations concernant l'essai",    "Informations concernant l'essai");
		put("Informations concernant la course",    "Informations concernant la course");
		put("Fichier",    "Fichier");
		put("Edition",    "Edition");
		put("Vue",    "Vue");
		put("Aide",    "Aide");
		put("Temps",    "Temps");
		put("Heure",    "Heure");
		put("Temps ecoule depuis le depart",    "Temps \u00E9coul\u00E9 depuis le d\u00E9part");
		put("Temps restant a courir",    "Temps restant a courir");
		put("TOP",    "TOP");
		put("Temps par tour",    "Temps par tour");
		put("STOP",    "STOP");
		put("Informations pilotes",    "Informations pilotes");
		put("Panneau de la voiture",    "Panneau de la voiture");
		put("Etat",    "Etat");
		put("Informations",    "Informations");
		put("Pilote actuel",    "Pilote actuel");
		put("Nombre de tour(s) par relai :",    "Nombre de tour(s) par relai :");
		put("Nombre de tours effectues :",    "Nombre de tours effectu\u00E9s :");
		put("Liste des tops",    "Liste des tops");
		put("Statistiques",    "Statistiques");
		put("Suivant",    "Suivant");
		put("Realise par Kavishan, Kevin, Philippe et Yann",    "R\u00E9alis\u00E9 par Kavishan, Kevin, Philippe et Yann");
		put("Ajouter un evenement",    "Ajouter un \u00E9v\u00E9nement");
		put("Creer un evenement",    "Cr\u00E9er un \u00E9v\u00E9nement");
		put("Nom de l'essai :",    "Nom de l'essai :");
		put("Commentaires sur l'essai :",    "Commentaires sur l'essai :");
		put("Prenom",    "Pr\u00E9nom");
		put("Commentaires",    "Commentaires");
		put("sur",    "sur");
		put("la course",    "la course");
		put("La longueur n'est pas numerique !!!!!",    "La longueur n'est pas num\u00E9rique !!!!!");
		put("Image du pilote",    "Image du pilote");
		put("l'essai",    "l'essai");
		put("Caracteristiques de l'essai",    "Caract\u00E9ristiques de l'essai");
		put("Ajouter",    "Ajouter");
		put("Supprimer",    "Supprimer");
		put("Modifier",    "Modifier");
		put("Caracteristiques de l'evenement",    "Caract\u00E9ristiques de l'\u00E9v\u00E9nement");
		put("Que souhaitez-vous faire ?",    "Que souhaitez-vous faire ?");
		put("Caracteristiques de la voiture",    "Caract\u00E9ristiques de la voiture");
		put("Charger un evenement",    "Charger un \u00E9v\u00E9nement");
		put("Attention",    "Attention");
		put("Vous n'avez pas tout rempli !!!!!",    "Vous n'avez pas tout rempli !!!!!");
		put("Nombre de relai(s) incorrect",    "Nombre de relai(s) incorrect");
		put("Vous devez au moins avoir une voiture activee !!!!!",    "Vous devez au moins avoir une voiture activ\u00E9e !!!!!");
		put("Vous n'avez aucun pilote",    "Vous n'avez aucun pilote");
		put("rien",    "rien");
		put("Action",    "Action");
		put("Classement",    "Classement");
		put("Heure actuelle",    "Heure actuelle");
		put("Temps ecoule",    "Temps \u00E9coul\u00E9");
		put("Nombre de tour(s) restant(s) :",    "Nombre de tour(s) restant(s) :");
		put("Informations generales",    "Informations g\u00E9n\u00E9rales");
		put("Tour",    "Tour");
		put("Top depart pour toutes les voitures",    "Top d\u00E9part pour toutes les voitures");
		put("",    "");
		put("",    "");
		put("",    "");
		put("",    "");
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