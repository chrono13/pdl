package principal;


public class Top {
	
	private int top_num_voiture;
	private int top_nombreTourPilote_dansrelai;
	private int top_nbretour_debcourse;
	private String top_temps_tour;
	private char top_etat;
	private String top_heure_passage;
	private String top_heure_passage_milli; 
	
	public Top() {
		this.top_num_voiture = 0;
		this.top_nombreTourPilote_dansrelai = 0;
		this.top_nbretour_debcourse = 0;
		this.top_temps_tour = "";
		this.top_etat = ' ';
		this.top_heure_passage = "";
		this.top_heure_passage_milli = "";
	}
	
	public Top (int top_num_voiture, int top_nombreTourPilote_dansrelai, int top_nbretour_debcourse, String top_temps_tour, char top_etat, String top_heure_passage, String top_heure_passage_milli ) {
		this.top_num_voiture = top_num_voiture;
		this.top_nombreTourPilote_dansrelai = top_nombreTourPilote_dansrelai;
		this.top_nbretour_debcourse = top_nbretour_debcourse;
		this.top_temps_tour = top_temps_tour;
		this.top_etat = top_etat;
		this.top_heure_passage = top_heure_passage;
		this.top_heure_passage_milli = top_heure_passage_milli;
	}

	public int getTop_num_voiture() {
		return top_num_voiture;
	}

	public void setTop_num_voiture(int top_num_voiture) {
		this.top_num_voiture = top_num_voiture;
	}

	public int getTop_nombreTourPilote_dansrelai() {
		return top_nombreTourPilote_dansrelai;
	}

	public void setTop_nombreTourPilote_dansrelai(
			int top_nombreTourPilote_dansrelai) {
		this.top_nombreTourPilote_dansrelai = top_nombreTourPilote_dansrelai;
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

	public char getTop_etat() {
		return top_etat;
	}

	public void setTop_etat(char top_etat) {
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
	
	
}
