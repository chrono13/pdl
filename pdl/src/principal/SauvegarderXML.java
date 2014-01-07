package principal;

import java.io.File;

import javax.swing.JFileChooser;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import ihm.Dico;

public class SauvegarderXML {
	
	public static void sauvegarder (Class class1, Object o) {
		Dico.langueSystem(Dico.getlangue());// choix de la langue pour la fenetre de sauvegarde
		JFileChooser dialogue = new JFileChooser(new File("."));// ouverture d'une boite de dialogue
		File fichier;
		String namefile = "";
		String pathname= "";
		if (dialogue.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
			fichier = dialogue.getSelectedFile();
			namefile = fichier.getName();// on recupere le nom du fichier
			pathname = fichier.getParent();// on recupere le chemein du fichier
		}
		String nomdufichier = pathname+"/"+namefile+".xml";// on ajoute l'extension xml au fihcier
		if (!nomdufichier.equals("/.xml")){// verifie que lors du choix de l'emplacement si on fait annuler on arrete l'enregistrement
			File file = new File(nomdufichier);//sauvegarde dans l'explorateur le fichier
			JAXBContext jaxbContext;
			try {
				jaxbContext = JAXBContext.newInstance(class1);// on fait un xml par rapport a la classse voiture
				Marshaller m = jaxbContext.createMarshaller();// marshaller permet de passer d'une classe a un xml
				m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				m.marshal(o, file);// genere le fichier de sauvegarde
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
/*
	public static void sauvegarder(Class<Voiture> class1, Voiture v) {
		// TODO Auto-generated method stub
		
	}
*/
}
