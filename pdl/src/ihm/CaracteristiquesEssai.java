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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;

import principal.Essai;
import principal.Evenement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class CaracteristiquesEssai extends JPanel {
	private JTextField txtNomcourse;
	private JTextField txtHeuredbut;
	private JTextField txtHeurefin;
	private JTextField textnbToursMax;
	private JTextField textDureeMaxPilote;
	private JTextField textDureeConsécutiveMaxPilote;
	private Essai essai = null;
	private Evenement event = null;

	/**
	 * Create the panel.
	 */
	public CaracteristiquesEssai(Evenement e, Essai es) {
		setBackground(new Color(240, 255, 255));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		this.event = e;
		this.essai = es;
		
		final JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);
		
		JLabel lblInformationsConcernantLaCourse = new JLabel("Informations concernant l'essai");
		lblInformationsConcernantLaCourse.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblInformationsConcernantLaCourse.setBounds(214, 0, 685, 36);
		desktopPane.add(lblInformationsConcernantLaCourse);
		
		JLabel lblNomDeLa = new JLabel("Nom de l'essai :");
		lblNomDeLa.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNomDeLa.setBounds(193, 59, 163, 14);
		desktopPane.add(lblNomDeLa);
		
		JLabel lblHeureDeDbut = new JLabel("Heure de debut :");
		lblHeureDeDbut.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblHeureDeDbut.setBounds(193, 96, 136, 14);
		desktopPane.add(lblHeureDeDbut);
		
		JLabel lblHeureDeFin = new JLabel("Heure de fin :");
		lblHeureDeFin.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblHeureDeFin.setBounds(569, 96, 107, 14);
		desktopPane.add(lblHeureDeFin);
		
		JLabel lblNewLabel = new JLabel("Nombre de tours maximum :");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel.setBounds(193, 200, 256, 14);
		desktopPane.add(lblNewLabel);
		
		final JCheckBox chckbxDpartAutomatique = new JCheckBox("Depart automatique");
		chckbxDpartAutomatique.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		chckbxDpartAutomatique.setBackground(SystemColor.activeCaption);
		chckbxDpartAutomatique.setForeground(new Color(0, 0, 0));
		chckbxDpartAutomatique.setBounds(193, 149, 204, 23);
		desktopPane.add(chckbxDpartAutomatique);
		
		JLabel lblTypeDeFin = new JLabel("Type de fin :");
		lblTypeDeFin.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblTypeDeFin.setBounds(501, 149, 117, 19);
		desktopPane.add(lblTypeDeFin);
		
		final JCheckBox chckbxParNombreDe = new JCheckBox("Par nombre de tours");
		chckbxParNombreDe.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		chckbxParNombreDe.setBackground(SystemColor.activeCaption);
		chckbxParNombreDe.setBounds(609, 136, 198, 23);
		desktopPane.add(chckbxParNombreDe);
		
		final JCheckBox chckbxParTemps = new JCheckBox("Par temps");
		chckbxParTemps.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		chckbxParTemps.setBackground(SystemColor.activeCaption);
		chckbxParTemps.setBounds(609, 162, 163, 23);
		desktopPane.add(chckbxParTemps);
		
		txtNomcourse = new JTextField();
		txtNomcourse.setBounds(396, 59, 222, 20);
		desktopPane.add(txtNomcourse);
		txtNomcourse.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Duree totale maximum par pilote :");
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
		
		JLabel lblDureConscutiveMaximum = new JLabel("Duree consecutive maximum par pilote :");
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
		
		final JTextPane txtpnCommentairesCourse = new JTextPane();
		txtpnCommentairesCourse.setBounds(208, 310, 572, 162);
		desktopPane.add(txtpnCommentairesCourse);
		
		if (essai !=null) {
			txtNomcourse.setText(essai.getSession_nom());
			txtHeuredbut.setText(essai.getSession_heuredebut());
			txtHeurefin.setText(essai.getSession_heurefin());
			textDureeConsécutiveMaxPilote.setText(essai.getSession_dureemaxconsecutiveparpilote());
			textDureeMaxPilote.setText(essai.getSession_dureetotalemaxpilote());
			textnbToursMax.setText(Integer.toString(essai.getSession_nbre_tours_max()));
			if (!essai.getSession_commentaire().equals("")){
				txtpnCommentairesCourse.setText(essai.getSession_commentaire());
			}
			if (essai.isSession_departauto()){
				chckbxDpartAutomatique.setSelected(true);
			}
			if (essai.isSession_typefin()){
				chckbxParTemps.setSelected(true);
			}
			else {
				chckbxParNombreDe.setSelected(true);
			}
		}
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setContentAreaFilled(false);
		btnAnnuler.setBorderPainted(false);
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
		btnAnnuler.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnAnnuler.setBounds(107, 483, 163, 65);
		desktopPane.add(btnAnnuler);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setContentAreaFilled(false);
		btnValider.setBorderPainted(false);
		Icon loginIcon1 = new ImageIcon("icones/valid.png");
		btnValider.setIcon(loginIcon1);
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// recuperation des informations lie a a course
				if (txtNomcourse == null || txtNomcourse.getText().equals("")  || txtHeuredbut.getText().equals("") 
						|| txtHeuredbut == null || txtHeurefin == null || txtHeurefin.getText().equals("")
						|| textDureeMaxPilote == null || textDureeMaxPilote.getText().equals("") 
						|| textDureeConsécutiveMaxPilote == null || textDureeConsécutiveMaxPilote.getText().equals("") 
						|| textnbToursMax == null || textnbToursMax.getText().equals("0"))
				
				{// si au moins un des champs principaux n'est pas remplies alors on a un message d'erreur
					JOptionPane.showMessageDialog(desktopPane, "Vous n'avez pas tout remplies !!!!!", "Attention", JOptionPane.ERROR_MESSAGE);
					return;// si il manque au moins un élément dans le voiture alors on avertit le client
				}
				else {// si tous les informations sont remplies alors on prend les informations
					if (!txtpnCommentairesCourse.getText().equals("")){
						essai.setSession_commentaire(txtpnCommentairesCourse.getText());
					}
					essai.setSession_nom(txtNomcourse.getText());
					essai.setSession_heuredebut(txtHeuredbut.getText());
					essai.setSession_heurefin(txtHeurefin.getText());
					essai.setSession_dureemaxconsecutiveparpilote(textDureeConsécutiveMaxPilote.getText());
					essai.setSession_dureetotalemaxpilote(textDureeMaxPilote.getText());
					try
					{
					     int i=Integer.decode(textnbToursMax.getText());// verifie si la saisie de la longueur est un entier
					 
					}catch(NumberFormatException  e2)
					{
						JOptionPane.showMessageDialog(desktopPane, "Une donnee n'est pas numerique !!!!!", "Attention", JOptionPane.ERROR_MESSAGE);
						return;}
					essai.setSession_nbre_tours_max(Integer.parseInt(textnbToursMax.getText()));
					if (chckbxDpartAutomatique.isSelected()){
						essai.setSession_departauto(true);
					}
					if (chckbxParNombreDe.isSelected() && chckbxParTemps.isSelected()){
						JOptionPane.showMessageDialog(desktopPane, "Seulement une case doit etre cochee", "Attention", JOptionPane.ERROR_MESSAGE);
						return;
					}
					else {
						if (chckbxParNombreDe.isSelected()){
							essai.setSession_typefin(false);
						}
						if (chckbxParTemps.isSelected()){
							essai.setSession_typefin(true);
						}
					}
					event.ajouterEssai(essai);
					removeAll();
					repaint();
					CaracteristiquesEvent inter = new CaracteristiquesEvent(event);
					add(inter);
					validate();
				}
			}
		});
		btnValider.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnValider.setToolTipText("");
		btnValider.setBounds(714, 483, 163, 65);
		desktopPane.add(btnValider);
		
		JLabel lblSur = new JLabel("sur");
		lblSur.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblSur.setBounds(107, 389, 130, 22);
		desktopPane.add(lblSur);
		
		JLabel lblLaCourse = new JLabel("l'essai");
		lblLaCourse.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblLaCourse.setBounds(95, 423, 130, 22);
		desktopPane.add(lblLaCourse);

	}
}
