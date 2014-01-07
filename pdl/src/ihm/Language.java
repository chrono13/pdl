package ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Classe permettant de choisir le langage de l'application au lancement
 * @author Blanchard K�vin /Ganeshamoorthy Kavishan/ Leroy Philippe/Veillot Yann
 *
 */

public class Language extends JPanel {

	/**
	 * Create the panel.
	 */
	public Language() {
		setBackground(new Color(240, 255, 255));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);
		
		JLabel lblChoisirLaLangue = new JLabel("Choix de la langue ");
		lblChoisirLaLangue.setHorizontalAlignment(SwingConstants.CENTER);
		lblChoisirLaLangue.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblChoisirLaLangue.setBounds(314, 57, 445, 54);
		desktopPane.add(lblChoisirLaLangue);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(367, 194, 216, 54);
		desktopPane.add(comboBox);
		comboBox.addItem("Fran\u00E7ais");
		comboBox.addItem("English");
		comboBox.addItem("Deutsch");
		comboBox.addItem("Italiano");
		comboBox.addItem("Espanol");
		
		/* BOUTONS DE LA FENETRE */
		
		//bouton Valider	
		JButton btnValider = new JButton("Valider");
		btnValider.setBorderPainted(false);
		btnValider.setContentAreaFilled(false);
		btnValider.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnValider.setContentAreaFilled(false);
		btnValider.setBorderPainted(false);
		Icon loginIcon4 = new ImageIcon("icones/valid.png");
		btnValider.setIcon(loginIcon4);
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String langue = comboBox.getSelectedItem().toString(); 
				Dico.langue = langue;
				removeAll();
				repaint();
				FirstFenetre inter3 = new FirstFenetre();
				add(inter3);
				validate();
			}
		});
		btnValider.setBounds(172, 351, 216, 66);
		desktopPane.add(btnValider);
		
		
//bouton Quitter	
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setBorderPainted(false);
		btnQuitter.setContentAreaFilled(false);
		btnQuitter.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnQuitter.setContentAreaFilled(false);
		btnQuitter.setBorderPainted(false);
		Icon loginIcon1 = new ImageIcon("icones/quit.png");
		btnQuitter.setIcon(loginIcon1);
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuitter.setBounds(560, 351, 216, 66);
		desktopPane.add(btnQuitter);

	}
}
