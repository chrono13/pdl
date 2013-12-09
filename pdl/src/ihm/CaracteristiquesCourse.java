package ihm;

import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.BoxLayout;

import java.awt.SystemColor;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class CaracteristiquesCourse extends JPanel {
	private JTextField txtNomcourse;
	private JTextField txtHeuredbut;
	private JTextField txtHeurefin;
	private JTextField textnbToursMax;
	private JTextField textDureeMaxPilote;
	private JTextField textDureeConsécutiveMaxPilote;

	/**
	 * Create the panel.
	 */
	public CaracteristiquesCourse() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);
		
		JLabel lblInformationsConcernantLaCourse = new JLabel(Dico.dansLedico("Informations concernant la course", Dico.langue));
		lblInformationsConcernantLaCourse.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblInformationsConcernantLaCourse.setBounds(234, 0, 643, 36);
		desktopPane.add(lblInformationsConcernantLaCourse);
		
		JLabel lblNomDeLa = new JLabel(Dico.dansLedico("Nom de la course :", Dico.langue));
		lblNomDeLa.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNomDeLa.setBounds(193, 59, 163, 14);
		desktopPane.add(lblNomDeLa);
		
		JLabel lblHeureDeDbut = new JLabel(Dico.dansLedico("Heure de debut :", Dico.langue));
		lblHeureDeDbut.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblHeureDeDbut.setBounds(193, 96, 136, 14);
		desktopPane.add(lblHeureDeDbut);
		
		JLabel lblHeureDeFin = new JLabel(Dico.dansLedico("Heure de fin :", Dico.langue));
		lblHeureDeFin.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblHeureDeFin.setBounds(569, 96, 107, 14);
		desktopPane.add(lblHeureDeFin);
		
		JLabel lblNewLabel = new JLabel(Dico.dansLedico("Nombre de tours maximum :", Dico.langue));
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel.setBounds(193, 200, 256, 14);
		desktopPane.add(lblNewLabel);
		
		JCheckBox chckbxDpartAutomatique = new JCheckBox(Dico.dansLedico("Depart automatique", Dico.langue));
		chckbxDpartAutomatique.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		chckbxDpartAutomatique.setBackground(SystemColor.activeCaption);
		chckbxDpartAutomatique.setForeground(new Color(0, 0, 0));
		chckbxDpartAutomatique.setBounds(193, 149, 204, 23);
		desktopPane.add(chckbxDpartAutomatique);
		
		JLabel lblTypeDeFin = new JLabel(Dico.dansLedico("Type de fin :", Dico.langue));
		lblTypeDeFin.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblTypeDeFin.setBounds(501, 149, 117, 19);
		desktopPane.add(lblTypeDeFin);
		
		JCheckBox chckbxParNombreDe = new JCheckBox(Dico.dansLedico("Par nombre de tours", Dico.langue));
		chckbxParNombreDe.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		chckbxParNombreDe.setBackground(SystemColor.activeCaption);
		chckbxParNombreDe.setBounds(609, 136, 198, 23);
		desktopPane.add(chckbxParNombreDe);
		
		JCheckBox chckbxParTemps = new JCheckBox(Dico.dansLedico("Par temps", Dico.langue));
		chckbxParTemps.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		chckbxParTemps.setBackground(SystemColor.activeCaption);
		chckbxParTemps.setBounds(609, 162, 163, 23);
		desktopPane.add(chckbxParTemps);
		
		txtNomcourse = new JTextField();
		txtNomcourse.setBounds(396, 59, 222, 20);
		desktopPane.add(txtNomcourse);
		txtNomcourse.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(Dico.dansLedico("Duree totale maximum par pilote :", Dico.langue));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(194, 235, 271, 14);
		desktopPane.add(lblNewLabel_1);
		
		txtHeuredbut = new JTextField();
		txtHeuredbut.setBounds(396, 95, 86, 20);
		desktopPane.add(txtHeuredbut);
		txtHeuredbut.setColumns(10);
		
		txtHeurefin = new JTextField();
		txtHeurefin.setBounds(704, 93, 86, 20);
		desktopPane.add(txtHeurefin);
		txtHeurefin.setColumns(10);
		
		textnbToursMax = new JTextField();
		textnbToursMax.setBounds(501, 197, 130, 20);
		desktopPane.add(textnbToursMax);
		textnbToursMax.setColumns(10);
		
		textDureeMaxPilote = new JTextField();
		textDureeMaxPilote.setBounds(501, 232, 130, 20);
		desktopPane.add(textDureeMaxPilote);
		textDureeMaxPilote.setColumns(10);
		
		JLabel lblDureConscutiveMaximum = new JLabel(Dico.dansLedico("Duree consecutive maximum par pilote :", Dico.langue));
		lblDureConscutiveMaximum.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblDureConscutiveMaximum.setBounds(193, 270, 311, 14);
		desktopPane.add(lblDureConscutiveMaximum);
		
		textDureeConsécutiveMaxPilote = new JTextField();
		textDureeConsécutiveMaxPilote.setColumns(10);
		textDureeConsécutiveMaxPilote.setBounds(501, 267, 130, 20);
		desktopPane.add(textDureeConsécutiveMaxPilote);
		
		JLabel lblCommentairesSurLa = new JLabel("Commentaires");
		lblCommentairesSurLa.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblCommentairesSurLa.setBounds(75, 356, 130, 22);
		desktopPane.add(lblCommentairesSurLa);
		
		JTextPane txtpnCommentairesCourse = new JTextPane();
		txtpnCommentairesCourse.setBounds(208, 310, 574, 164);
		desktopPane.add(txtpnCommentairesCourse);
		
		JButton btnAnnuler = new JButton(Dico.dansLedico("Annuler", Dico.langue));
		btnAnnuler.setContentAreaFilled(false);
		btnAnnuler.setBorderPainted(false);
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
		btnAnnuler.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnAnnuler.setBounds(131, 486, 163, 65);
		desktopPane.add(btnAnnuler);
		
		JButton btnLancerLaCourse = new JButton(Dico.dansLedico("Lancer la course", Dico.langue));
		btnLancerLaCourse.setContentAreaFilled(false);
		btnLancerLaCourse.setBorderPainted(false);
		Icon loginIcon1 = new ImageIcon("icones/lancer.png");
		btnLancerLaCourse.setIcon(loginIcon1);
		btnLancerLaCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				InterCourse inter = new InterCourse();
				add(inter);
				validate();
			}
		});
		btnLancerLaCourse.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnLancerLaCourse.setToolTipText("");
		btnLancerLaCourse.setBounds(653, 485, 163, 65);
		desktopPane.add(btnLancerLaCourse);
		
		JLabel lblSur = new JLabel("sur");
		lblSur.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblSur.setBounds(107, 389, 130, 22);
		desktopPane.add(lblSur);
		
		JLabel lblLaCourse = new JLabel("la course");
		lblLaCourse.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblLaCourse.setBounds(90, 422, 130, 22);
		desktopPane.add(lblLaCourse);

	}
}
