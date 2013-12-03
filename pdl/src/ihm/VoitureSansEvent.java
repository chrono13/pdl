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
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import principal.Pilote;
import principal.Variable_appli;
import principal.Voiture;

import java.awt.Cursor;
import java.util.Iterator;


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

	public VoitureSansEvent(Voiture v) {
		this.v = v;
		mkUI();
		
	}

	private void mkUI() {
		setBackground(new Color(240, 240, 240));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		JPanel panel = new JPanel();
		panel.setForeground(Color.CYAN);
		add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		JDesktopPane desktopPane = new JDesktopPane();
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

		JComboBox comboBox = new JComboBox();
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
		
		
		textField = new JTextField();
		textField.setBounds(189, 67, 283, 20);
		desktopPane.add(textField);
		textField.setColumns(10);
		if (Variable_appli.voituresauvegarder.getVoiture_num()!=0) {
			textField.setText(String.valueOf(Variable_appli.voituresauvegarder.getVoiture_num()));
		}

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
		
		//textField_4.setText(arg0);
		
		table = new JTable();
		table.setBounds(10, 325, 410, 214);
		desktopPane.add(table);
		String [] entete = {"nom du pilote", "modifier", "supprimer"};
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Nom du pilote");
		model.addColumn("modifier");
		model.addColumn("supprimer");
		if (!v.listPiloteVide(v)) {
			Iterator <Pilote> it = v.getVoiture_list_pilotes().iterator();
		
			while(it.hasNext()) {
				Pilote p1 = it.next();
				String nom = p1.getPilote_nomprenom();
				JButton b = new JButton("Ajout bouton");
				model.addRow(new Object [] {nom,  b, 2});
			}
		}
		table.setModel(model);
		//JScrollPane scrollPane = new JScrollPane(table);
		// kavishan ici doit voir le problème d'ajout d'une scroll bar au tableau
		//JScrollPane scroll = new JScrollPane(table);
		//table.add(scrollPane);	
		

		/* BOUTONS DE LA FENETRE */

		// Bouton Sauvegarder
		JButton btnSauvegarder = new JButton("Sauvegarder");
		btnSauvegarder.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		Icon loginIcon1 = new ImageIcon("icones/disquette$.png");
		btnSauvegarder.setIcon(loginIcon1);
		btnSauvegarder.setBounds(541, 355, 137, 74);
		btnSauvegarder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				removeAll();
				repaint();
				FirstFenetre inter2 = new FirstFenetre();
				add(inter2);
				validate();			
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
			
			int nom = 0;
			Pilote p = new Pilote();
			public void actionPerformed(ActionEvent e) {
				
				if (textField != null && !textField.getText().equals("")) {
					nom = Integer.parseInt(textField.getText());
					v.setVoiture_num(nom);
				}
				/*String couleur = textField_1.getText();
				String lien = textField_2.getText();
				int nbreTour = Integer.parseInt(textField_3.getText());
				String temps = textField_4.getText();
				boolean estactive = chckbxVoitureActive.isSelected();*/
				/*if (nom!=0){
					System.out.println("toto");
				}
				else {
					System.out.println("tata");
				}
				//Variable_appli.voituresauvegarder.setVoiture_num(nom);
				/*Variable_appli.voituresauvegarder.setVoiture_couleur(couleur);
				Variable_appli.voituresauvegarder.setVoiture_lien_img(lien);
				Variable_appli.voituresauvegarder.setVoiture_nbreTour_par_relai(nbreTour);
				Variable_appli.voituresauvegarder.setVoiture_active(estactive);
				Variable_appli.voituresauvegarder.setVoiture_temps_estime_partour(temps);*/
				removeAll();
				repaint();
				int ligne = table.getSelectedRow();
				if (ligne !=-1) {
					Iterator <Pilote> it = v.getVoiture_list_pilotes().iterator();
					int i = 0;
					while(it.hasNext() && i<=ligne) {
						
						if (i == ligne) {
							 p = it.next();
						}
					}
				}
				CreerPiloteSansEvent inter4 = new CreerPiloteSansEvent(v, p);
				add(inter4);
				validate();
			}
		});
		btnAjouterPilote.setBounds(175, 303, 33, 18);
		desktopPane.add(btnAjouterPilote);

		
	}
}
