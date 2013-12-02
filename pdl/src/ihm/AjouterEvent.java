package ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class AjouterEvent extends JPanel {

	private JTextField nomCourse;
	private JTextField longueurCircuit;
	private JTextField nomCircuit;
	/**
	 * Create the panel.
	 */
	public AjouterEvent() {
setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);
		
		JLabel lblAjouterEvent = new JLabel("Ajouter un \u00E9v\u00E9nement");
		lblAjouterEvent.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblAjouterEvent.setBounds(274, 0, 751, 44);
		desktopPane.add(lblAjouterEvent);
		
		JLabel lblNomDeLa = new JLabel("Nom de la course :");
		lblNomDeLa.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNomDeLa.setBounds(10, 123, 266, 14);
		desktopPane.add(lblNomDeLa);
		
		JLabel lblNomDuCircuit = new JLabel("Nom du circuit :");
		lblNomDuCircuit.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNomDuCircuit.setBounds(10, 236, 266, 14);
		desktopPane.add(lblNomDuCircuit);
		
		JLabel lblLongueurDuCircuit = new JLabel("Longueur du circuit (m) :");
		lblLongueurDuCircuit.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblLongueurDuCircuit.setBounds(10, 337, 266, 28);
		desktopPane.add(lblLongueurDuCircuit);
		
		
		nomCourse = new JTextField();
		nomCourse.setBounds(310, 123, 330, 28);
		desktopPane.add(nomCourse);
		nomCourse.setColumns(10);
		
		longueurCircuit = new JTextField();
		longueurCircuit.setColumns(10);
		longueurCircuit.setBounds(310, 338, 330, 28);
		desktopPane.add(longueurCircuit);
		
		nomCircuit = new JTextField();
		nomCircuit.setColumns(10);
		nomCircuit.setBounds(310, 230, 330, 28);
		desktopPane.add(nomCircuit);
		
		JButton btnSuivant = new JButton("Suivant");
		btnSuivant.setBounds(387, 445, 175, 83);
		desktopPane.add(btnSuivant);
		btnSuivant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//�v�nement suite au "clic" sur le boutton ajouter un �v�nement
				removeAll();
				repaint();
				CaracteristiquesEvent inter4 = new CaracteristiquesEvent();
				add(inter4);
				validate();
			}
		});
		
	}
}
