package principal;

public class Moteur {
	
	private Evenement e;
	
	private Voiture v;
	
	private Pilote p;
	
	private Top t;
	
	private Course c;
	
	private Essai s;
	
	public Moteur(){
		v = new Voiture();
		p = new Pilote();
		e = new Evenement();
		t = new Top();
		c = new Course();
		s = new Essai();
	}
	
	public void AjouterVoiture(){
		
	}
	

}
