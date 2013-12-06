package ihm;

import javax.rmi.CORBA.Util;
import javax.swing.JPanel;

import java.awt.SystemColor;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;

import principal.Evenement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;


public class GestionEvent extends JPanel {

	private static final long serialVersionUID = 1L;

	public GestionEvent() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);
		
		JLabel lblQueSouhaitezVous = new JLabel("Que souhaitez vous faire ?");
		lblQueSouhaitezVous.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblQueSouhaitezVous.setBounds(275, 20, 543, 45);
		desktopPane.add(lblQueSouhaitezVous);
		
		
		/* BOUTONS DE LA FENETRE */
		
		
		// bouton ajouter un evenement		
		JButton btnAjouterEvent = new JButton("Ajouter un evenement");
		btnAjouterEvent.setContentAreaFilled(false);
		btnAjouterEvent.setBorderPainted(false);
		Icon loginIcon1 = new ImageIcon("icones/add.png");
		btnAjouterEvent.setIcon(loginIcon1);
		btnAjouterEvent.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnAjouterEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//évènement suite au "clic" sur le boutton ajouter un évènement
				Evenement event = new Evenement();
				removeAll();
				repaint();
				AjouterEvent inter4 = new AjouterEvent(event);
				add(inter4);
				validate();
			}
		});
		btnAjouterEvent.setBounds(382, 276, 234, 50);
		desktopPane.add(btnAjouterEvent);
		
		
		
		// bouton charger un ŽvŽnement		
		JButton btnChargerEvent = new JButton("Charger un evenement");
		btnChargerEvent.setContentAreaFilled(false);
		btnChargerEvent.setBorderPainted(false);
		Icon loginIcon6 = new ImageIcon("icones/import.png");
		btnChargerEvent.setIcon(loginIcon6);
		btnChargerEvent.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnChargerEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
			}
		});
		btnChargerEvent.setBounds(93, 111, 253, 50);
		desktopPane.add(btnChargerEvent);

		
// bouton annuler		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setContentAreaFilled(false);
		btnAnnuler.setBorderPainted(false);
		Icon loginIcon10 = new ImageIcon("icones/previous.png");
		btnAnnuler.setIcon(loginIcon10);
		btnAnnuler.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				FirstFenetre inter2 = new FirstFenetre();
				add(inter2);
				validate();
			}
		});
		btnAnnuler.setBounds(671, 439, 217, 50);
		desktopPane.add(btnAnnuler);
	}
	

}
