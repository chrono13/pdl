package ihm;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTable;


public class InterCourse extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public InterCourse() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		final Chrono chr = new Chrono();
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Temps", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		desktopPane_1.setBackground(new Color(220, 220, 220));
		desktopPane_1.setBounds(20, 35, 280, 220);
		desktopPane.add(desktopPane_1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(66, 195, 146, 14);
		desktopPane_1.add(progressBar);
		
		JButton btnTop = new JButton("TOP");
		btnTop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chr.top() ;
			}
		});
		btnTop.setBounds(10, 131, 89, 53);
		desktopPane_1.add(btnTop);
		
		JButton btnStop = new JButton("STOP");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chr.stop();
			}
		});
		btnStop.setBounds(10, 97, 89, 23);
		desktopPane_1.add(btnStop);
		
		
		
		chr.setBounds(121, 143, 138, 40);
		desktopPane_1.add(chr);
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBorder(new TitledBorder(null, "Information pour le pilote", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		desktopPane_2.setBackground(new Color(220, 220, 220));
		desktopPane_2.setBounds(323, 35, 280, 220);
		desktopPane.add(desktopPane_2);
		
		JLabel lblPanneauDeLa = new JLabel("Panneau de la voiture :");
		lblPanneauDeLa.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblPanneauDeLa.setBounds(10, 39, 146, 16);
		desktopPane_2.add(lblPanneauDeLa);
		
		JLabel lblToursRestant = new JLabel("Tours Restant :");
		lblToursRestant.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblToursRestant.setBounds(10, 84, 134, 14);
		desktopPane_2.add(lblToursRestant);
		
		JLabel lblTemps = new JLabel("Temps :");
		lblTemps.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblTemps.setBounds(10, 125, 118, 14);
		desktopPane_2.add(lblTemps);
		
		JLabel lblEtat = new JLabel("Etat :");
		lblEtat.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEtat.setBounds(10, 165, 78, 14);
		desktopPane_2.add(lblEtat);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		textPane_3.setBounds(176, 39, 78, 20);
		desktopPane_2.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setEditable(false);
		textPane_4.setBounds(176, 84, 78, 20);
		desktopPane_2.add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setEditable(false);
		textPane_5.setBounds(176, 125, 78, 20);
		desktopPane_2.add(textPane_5);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setEditable(false);
		textPane_6.setBounds(176, 165, 78, 20);
		desktopPane_2.add(textPane_6);
		
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBorder(new TitledBorder(null, "Informations G\u00E9n\u00E9rale", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		desktopPane_3.setBackground(new Color(220, 220, 220));
		desktopPane_3.setBounds(625, 35, 280, 220);
		desktopPane.add(desktopPane_3);
		
		JLabel lblPiloteActuel = new JLabel("Pilote actuel :");
		lblPiloteActuel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblPiloteActuel.setBounds(10, 56, 95, 14);
		desktopPane_3.add(lblPiloteActuel);
		
		JLabel lblNewLabel = new JLabel("Nombre de tours par relais :");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 97, 168, 14);
		desktopPane_3.add(lblNewLabel);
		
		JLabel lblNombreDeTours = new JLabel("Nombre de tours restant :");
		lblNombreDeTours.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNombreDeTours.setBounds(10, 136, 157, 14);
		desktopPane_3.add(lblNombreDeTours);
		
		JLabel lblNombreDeTours_1 = new JLabel("Nombre de tours effectues :");
		lblNombreDeTours_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNombreDeTours_1.setBounds(10, 175, 168, 14);
		desktopPane_3.add(lblNombreDeTours_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(150, 45, 120, 25);
		desktopPane_3.add(comboBox);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setBounds(206, 135, 42, 25);
		desktopPane_3.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		textPane_2.setBounds(206, 175, 42, 25);
		desktopPane_3.add(textPane_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(206, 95, 42, 25);
		desktopPane_3.add(textPane);
		
		String[] entetes = {"Voiture", "Tour", "Pilote", "Temps","Relais", "E", "Heure", "Commentaire", "Annuler"};
		//String donnees [] []
		table = new JTable();
		table.setBounds(20, 279, 881, 236);
		desktopPane.add(table);
		
		

	}
}
