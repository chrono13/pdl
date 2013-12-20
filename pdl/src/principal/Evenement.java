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
	
	public Evenement() {
		this.even_nom="";
		this.even_nom_circuit="";
		this.even_longueur_circuit=0;
		
	}
	
	public String getEven_nom() {
		return even_nom;
	}
	public void setEven_nom(String even_nom) {
		this.even_nom = even_nom;
	}

	public String getEven_nom_circuit() {
		return even_nom_circuit;
	}

	public void setEven_nom_circuit(String even_nom_circuit) {
		this.even_nom_circuit = even_nom_circuit;
	}

	public int getEven_longueur_circuit() {
		return even_longueur_circuit;
	}

	public void setEven_longueur_circuit(int even_longueur_circuit) {
		this.even_longueur_circuit = even_longueur_circuit;
	}

	@XmlElement
	public List<Voiture> getVoitures() {
		return voitures;
	}

	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}

	@XmlElement
	public List<Essai> getEssais() {
		return essais;
	}

	public void setEssais(List<Essai> essais) {
		this.essais = essais;
	}

	@XmlElement
	public Course getC() {
		return c;
	}

	public void setC(Course c) {
		this.c = c;
	}
	
	public boolean listVoitureVide (){
		return this.voitures.isEmpty();
	}
	
	public boolean listEssaiVide (){
		return this.essais.isEmpty();
	}
	
	public void ajouterVoiture (Voiture v) {
		this.voitures.add(v);
	}
	
	public void supprimerVoiture (Voiture v) {
		this.voitures.remove(v);
	}
	
	public void ajouterEssai (Essai e) {
		this.essais.add(e);
	}
	
	public void supprimerEssai (Essai e) {
		this.essais.remove(e);
	}
	
	public boolean auMoinsuneVoitureActive() {
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
