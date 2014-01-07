package ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.Timer;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import principal.Evenement;
import principal.Pilote;
import principal.Session;
import principal.TimeManager;
import principal.Top;
import principal.Voiture;

public class CourseInterface extends JPanel {

	private Evenement event = null;
	private Session session = null;
	private JTextField heureactu;
	private JTextField heurefin;
	private boolean lancement=true;
	private Timer timer;
	private static Top tooop = null;
	private JTextField textField_commentaire;
	private JTextField textField;

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
		mntmRevenir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		mnFichier.add(mntmRevenir);

		JMenuItem mntmSauvegarder = new JMenuItem("En travaux");
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

		JMenuItem mntmRien = new JMenuItem("En travaux");
		mnEdition.add(mntmRien);

		JMenu mnAction = new JMenu(Dico.dansLedico("Action", Dico.langue));
		menuBar.add(mnAction);

		JMenuItem mntmClassement = new JMenuItem("En travaux");
		mnAction.add(mntmClassement);



		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 57, 917, 532);
		desktopPane.add(tabbedPane);

		Iterator<Voiture> it = event.getVoitures().iterator();
		final Map<String, TimeManager> chronos = new HashMap<String,TimeManager>() ; 





		while (it.hasNext()){
			Voiture voiture = new Voiture();
			voiture = it.next();


			final TimeManager timeManager = new TimeManager(new Chrono(), new Chrono(), new JTable(), new JTextField());
			final Chrono chr = timeManager.getChronoTop() ; //new Chrono();
			final Chrono temps = timeManager.getChronoGlobal() ; // new Chrono();
			final JTable table = timeManager.get_Table();//new Table();
			final JTextField heureactu = timeManager.get_jtext();
			final int nb_tour = timeManager.get_compteur();

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


				JLabel lblHeureActuelle = new JLabel(Dico.dansLedico("Heure :", Dico.langue));
				lblHeureActuelle.setFont(new Font("Segoe UI", Font.BOLD, 12));
				lblHeureActuelle.setBounds(10, 27, 102, 14);
				desktopPane_2.add(lblHeureActuelle);

				JLabel lblHeureDeFin = new JLabel(Dico.dansLedico("Heure de fin :", Dico.langue));
				lblHeureDeFin.setFont(new Font("Segoe UI", Font.BOLD, 12));
				lblHeureDeFin.setBounds(10, 60, 124, 14);
				desktopPane_2.add(lblHeureDeFin);

				//heureactu = new JTextField();
				heureactu.setEditable(false);
				heureactu.setBounds(172, 25, 86, 20);
				desktopPane_2.add(heureactu);
				heureactu.setColumns(10);
				int delay = 1000; //milliseconds
				ActionListener taskPerformer = new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						//heureactu.setText(java.util.Calendar.getInstance().getTime().toString());
						SimpleDateFormat formater = new SimpleDateFormat("H:mm:ss");
						heureactu.setText(formater.format(java.util.Calendar.getInstance().getTime()));
						heureactu.repaint();
					}
				};
				setVisible(true);
				timer = new Timer(delay, taskPerformer);
				timer.start();

				heurefin = new JTextField();
				heurefin.setEditable(false);
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
				lblToursRestant.setBounds(0, 84, 173, 14);
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

				JLabel lblPiloteActuel = new JLabel(Dico.dansLedico("Pilote(s)", Dico.langue));
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

				JLabel lblNombreDeTours_1 = new JLabel(Dico.dansLedico("Nombre de tours effectues :", Dico.langue));
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

				final JComboBox <String> comboBox_etat = new JComboBox<String>();
				comboBox_etat.setBounds(187, 189, 48, 20);
				desktopPane_2.add(comboBox_etat);
				comboBox_etat.addItem("I");
				comboBox_etat.addItem("O");
				comboBox_etat.addItem("R");

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

				JLabel lblCommentaire = new JLabel(Dico.dansLedico("Commentaires :", Dico.langue));
				lblCommentaire.setBounds(10, 286, 124, 14);
				desktopPane_1.add(lblCommentaire);
				
				final JTextField commentari = new JTextField();
				commentari.setBounds(159, 286, 400, 20);
				commentari.setColumns(10);
				desktopPane_1.add(commentari);
				

				JPanel panetable = new JPanel();
				panetable.setBounds(10, 311, 892, 190);
				//table = new JTable();
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
				model.addColumn(Dico.dansLedico("Pilote(s)", Dico.langue));
				model.addColumn(Dico.dansLedico("Temps :", Dico.langue));
				model.addColumn(Dico.dansLedico("Etat :", Dico.langue));
				model.addColumn(Dico.dansLedico("Heure", Dico.langue));
				model.addColumn(Dico.dansLedico("Commentaires", Dico.langue));



				/*bouton et chrono de la partie temps*/
				JButton btnStop = new JButton(Dico.dansLedico("STOP", Dico.langue));
				btnStop.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						chr.stop();
						temps.stop();
						lancement = true;
					}
				});
				btnStop.setBounds(10, 129, 89, 23);
				desktopPane_2.add(btnStop);

				JButton btnTop = new JButton(Dico.dansLedico("TOP", Dico.langue));
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
							String comm = "";
							comm = commentari.getText();
							if (!comm.equals("")) {
								commentari.setText("");
							}
							model.addRow((new Object [] {car_name, timeManager.get_compteur() , comboBox.getSelectedItem(), time, comboBox_etat.getSelectedItem() , heure, comm}));
							String pilotes = (String) comboBox.getSelectedItem();
							String etat = (String) comboBox_etat.getSelectedItem();
							Top t = new Top (car_name, nb_tour, pilotes, time, etat, heure,comm);
							session.AddTop(t);
							timeManager.set_compteur(timeManager.get_compteur()+1);

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

				
				
				JButton btnModifierTop = new JButton(Dico.dansLedico("Modifier TOP", Dico.langue));
				btnModifierTop.setContentAreaFilled(false);
				btnModifierTop.setBorderPainted(false);
				Icon loginIcon10 = new ImageIcon("icones/edit.png");
				btnModifierTop.setIcon(loginIcon10);
				btnModifierTop.setFont(new Font("Segoe UI", Font.PLAIN, 14));
				btnModifierTop.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						int ligne = table.getSelectedRow();
						Top toup = null;
						if (ligne !=-1) {// si rien n'est selectionner dans le tableau alors on ne rentre pas
							int i = 0;
							Iterator <Top> it = session.getTop().iterator();
							ModificationTop modified;
							while(it.hasNext() && i<=ligne){
								toup = it.next();
								if (i == ligne) {
								}
								i++;
							}
							
							modified = new ModificationTop(toup, model, ligne, table);
							modified.setVisible(true);
							
							/*
							
							int cp = 0;
							while (modified.isActive()) {
								
								cp++;
							}
							if (tooop!=null) {
								model.setValueAt(tooop.getTop_comment(), ligne, 6);
								model.setValueAt(tooop.getTop_etat(), ligne, 4 );	
								model.setValueAt(tooop.getTop_heure_passage(), ligne, 5);
								model.setValueAt(tooop.getTop_temps_tour(), ligne, 3);	
								model.fireTableCellUpdated(ligne, 6);
								model.fireTableCellUpdated(ligne, 5);
								model.fireTableCellUpdated(ligne, 4);
								model.fireTableCellUpdated(ligne, 3);
								tooop = null;
							}*/
						}
					}
				});
				btnModifierTop.setBounds(20, 251, 202, 23);
				desktopPane_1.add(btnModifierTop);


				JButton btnExportTableur = new JButton(Dico.dansLedico("Export tableur", Dico.langue));
				btnExportTableur.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Dico.langueSystem(Dico.langue);// choix de la langue pour la fenetre de sauvegarde
						JFileChooser dialogue = new JFileChooser(new File("."));// ouverture d'une boite de dialogue
						File fichier;
						String namefile = "";
						String pathname= "";
						if (dialogue.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
							fichier = dialogue.getSelectedFile();
							namefile = fichier.getName();// on recupere le nom du fichier
							pathname = fichier.getParent();// on recupere le chemein du fichier
						}
						String nomdufichier = pathname+"/"+namefile+".xls";// on ajoute l'extension xml au fihcier
						if (!nomdufichier.equals("/.xls")){// verifie que lors du choix de l'emplacement si on fait annuler on arrete l'enregistrement
							try {
								FileWriter out = new FileWriter(nomdufichier);
								for(int i=0; i < model.getColumnCount(); i++) {
									out.write(model.getColumnName(i) + "\t");
								}
								out.write("\n");

								for(int i=0; i< model.getRowCount(); i++) {
									for(int j=0; j < model.getColumnCount(); j++) {
										out.write(model.getValueAt(i,j).toString()+"\t");
									}
									out.write("\n");
								}
								out.close();
							}	catch(Exception err)
							{
								err.printStackTrace();
							}
						}
					}
				});
				btnExportTableur.setContentAreaFilled(false);
				btnExportTableur.setBorderPainted(false);
				Icon loginIcon12 = new ImageIcon(getClass().getResource("/icones/tableur.png"));
				btnExportTableur.setIcon(loginIcon12);
				btnExportTableur.setFont(new Font("Segoe UI", Font.PLAIN, 14));
				btnExportTableur.setBounds(464, 251, 202, 23);
				desktopPane_1.add(btnExportTableur);




				JButton btnImprimer = new JButton(Dico.dansLedico("Imprimer", Dico.langue));
				btnImprimer.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							table.print();
						} catch (PrinterException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				btnImprimer.setContentAreaFilled(false);
				btnImprimer.setBorderPainted(false);
				Icon loginIcon13 = new ImageIcon(getClass().getResource("/icones/print.png"));
				btnImprimer.setIcon(loginIcon13);
				btnImprimer.setFont(new Font("Segoe UI", Font.PLAIN, 14));
				btnImprimer.setBounds(686, 251, 202, 23);
				desktopPane_1.add(btnImprimer);

				//desktopPane_1.add(table)
				JButton btnSupprimerTop = new JButton(Dico.dansLedico("Supprimer TOP", Dico.langue));
				btnSupprimerTop.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int ligne = table.getSelectedRow();
						Top toup = new Top ();
						if (ligne !=-1) {// si rien n'est selectionner dans le tableau alors on ne rentre pas
							int i = 0;
							Iterator <Top> it = session.getTop().iterator();
							while(it.hasNext() && i<=ligne){
								toup = it.next();
								if (i == ligne) {
									it.remove();
								}
								i++;
							}
							model.removeRow(ligne);
						}

					}
				});
				btnSupprimerTop.setContentAreaFilled(false);
				btnSupprimerTop.setBorderPainted(false);
				Icon loginIcon11 = new ImageIcon(getClass().getResource("/icones/suppr.png"));
				btnSupprimerTop.setIcon(loginIcon11);
				btnSupprimerTop.setFont(new Font("Segoe UI", Font.PLAIN, 14));
				btnSupprimerTop.setBounds(242, 251, 202, 23);
				desktopPane_1.add(btnSupprimerTop);
				
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

	/**
	 * @return the tooop
	 */
	public Top getTooop() {
		return tooop;
	}

	/**
	 * @param tooop the tooop to set
	 */
	public static void setTooop(Top tooops) {
		tooop = tooops;
	}
	
	public static void updatetable(DefaultTableModel model, JTable table) {
		table.setModel(model);
	}
}
