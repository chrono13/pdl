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
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;


public class VoitureAvecEvent extends JPanel {
	private JTextField numVoiture;
	private JTextField couleurVoiture;
	private JTextField imageVoiture;
	private JTextField nbTours;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public VoitureAvecEvent() {
		setBackground(new Color(240, 240, 240));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.CYAN);
		add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);
		
		JCheckBox chckbxVoitureActive = new JCheckBox("Voiture activ\u00E9e");
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(700, 299, 133, 23);
		desktopPane.add(comboBox);
		
		numVoiture = new JTextField();
		numVoiture.setBounds(189, 67, 283, 20);
		desktopPane.add(numVoiture);
		numVoiture.setColumns(10);
		
		couleurVoiture = new JTextField();
		couleurVoiture.setBounds(568, 68, 290, 20);
		desktopPane.add(couleurVoiture);
		couleurVoiture.setColumns(10);
		
		imageVoiture = new JTextField();
		imageVoiture.setBounds(216, 136, 290, 20);
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
		
		table = new JTable();
		table.setBounds(10, 328, 483, 255);
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
				removeAll();
				repaint();
				CaracteristiquesEvent inter = new CaracteristiquesEvent();
				add(inter);
				validate();
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
				removeAll();
				repaint();
				CaracteristiquesEvent inter = new CaracteristiquesEvent();
				add(inter);
				validate();
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
				CaracteristiquesEvent inter = new CaracteristiquesEvent();
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
				removeAll();
				repaint();
				CreerPiloteAvecEvent inter = new CreerPiloteAvecEvent();
				add(inter);
				validate();
			}
		});
		btnAjouterPilote.setBounds(69, 302, 137, 18);
		desktopPane.add(btnAjouterPilote);
		
		
		// bouton Supprimer un pilote				
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnSupprimer.setBorderPainted(false);
		btnSupprimer.setContentAreaFilled(false);
		Icon loginIcon5 = new ImageIcon("icones/suppr.png");
		btnSupprimer.setIcon(loginIcon5);
		btnSupprimer.setBounds(376, 297, 117, 29);
		desktopPane.add(btnSupprimer);
	
		
		// bouton Modifier un pilote		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnModifier.setBorderPainted(false);
		btnModifier.setContentAreaFilled(false);
		Icon loginIcon6 = new ImageIcon("icones/edit.png");
		btnModifier.setIcon(loginIcon6);
		btnModifier.setBounds(221, 299, 117, 29);
		desktopPane.add(btnModifier);
	}
	
	
}
