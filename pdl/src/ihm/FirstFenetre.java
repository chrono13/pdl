package ihm;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import principal.Voiture;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Component;


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
		
		//bouton creer un evenement		
		JButton btnCreerEvent = new JButton("Creer un evenement");
		btnCreerEvent.setContentAreaFilled(false);
		btnCreerEvent.setBorderPainted(false);
		Icon loginIcon2 = new ImageIcon("icones/flag.png");
		btnCreerEvent.setIcon(loginIcon2);
		btnCreerEvent.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCreerEvent.setHorizontalTextPosition(SwingConstants.CENTER);
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
		btnCreerEvent.setBounds(146, 304, 200, 72);
		desktopPane.add(btnCreerEvent);
		
		
//bouton Créer une voiture		
		JButton btnCreerVoiture = new JButton(Dico.dansLedico("Creer une voiture", Dico.langue));
		btnCreerVoiture.setContentAreaFilled(false);
		btnCreerVoiture.setBorderPainted(false);
		Icon loginIcon3 = new ImageIcon("icones/car.png");
		btnCreerVoiture.setIcon(loginIcon3);
		btnCreerVoiture.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCreerVoiture.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCreerVoiture.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnCreerVoiture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voiture v = new Voiture();
				removeAll();
				repaint();
				VoitureSansEvent inter3 = new VoitureSansEvent(v);
				add(inter3);
				validate();
			}
		});
		btnCreerVoiture.setBounds(387, 304, 234, 72);
		desktopPane.add(btnCreerVoiture);
		
		
//bouton annuler		
		JButton btnAnnuler = new JButton(Dico.dansLedico("Retour", Dico.langue));
		btnAnnuler.setContentAreaFilled(false);
		btnAnnuler.setBorderPainted(false);
		Icon loginIcon1 = new ImageIcon("icones/previous.png");
		btnAnnuler.setIcon(loginIcon1);
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
		btnAnnuler.setBounds(635, 304, 162, 72);
		desktopPane.add(btnAnnuler);
		
	}
}
