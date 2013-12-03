package ihm;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;

import java.awt.SystemColor;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Lancement extends JPanel {

	/**
	 * Create the panel.
	 */
	public Lancement() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBorder(UIManager.getBorder("CheckBox.border"));
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);
		
		JLabel lblBonjour = new JLabel("Bonjour");
		lblBonjour.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblBonjour.setBounds(413, 60, 218, 56);
		desktopPane.add(lblBonjour);
		
		JLabel lblVoulezvousLancerLapplication = new JLabel("Application PDL-Chrono13 ");
		lblVoulezvousLancerLapplication.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblVoulezvousLancerLapplication.setBounds(354, 216, 492, 39);
		desktopPane.add(lblVoulezvousLancerLapplication);
		
		JLabel lblRealiseeParKavishan = new JLabel("R\u00E9alis\u00E9 par Kavishan, Kevin, Philippe et Yann");
		lblRealiseeParKavishan.setBounds(354, 281, 313, 14);
		desktopPane.add(lblRealiseeParKavishan);
		
		
// bouton Continuer		
		JButton btnContinuer = new JButton("Continuer");
		btnContinuer.setContentAreaFilled(false);
		btnContinuer.setBorderPainted(false);
		btnContinuer.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		Icon loginIcon1 = new ImageIcon("icones/valid.png");
		btnContinuer.setIcon(loginIcon1);
		btnContinuer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				Language inter2 = new Language();
				add(inter2);
				validate();
			}
		});
		btnContinuer.setBounds(413, 339, 156, 56);
		desktopPane.add(btnContinuer);

	}

}
