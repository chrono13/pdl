package ihm;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollBar;

import principal.Evenement;
import principal.Heure;
import principal.Pilote;
import principal.Session;
import principal.TimeManager;
import principal.Voiture;

import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class CourseInterface extends JPanel {
	private JTable table;
	private Evenement event = null;
	private Session session = null;
	private JTextField heureactu;
	private JTextField heurefin;
	private boolean lancement=true;
	private int nb_tour = 0;
	private Timer timer;
	
	/**
	 * Create the panel.
	 */
	public CourseInterface(Evenement ev, Session s) {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		this.event = ev;
		this.session = s;

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(245, 255, 250));
		add(desktopPane);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 155, 21);
		desktopPane.add(menuBar);

		JMenu mnFichier = new JMenu(Dico.dansLedico("Fichier", Dico.langue));
		menuBar.add(mnFichier);

		JMenuItem mntmRevenir = new JMenuItem(Dico.dansLedico("Retour", Dico.langue));
		mnFichier.add(mntmRevenir);

		JMenuItem mntmSauvegarder = new JMenuItem(Dico.dansLedico("Sauvegarder", Dico.langue));
		mnFichier.add(mntmSauvegarder);

		JMenuItem mntmQuitter = new JMenuItem(Dico.dansLedico("Quitter", Dico.langue));
		mntmQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(1);
			}
		});
		mnFichier.add(mntmQuitter);

		JMenu mnEdition = new JMenu(Dico.dansLedico("Edition", Dico.langue));
		menuBar.add(mnEdition);

		JMenuItem mntmRien = new JMenuItem(Dico.dansLedico("rien", Dico.langue));
		mnEdition.add(mntmRien);

		JMenu mnAction = new JMenu(Dico.dansLedico("Action", Dico.langue));
		menuBar.add(mnAction);

		JMenuItem mntmClassement = new JMenuItem(Dico.dansLedico("Classement", Dico.langue));
		mnAction.add(mntmClassement);

		

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 57, 917, 532);
		desktopPane.add(tabbedPane);
		
		Iterator<Voiture> it = event.getVoitures().iterator();
		final Map<String, TimeManager> chronos = new HashMap<String,TimeManager>() ; 
		while (it.hasNext()){
			Voiture voiture = new Voiture();
			voiture = it.next();
			
			final TimeManager timeManager = new TimeManager(new Chrono(), new Chrono());
			final Chrono chr = timeManager.getChronoTop() ; //new Chrono();
			final Chrono temps = timeManager.getChronoGlobal() ; // new Chrono();
			
			chronos.put(voiture.getVoiture_num(), timeManager);
			
			
			if (voiture.isVoiture_active()) {
				final String car_name = voiture.getVoiture_num();
				// composant des onglet par voiture active
				JPanel panel = new JPanel();
				tabbedPane.addTab(voiture.getVoiture_num(), null, panel, null);
				panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

				JDesktopPane desktopPane_1 = new JDesktopPane();
				desktopPane_1.setBackground(new Color(240, 248, 255));
				panel.add(desktopPane_1);

				JDesktopPane desktopPane_2 = new JDesktopPane();
				desktopPane_2.setBorder(new TitledBorder(null, Dico.dansLedico("Temps", Dico.langue), TitledBorder.LEADING, TitledBorder.TOP, null, null));
				desktopPane_2.setBackground(new Color(230, 230, 250));
				desktopPane_2.setBounds(10, 25, 290, 220);
				desktopPane_1.add(desktopPane_2);

				


				JProgressBar progressBar = new JProgressBar();
				progressBar.setBounds(120, 180, 138, 14);
				desktopPane_2.add(progressBar);


				JLabel lblHeureActuelle = new JLabel(Dico.dansLedico("Heure actuelle :", Dico.langue));
				lblHeureActuelle.setFont(new Font("Segoe UI", Font.BOLD, 12));
				lblHeureActuelle.setBounds(10, 27, 102, 14);
				desktopPane_2.add(lblHeureActuelle);
		
				JLabel lblHeureDeFin = new JLabel(Dico.dansLedico("Heure de fin prevue :", Dico.langue));
				lblHeureDeFin.setFont(new Font("Segoe UI", Font.BOLD, 12));
				lblHeureDeFin.setBounds(10, 60, 124, 14);
				desktopPane_2.add(lblHeureDeFin);
		
				heureactu = new JTextField();
				heureactu.setEditable(true);
				heureactu.setBounds(172, 25, 86, 20);
				desktopPane_2.add(heureactu);
				heureactu.setColumns(10);
				int delay = 1000; //milliseconds
				  ActionListener taskPerformer = new ActionListener() {
				      public void actionPerformed(ActionEvent evt) {
				         //heureactu.setText(java.util.Calendar.getInstance().getTime().toString());
				         SimpleDateFormat formater = new SimpleDateFormat("H:mm:ss");
				         heureactu.setText(formater.format(java.util.Calendar.getInstance().getTime()));
				         System.out.println((formater.format(java.util.Calendar.getInstance().getTime())));
				         System.out.println(car_name);
				         heureactu.repaint();
				      }
				  };
				  setVisible(true);
				  timer = new Timer(delay, taskPerformer);
				  timer.start();
		
				heurefin = new JTextField();
				heurefin.setEditable(false);
				heurefin.setEnabled(false);
				heurefin.setBounds(172, 58, 86, 20);
				desktopPane_2.add(heurefin);
				heurefin.setColumns(10);
				heurefin.setText(session.getSession_heurefin());
				
				JLabel lblTempscoul = new JLabel(Dico.dansLedico("Temps ecoule :", Dico.langue));
				lblTempscoul.setFont(new Font("Segoe UI", Font.BOLD, 12));
				lblTempscoul.setBounds(10, 92, 124, 14);
				desktopPane_2.add(lblTempscoul);
				

				JDesktopPane desktopPane_3 = new JDesktopPane();
				desktopPane_3.setBorder(new TitledBorder(null, Dico.dansLedico("Informations sur le pilote", Dico.langue), TitledBorder.LEADING, TitledBorder.TOP, null, null));
				desktopPane_3.setBackground(new Color(230, 230, 250));
				desktopPane_3.setBounds(312, 25, 290, 220);
				desktopPane_1.add(desktopPane_3);

				JLabel lblPanneauDeLa = new JLabel(Dico.dansLedico("Panneau de la voiture :", Dico.langue));
				lblPanneauDeLa.setFont(new Font("Segoe UI", Font.BOLD, 12));
				lblPanneauDeLa.setBounds(10, 39, 146, 16);
				desktopPane_3.add(lblPanneauDeLa);

				JLabel lblToursRestant = new JLabel(Dico.dansLedico("Nombre de tour(s) restant(s) :", Dico.langue));
				lblToursRestant.setFont(new Font("Segoe UI", Font.BOLD, 12));
				lblToursRestant.setBounds(10, 84, 134, 14);
				desktopPane_3.add(lblToursRestant);

				JLabel lblTemps = new JLabel(Dico.dansLedico("Temps :", Dico.langue));
				lblTemps.setFont(new Font("Segoe UI", Font.BOLD, 12));
				lblTemps.setBounds(10, 125, 118, 14);
				desktopPane_3.add(lblTemps);

				JLabel lblEtat = new JLabel(Dico.dansLedico("Etat :", Dico.langue));
				lblEtat.setFont(new Font("Segoe UI", Font.BOLD, 12));
				lblEtat.setBounds(10, 165, 78, 14);
				desktopPane_3.add(lblEtat);

				JTextPane textPane_3 = new JTextPane();
				textPane_3.setEditable(false);
				textPane_3.setBounds(176, 39, 78, 20);
				desktopPane_3.add(textPane_3);
				textPane_3.setText(voiture.getVoiture_num());

				final JTextPane textPane_4 = new JTextPane();
				textPane_4.setEditable(false);
				textPane_4.setBounds(176, 84, 78, 20);
				desktopPane_3.add(textPane_4);
				textPane_4.setText(Integer.toString(session.getSession_nbre_tours_max()));

				final JTextPane textPane_5 = new JTextPane();
				textPane_5.setEditable(false);
				textPane_5.setBounds(176, 125, 78, 20);
				desktopPane_3.add(textPane_5);

				JTextPane textPane_6 = new JTextPane();
				textPane_6.setEditable(false);
				textPane_6.setBounds(176, 165, 78, 20);
				desktopPane_3.add(textPane_6);

				JDesktopPane desktopPane_4 = new JDesktopPane();
				desktopPane_4.setBorder(new TitledBorder(null, Dico.dansLedico("Informations generales", Dico.langue), TitledBorder.LEADING, TitledBorder.TOP, null, null));
				desktopPane_4.setBackground(new Color(230, 230, 250));
				desktopPane_4.setBounds(612, 25, 290, 220);
				desktopPane_1.add(desktopPane_4);

				JLabel lblPiloteActuel = new JLabel(Dico.dansLedico("Pilote actuel :", Dico.langue));
				lblPiloteActuel.setFont(new Font("Segoe UI", Font.BOLD, 12));
				lblPiloteActuel.setBounds(10, 56, 95, 14);
				desktopPane_4.add(lblPiloteActuel);

				JLabel lblNewLabel = new JLabel(Dico.dansLedico("Nombre de tour(s) par relai :", Dico.langue));
				lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
				lblNewLabel.setBounds(10, 97, 168, 14);
				desktopPane_4.add(lblNewLabel);

				JLabel lblNombreDeTours = new JLabel(Dico.dansLedico("Nombre de tour(s) restant(s) :", Dico.langue));
				lblNombreDeTours.setFont(new Font("Segoe UI", Font.BOLD, 12));
				lblNombreDeTours.setBounds(10, 136, 157, 14);
				desktopPane_4.add(lblNombreDeTours);

				JLabel lblNombreDeTours_1 = new JLabel("Nombre de tours effectues :");
				lblNombreDeTours_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
				lblNombreDeTours_1.setBounds(10, 175, 168, 14);
				desktopPane_4.add(lblNombreDeTours_1);

				final JComboBox<String> comboBox = new JComboBox<String>();
				comboBox.setBounds(150, 45, 120, 25);
				desktopPane_4.add(comboBox);
				
				if (!voiture.listPiloteVide()) {
					Iterator <Pilote> iterat_pilot = voiture.getVoiture_list_pilotes().iterator();
					while(iterat_pilot.hasNext()) {
						Pilote p1 = iterat_pilot.next();
						String nom = p1.getPilote_nomprenom();
						comboBox.addItem(nom);
						
					}
				}

				JTextPane textPane_1 = new JTextPane();
				textPane_1.setEditable(false);
				textPane_1.setBounds(206, 135, 42, 25);
				desktopPane_4.add(textPane_1);
				textPane_1.setText(Integer.toString(session.getSession_nbre_tours_max()));

				JTextPane textPane_2 = new JTextPane();
				textPane_2.setEditable(false);
				textPane_2.setBounds(206, 175, 42, 25);
				desktopPane_4.add(textPane_2);
				textPane_2.setText(Integer.toString(0));

				JTextPane textPane = new JTextPane();
				textPane.setEditable(false);
				textPane.setBounds(206, 95, 42, 25);
				desktopPane_4.add(textPane);
				textPane.setText(Integer.toString(voiture.getVoiture_nbreTour_par_relai()));
				
				
				JPanel panetable = new JPanel();
				panetable.setBounds(10, 268, 892, 225);
				table = new JTable();
				//panetable.setBackground(Color.BLUE);
				//table.setBounds(10, 268, 892, 225);
				panetable.setLayout(new BorderLayout());
				panetable.add(new JScrollPane(table));
				desktopPane_1.add(panetable);
				final DefaultTableModel model = new DefaultTableModel() {

					@Override
					public boolean isCellEditable(int x, int y) {
						return false ; 
					}
				};
				model.addColumn(Dico.dansLedico("Voiture(s)", Dico.langue));
				model.addColumn(Dico.dansLedico("Tour", Dico.langue));
				model.addColumn(Dico.dansLedico("Pilote (s)", Dico.langue));
				model.addColumn(Dico.dansLedico("Temps", Dico.langue));
				model.addColumn(Dico.dansLedico("Etat", Dico.langue));
				model.addColumn(Dico.dansLedico("Heure", Dico.langue));
				model.addColumn(Dico.dansLedico("Commentaires", Dico.langue));
				
				
				
				/*bouton et chrono de la partie temps*/
				JButton btnStop = new JButton("STOP");
				btnStop.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						chr.stop();
						temps.stop();
						lancement = true;
					}
				});
				btnStop.setBounds(10, 129, 89, 23);
				desktopPane_2.add(btnStop);

				JButton btnTop = new JButton("TOP");
				btnTop.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						int nbtourrestant = Integer.parseInt(textPane_4.getText())-1;
						textPane_4.setText(Integer.toString(nbtourrestant));
						if (lancement){
							chr.top();
							temps.top();
							lancement = false;
						} 
						else {
							Date madate = new Date();
							SimpleDateFormat formater = new SimpleDateFormat("H:mm:ss");
							String heure = formater.format(madate);
							String time = chr.tops();
							textPane_5.setText(time);
							model.addRow((new Object [] {car_name, nb_tour, comboBox.getSelectedItem(), time, "E", heure,""}));
							nb_tour= nb_tour+1;
						}
					}
				});
				btnTop.setBounds(10, 163, 89, 46);
				desktopPane_2.add(btnTop);
				
				
				temps.setBounds(120, 85, 138, 40);
				desktopPane_2.add(temps);
				chr.setBounds(120, 129, 138, 40);
				desktopPane_2.add(chr);
				
				
				table.setModel(model);
				
				//desktopPane_1.add(table);
			}
		}
		
		
		
		
		
		

		final JButton btnTopDepartPour = new JButton(Dico.dansLedico("Top depart pour toutes les voitures", Dico.langue));
		btnTopDepartPour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// lance tout les tops des voitures
				Iterator<Voiture> it = event.getVoitures().iterator();
				while (it.hasNext()){
					Voiture voiture = new Voiture();
					voiture = it.next();
					if (voiture.isVoiture_active()) {
						TimeManager tManager = chronos.get(voiture.getVoiture_num());
						tManager.getChronoTop().top(); 
						tManager.getChronoGlobal().top();
						lancement=false;
						btnTopDepartPour.setEnabled(false);
					}
				}
			}
		});
		btnTopDepartPour.setBounds(344, 23, 261, 23);
		desktopPane.add(btnTopDepartPour);
	}
	public int getNb_tour() {
		return nb_tour;
	}
	public void setNb_tour(int nb_tour) {
		this.nb_tour = nb_tour;
	}
}
