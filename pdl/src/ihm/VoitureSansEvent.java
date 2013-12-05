package ihm;

import javax.swing.JPanel;
import javax.swing.BoxLayout;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JDesktopPane;

import java.awt.SystemColor;

import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.xml.sax.XMLFilter;

import principal.Pilote;
import principal.Variable_appli;
import principal.Voiture;

import java.awt.Cursor;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Locale;


public class VoitureSansEvent extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	
	
	private Voiture v = null;

	/**
	 * Impossible to create a VoitureSansEvent without a voiture
	 */
	private VoitureSansEvent() {
		
	}

	public VoitureSansEvent(final Voiture v) {
		//this.v = v;
		//mkUI();
		setBackground(new Color(240, 240, 240));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		JPanel panel = new JPanel();
		panel.setForeground(Color.CYAN);
		add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		final JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		desktopPane.setInheritsPopupMenu(true);
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);

		final JCheckBox chckbxVoitureActive = new JCheckBox("Voiture activ\u00E9e");
		chckbxVoitureActive.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		chckbxVoitureActive.setBackground(SystemColor.activeCaption);
		chckbxVoitureActive.setBounds(628, 133, 298, 23);
		desktopPane.add(chckbxVoitureActive);

		JLabel lblCaractristiquesDeLa = new JLabel("Caract\u00E9ristiques de la voiture");
		lblCaractristiquesDeLa.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblCaractristiquesDeLa.setBounds(249, 0, 628, 50);
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
		lblLienVersLimage.setBounds(10, 137, 196, 14);
		desktopPane.add(lblLienVersLimage);

		JLabel lblNombreDeTours = new JLabel("Nombre de tours / relais :");
		lblNombreDeTours.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNombreDeTours.setBounds(10, 203, 258, 14);
		desktopPane.add(lblNombreDeTours);

		JLabel lblTempsEstimPar = new JLabel("Temps estim\u00E9 par tour :");
		lblTempsEstimPar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblTempsEstimPar.setBounds(459, 203, 258, 14);
		desktopPane.add(lblTempsEstimPar);

		JLabel lblPilotes = new JLabel("Pilotes");
		lblPilotes.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblPilotes.setBounds(113, 303, 104, 14);
		desktopPane.add(lblPilotes);

		JLabel lblPiloteAuDopart = new JLabel("Pilote au d\u00E9part :");
		lblPiloteAuDopart.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblPiloteAuDopart.setBounds(547, 304, 189, 14);
		desktopPane.add(lblPiloteAuDopart);

		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(684, 296, 97, 27);
		desktopPane.add(comboBox);
		if (!v.listPiloteVide(v)) {
			Iterator <Pilote> it = v.getVoiture_list_pilotes().iterator();
			while(it.hasNext()) {
				Pilote p1 = it.next();
				String nom = p1.getPilote_nomprenom();
				comboBox.addItem(nom);
			}
		}
		this.v = v;
		
		textField = new JTextField();
		textField.setBounds(189, 67, 283, 20);
		desktopPane.add(textField);
		textField.setColumns(10);		

		textField_1 = new JTextField();
		textField_1.setBounds(568, 68, 290, 20);
		desktopPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(189, 136, 290, 20);
		desktopPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(233, 202, 75, 20);
		desktopPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(662, 202, 119, 20);
		desktopPane.add(textField_4);
		textField_4.setColumns(10);
		
		if (v!=null) {
			textField.setText(v.getVoiture_num());
			textField_1.setText(v.getVoiture_couleur());
			textField_2.setText(v.getVoiture_lien_img());
			textField_3.setText(Integer.toString(v.getVoiture_nbreTour_par_relai()));
			textField_4.setText(v.getVoiture_temps_estime_partour());
		}
		
		String [] entete =  {"Nom et prenom", "Couleur Casque", "Lien image" };
		table = new JTable();
		table.setBounds(10, 325, 410, 214);
		
		final DefaultTableModel model = new DefaultTableModel() {
			
			@Override
			public boolean isCellEditable(int x, int y) {
				return false ; 
			}
			
			
		};
		model.addColumn("Nom et prenom");
		model.addColumn("Couleur Casque");
		model.addColumn("Lien image");
		
		model.setColumnIdentifiers(entete);
		
		if (!v.listPiloteVide(v)) {
			Iterator <Pilote> it = v.getVoiture_list_pilotes().iterator();
		
			while(it.hasNext()) {
				Pilote p1 = it.next();
				String nom = p1.getPilote_nomprenom();
				String couleur = p1.getPilote_couleur();
				String lien = p1.getPilote_lien_sur_img();
				model.addRow(new Object [] {nom,  couleur, lien});
			}
		}

		table.setModel(model);
		//desktopPane.setLayout(new BorderLayout());
		
		//JScrollPane scroll = new JScrollPane();
		//scroll.setViewportView(table);
		desktopPane.add(table);
		//desktopPane.add(table.getTableHeader());//, BorderLayout.NORTH);
		
		

		/* BOUTONS DE LA FENETRE */

		// Bouton Sauvegarder
		JButton btnSauvegarder = new JButton("Sauvegarder");
		btnSauvegarder.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		Icon loginIcon1 = new ImageIcon("icones/disquette$.png");
		btnSauvegarder.setIcon(loginIcon1);
		btnSauvegarder.setBounds(541, 355, 137, 74);
		btnSauvegarder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*verification si l'ensemble des cellules est rempli*/
				if (v.listPiloteVide(v)){
					JOptionPane.showMessageDialog(desktopPane, "Attention", "Vous avez aucun pilote", JOptionPane.ERROR_MESSAGE);
				}
				if (textField == null || textField.getText().equals("")  || textField_2.getText().equals("") 
						|| textField_2 == null || textField_4 == null || textField_4.getText().equals("")
						|| textField_3 == null || textField_3.getText().equals("0") || textField_1== null || textField_1.getText().equals(""))
				
				{// si au moins un des champs principaux n'est pas remplies alors on a un message d'erreur
					JOptionPane.showMessageDialog(desktopPane, "Vous n'avez pas tout remplies !!!!!", "Attention", JOptionPane.ERROR_MESSAGE);
					return;// si il manque au moins un élément dans le voiture alors on avertit le client
				}
				else {
					//v.setVoiture_active(textField);
					v.setVoiture_couleur(textField_1.getText());
					v.setVoiture_lien_img(textField_2.getText());
					v.setVoiture_nbreTour_par_relai(Integer.parseInt(textField_3.getText()));
					v.setVoiture_num(textField.getText());
					v.setVoiture_temps_estime_partour(textField_4.getText());
					//v.setVoiture_pilote_actuelle(comboBox.getitem);
					
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
						removeAll();
						repaint();
						FirstFenetre inter2 = new FirstFenetre();
						add(inter2);
						validate();		
					}
				}
			}
		});
		btnSauvegarder.setBounds(557, 448, 137, 74);
		desktopPane.add(btnSauvegarder);

		
		
		// annuler
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		Icon loginIcon2 = new ImageIcon("");
		btnAnnuler.setIcon(loginIcon2);
		btnAnnuler.setBounds(763, 355, 130, 74);
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				FirstFenetre inter2 = new FirstFenetre();
				add(inter2);
				validate();
			}
		});
		btnAnnuler.setBounds(763, 448, 130, 74);
		desktopPane.add(btnAnnuler);



		// Ajouter un pilote
		JButton btnAjouterPilote = new JButton("");
		btnAjouterPilote.setBorderPainted(false);
		btnAjouterPilote.setIgnoreRepaint(true);
		btnAjouterPilote.setContentAreaFilled(false);
		btnAjouterPilote.setForeground(new Color(240, 255, 255));
		btnAjouterPilote.setBackground(new Color(240, 255, 255));
		Icon loginIcon3 = new ImageIcon("icones/add.png");
		btnAjouterPilote.setIcon(loginIcon3);
		btnAjouterPilote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom ="";
				if (!textField.getText().equals("")) {
					nom = textField.getText();
					v.setVoiture_num(nom);
				}
				if (!textField_1.getText().equals("")) {
					String field1 = textField_1.getText();
					v.setVoiture_couleur(field1);
				}
				if (!textField_2.getText().equals("")) {
					String field2 = textField_2.getText();
					v.setVoiture_lien_img(field2);
				}
				if (!textField_3.getText().equals("")) {
					int field3 = Integer.parseInt(textField_3.getText());
					v.setVoiture_nbreTour_par_relai(field3);
				}
				if (!textField_4.getText().equals("")) {
					String fiel4 = textField.getText();
					v.setVoiture_temps_estime_partour(fiel4);;
				}
				textField.setText(v.getVoiture_num());
				textField_1.setText(v.getVoiture_couleur());
				textField_2.setText(v.getVoiture_lien_img());
				textField_3.setText(Integer.toString(v.getVoiture_nbreTour_par_relai()));
				textField_4.setText(v.getVoiture_temps_estime_partour());
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
				CreerPiloteSansEvent inter4 = new CreerPiloteSansEvent(v, p);
				add(inter4);
				validate();
			}
		});
		btnAjouterPilote.setBounds(175, 303, 33, 18);
		desktopPane.add(btnAjouterPilote);
		
		JButton button_supprimerpilote = new JButton("");
		button_supprimerpilote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
	
		button_supprimerpilote.setBounds(227, 298, 41, 23);
		desktopPane.add(button_supprimerpilote);
		
	}
}
