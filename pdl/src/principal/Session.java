package principal;

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
	
	public Session() {
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
	
	public String getSession_nom() {
		return session_nom;
	}
	public void setSession_nom(String session_nom) {
		this.session_nom = session_nom;
	}
	public String getSession_heuredebut() {
		return session_heuredebut;
	}
	public void setSession_heuredebut(String session_heuredebut) {
		this.session_heuredebut = session_heuredebut;
	}
	public boolean isSession_departauto() {
		return session_departauto;
	}
	public void setSession_departauto(boolean session_departauto) {
		this.session_departauto = session_departauto;
	}
	public String getSession_heurefin() {
		return session_heurefin;
	}
	public void setSession_heurefin(String session_heurefin) {
		this.session_heurefin = session_heurefin;
	}
	public int getSession_nbre_tours_max() {
		return session_nbre_tours_max;
	}
	public void setSession_nbre_tours_max(int session_nbre_tours_max) {
		this.session_nbre_tours_max = session_nbre_tours_max;
	}
	public boolean isSession_typefin() {
		return session_typefin;
	}
	public void setSession_typefin(boolean session_typefin) {
		this.session_typefin = session_typefin;
	}
	public String getSession_dureetotalemaxpilote() {
		return session_dureetotalemaxpilote;
	}
	public void setSession_dureetotalemaxpilote(
			String session_dureetotalemaxpilote) {
		this.session_dureetotalemaxpilote = session_dureetotalemaxpilote;
	}
	public String getSession_dureemaxconsecutiveparpilote() {
		return session_dureemaxconsecutiveparpilote;
	}
	public void setSession_dureemaxconsecutiveparpilote(
			String session_dureemaxconsecutiveparpilote) {
		this.session_dureemaxconsecutiveparpilote = session_dureemaxconsecutiveparpilote;
	}
	public String getSession_commentaire() {
		return session_commentaire;
	}
	public void setSession_commentaire(String session_commentaire) {
		this.session_commentaire = session_commentaire;
	}
	public boolean isSession_type() {
		return session_type;
	}
	public void setSession_type(boolean session_type) {
		this.session_type = session_type;
	}
	
	
}
