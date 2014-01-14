package principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *@author Blanchard Kévin /Ganeshamoorthy Kavishan/ Leroy Philippe/Veillot Yann
 *
 */

@XmlRootElement
public class Evenement {
	
	private String even_nom;
	private String even_nom_circuit;
	private int even_longueur_circuit;
	private List<Voiture> voitures = new ArrayList <Voiture>();
	private List<Essai> essais = new ArrayList <Essai>();
	private Course c;
	
	public Evenement() {// constructeur d'un evenement
		this.even_nom="";
		this.even_nom_circuit="";
		this.even_longueur_circuit=0;
		
	}
	
	public String getEven_nom() {// retourne le nom de l'evenement
		return even_nom;
	}
	public void setEven_nom(String even_nom) {// on fixe le nom de l'evenement
		this.even_nom = even_nom;
	}

	public String getEven_nom_circuit() {// retourne le nom du circuit
		return even_nom_circuit;
	}

	public void setEven_nom_circuit(String even_nom_circuit) {// on fixe le nom du circuit
		this.even_nom_circuit = even_nom_circuit;
	}

	public int getEven_longueur_circuit() {// retourne la longueur du circuit
		return even_longueur_circuit;
	}

	public void setEven_longueur_circuit(int even_longueur_circuit) {// fixe la longueur du circuit
		this.even_longueur_circuit = even_longueur_circuit;
	}

	@XmlElement
	public List<Voiture> getVoitures() {// retourne la liste des voitures
		return voitures;
	}

	public void setVoitures(List<Voiture> voitures) {// on fixe la liste des voitures
		this.voitures = voitures;
	}

	@XmlElement
	public List<Essai> getEssais() {// retourne la liste des essais
		return essais;
	}

	public void setEssais(List<Essai> essais) {// fixe la liste des essais
		this.essais = essais;
	}

	@XmlElement
	public Course getC() {// on recupere la course 
		return c;
	}

	public void setC(Course c) {// on fixe la cource c a l'evenement
		this.c = c;
	}
	
	public boolean listVoitureVide (){// verifie si la liste des voitures est vide?
		return this.voitures.isEmpty();
	}
	
	public boolean listEssaiVide (){// verifie si la liste des essais est vide?
		return this.essais.isEmpty();
	}
	
	public void ajouterVoiture (Voiture v) {// ajoute une voiture a la liste des voitures
		this.voitures.add(v);
	}
	
	public void supprimerVoiture (Voiture v) {//retire de la liste de voitures la voiture v
		this.voitures.remove(v);
	}
	
	public void ajouterEssai (Essai e) {// ajoute un essai e a la liste des essais de l'evenement
		this.essais.add(e);
	}
	
	public void supprimerEssai (Essai e) {// supprime l'essai de la liste des essais
		this.essais.remove(e);
	}
	
	public boolean auMoinsuneVoitureActive() {// verifie si une fonction au moin est active.
		if (this.listVoitureVide()){
			return false;
		}
		else {
			Voiture voiture = new Voiture();
			Iterator <Voiture> it = this.getVoitures().iterator();
			while(it.hasNext()){
				voiture = it.next();
				if (voiture.isVoiture_active()) {
					return true;
				}
			}
		}
		return false;
	}
	
}
