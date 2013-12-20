package ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import principal.Top;

public class ModificationTop extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Top tops = null;



	/**
	 * Create the frame.
	 * @param toup 
	 */
	public ModificationTop(Top toup) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

		this.tops = toup;

		final JDesktopPane desktopPane = new JDesktopPane();
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
		textField.setText(tops.getTop_temps_tour());

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
		textField_1.setText(tops.getTop_heure_passage());

		JLabel lblEtat = new JLabel("Etat :");
		lblEtat.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblEtat.setBounds(6, 147, 127, 22);
		desktopPane.add(lblEtat);

		final JComboBox <String> comboBoxEtat = new JComboBox <String>();
		comboBoxEtat.setBounds(150, 147, 195, 27);
		desktopPane.add(comboBoxEtat);
		comboBoxEtat.addItem("I");
		comboBoxEtat.addItem("R");
		comboBoxEtat.addItem("O");
		comboBoxEtat.setSelectedItem(toup.getTop_etat());

		JLabel lblCommentaires = new JLabel("Commentaires :");
		lblCommentaires.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCommentaires.setBounds(6, 196, 162, 22);
		desktopPane.add(lblCommentaires);


		final JTextArea textArea = new JTextArea();
		textArea.setBounds(160, 200, 296, 97);
		desktopPane.add(textArea);
		if (!toup.getTop_comment().equals("")) {
			textArea.setText(toup.getTop_comment());
		}

		JButton btnAnnuler = new JButton(Dico.dansLedico("Annuler", Dico.langue));
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				((Window) contentPane.getTopLevelAncestor()).dispose();
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
				if (textField == null || textField.getText().equals("") ) {
					JOptionPane.showMessageDialog(desktopPane, Dico.dansLedico("Vous n'avez pas tout rempli !", Dico.langue), Dico.dansLedico("Attention", Dico.langue), JOptionPane.ERROR_MESSAGE);
					return;// si il manque au moins un élément chez le pilote alors on avertit le client
				}
				if (!textArea.getText().equals("")) {
					tops.setTop_comment(textArea.getText());
				}
				String etat = (String) comboBoxEtat.getSelectedItem();
				tops.setTop_etat(etat);
				tops.setTop_heure_passage(textField_1.getText());
				tops.setTop_temps_tour(textField.getText());
				CourseInterface.setTooop(tops);
				((Window) contentPane.getTopLevelAncestor()).dispose();
			
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
