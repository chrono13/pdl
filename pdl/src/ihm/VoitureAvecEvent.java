package ihm;

import javax.swing.JPanel;
import javax.swing.BoxLayout;

import java.awt.Color;

import javax.swing.JDesktopPane;

import java.awt.SystemColor;

import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.Iterator;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import principal.Evenement;
import principal.Pilote;
import principal.Voiture;


public class VoitureAvecEvent extends JPanel {
	private JTextField numVoiture;
	private JTextField couleurVoiture;
	private JTextField imageVoiture;
	private JTextField nbTours;
	private JTextField textField_4;
	private JTable table;
	private Voiture v = null;
	private Evenement event = null;
	private boolean verrou= false;
	/**
	 * Create the panel.
	 */
	public VoitureAvecEvent(Evenement e, Voiture voiture) {
		setBackground(new Color(240, 240, 240));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		this.event = e;
		this.v = voiture;

		JPanel panel = new JPanel();
		panel.setForeground(Color.CYAN);
		add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		final JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);

		final JCheckBox chckbxVoitureActive = new JCheckBox("Voiture activ\u00E9e");
		chckbxVoitureActive.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		chckbxVoitureActive.setBackground(SystemColor.activeCaption);
		chckbxVoitureActive.setBounds(628, 133, 298, 23);
		desktopPane.add(chckbxVoitureActive);

		JLabel lblCaractristiquesDeLa = new JLabel("Caract\u00E9ristiques de la voiture");
		lblCaractristiquesDeLa.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblCaractristiquesDeLa.setBounds(248, 0, 660, 50);
		desktopPane.add(lblCaractristiquesDeLa);

		JLabel lblNumroDeLa = new JLabel("Num\u00E9ro de la voiture :");
		lblNumroDeLa.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNumroDeLa.setBounds(10, 68, 207, 14);
		desktopPane.add(lblNumroDeLa);

		JLabel lblCouleur = new JLabel("Couleur :");
		lblCouleur.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblCouleur.setBounds(482, 68, 83, 14);
		desktopPane.add(lblCouleur);

		JLabel lblLienVersLimage = new JLabel("Lien vers l'image :");
		lblLienVersLimage.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblLienVersLimage.setBounds(10, 137, 196, 19);
		desktopPane.add(lblLienVersLimage);

		JLabel lblNombreDeTours = new JLabel("Nombre de tours / relais :");
		lblNombreDeTours.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNombreDeTours.setBounds(10, 203, 258, 14);
		desktopPane.add(lblNombreDeTours);

		JLabel lblTempsEstimPar = new JLabel("Temps estim\u00E9 par tour :");
		lblTempsEstimPar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblTempsEstimPar.setBounds(459, 203, 258, 19);
		desktopPane.add(lblTempsEstimPar);

		JLabel lblPilotes = new JLabel("Pilotes");
		lblPilotes.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblPilotes.setBounds(10, 304, 104, 14);
		desktopPane.add(lblPilotes);

		JLabel lblPiloteAuDopart = new JLabel("Pilote au d\u00E9part :");
		lblPiloteAuDopart.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblPiloteAuDopart.setBounds(574, 301, 189, 14);
		desktopPane.add(lblPiloteAuDopart);

		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(700, 299, 133, 23);
		desktopPane.add(comboBox);
		if (!v.listPiloteVide()) {
			Iterator <Pilote> it = v.getVoiture_list_pilotes().iterator();
			while(it.hasNext()) {
				Pilote p1 = it.next();
				String nom = p1.getPilote_nomprenom();
				comboBox.addItem(nom);
			}
		}

		numVoiture = new JTextField();
		numVoiture.setBounds(189, 67, 283, 20);
		desktopPane.add(numVoiture);
		numVoiture.setColumns(10);

		couleurVoiture = new JTextField();
		couleurVoiture.setBounds(568, 68, 290, 20);
		desktopPane.add(couleurVoiture);
		couleurVoiture.setColumns(10);

		imageVoiture = new JTextField();
		imageVoiture.setBounds(189, 136, 283, 20);
		desktopPane.add(imageVoiture);
		imageVoiture.setColumns(10);

		nbTours = new JTextField();
		nbTours.setBounds(233, 202, 75, 20);
		desktopPane.add(nbTours);
		nbTours.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(662, 202, 119, 20);
		desktopPane.add(textField_4);
		textField_4.setColumns(10);

		if (v!=null) {
			numVoiture.setText(v.getVoiture_num());
			couleurVoiture.setText(v.getVoiture_couleur());
			imageVoiture.setText(v.getVoiture_lien_img());
			nbTours.setText(Integer.toString(v.getVoiture_nbreTour_par_relai()));
			textField_4.setText(v.getVoiture_temps_estime_partour());
			verrou = true;
		}

		table = new JTable();
		table.setBounds(10, 328, 483, 255);
		final DefaultTableModel model = new DefaultTableModel() {

			@Override
			public boolean isCellEditable(int x, int y) {
				return false ; 
			}


		};
		model.addColumn("Nom et prenom");
		//model.setColumnIdentifiers(entete);
		if (!v.listPiloteVide()) {
			Iterator <Pilote> it = v.getVoiture_list_pilotes().iterator();

			while(it.hasNext()) {
				Pilote p1 = it.next();
				String nom = p1.getPilote_nomprenom();
				model.addRow(new Object [] {nom});
			}
		}

		table.setModel(model);
		desktopPane.add(table);



		/* BOUTONS DE LA FENETRE */

		// bouton Sauvegarder		
		JButton btnSauvegarder = new JButton("Sauvegarder");
		btnSauvegarder.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnSauvegarder.setBorderPainted(false);
		btnSauvegarder.setContentAreaFilled(false);
		Icon loginIcon1 = new ImageIcon("icones/save.png");
		btnSauvegarder.setIcon(loginIcon1);
		btnSauvegarder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (numVoiture == null || numVoiture.getText().equals("")  || couleurVoiture.getText().equals("") 
						|| couleurVoiture == null || imageVoiture == null || imageVoiture.getText().equals("")
						|| nbTours == null || nbTours.getText().equals("0") || textField_4== null || textField_4.getText().equals(""))

				{// si au moins un des champs principaux n'est pas remplies alors on a un message d'erreur
					JOptionPane.showMessageDialog(desktopPane, "Vous n'avez pas tout remplies !!!!!", "Attention", JOptionPane.ERROR_MESSAGE);
					return;// si il manque au moins un élément dans le voiture alors on avertit le client
				}
				else {
					// fixation des informations de la voiture avant la sauvegarde
					v.setVoiture_active(chckbxVoitureActive.isSelected());
					v.setVoiture_couleur(couleurVoiture.getText());
					v.setVoiture_lien_img(imageVoiture.getText());
					v.setVoiture_nbreTour_par_relai(Integer.parseInt(nbTours.getText()));
					v.setVoiture_num(numVoiture.getText());
					v.setVoiture_temps_estime_partour(textField_4.getText());
					// on recupere le pilote de depart via ce qui suit
					String pilote = (String) comboBox.getSelectedItem();
					// nous verifions que le relais est bien est entier
					try
					{
						int i=Integer.decode(nbTours.getText());// verifie si la saisie de la longueur est un entier

					}catch(NumberFormatException  e)
					{
						JOptionPane.showMessageDialog(desktopPane, "La relais n'est pas numerique !!!!!", "Attention", JOptionPane.ERROR_MESSAGE);
						return;
					}
					// nous fixons le pilote actuelle
					if (!v.listPiloteVide()) {
						Iterator <Pilote> it = v.getVoiture_list_pilotes().iterator();
						boolean pilotetrouve = true;
						while(it.hasNext()&& pilotetrouve) {
							Pilote p1 = it.next();
							if (p1.getPilote_nomprenom().equals(pilote)){
								v.setVoiture_pilote_actuelle(p1);
							}
						}
					}
					// processus de sauvegarde
					Dico.langueSystem(Dico.langue);// choix de la langue pour la fenetre de sauvegarde
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
							jaxbContext = JAXBContext.newInstance(Voiture.class);// on fait un xml par rapport a la classse voiture
							Marshaller m = jaxbContext.createMarshaller();// marshaller permet de passer d'une classe a un xml
							m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
							m.marshal(v, file);// genere le fichier de sauvegarde
						} catch (JAXBException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
					}
				}

			}
		});
		btnSauvegarder.setBounds(557, 403, 160, 74);
		desktopPane.add(btnSauvegarder);


		// bouton Valider		
		JButton btnValider = new JButton("Valider");
		btnValider.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnValider.setBorderPainted(false);
		btnValider.setContentAreaFilled(false);
		Icon loginIcon4 = new ImageIcon("icones/valid.png");
		btnValider.setIcon(loginIcon4);
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (v.listPiloteVide()){// on informe que la voiture n'as pas de pilotes
					JOptionPane.showMessageDialog(desktopPane, "Attention", "Vous avez aucun pilote", JOptionPane.ERROR_MESSAGE);
				}
				if (numVoiture == null || numVoiture.getText().equals("")  || couleurVoiture.getText().equals("") 
						|| couleurVoiture == null || imageVoiture == null || imageVoiture.getText().equals("")
						|| nbTours == null || nbTours.getText().equals("0") || textField_4== null || textField_4.getText().equals(""))

				{// si au moins un des champs principaux n'est pas remplies alors on a un message d'erreur
					JOptionPane.showMessageDialog(desktopPane, "Vous n'avez pas tout remplies !!!!!", "Attention", JOptionPane.ERROR_MESSAGE);
					return;// si il manque au moins un élément dans le voiture alors on avertit le client
				}
				else {
					if (verrou) {
						event.supprimerVoiture(v);
					}
					try
					{
						int i=Integer.decode(nbTours.getText());// verifie si la saisie de la longueur est un entier

					}catch(NumberFormatException  e1)
					{
						JOptionPane.showMessageDialog(desktopPane, "La relais n'est pas numerique !!!!!", "Attention", JOptionPane.ERROR_MESSAGE);
						return;
					}
					// nous fixons le pilote actuelle
					if (!v.listPiloteVide()) {
						String pilote = (String) comboBox.getSelectedItem();
						Iterator <Pilote> it = v.getVoiture_list_pilotes().iterator();
						boolean pilotetrouve = true;
						while(it.hasNext()&& pilotetrouve) {
							Pilote p1 = it.next();
							if (p1.getPilote_nomprenom().equals(pilote)){
								v.setVoiture_pilote_actuelle(p1);
							}
						}
					}
					v.setVoiture_active(chckbxVoitureActive.isSelected());
					v.setVoiture_couleur(couleurVoiture.getText());
					v.setVoiture_lien_img(imageVoiture.getText());
					v.setVoiture_nbreTour_par_relai(Integer.parseInt(nbTours.getText()));
					v.setVoiture_num(numVoiture.getText());
					v.setVoiture_temps_estime_partour(textField_4.getText());
					event.ajouterVoiture(v);
					removeAll();
					repaint();
					CaracteristiquesEvent inter = new CaracteristiquesEvent(event);
					add(inter);
					validate();
				}
			}
		});
		btnValider.setBounds(650, 517, 183, 74);
		desktopPane.add(btnValider);


		//bouton Annuler
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnAnnuler.setBorderPainted(false);
		btnAnnuler.setContentAreaFilled(false);
		Icon loginIcon2 = new ImageIcon("icones/previous.png");
		btnAnnuler.setIcon(loginIcon2);
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				CaracteristiquesEvent inter = new CaracteristiquesEvent(event);
				add(inter);
				validate();
			}
		});
		btnAnnuler.setBounds(753, 403, 155, 74);
		desktopPane.add(btnAnnuler);


		// bouton Ajouter un pilote		
		JButton btnAjouterPilote = new JButton("Ajouter");
		btnAjouterPilote.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnAjouterPilote.setBorderPainted(false);
		btnAjouterPilote.setContentAreaFilled(false);
		Icon loginIcon3 = new ImageIcon("icones/add.png");
		btnAjouterPilote.setIcon(loginIcon3);
		btnAjouterPilote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pilote pil = new Pilote();
				String nom ="";
				if (!numVoiture.getText().equals("")) {
					nom = numVoiture.getText();
					v.setVoiture_num(nom);
				}
				if (!couleurVoiture.getText().equals("")) {
					String field1 = couleurVoiture.getText();
					v.setVoiture_couleur(field1);
				}
				if (!imageVoiture.getText().equals("")) {
					String field2 = imageVoiture.getText();
					v.setVoiture_lien_img(field2);
				}
				if (!nbTours.getText().equals("")) {
					int field3 = Integer.parseInt(nbTours.getText());
					v.setVoiture_nbreTour_par_relai(field3);
				}
				if (!textField_4.getText().equals("")) {
					String fiel4 = textField_4.getText();
					v.setVoiture_temps_estime_partour(fiel4);;
				}
				removeAll();
				repaint();
				CreerPiloteAvecEvent inter = new CreerPiloteAvecEvent(event, v, pil);
				add(inter);
				validate();
			}
		});
		btnAjouterPilote.setBounds(69, 302, 137, 18);
		desktopPane.add(btnAjouterPilote);


		// bouton Supprimer un pilote				
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ligne = table.getSelectedRow();
				Pilote p = new Pilote ();
				if (ligne !=-1) {// si rien n'est selectionner dans le tableau alors on ne rentre pas
					int i = 0;
					Iterator <Pilote> it = v.getVoiture_list_pilotes().iterator();
					while(it.hasNext() && i<=ligne){
						p = it.next();
						if (i == ligne) {
							it.remove();
						}
						i++;
					}
				}
				model.removeRow(ligne);
				comboBox.removeItemAt(ligne);
				// on notify la table comme quoi un pilote n'est plus
			}
		});
		btnSupprimer.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnSupprimer.setBorderPainted(false);
		btnSupprimer.setContentAreaFilled(false);
		Icon loginIcon5 = new ImageIcon("icones/suppr.png");
		btnSupprimer.setIcon(loginIcon5);
		btnSupprimer.setBounds(376, 297, 133, 29);
		desktopPane.add(btnSupprimer);


		// bouton Modifier un pilote		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom ="";
				if (!numVoiture.getText().equals("")) {
					nom = numVoiture.getText();
					v.setVoiture_num(nom);
				}
				if (!couleurVoiture.getText().equals("")) {
					String field1 = couleurVoiture.getText();
					v.setVoiture_couleur(field1);
				}
				if (!imageVoiture.getText().equals("")) {
					String field2 = imageVoiture.getText();
					v.setVoiture_lien_img(field2);
				}
				if (!nbTours.getText().equals("")) {
					int field3 = Integer.parseInt(nbTours.getText());
					v.setVoiture_nbreTour_par_relai(field3);
				}
				if (!textField_4.getText().equals("")) {
					String fiel4 = textField_4.getText();
					v.setVoiture_temps_estime_partour(fiel4);;
				}
				removeAll();
				repaint();
				int ligne = table.getSelectedRow();
				Pilote p = new Pilote ();
				if (ligne !=-1) {// si rien n'est selectionner dans le tableau alors on ne rentre pas
					int i = 0;
					Iterator <Pilote> it = v.getVoiture_list_pilotes().iterator();
					while(it.hasNext() && i<=ligne){
						p =it.next();
						i++;
					}
				}
				CreerPiloteAvecEvent inter = new CreerPiloteAvecEvent(event, v, p);
				add(inter);
				validate();
			}
		});
		btnModifier.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnModifier.setBorderPainted(false);
		btnModifier.setContentAreaFilled(false);
		Icon loginIcon6 = new ImageIcon("icones/edit.png");
		btnModifier.setIcon(loginIcon6);
		btnModifier.setBounds(221, 299, 145, 29);
		desktopPane.add(btnModifier);
	}
}
