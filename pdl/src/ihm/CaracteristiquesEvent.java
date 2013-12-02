package ihm;

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


public class CaracteristiquesEvent extends JPanel {

	/**
	 * Create the panel.
	 */
	public CaracteristiquesEvent() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);
		
		JLabel lblCaractristiquesDeLa = new JLabel("Caract\u00E9ristiques de l'\u00E9v\u00E9nement");
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
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				removeAll();
				repaint();
				VoitureAvecEvent inter7 = new VoitureAvecEvent();
				add(inter7);
				validate();
			}
		});
		btnAjouter.setForeground(new Color(0, 0, 0));
		btnAjouter.setBackground(SystemColor.activeCaption);
		btnAjouter.setBounds(195, 203, 107, 20);
		desktopPane.add(btnAjouter);
		
		JLabel lblSancesDessai = new JLabel("S\u00E9ances d'essai");
		lblSancesDessai.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblSancesDessai.setBounds(367, 206, 148, 14);
		desktopPane.add(lblSancesDessai);
		
		JButton button = new JButton("Ajouter");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				CaracteristiquesEssai inter7 = new CaracteristiquesEssai();
				add(inter7);
				validate();
			}
		});
		button.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		button.setForeground(Color.BLACK);
		button.setBackground(SystemColor.activeCaption);
		button.setBounds(547, 203, 112, 20);
		desktopPane.add(button);
		
		JLabel lblCourse = new JLabel("COURSE");
		lblCourse.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblCourse.setBounds(745, 206, 61, 14);
		desktopPane.add(lblCourse);
		
		JTextPane voituresListe = new JTextPane();
		voituresListe.setBounds(10, 231, 292, 239);
		desktopPane.add(voituresListe);
		
		JTextPane essaiListe = new JTextPane();
		essaiListe.setBounds(367, 231, 292, 239);
		desktopPane.add(essaiListe);
		
		JButton btnImporterVoiture = new JButton("Importer Voiture");
		btnImporterVoiture.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnImporterVoiture.setBounds(61, 494, 192, 49);
		desktopPane.add(btnImporterVoiture);
		
		JButton btnLancerLessai = new JButton("Lancer l'essai");
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
		
		JButton btnLancerLaCourse = new JButton("Lancer la course");
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
		btnLancerLaCourse.setBounds(710, 269, 136, 44);
		desktopPane.add(btnLancerLaCourse);
		
		JButton btnSauvegarder = new JButton("Sauvegarder");
		btnSauvegarder.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnSauvegarder.setBounds(710, 342, 136, 44);
		desktopPane.add(btnSauvegarder);
		
		JButton btnRetour = new JButton("Retour");
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
		btnRetour.setBounds(710, 418, 136, 44);
		desktopPane.add(btnRetour);
		
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

	}
}
