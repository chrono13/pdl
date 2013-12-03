package ihm;

import javax.rmi.CORBA.Util;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;


public class GestionEvent extends JPanel {

	private static final long serialVersionUID = 1L;

	public GestionEvent() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);
		
		JLabel lblQueSouhaitezVous = new JLabel("Que souhaitez vous faire?");
		lblQueSouhaitezVous.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblQueSouhaitezVous.setBounds(275, 20, 400, 45);
		desktopPane.add(lblQueSouhaitezVous);
		
		
		/* BOUTONS DE LA FENETRE */
		
		
// bouton ajouter un ŽvŽnement		
		JButton btnAjouterEvent = new JButton("Ajouter un evenement");
		btnAjouterEvent.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnAjouterEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//évènement suite au "clic" sur le boutton ajouter un évènement
				removeAll();
				repaint();
				AjouterEvent inter4 = new AjouterEvent();
				add(inter4);
				validate();
			}
		});
		btnAjouterEvent.setBounds(382, 276, 196, 50);
		desktopPane.add(btnAjouterEvent);
		
		
		
// bouton charger un ŽvŽnement		
		JButton btnChargerEvent = new JButton("Charger un evenement");
		btnChargerEvent.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnChargerEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				/*test2 pil = new test2();
				System.out.println("bla");
				//évènement suite au "clic" sur le boutton charger un évènement*/
//				 try
//			        {
//			         Util.openLink(new URL("file://" + Util.getWorkingDirectory().getAbsolutePath()).toURI());
//			        }
//			        catch (Exception e)
//			        {
//			         e.printStackTrace();
//			        }
			}
		});
		btnChargerEvent.setBounds(93, 111, 196, 50);
		desktopPane.add(btnChargerEvent);

		
// bouton annuler		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				FirstFenetre inter2 = new FirstFenetre();
				add(inter2);
				validate();
			}
		});
		btnAnnuler.setBounds(671, 439, 196, 50);
		desktopPane.add(btnAnnuler);
	}
	

}
