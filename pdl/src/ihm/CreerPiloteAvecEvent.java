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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import principal.Evenement;
import principal.Pilote;
import principal.Voiture;

/**
 * Classe permettant d'ajouter un nouveau pilote lorsque on a d�ja
 * cr�e un �v�nement
 * @author Blanchard K�vin /Ganeshamoorthy Kavishan/ Leroy Philippe/Veillot Yann
 *
 */

public class CreerPiloteAvecEvent extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private Pilote p = null;
	private Voiture v = null;
	private Evenement event = null;
	private boolean verrou = false;

	/**
	 * Create the panel.
	 * @param event 
	 * @param pil 
	 */
	public CreerPiloteAvecEvent(final Evenement event, Voiture voit, Pilote pil) {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		this.v = voit;
		this.p = pil;
		this.event = event;
		
		final JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);
		
		JLabel lblInformationDuPilote = new JLabel(Dico.dansLedico("Informations sur le pilote", Dico.langue));
		lblInformationDuPilote.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblInformationDuPilote.setBounds(317, 20, 563, 45);
		desktopPane.add(lblInformationDuPilote);
		
		JLabel lblNom = new JLabel(Dico.dansLedico("Nom et prenom :", Dico.langue));
		lblNom.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNom.setBounds(170, 236, 219, 23);
		desktopPane.add(lblNom);
		
		JLabel lblCouleurDuCasque = new JLabel(Dico.dansLedico("Couleur du casque", Dico.langue));
		lblCouleurDuCasque.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblCouleurDuCasque.setBounds(170, 300, 120, 23);
		desktopPane.add(lblCouleurDuCasque);
		
		JLabel lblImageDuPilote = new JLabel(Dico.dansLedico("Image du pilote", Dico.langue));
		lblImageDuPilote.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblImageDuPilote.setBounds(170, 365, 120, 23);
		desktopPane.add(lblImageDuPilote);
		
		textField = new JTextField();
		textField.setBounds(551, 237, 270, 20);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAjouterModifier = new JButton(Dico.dansLedico("Ajouter / Modifier", Dico.langue));
		btnAjouterModifier.setContentAreaFilled(false);
		btnAjouterModifier.setBorderPainted(false);
		Icon loginIcon1 = new ImageIcon("icones/add.png");
		btnAjouterModifier.setIcon(loginIcon1);
		btnAjouterModifier.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnAjouterModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//�v�nement suite au "clic" sur le boutton ajouter/modifier
				String nom;
				String img;
				String casque;
				if (verrou) {// si le pilote existait d�ja est que le modifie alors on supprime son ancien item afin d'en refaire un nouveau
					v.voiture_remove_pilote(p);
				}
				if (textField == null || textField.getText().equals("")  || textField_2.getText().equals("") 
						|| textField_2 == null || textField_3 == null || textField_3.getText().equals("")) {
					JOptionPane.showMessageDialog(desktopPane, Dico.dansLedico("Vous n'avez pas tout rempli !!!!!", Dico.langue), Dico.dansLedico("Attention", Dico.langue), JOptionPane.ERROR_MESSAGE);
					return;// si il manque au moins un �l�ment chez le pilote alors on avertit le client
				}
				//�v�nement suite au "clic" sur le bouton ajouter/modifier
				if (textField != null && !textField.getText().equals("") ) {
					nom = textField.getText();
					p.setPilote_nomprenom(nom);
				}
				if (textField_2 != null && !textField_2.getText().equals("")) {
					casque = textField_2.getText();
					p.setPilote_couleur(casque);
				}
				if (textField_3 != null && !textField_3.getText().equals("")) {
					img = textField_3.getText();
					p.setPilote_lien_sur_img(img);
				}
				v.voiture_add_pilote(p);
				removeAll();
				repaint();
				VoitureAvecEvent inter2 = new VoitureAvecEvent(event, v);
				add(inter2);
				validate();
			}
		});
		btnAjouterModifier.setBounds(236, 469, 219, 45);
		desktopPane.add(btnAjouterModifier);
		
		textField_2 = new JTextField();
		textField_2.setBounds(551, 300, 270, 20);
		desktopPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(551, 365, 270, 20);
		desktopPane.add(textField_3);
		textField_3.setColumns(10);
		
		
		if (p!=null) {
			verrou = true;
			textField.setText(p.getPilote_nomprenom());
			textField_3.setText(p.getPilote_lien_sur_img());
			textField_2.setText(p.getPilote_couleur());
		}
		
		JButton btnRetour = new JButton(Dico.dansLedico("Retour", Dico.langue));
		btnRetour.setContentAreaFilled(false);
		btnRetour.setBorderPainted(false);
		btnRetour.setFont(new Font("Dialog", Font.PLAIN, 14));
		Icon loginIcon2 = new ImageIcon("icones/previous.png");
		btnRetour.setIcon(loginIcon2);
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				VoitureAvecEvent inter2 = new VoitureAvecEvent(event, v);
				add(inter2);
				validate();
			}
		});
		btnRetour.setBounds(592, 469, 153, 45);
		desktopPane.add(btnRetour);

	}
}

