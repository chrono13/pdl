package ihm;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class CreerPiloteSansEvent extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField prenomPilote;
	private JTextField couleurCasque;
	private JTextField imagePilote;
	private JTextField nomPilote;

	/**
	 * Create the panel.
	 */
	public CreerPiloteSansEvent() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);
		
		JLabel lblInformationDuPilote = new JLabel("Information sur le pilote");
		lblInformationDuPilote.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblInformationDuPilote.setBounds(285, 20, 555, 45);
		desktopPane.add(lblInformationDuPilote);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblNom.setBounds(182, 121, 120, 23);
		desktopPane.add(lblNom);
		
		JLabel lblPrnom = new JLabel("Pr\u00E9nom");
		lblPrnom.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblPrnom.setBounds(182, 183, 120, 23);
		desktopPane.add(lblPrnom);
		
		JLabel lblCouleurDuCasque = new JLabel("Couleur du casque");
		lblCouleurDuCasque.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblCouleurDuCasque.setBounds(182, 250, 120, 23);
		desktopPane.add(lblCouleurDuCasque);
		
		JLabel lblImageDuPilote = new JLabel("Image du pilote");
		lblImageDuPilote.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblImageDuPilote.setBounds(182, 313, 120, 23);
		desktopPane.add(lblImageDuPilote);
		
		prenomPilote = new JTextField();
		prenomPilote.setBounds(551, 184, 270, 20);
		desktopPane.add(prenomPilote);
		prenomPilote.setColumns(10);
		
		couleurCasque = new JTextField();
		couleurCasque.setBounds(551, 251, 270, 20);
		desktopPane.add(couleurCasque);
		couleurCasque.setColumns(10);
					
		imagePilote = new JTextField();
		imagePilote.setBounds(551, 314, 270, 20);
		desktopPane.add(imagePilote);
		imagePilote.setColumns(10);
		
		nomPilote = new JTextField();
		nomPilote.setBounds(551, 122, 270, 20);
		desktopPane.add(nomPilote);
		nomPilote.setColumns(10);
		
		
		/* BOUTONS DE LA FENETRE */
		

//bouton ajouter ou modifier		
		JButton btnAjoutermodifier = new JButton("Ajouter/Modifier");
		btnAjoutermodifier.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnAjoutermodifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//évènement suite au "clic" sur le bouton ajouter/modifier
				removeAll();
				repaint();
				VoitureSansEvent inter2 = new VoitureSansEvent();
				add(inter2);
				validate();
			}
		});
		btnAjoutermodifier.setBounds(217, 490, 150, 45);
		desktopPane.add(btnAjoutermodifier);
		
		
		
// bouton retour		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				VoitureSansEvent inter2 = new VoitureSansEvent();
				add(inter2);
				validate();
			}
		});
		btnRetour.setBounds(584, 490, 150, 45);
		desktopPane.add(btnRetour);

	}
}
