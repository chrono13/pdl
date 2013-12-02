package ihm;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextPane;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Font;


public class FirstFenetre extends JPanel {

	/**
	 * Create the panel.
	 */
	public FirstFenetre() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);
		
		JLabel lblVousSouhaitez = new JLabel("Vous souhaitez :");
		lblVousSouhaitez.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblVousSouhaitez.setBounds(342, 198, 588, 53);
		desktopPane.add(lblVousSouhaitez);

		
		/* BOUTONS DE LA FENETRE */
		
//bouton créer un événement		
		JButton btnCreerEvent = new JButton("Cr\u00E9er un \u00E9v\u00E9nement");
		btnCreerEvent.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnCreerEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				GestionEvent inter3 = new GestionEvent();
				add(inter3);
				validate();
			}
		});
		btnCreerEvent.setBounds(187, 333, 162, 43);
		desktopPane.add(btnCreerEvent);
		
		
//bouton Créer une voiture		
		JButton btnCreerVoiture = new JButton(Dico.dansLedico("Creer une voiture", Dico.langue));
		btnCreerVoiture.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnCreerVoiture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				VoitureSansEvent inter3 = new VoitureSansEvent();
				add(inter3);
				validate();
			}
		});
		btnCreerVoiture.setBounds(406, 333, 154, 43);
		desktopPane.add(btnCreerVoiture);
		
		
//bouton annuler		
		JButton btnAnnuler = new JButton(Dico.dansLedico("Retour", Dico.langue));
		btnAnnuler.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// si on clique sur le bouton annuler on ferme l'application 
				removeAll();
				repaint();
				Language inter2 = new Language();
				add(inter2);
				validate();
			}
		});
		btnAnnuler.setBounds(635, 333, 148, 43);
		desktopPane.add(btnAnnuler);
		
	}
}
