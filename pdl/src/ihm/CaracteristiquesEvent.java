package ihm;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;

import java.awt.SystemColor;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;

public class CaracteristiquesEvent extends JPanel {

	/**
	 * Create the panel.
	 */
	public CaracteristiquesEvent() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);

		JLabel lblCaractristiquesDeLa = new JLabel("Caracteristiques de l'evenement");
		lblCaractristiquesDeLa.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblCaractristiquesDeLa.setBounds(218, 6, 751, 44);
		desktopPane.add(lblCaractristiquesDeLa);

		JLabel lblNomDeLa = new JLabel("Nom de la course :");
		lblNomDeLa.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNomDeLa.setBounds(10, 66, 266, 14);
		desktopPane.add(lblNomDeLa);

		JLabel lblNomDuCircuit = new JLabel("Nom du circuit :");
		lblNomDuCircuit.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNomDuCircuit.setBounds(10, 97, 266, 14);
		desktopPane.add(lblNomDuCircuit);

		JLabel lblLongueurDuCircuit = new JLabel("Longueur du circuit (m) :");
		lblLongueurDuCircuit.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblLongueurDuCircuit.setBounds(10, 123, 266, 28);
		desktopPane.add(lblLongueurDuCircuit);

		JLabel lblVoitures = new JLabel("Voitures");
		lblVoitures.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblVoitures.setBounds(10, 206, 91, 14);
		desktopPane.add(lblVoitures);



		JLabel lblSancesDessai = new JLabel("S\u00E9ances d'essai");
		lblSancesDessai.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblSancesDessai.setBounds(367, 206, 148, 14);
		desktopPane.add(lblSancesDessai);




		JLabel lblCourse = new JLabel("COURSE");
		lblCourse.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblCourse.setBounds(789, 206, 61, 14);
		desktopPane.add(lblCourse);

		JTextPane voituresListe = new JTextPane();
		voituresListe.setBounds(10, 231, 327, 239);
		desktopPane.add(voituresListe);

		JTextPane essaiListe = new JTextPane();
		essaiListe.setBounds(367, 231, 350, 239);
		desktopPane.add(essaiListe);


		JLabel lblNomCourse = new JLabel("");
		lblNomCourse.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNomCourse.setForeground(SystemColor.activeCaptionText);
		lblNomCourse.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNomCourse.setBackground(SystemColor.scrollbar);
		lblNomCourse.setBounds(218, 63, 451, 20);
		desktopPane.add(lblNomCourse);

		JLabel lblNomCircuit = new JLabel("");
		lblNomCircuit.setForeground(Color.BLACK);
		lblNomCircuit.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNomCircuit.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNomCircuit.setBackground(SystemColor.windowBorder);
		lblNomCircuit.setBounds(218, 97, 451, 20);
		desktopPane.add(lblNomCircuit);

		JLabel lblLongueurCircuit = new JLabel("");
		lblLongueurCircuit.setForeground(Color.BLACK);
		lblLongueurCircuit.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblLongueurCircuit.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblLongueurCircuit.setBackground(SystemColor.windowBorder);
		lblLongueurCircuit.setBounds(218, 130, 451, 20);
		desktopPane.add(lblLongueurCircuit);


		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBorder(new LineBorder(new Color(0, 0, 0)));
		separator.setBounds(349, 174, 2, 369);
		desktopPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(740, 174, 2, 369);
		desktopPane.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(10, 174, 885, 2);
		desktopPane.add(separator_2);

		/******* BOUTONS DE LA PAGE *******/

		//Bouton Ajouter Pilote
		JButton btnAjouterPilote = new JButton("Ajouter");
		btnAjouterPilote.setContentAreaFilled(false);
		btnAjouterPilote.setBorderPainted(false);
		Icon loginIcon1 = new ImageIcon("icones/add.png");
		btnAjouterPilote.setIcon(loginIcon1);
		btnAjouterPilote.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnAjouterPilote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				removeAll();
				repaint();
				VoitureAvecEvent inter7 = new VoitureAvecEvent();
				add(inter7);
				validate();
			}
		});
		btnAjouterPilote.setForeground(new Color(0, 0, 0));
		btnAjouterPilote.setBackground(SystemColor.activeCaption);
		btnAjouterPilote.setBounds(79, 199, 148, 29);
		desktopPane.add(btnAjouterPilote);

		//Bouton Supprimer Pilote		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setContentAreaFilled(false);
		btnSupprimer.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnSupprimer.setBorderPainted(false);
		Icon loginIcon2 = new ImageIcon("icones/suppr.png");
		btnSupprimer.setIcon(loginIcon2);
		btnSupprimer.setBounds(207, 199, 148, 29);
		desktopPane.add(btnSupprimer);

		//Bouton Ajouter Essai		
		JButton btnAjouterEssai = new JButton("Ajouter");
		btnAjouterEssai.setContentAreaFilled(false);
		btnAjouterEssai.setBorderPainted(false);
		Icon loginIcon3 = new ImageIcon("icones/add.png");
		btnAjouterEssai.setIcon(loginIcon3);
		btnAjouterEssai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				CaracteristiquesEssai inter7 = new CaracteristiquesEssai();
				add(inter7);
				validate();
			}
		});
		btnAjouterEssai.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnAjouterEssai.setForeground(Color.BLACK);
		btnAjouterEssai.setBackground(SystemColor.activeCaption);
		btnAjouterEssai.setBounds(500, 204, 112, 20);
		desktopPane.add(btnAjouterEssai);


		//Bouton Supprimer Essai
		JButton btnSupprimerEssai = new JButton("Supprimer");
		btnSupprimerEssai.setContentAreaFilled(false);
		Icon loginIcon4 = new ImageIcon("icones/suppr.png");
		btnSupprimerEssai.setIcon(loginIcon4);
		btnSupprimerEssai.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnSupprimerEssai.setBorderPainted(false);
		btnSupprimerEssai.setBounds(606, 201, 148, 29);
		desktopPane.add(btnSupprimerEssai);


		//Bouton Modifier
		JButton btnEdit = new JButton("Modifier");
		btnEdit.setContentAreaFilled(false);
		btnEdit.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnEdit.setBorderPainted(false);
		Icon loginIcon5 = new ImageIcon("icones/edit.png");
		btnEdit.setIcon(loginIcon5);
		btnEdit.setBounds(747, 92, 117, 29);
		desktopPane.add(btnEdit);

		// Bouton Importer Voiture
		JButton btnImporterVoiture = new JButton("Importer Voiture");
		btnImporterVoiture.setContentAreaFilled(false);
		btnImporterVoiture.setBorderPainted(false);
		Icon loginIcon6 = new ImageIcon("icones/import.png");
		btnImporterVoiture.setIcon(loginIcon6);
		btnImporterVoiture.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnImporterVoiture.setBounds(61, 494, 192, 49);
		desktopPane.add(btnImporterVoiture);


		// Bouton Lancer Essai
		JButton btnLancerLessai = new JButton("Lancer l'essai");
		btnLancerLessai.setContentAreaFilled(false);
		btnLancerLessai.setBorderPainted(false);
		Icon loginIcon7 = new ImageIcon("icones/lancerEssai.png");
		btnLancerLessai.setIcon(loginIcon7);
		btnLancerLessai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				InterCourse inter7 = new InterCourse();
				add(inter7);
				validate();
			}
		});
		btnLancerLessai.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnLancerLessai.setBounds(420, 494, 192, 49);
		desktopPane.add(btnLancerLessai);



		// Bouton Lancer Course
		JButton btnLancerLaCourse = new JButton("Lancer la course");
		btnLancerLaCourse.setContentAreaFilled(false);
		btnLancerLaCourse.setBorderPainted(false);
		Icon loginIcon8 = new ImageIcon("icones/lancer.png");
		btnLancerLaCourse.setIcon(loginIcon8);
		btnLancerLaCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				CaracteristiquesCourse inter7 = new CaracteristiquesCourse();
				add(inter7);
				validate();
			}
		});
		btnLancerLaCourse.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnLancerLaCourse.setBounds(740, 496, 184, 44);
		desktopPane.add(btnLancerLaCourse);


		// Bouton Sauvegarder
		JButton btnSauvegarder = new JButton("Sauvegarder");
		btnSauvegarder.setContentAreaFilled(false);
		btnSauvegarder.setBorderPainted(false);
		Icon loginIcon9 = new ImageIcon("icones/save.png");
		btnSauvegarder.setIcon(loginIcon9);
		btnSauvegarder.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnSauvegarder.setBounds(740, 305, 173, 44);
		desktopPane.add(btnSauvegarder);


		// Bouton Retour
		JButton btnRetour = new JButton("Retour");
		btnRetour.setContentAreaFilled(false);
		btnRetour.setBorderPainted(false);
		Icon loginIcon10 = new ImageIcon("icones/previous.png");
		btnRetour.setIcon(loginIcon10);
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				GestionEvent inter7 = new GestionEvent();
				add(inter7);
				validate();
			}
		});
		btnRetour.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnRetour.setBounds(740, 388, 148, 44);
		desktopPane.add(btnRetour);



	}
}
