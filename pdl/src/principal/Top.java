package principal;


public class Top {
	
	private String top_num_voiture;
	private int top_nbretour_debcourse;
	private String top_temps_tour;
	private String top_pilote;
	private String top_etat;
	private String top_heure_passage;
	private String top_heure_passage_milli; 
	private String top_comment;
	
	public Top() {
		this.top_num_voiture = "";
		this.top_nbretour_debcourse = 0;
		this.top_temps_tour = "";
		this.top_pilote = null;
		this.top_etat = "";
		this.top_heure_passage = "";
		this.top_comment = "";
	}
	
	public Top (String top_num_voiture, int nb_tour, String p, String temps, String etat, String heure, String Commentaire ) {
		this.top_num_voiture = top_num_voiture;
		this.top_nbretour_debcourse = nb_tour;
		this.top_pilote = p;
		this.top_temps_tour = temps;
		this.top_etat = etat;
		this.top_heure_passage = heure;
		this.top_comment = Commentaire;
	}

	public String getTop_num_voiture() {
		return top_num_voiture;
	}

	public void setTop_num_voiture(String top_num_voiture) {
		this.top_num_voiture = top_num_voiture;
	}

	public int getTop_nbretour_debcourse() {
		return top_nbretour_debcourse;
	}

	public void setTop_nbretour_debcourse(int top_nbretour_debcourse) {
		this.top_nbretour_debcourse = top_nbretour_debcourse;
	}

	public String getTop_temps_tour() {
		return top_temps_tour;
	}

	public void setTop_temps_tour(String top_temps_tour) {
		this.top_temps_tour = top_temps_tour;
	}

	public String getTop_etat() {
		return top_etat;
	}

	public void setTop_etat(String top_etat) {
		this.top_etat = top_etat;
	}

	public String getTop_heure_passage() {
		return top_heure_passage;
	}

	public void setTop_heure_passage(String top_heure_passage) {
		this.top_heure_passage = top_heure_passage;
	}

	public String getTop_heure_passage_milli() {
		return top_heure_passage_milli;
	}

	public void setTop_heure_passage_milli(String top_heure_passage_milli) {
		this.top_heure_passage_milli = top_heure_passage_milli;
	}

	/**
	 * @return the top_pilote
	 */
	public String getTop_pilote() {
		return top_pilote;
	}

	/**
	 * @param top_pilote the top_pilote to set
	 */
	public void setTop_pilote(String top_pilote) {
		this.top_pilote = top_pilote;
	}

	/**
	 * @return the top_comment
	 */
	public String getTop_comment() {
		return top_comment;
	}

	/**
	 * @param top_comment the top_comment to set
	 */
	public void setTop_comment(String top_comment) {
		this.top_comment = top_comment;
	}
	
	
}
