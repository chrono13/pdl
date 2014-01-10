package ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import principal.Evenement;

/**
 * Classe permettant de charger ou d'ajouter un évènement
 * @author Blanchard Kévin /Ganeshamoorthy Kavishan/ Leroy Philippe/Veillot Yann
 *
 */

public class GestionEvent extends JPanel {

	private static final long serialVersionUID = 1L;

	public GestionEvent() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		final JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);
		
		JLabel lblQueSouhaitezVous = new JLabel(Dico.dansLedico("Que souhaitez-vous faire ?", Dico.langue));
		lblQueSouhaitezVous.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblQueSouhaitezVous.setBounds(275, 20, 543, 45);
		desktopPane.add(lblQueSouhaitezVous);
		
		
		/* BOUTONS DE LA FENETRE */
		
		
		// bouton ajouter un evenement		
		JButton btnAjouterEvent = new JButton(Dico.dansLedico("Ajouter un evenement", Dico.langue));
		btnAjouterEvent.setContentAreaFilled(false);
		btnAjouterEvent.setBorderPainted(false);
		Icon loginIcon1 = new ImageIcon(getClass().getResource("/icones/add.png"));
		btnAjouterEvent.setIcon(loginIcon1);
		btnAjouterEvent.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnAjouterEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//évènement suite au "clic" sur le boutton ajouter un évènement
				Evenement event = new Evenement();
				removeAll();
				repaint();
				AjouterEvent inter4 = new AjouterEvent(event);
				add(inter4);
				validate();
			}
		});
		btnAjouterEvent.setBounds(382, 276, 234, 50);
		desktopPane.add(btnAjouterEvent);
		
		
		
		// bouton charger un evenement		
		JButton btnChargerEvent = new JButton(Dico.dansLedico("Charger un evenement", Dico.langue));
		btnChargerEvent.setContentAreaFilled(false);
		btnChargerEvent.setBorderPainted(false);
		Icon loginIcon6 = new ImageIcon(getClass().getResource("/icones/import.png"));
		btnChargerEvent.setIcon(loginIcon6);
		btnChargerEvent.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnChargerEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				Dico.langueSystem(Dico.langue);// choix de la langue pour la fenetre de sauvegarde
				JFileChooser dialogue = new JFileChooser(new File("."));// ouverture d'une boite de dialogue
				File fichier=null;
				String namefile = "";
				String pathname= "";
				if (dialogue.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
					fichier = dialogue.getSelectedFile();
					namefile = fichier.getName();// on recupere le nom du fichier
					pathname = fichier.getParent();// on recupere le chemein du fichier
				}
				String nomdufichier = pathname+"\\"+namefile;// on ajoute l'extension xml au fihcier
				if (!nomdufichier.contains(".xml")){
					JOptionPane.showMessageDialog(desktopPane, Dico.dansLedico("Choisir un fichier xml", Dico.langue), Dico.dansLedico("Attention", Dico.langue), JOptionPane.ERROR_MESSAGE);
					return;
				}
				if (fichier==null){// si on clique sur annuler!
					return;
				}
				// récupération du fichier sélectionné
				else {
					try {	
						// chargement du fichier puis on passe a l'interface caracteristique de l'evenement
						File file = new File(nomdufichier);
						JAXBContext jaxbContext = JAXBContext.newInstance(Evenement.class);
						Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
						Evenement event = (Evenement) jaxbUnmarshaller.unmarshal(file);
						removeAll();
						repaint();
						CaracteristiquesEvent inter7 = new CaracteristiquesEvent(event);
						add(inter7);
						validate();
					}
					catch (Exception e2) {
						JOptionPane.showMessageDialog(desktopPane, Dico.dansLedico("Fichier incorrect", Dico.langue), Dico.dansLedico("Attention", Dico.langue), JOptionPane.ERROR_MESSAGE);
					}
				}
			}
				
			
		});
		btnChargerEvent.setBounds(93, 111, 253, 50);
		desktopPane.add(btnChargerEvent);

		
		// bouton annuler		
		JButton btnAnnuler = new JButton(Dico.dansLedico("Annuler", Dico.langue));
		btnAnnuler.setContentAreaFilled(false);
		btnAnnuler.setBorderPainted(false);
		Icon loginIcon10 = new ImageIcon(getClass().getResource("/icones/previous.png"));
		btnAnnuler.setIcon(loginIcon10);
		btnAnnuler.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				FirstFenetre inter2 = new FirstFenetre();
				add(inter2);
				validate();
			}
		});
		btnAnnuler.setBounds(671, 439, 217, 50);
		desktopPane.add(btnAnnuler);
	}
	

}
