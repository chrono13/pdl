package ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

/**
 * Classe de bienvenue dans l'application
 * @author Blanchard K�vin /Ganeshamoorthy Kavishan/ Leroy Philippe/Veillot Yann
 *
 */
// c'est la fenetre d'acceuil de l'application, ou nous presentons les createurs de cette application
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
		lblBonjour.setHorizontalAlignment(SwingConstants.CENTER);
		lblBonjour.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblBonjour.setBounds(331, 49, 218, 56);
		desktopPane.add(lblBonjour);
		
		JLabel lblVoulezvousLancerLapplication = new JLabel("Application PDL-Chrono13 ");
		lblVoulezvousLancerLapplication.setHorizontalAlignment(SwingConstants.CENTER);
		lblVoulezvousLancerLapplication.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblVoulezvousLancerLapplication.setBounds(-35, 228, 492, 39);
		desktopPane.add(lblVoulezvousLancerLapplication);
		
		JLabel lblRealiseeParKavishan = new JLabel("R\u00E9alis\u00E9 par Kavishan, Kevin, Philippe et Yann");
		lblRealiseeParKavishan.setHorizontalAlignment(SwingConstants.CENTER);
		lblRealiseeParKavishan.setBounds(57, 359, 313, 14);
		desktopPane.add(lblRealiseeParKavishan);
		
		
		// bouton Continuer		
		JButton btnContinuer = new JButton("Continuer");
		btnContinuer.setContentAreaFilled(false);
		btnContinuer.setBorderPainted(false);
		btnContinuer.setContentAreaFilled(false);
		btnContinuer.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		Icon loginIcon1 = new ImageIcon(getClass().getResource("/icones/flag2.png"));
		btnContinuer.setIcon(loginIcon1);
		btnContinuer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// si le bouton continuer est appuyer alors on propose la fenetre permettant le choix de la langue
				removeAll();// on supprime le contenu de la fenetre
				repaint();// on reinitialise
				Language inter2 = new Language();// on creer le contenu de choix de la langue
				add(inter2);// on ajoute le contenu a la fenetre
				validate();// on valide
			}
		});
		btnContinuer.setBounds(78, 462, 218, 56);
		desktopPane.add(btnContinuer);
		
		JLabel course = new JLabel("");
		Icon loginIcon2 = new ImageIcon(getClass().getResource("/icones/race.jpg"));
		course.setIcon(loginIcon2);
		course.setBounds(395, 194, 486, 364);
		desktopPane.add(course);

	}
}
