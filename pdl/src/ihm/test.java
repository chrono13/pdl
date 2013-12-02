package ihm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			//Dico.langue = Dico.langue + "english";
			public void run() {
				try {
					test frame = new test();
					Lancement l = new Lancement();
					frame.add(l);
					frame.pack();
					frame.setVisible(true);
					frame.setResizable(false); // pas de redimensionnement
					frame.setSize(950, 650); // taille de 950x650
					
					frame.setAlwaysOnTop(true); // toujours au premier plan
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
