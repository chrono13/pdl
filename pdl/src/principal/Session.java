package principal;

import java.util.ArrayList;
import java.util.List;

/**
 *@author Blanchard Kévin /Ganeshamoorthy Kavishan/ Leroy Philippe/Veillot Yann
 *
 */

public class Session {

	private String session_nom;
	private String session_heuredebut;
	private String session_heurefin;
	private boolean session_departauto;// si 1 alors le depart est automatique sinon il est lancé par le client
	private int session_nbre_tours_max;
	private boolean session_typefin;// si cette argument est a vrai alors le type de fin se fait au temps, sinon c'est en fonction du nombre de tour
	private String session_dureetotalemaxpilote;
	private String session_dureemaxconsecutiveparpilote;
	private String session_commentaire;
	private boolean session_type;// si 1 c'est une course sinon c'est un essai
	private List <Top> listTop = new ArrayList <Top>();
	
	public Session() {// constructeur initialisant la session
		this.session_nom="";
		this.session_heuredebut="";
		this.session_heurefin="";
		this.session_departauto=false;
		this.session_nbre_tours_max=0;
		this.session_typefin=false;
		this.session_dureetotalemaxpilote="";
		this.session_dureemaxconsecutiveparpilote="";
		this.session_commentaire="";
	}
	
	public String getSession_nom() {// fixe le nom de la session
		return session_nom;
	}
	public void setSession_nom(String session_nom) {// on fixe le nom de la session
		this.session_nom = session_nom;
	}
	public String getSession_heuredebut() {// fixe l'heure de debut de la session
		return session_heuredebut;
	}
	public void setSession_heuredebut(String session_heuredebut) {//on fixe l'heure debut de la session
		this.session_heuredebut = session_heuredebut;
	}
	public boolean isSession_departauto() {// retourne si la session est en depart automtique
		return session_departauto;
	}
	public void setSession_departauto(boolean session_departauto) {// fixe la variable du depart automatique
		this.session_departauto = session_departauto;
	}
	public String getSession_heurefin() {// retourne l'heure de fin  de la session
		return session_heurefin;
	}
	public void setSession_heurefin(String session_heurefin) {// fixe l'heure de fin de la session
		this.session_heurefin = session_heurefin;
	}
	public int getSession_nbre_tours_max() {// recupere le nombre de tours de la session
		return session_nbre_tours_max;
	}
	public void setSession_nbre_tours_max(int session_nbre_tours_max) {// fixe le nombre de tour de la session
		this.session_nbre_tours_max = session_nbre_tours_max;
	}
	public boolean isSession_typefin() {// retourne le type de fin de la session
		return session_typefin;
	}
	public void setSession_typefin(boolean session_typefin) {// fixe le type de fin de la session
		this.session_typefin = session_typefin;
	}
	public String getSession_dureetotalemaxpilote() {// retourne la duree totale par pilote
		return session_dureetotalemaxpilote;
	}
	public void setSession_dureetotalemaxpilote(String session_dureetotalemaxpilote) {// fixe la duree totale par pilote
		this.session_dureetotalemaxpilote = session_dureetotalemaxpilote;
	}
	public String getSession_dureemaxconsecutiveparpilote() {
		return session_dureemaxconsecutiveparpilote;
	}
	public void setSession_dureemaxconsecutiveparpilote(
			String session_dureemaxconsecutiveparpilote) {
		this.session_dureemaxconsecutiveparpilote = session_dureemaxconsecutiveparpilote;
	}
	public String getSession_commentaire() {// retourne le commentaire de la session
		return session_commentaire;
	}
	public void setSession_commentaire(String session_commentaire) {// fixe un commentaire a la session
		this.session_commentaire = session_commentaire;
	}
	public boolean isSession_type() {// retourne le type de session
		return session_type;
	}
	public void setSession_type(boolean session_type) {// fixe le type de session
		this.session_type = session_type;
	}
	public void AddTop(Top t) {// ajoute un top a la session
		this.listTop.add(t);
	}
	
	public void DeleteTop(Top t) {// supprime un top de la session
		this.listTop.remove(t);
	}
	
	
	public List<Top> getTop() {// retourne la liste des tops
		return this.listTop;
	}
	
	
}
