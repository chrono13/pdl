package ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import principal.Evenement;
import principal.Pilote;
import principal.SauvegarderXML;
import principal.Voiture;

/**
 * Classe permettant la création d'une voiture lorsqu'un évènement à déja été créé
 * @author Blanchard Kévin /Ganeshamoorthy Kavishan/ Leroy Philippe/Veillot Yann
 *
 */

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
	private String colorie_casque = null;
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

		final JCheckBox chckbxVoitureActive = new JCheckBox(Dico.dansLedico("Voiture activee", Dico.langue));
		chckbxVoitureActive.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		chckbxVoitureActive.setBackground(SystemColor.activeCaption);
		chckbxVoitureActive.setBounds(628, 133, 298, 23);
		desktopPane.add(chckbxVoitureActive);

		JLabel lblCaractristiquesDeLa = new JLabel(Dico.dansLedico("Caracteristiques de la voiture", Dico.langue));
		lblCaractristiquesDeLa.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblCaractristiquesDeLa.setBounds(248, 0, 660, 50);
		desktopPane.add(lblCaractristiquesDeLa);

		JLabel lblNumroDeLa = new JLabel(Dico.dansLedico("Numero de la voiture :", Dico.langue));
		lblNumroDeLa.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNumroDeLa.setBounds(10, 68, 207, 14);
		desktopPane.add(lblNumroDeLa);

		JLabel lblCouleur = new JLabel(Dico.dansLedico("Couleur :", Dico.langue));
		lblCouleur.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblCouleur.setBounds(482, 68, 83, 14);
		desktopPane.add(lblCouleur);

		JLabel lblLienVersLimage = new JLabel(Dico.dansLedico("Lien vers l'image :", Dico.langue));
		lblLienVersLimage.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblLienVersLimage.setBounds(10, 137, 196, 23);
		desktopPane.add(lblLienVersLimage);

		JLabel lblNombreDeTours = new JLabel(Dico.dansLedico("Nombre de tour(s) par relai :", Dico.langue));
		lblNombreDeTours.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNombreDeTours.setBounds(10, 203, 258, 19);
		desktopPane.add(lblNombreDeTours);

		JLabel lblTempsEstimPar = new JLabel(Dico.dansLedico("Temps estime par tour :", Dico.langue));
		lblTempsEstimPar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblTempsEstimPar.setBounds(459, 203, 258, 19);
		desktopPane.add(lblTempsEstimPar);

		JLabel lblPilotes = new JLabel(Dico.dansLedico("Pilote(s)", Dico.langue));
		lblPilotes.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblPilotes.setBounds(10, 304, 104, 14);
		desktopPane.add(lblPilotes);

		JLabel lblPiloteAuDopart = new JLabel(Dico.dansLedico("Pilote au depart :", Dico.langue));
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
		couleurVoiture.setEditable(false);
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
			colorie_casque = v.getVoiture_couleur();
			imageVoiture.setText(v.getVoiture_lien_img());
			nbTours.setText(Integer.toString(v.getVoiture_nbreTour_par_relai()));
			textField_4.setText(v.getVoiture_temps_estime_partour());
			verrou = true;
		}
		if (!colorie_casque.equals("") && colorie_casque!= null) {
			couleurVoiture.setBackground(Color.decode(colorie_casque));// on affecte la couleur choisit comme background du textarea
		}
		
		
		JPanel panetable = new JPanel();
		panetable.setBounds(10, 328, 483, 255);
		table = new JTable();
		panetable.setLayout(new BorderLayout());
		panetable.add(new JScrollPane(table));
		desktopPane.add(panetable);
		final DefaultTableModel model = new DefaultTableModel() {

			@Override
			public boolean isCellEditable(int x, int y) {
				return false ; 
			}


		};
		model.addColumn(Dico.dansLedico("Nom et prenom :", Dico.langue));
		if (!v.listPiloteVide()) {
			Iterator <Pilote> it = v.getVoiture_list_pilotes().iterator();

			while(it.hasNext()) {
				Pilote p1 = it.next();
				String nom = p1.getPilote_nomprenom();
				model.addRow(new Object [] {nom});
			}
		}

		table.setModel(model);
		



		/* BOUTONS DE LA FENETRE */

		// bouton Sauvegarder		
		JButton btnSauvegarder = new JButton(Dico.dansLedico("Sauvegarder", Dico.langue));
		btnSauvegarder.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnSauvegarder.setBorderPainted(false);
		btnSauvegarder.setContentAreaFilled(false);
		Icon loginIcon1 = new ImageIcon(getClass().getResource("/icones/save.png"));
		btnSauvegarder.setIcon(loginIcon1);
		btnSauvegarder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (numVoiture == null || numVoiture.getText().equals("")  || colorie_casque.equals("") 
						|| colorie_casque == null || imageVoiture == null || imageVoiture.getText().equals("")
						|| nbTours == null || nbTours.getText().equals("0") || textField_4== null || textField_4.getText().equals(""))

				{// si au moins un des champs principaux n'est pas remplies alors on a un message d'erreur
					JOptionPane.showMessageDialog(desktopPane, Dico.dansLedico("Vous n'avez pas tout rempli !", Dico.langue), Dico.dansLedico("Attention", Dico.langue), JOptionPane.ERROR_MESSAGE);
					return;// si il manque au moins un élément dans le voiture alors on avertit le client
				}
				else {
					// fixation des informations de la voiture avant la sauvegarde
					v.setVoiture_active(chckbxVoitureActive.isSelected());
					v.setVoiture_couleur(colorie_casque);
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
						JOptionPane.showMessageDialog(desktopPane, Dico.dansLedico("Nombre de relai(s) incorrect !", Dico.langue), Dico.dansLedico("Attention", Dico.langue), JOptionPane.ERROR_MESSAGE);
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
					SauvegarderXML.sauvegarder(Voiture.class, v);
				}

			}
		});
		btnSauvegarder.setBounds(557, 403, 160, 74);
		desktopPane.add(btnSauvegarder);


		// bouton Valider		
		JButton btnValider = new JButton(Dico.dansLedico("Valider", Dico.langue));
		btnValider.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnValider.setBorderPainted(false);
		btnValider.setContentAreaFilled(false);
		Icon loginIcon4 = new ImageIcon(getClass().getResource("/icones/valid.png"));
		btnValider.setIcon(loginIcon4);
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (v.listPiloteVide()){// on informe que la voiture n'as pas de pilotes
					JOptionPane.showMessageDialog(desktopPane, Dico.dansLedico("Vous n'avez aucun pilote", Dico.langue), Dico.dansLedico("Attention", Dico.langue), JOptionPane.ERROR_MESSAGE);
				}
				if (numVoiture == null || numVoiture.getText().equals("") || colorie_casque.equals("")  
						|| colorie_casque == null || imageVoiture == null || imageVoiture.getText().equals("")
						|| nbTours == null || nbTours.getText().equals("0") || textField_4== null || textField_4.getText().equals(""))

				{// si au moins un des champs principaux n'est pas remplies alors on a un message d'erreur
					JOptionPane.showMessageDialog(desktopPane, Dico.dansLedico("Vous n'avez pas tout rempli !", Dico.langue), Dico.dansLedico("Attention", Dico.langue), JOptionPane.ERROR_MESSAGE);
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
						JOptionPane.showMessageDialog(desktopPane, Dico.dansLedico("Nombre de relai(s) incorrect !", Dico.langue), Dico.dansLedico("Attention", Dico.langue), JOptionPane.ERROR_MESSAGE);
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
					v.setVoiture_couleur(colorie_casque);
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
		JButton btnAnnuler = new JButton(Dico.dansLedico("Annuler", Dico.langue));
		btnAnnuler.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnAnnuler.setBorderPainted(false);
		btnAnnuler.setContentAreaFilled(false);
		Icon loginIcon2 = new ImageIcon(getClass().getResource("/icones/previous.png"));
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
		JButton btnAjouterPilote = new JButton(Dico.dansLedico("Ajouter", Dico.langue));
		btnAjouterPilote.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnAjouterPilote.setBorderPainted(false);
		btnAjouterPilote.setContentAreaFilled(false);
		Icon loginIcon3 = new ImageIcon(getClass().getResource("/icones/add.png"));
		btnAjouterPilote.setIcon(loginIcon3);
		btnAjouterPilote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pilote pil = new Pilote();
				String nom ="";
				if (!numVoiture.getText().equals("") && numVoiture!= null) {
					nom = numVoiture.getText();
					v.setVoiture_num(nom);
				}
				if (colorie_casque != null && !colorie_casque.equals("") ) {
					String field1 = colorie_casque;
					v.setVoiture_couleur(field1);
				}
				if (!imageVoiture.getText().equals("") && imageVoiture!=null) {
					String field2 = imageVoiture.getText();
					v.setVoiture_lien_img(field2);
				}
				if (!nbTours.getText().equals("") && nbTours != null) {
					int field3 = Integer.parseInt(nbTours.getText());
					v.setVoiture_nbreTour_par_relai(field3);
				}
				if (!textField_4.getText().equals("") && textField_4 != null) {
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
		JButton btnSupprimer = new JButton(Dico.dansLedico("Supprimer", Dico.langue));
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
					model.removeRow(ligne);
					comboBox.removeItemAt(ligne);
					// on notify la table comme quoi un pilote n'est plus
				}
				
			}
		});
		btnSupprimer.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnSupprimer.setBorderPainted(false);
		btnSupprimer.setContentAreaFilled(false);
		Icon loginIcon5 = new ImageIcon(getClass().getResource("/icones/suppr.png"));
		btnSupprimer.setIcon(loginIcon5);
		btnSupprimer.setBounds(376, 297, 133, 29);
		desktopPane.add(btnSupprimer);


		// bouton Modifier un pilote		
		JButton btnModifier = new JButton(Dico.dansLedico("Modifier", Dico.langue));
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom ="";
				if (!numVoiture.getText().equals("") && numVoiture!= null) {
					nom = numVoiture.getText();
					v.setVoiture_num(nom);
				}
				if (colorie_casque!= null && !colorie_casque.equals("") ) {
					String field1 = colorie_casque;
					v.setVoiture_couleur(field1);
				}
				if (!imageVoiture.getText().equals("") && imageVoiture != null) {
					String field2 = imageVoiture.getText();
					v.setVoiture_lien_img(field2);
				}
				if (!nbTours.getText().equals("") && nbTours != null) {
					int field3 = Integer.parseInt(nbTours.getText());
					v.setVoiture_nbreTour_par_relai(field3);
				}
				if (!textField_4.getText().equals("") && textField_4 != null) {
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
		Icon loginIcon6 = new ImageIcon(getClass().getResource("/icones/edit.png"));
		btnModifier.setIcon(loginIcon6);
		btnModifier.setBounds(221, 299, 145, 29);
		desktopPane.add(btnModifier);
		
		JButton btnColorSelect = new JButton("");
		btnColorSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dico.langueSystem(Dico.langue);// choix de la langue pour la fenetre choix des couleurs
				Color couleur = JColorChooser.showDialog (null, Dico.dansLedico("Couleur du casque", Dico.langue), Color.WHITE);
				couleurVoiture.setBackground(couleur);// on affecte la couleur choisit comme background du textarea
				colorie_casque = Integer.toString(couleur.getRGB());
			}
		});
		btnColorSelect.setBounds(880, 68, 46, 20);
		desktopPane.add(btnColorSelect);
	}
}
