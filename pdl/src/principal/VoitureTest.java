package principal;

import static org.junit.Assert.*;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Test;

public class VoitureTest {

	@Test 
	public void test1() throws JAXBException {// test pour envoyer des informations d'une voiture en xml
		Pilote p = new Pilote();
		p.setPilote_couleur("rouge");
		p.setPilote_lien_sur_img("tottotototo");
		p.setPilote_nomprenom("kavishan");
		Pilote p2 = new Pilote();
		p2.setPilote_couleur("marrone");
		p2.setPilote_lien_sur_img("gf");
		p2.setPilote_nomprenom("kevin");
		Voiture v = new Voiture();
		v.setVoiture_active(true);
		v.setVoiture_temps_estime_partour("05'05'66'");
		v.setVoiture_couleur("bleu");
		v.setVoiture_lien_img("\\hdfdb");
		v.setVoiture_nbreTour_par_relai(25);
		v.setVoiture_num("007");
		v.setVoiture_pilote_actuelle(p);
		v.voiture_add_pilote(p);
		v.voiture_add_pilote(p2);
		File file = new File("C:/Users/Kavishan/xaxa.xml");//sauvegarde dans l'explorateur le fichier
		JAXBContext jaxbContext = JAXBContext.newInstance(Voiture.class);
		Marshaller m = jaxbContext.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(v, file);
		m.marshal(v, System.out);
	}

}
