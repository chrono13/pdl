package principal;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 *@author Blanchard Kévin /Ganeshamoorthy Kavishan/ Leroy Philippe/Veillot Yann
 *
 */

public class Pilote {
	private String pilote_nomprenom;
	private String pilote_couleur;
	private String pilote_lien_sur_img;
	
	public Pilote() {
		
	}
	// constructeur Pilote avec arguments
	public Pilote (String nom, String couleur, String lien) {
		this.pilote_couleur = couleur;
		this.pilote_lien_sur_img = lien;
		this.pilote_nomprenom = nom;
	}

	// getter et setter class Pilote

	public String getPilote_nomprenom() {
		return pilote_nomprenom;
	}

	public void setPilote_nomprenom(String pilote_nomprenom) {
		this.pilote_nomprenom = pilote_nomprenom;
	}

	public String getPilote_couleur() {
		return pilote_couleur;
	}

	public void setPilote_couleur(String pilote_couleur) {
		this.pilote_couleur = pilote_couleur;
	}

	public String getPilote_lien_sur_img() {
		return pilote_lien_sur_img;
	}

	public void setPilote_lien_sur_img(String pilote_lien_sur_img) {
		this.pilote_lien_sur_img = pilote_lien_sur_img;
	}
	
	
	public void modifer_Pilote (String nom, String couleur, String lien) {
		this.pilote_couleur = couleur;
		this.pilote_lien_sur_img = lien;
		this.pilote_nomprenom = nom;
	}
	

}
