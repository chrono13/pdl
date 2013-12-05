package ihm;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.SystemColor;

import javax.swing.JButton;

import principal.Pilote;
import principal.Voiture;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class CreerPiloteSansEvent extends JPanel {
	private JTextField couleurCasque;
	private JTextField imagePilote;
	private JTextField nomPilote;
	
	private Voiture v;
	private Pilote p;
	private Boolean verrou = false;

	/**
	 * Create the panel.
	 */
	public CreerPiloteSansEvent(final Voiture v, final Pilote p) {
		this.p = p;
		this.v = v;
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		final JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);
		
		JLabel lblInformationDuPilote = new JLabel("Informations sur le pilote");
		lblInformationDuPilote.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblInformationDuPilote.setBounds(285, 20, 555, 45);
		desktopPane.add(lblInformationDuPilote);
		
		JLabel lblNom = new JLabel("Nom et prenom");
		lblNom.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblNom.setBounds(182, 183, 120, 23);
		desktopPane.add(lblNom);
		
		JLabel lblCouleurDuCasque = new JLabel("Couleur du casque");
		lblCouleurDuCasque.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblCouleurDuCasque.setBounds(182, 250, 120, 23);
		desktopPane.add(lblCouleurDuCasque);
		
		JLabel lblImageDuPilote = new JLabel("Image du pilote");
		lblImageDuPilote.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblImageDuPilote.setBounds(182, 313, 120, 23);
		desktopPane.add(lblImageDuPilote);
		
		couleurCasque = new JTextField();
		couleurCasque.setBounds(551, 251, 270, 20);
		desktopPane.add(couleurCasque);
		couleurCasque.setColumns(10);
					
		imagePilote = new JTextField();
		imagePilote.setBounds(551, 314, 270, 20);
		desktopPane.add(imagePilote);
		imagePilote.setColumns(10);
		
		nomPilote = new JTextField();
		nomPilote.setBounds(551, 184, 270, 20);
		desktopPane.add(nomPilote);
		nomPilote.setColumns(10);
		
		if (p!=null) {
			verrou = true;
			nomPilote.setText(p.getPilote_nomprenom());
			imagePilote.setText(p.getPilote_lien_sur_img());
			couleurCasque.setText(p.getPilote_couleur());
		}
		
		/* BOUTONS DE LA FENETRE */
		

		//bouton ajouter ou modifier		
		JButton btnAjoutermodifier = new JButton("Ajouter/Modifier");
		btnAjoutermodifier.setContentAreaFilled(false);
		btnAjoutermodifier.setBorderPainted(false);
		Icon loginIcon1 = new ImageIcon("icones/add.png");
		btnAjoutermodifier.setIcon(loginIcon1);
		btnAjoutermodifier.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnAjoutermodifier.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnAjoutermodifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom;
				String img;
				String casque;
				if (verrou) {// si le pilote existait déja est que le modifie alors on supprime son ancien item afin d'en refaire un nouveau
					v.voiture_remove_pilote(p);
				}
				if (nomPilote == null || nomPilote.getText().equals("")  || couleurCasque.getText().equals("") 
						|| couleurCasque == null || imagePilote == null || imagePilote.getText().equals("")) {
					JOptionPane.showMessageDialog(desktopPane, "Vous n'avez pas tout remplies !!!!!", "Attention", JOptionPane.ERROR_MESSAGE);
					return;// si il manque au moins un élément chez le pilote alors on avertit le client
				}
				//évènement suite au "clic" sur le bouton ajouter/modifier
				if (nomPilote != null && !nomPilote.getText().equals("") ) {
					nom = nomPilote.getText();
					p.setPilote_nomprenom(nom);
				}
				if (couleurCasque != null && !couleurCasque.getText().equals("")) {
					casque = couleurCasque.getText();
					p.setPilote_couleur(casque);
				}
				if (imagePilote != null && !imagePilote.getText().equals("")) {
					img = imagePilote.getText();
					p.setPilote_lien_sur_img(img);
				}
				v.voiture_add_pilote(p);// on ajoute un pilote p à la voiture
				removeAll();
				repaint();
				VoitureSansEvent inter2 = new VoitureSansEvent(v);
				add(inter2);
				validate();
			}
		});
		btnAjoutermodifier.setBounds(217, 490, 235, 45);
		desktopPane.add(btnAjoutermodifier);
		
		
		
		// bouton retour		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setContentAreaFilled(false);
		btnRetour.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnRetour.setFont(new Font("Dialog", Font.PLAIN, 14));
		Icon loginIcon2 = new ImageIcon("icones/previous.png");
		btnRetour.setIcon(loginIcon2);
		btnRetour.setBorderPainted(false);
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				VoitureSansEvent inter2 = new VoitureSansEvent(v);
				add(inter2);
				validate();
			}
		});
		btnRetour.setBounds(584, 490, 150, 45);
		desktopPane.add(btnRetour);

	}
}
