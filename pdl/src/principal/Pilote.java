package principal;


/**
 *@author Blanchard Kévin /Ganeshamoorthy Kavishan/ Leroy Philippe/Veillot Yann
 *
 */

public class Pilote {
	private String pilote_nomprenom;
	private String pilote_couleur;
	private String pilote_lien_sur_img;
	
	public Pilote() {
		// constructeur vide
	}
	
	public Pilote (String nom, String couleur, String lien) {// constructeur Pilote avec arguments
		this.pilote_couleur = couleur;
		this.pilote_lien_sur_img = lien;
		this.pilote_nomprenom = nom;
	}

	// getter et setter class Pilote
	public String getPilote_nomprenom() {// recupere le nom et prenom du pilote
		return pilote_nomprenom;
	}

	public void setPilote_nomprenom(String pilote_nomprenom) {// fixe le nom et prenom du pilote
		this.pilote_nomprenom = pilote_nomprenom;
	}

	public String getPilote_couleur() {// recupere la couleur du pilote
		return pilote_couleur;
	}

	public void setPilote_couleur(String pilote_couleur) {// fixe la couleur du pilote
		this.pilote_couleur = pilote_couleur;
	}

	public String getPilote_lien_sur_img() {// recupere le lien de l'image du pilote
		return pilote_lien_sur_img;
	}

	public void setPilote_lien_sur_img(String pilote_lien_sur_img) {// on fixe le lien image du pilote
		this.pilote_lien_sur_img = pilote_lien_sur_img;
	}
	
	
	public void modifer_Pilote (String nom, String couleur, String lien) {// fonction de modification du pilote
		this.pilote_couleur = couleur;
		this.pilote_lien_sur_img = lien;
		this.pilote_nomprenom = nom;
	}
	

}
