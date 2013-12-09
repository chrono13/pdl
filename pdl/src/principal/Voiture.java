package principal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class Voiture {

	// attributs principaux
	private String voiture_num;
	private String voiture_couleur;
	private String voiture_lien_img;
	private int voiture_nbreTour_par_relai;
	private String voiture_temps_estime_partour;
	private boolean voiture_active;
	
	private List <Pilote> voiture_list_pilotes = new ArrayList <Pilote>();
	public List<Pilote> getVoiture_list_pilotes() {
		return voiture_list_pilotes;
	}
	public void setVoiture_list_pilotes(List<Pilote> voiture_list_pilotes) {
		this.voiture_list_pilotes = voiture_list_pilotes;
	}

	private Pilote voiture_pilote_actuelle;
	private List<Top> voiture_list_top;
	// autre attributs
	
	private int voiture_tours_deja_fait;
	private int voiture_nbTour_depuis_dernierRelais;
	private int voiture_num_relai;
	
	public Voiture() {
		this.voiture_num = "";
		this.voiture_couleur = "";
		this.voiture_lien_img = "";
		this.voiture_nbreTour_par_relai=0;
		this.voiture_temps_estime_partour = "";
		this.voiture_active = false;
		this.voiture_pilote_actuelle = null;
	}
	public Voiture(String num, String couleur, String lien, int nbretourrelai, String tempsestimee, boolean active, List<Pilote> pil, Pilote actuelle) {
		this.voiture_num = num;
		this.voiture_couleur = couleur;
		this.voiture_lien_img = lien;
		this.voiture_nbreTour_par_relai = nbretourrelai;
		this.voiture_temps_estime_partour = tempsestimee;
		this.voiture_active = active;
		this.voiture_list_pilotes = pil;
		this.voiture_pilote_actuelle = actuelle;
	}

	public String getVoiture_num() {
		return voiture_num;
	}

	public void setVoiture_num(String voiture_num) {
		this.voiture_num = voiture_num;
	}
	
	public String getVoiture_couleur() {
		return voiture_couleur;
	}

	public void setVoiture_couleur(String voiture_couleur) {
		this.voiture_couleur = voiture_couleur;
	}

	public String getVoiture_lien_img() {
		return voiture_lien_img;
	}

	public void setVoiture_lien_img(String voiture_lien_img) {
		this.voiture_lien_img = voiture_lien_img;
	}

	public int getVoiture_nbreTour_par_relai() {
		return voiture_nbreTour_par_relai;
	}
	
	public void setVoiture_nbreTour_par_relai(int voiture_nbreTour_par_relai) {
		this.voiture_nbreTour_par_relai = voiture_nbreTour_par_relai;
	}

	public String getVoiture_temps_estime_partour() {
		return voiture_temps_estime_partour;
	}

	public void setVoiture_temps_estime_partour(
			String voiture_temps_estime_partour) {
		this.voiture_temps_estime_partour = voiture_temps_estime_partour;
	}
	@XmlAttribute
	public boolean isVoiture_active() {
		return voiture_active;
	}

	public void setVoiture_active(boolean voiture_active) {
		this.voiture_active = voiture_active;
	}

	@XmlElement
	public Pilote getVoiture_pilote_actuelle() {
		return voiture_pilote_actuelle;
	}

	public void setVoiture_pilote_actuelle(Pilote voiture_pilote_actuelle) {
		this.voiture_pilote_actuelle = voiture_pilote_actuelle;
	}

	public void voiture_add_pilote(Pilote p) {
		if (p!= null) {
			this.voiture_list_pilotes.add(p);
		}
	}
	
	public void voiture_remove_pilote (Pilote p) {
		if (this.voiture_list_pilotes.contains(p)) {
			this.voiture_list_pilotes.remove(p);
		}
	}
	
	public boolean listPiloteVide (){
		return this.voiture_list_pilotes.isEmpty();
	}
	
	
}
