package ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;

public class ModificationTop extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificationTop frame = new ModificationTop();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ModificationTop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(245, 255, 250));
		contentPane.add(desktopPane);
		
		JLabel lblModificationTops = new JLabel("Modification Tops");
		lblModificationTops.setFont(new Font("Dialog", Font.BOLD, 35));
		lblModificationTops.setBounds(130, 6, 751, 44);
		desktopPane.add(lblModificationTops);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(150, 62, 195, 28);
		desktopPane.add(textField);
		
		JLabel lblTemps = new JLabel("Temps :");
		lblTemps.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblTemps.setBounds(6, 68, 127, 22);
		desktopPane.add(lblTemps);
		
		JLabel lblHeure = new JLabel("Heure :");
		lblHeure.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblHeure.setBounds(6, 97, 127, 22);
		desktopPane.add(lblHeure);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(150, 91, 195, 28);
		desktopPane.add(textField_1);
		
		JLabel lblRelais = new JLabel("Relais :");
		lblRelais.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblRelais.setBounds(6, 128, 127, 22);
		desktopPane.add(lblRelais);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(150, 122, 195, 28);
		desktopPane.add(textField_2);
		
		JLabel lblEtat = new JLabel("Etat :");
		lblEtat.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblEtat.setBounds(6, 162, 127, 22);
		desktopPane.add(lblEtat);
		
		JComboBox comboBoxEtat = new JComboBox();
		comboBoxEtat.setBounds(150, 162, 195, 27);
		desktopPane.add(comboBoxEtat);
		
		JLabel lblCommentaires = new JLabel("Commentaires :");
		lblCommentaires.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCommentaires.setBounds(6, 196, 162, 22);
		desktopPane.add(lblCommentaires);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(160, 200, 296, 97);
		desktopPane.add(textArea);
		
		
		JButton btnAnnuler = new JButton(Dico.dansLedico("Annuler", Dico.langue));
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAnnuler.setContentAreaFilled(false);
		btnAnnuler.setBorderPainted(false);
		Icon loginIcon2 = new ImageIcon("icones/previous.png");
		btnAnnuler.setIcon(loginIcon2);
		btnAnnuler.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnAnnuler.setBounds(129, 306, 163, 65);
		desktopPane.add(btnAnnuler);
		
		
		JButton btnValider = new JButton(Dico.dansLedico("Valider", Dico.langue));
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnValider.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnValider.setBorderPainted(false);
		btnValider.setContentAreaFilled(false);
		Icon loginIcon4 = new ImageIcon("icones/valid.png");
		btnValider.setIcon(loginIcon4);
		btnValider.setBounds(322, 309, 183, 74);
		desktopPane.add(btnValider);

	}
}
