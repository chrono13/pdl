package ihm;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;


public class CreerPiloteAvecEvent extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public CreerPiloteAvecEvent() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);
		
		JLabel lblInformationDuPilote = new JLabel("Information sur le pilote");
		lblInformationDuPilote.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblInformationDuPilote.setBounds(317, 20, 563, 45);
		desktopPane.add(lblInformationDuPilote);
		
		JLabel lblNom = new JLabel("Nom et prenom");
		lblNom.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblNom.setBounds(170, 236, 120, 23);
		desktopPane.add(lblNom);
		
		JLabel lblCouleurDuCasque = new JLabel("Couleur du casque");
		lblCouleurDuCasque.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblCouleurDuCasque.setBounds(170, 300, 120, 23);
		desktopPane.add(lblCouleurDuCasque);
		
		JLabel lblImageDuPilote = new JLabel("Image du pilote");
		lblImageDuPilote.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblImageDuPilote.setBounds(170, 365, 120, 23);
		desktopPane.add(lblImageDuPilote);
		
		textField = new JTextField();
		textField.setBounds(551, 237, 270, 20);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAjouterModifier = new JButton("Ajouter/Modifier");
		btnAjouterModifier.setContentAreaFilled(false);
		btnAjouterModifier.setBorderPainted(false);
		Icon loginIcon1 = new ImageIcon("icones/add.png");
		btnAjouterModifier.setIcon(loginIcon1);
		btnAjouterModifier.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnAjouterModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//évènement suite au "clic" sur le boutton ajouter/modifier
				removeAll();
				repaint();
				VoitureAvecEvent inter2 = new VoitureAvecEvent();
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
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setContentAreaFilled(false);
		btnRetour.setFont(new Font("Dialog", Font.PLAIN, 14));
		Icon loginIcon2 = new ImageIcon("icones/previous.png");
		btnRetour.setIcon(loginIcon2);
		btnRetour.setBorderPainted(false);
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				VoitureAvecEvent inter2 = new VoitureAvecEvent();
				add(inter2);
				validate();
			}
		});
		btnRetour.setBounds(592, 469, 153, 45);
		desktopPane.add(btnRetour);

	}
}

