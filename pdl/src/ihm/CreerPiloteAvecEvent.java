package ihm;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
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
	private JTextField textField_1;
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
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblNom.setBounds(170, 170, 120, 23);
		desktopPane.add(lblNom);
		
		JLabel lblPrnom = new JLabel("Prenom");
		lblPrnom.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblPrnom.setBounds(170, 235, 120, 23);
		desktopPane.add(lblPrnom);
		
		JLabel lblCouleurDuCasque = new JLabel("Couleur du casque");
		lblCouleurDuCasque.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblCouleurDuCasque.setBounds(170, 300, 120, 23);
		desktopPane.add(lblCouleurDuCasque);
		
		JLabel lblImageDuPilote = new JLabel("Image du pilote");
		lblImageDuPilote.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblImageDuPilote.setBounds(170, 365, 120, 23);
		desktopPane.add(lblImageDuPilote);
		
		textField = new JTextField();
		textField.setBounds(551, 170, 270, 20);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(551, 235, 270, 20);
		desktopPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAjoutermofifier = new JButton("Ajouter/Modifier");
		btnAjoutermofifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//évènement suite au "clic" sur le boutton ajouter/modifier
				removeAll();
				repaint();
				VoitureAvecEvent inter2 = new VoitureAvecEvent();
				add(inter2);
				validate();
			}
		});
		btnAjoutermofifier.setBounds(236, 469, 120, 45);
		desktopPane.add(btnAjoutermofifier);
		
		textField_2 = new JTextField();
		textField_2.setBounds(551, 300, 270, 20);
		desktopPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(551, 365, 270, 20);
		desktopPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Retour");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				VoitureAvecEvent inter2 = new VoitureAvecEvent();
				add(inter2);
				validate();
			}
		});
		btnNewButton.setBounds(592, 469, 120, 45);
		desktopPane.add(btnNewButton);

	}
}

