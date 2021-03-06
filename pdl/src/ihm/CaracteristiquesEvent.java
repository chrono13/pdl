package ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import principal.Course;
import principal.Essai;
import principal.Evenement;
import principal.SauvegarderXML;
import principal.Voiture;

/**
 * Classe permettant de d�finir les caract�ristique de l'�v�nement cr��
 * @author Blanchard K�vin /Ganeshamoorthy Kavishan/ Leroy Philippe/Veillot Yann
 *
 */

public class CaracteristiquesEvent extends JPanel {

	private Evenement event = null;
	private JTable table_voiture;
	private JTable table_essais;
	private List<Integer> ma_liste= new ArrayList<Integer>();
	/**
	 * Create the panel.
	 */
	public CaracteristiquesEvent(final Evenement e) {
		this.event = e;
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		final JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 255, 255));
		add(desktopPane);

		JLabel lblCaractristiquesDeLa = new JLabel(Dico.dansLedico("Caracteristiques de l'evenement", Dico.langue));
		lblCaractristiquesDeLa.setFont(new Font("Vrinda", Font.BOLD, 35));
		lblCaractristiquesDeLa.setBounds(218, 6, 751, 44);
		desktopPane.add(lblCaractristiquesDeLa);

		JLabel lblNomDeLa = new JLabel(Dico.dansLedico("Nom de la course :", Dico.langue));
		lblNomDeLa.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNomDeLa.setBounds(10, 66, 266, 14);
		desktopPane.add(lblNomDeLa);

		JLabel lblNomDuCircuit = new JLabel(Dico.dansLedico("Nom du circuit :", Dico.langue));
		lblNomDuCircuit.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNomDuCircuit.setBounds(10, 97, 266, 14);
		desktopPane.add(lblNomDuCircuit);

		JLabel lblLongueurDuCircuit = new JLabel(Dico.dansLedico("Longueur du circuit (m) :", Dico.langue));
		lblLongueurDuCircuit.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblLongueurDuCircuit.setBounds(10, 123, 266, 28);
		desktopPane.add(lblLongueurDuCircuit);

		JLabel lblVoitures = new JLabel(Dico.dansLedico("Voiture(s)", Dico.langue));
		lblVoitures.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblVoitures.setBounds(10, 206, 91, 14);
		desktopPane.add(lblVoitures);



		JLabel lblSancesDessai = new JLabel(Dico.dansLedico("Seance d'essai", Dico.langue));
		lblSancesDessai.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblSancesDessai.setBounds(367, 206, 148, 14);
		desktopPane.add(lblSancesDessai);




		JLabel lblCourse = new JLabel(Dico.dansLedico("COURSE", Dico.langue));
		lblCourse.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblCourse.setBounds(789, 206, 61, 14);
		desktopPane.add(lblCourse);


		JLabel lblNomCourse = new JLabel("");
		lblNomCourse.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNomCourse.setForeground(SystemColor.activeCaptionText);
		lblNomCourse.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNomCourse.setBackground(SystemColor.scrollbar);
		lblNomCourse.setBounds(218, 63, 451, 20);
		desktopPane.add(lblNomCourse);
		lblNomCourse.setText(event.getEven_nom());

		JLabel lblNomCircuit = new JLabel("");
		lblNomCircuit.setForeground(Color.BLACK);
		lblNomCircuit.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNomCircuit.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNomCircuit.setBackground(SystemColor.windowBorder);
		lblNomCircuit.setBounds(218, 97, 451, 20);
		desktopPane.add(lblNomCircuit);
		lblNomCircuit.setText(event.getEven_nom_circuit());

		JLabel lblLongueurCircuit = new JLabel("");
		lblLongueurCircuit.setForeground(Color.BLACK);
		lblLongueurCircuit.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblLongueurCircuit.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblLongueurCircuit.setBackground(SystemColor.windowBorder);
		lblLongueurCircuit.setBounds(218, 130, 451, 20);
		desktopPane.add(lblLongueurCircuit);
		lblLongueurCircuit.setText(String.valueOf(event.getEven_longueur_circuit()));


		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBorder(new LineBorder(new Color(0, 0, 0)));
		separator.setBounds(349, 174, 2, 369);
		desktopPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(740, 174, 2, 369);
		desktopPane.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(10, 174, 885, 2);
		desktopPane.add(separator_2);

		/******* BOUTONS DE LA PAGE *******/

		// remplir  la table des voiture
		JPanel panetablebis = new JPanel();
		panetablebis.setBounds(20, 239, 319, 259);
		table_voiture = new JTable();
		panetablebis.setLayout(new BorderLayout());
		panetablebis.add(new JScrollPane(table_voiture));
		desktopPane.add(panetablebis);
		final DefaultTableModel model = new DefaultTableModel() {

			@Override
			public boolean isCellEditable(int x, int y) {
				return false ; 
			}
		};





		model.addColumn(Dico.dansLedico("Nom et prenom :", Dico.langue));
		//model.setColumnIdentifiers(entete);
		if (!event.listVoitureVide()) {
			Iterator <Voiture> it = event.getVoitures().iterator();
			while(it.hasNext()) {
				Voiture v1 = it.next();
				String nom = v1.getVoiture_num();
				model.addRow(new Object [] {nom});
				if (v1.isVoiture_active()) {
					ma_liste.add(model.getRowCount()-1);
				}
			}
		}


		class MonCellRenderers extends DefaultTableCellRenderer {// specification de la couleur de fond lorsqu'une voiture est active ou non

			public Component getTableCellRendererComponent(JTable table, Object value,
				boolean isSelected, boolean hasFocus, int row, int column) {
				Component cell = super.getTableCellRendererComponent(table, value,
						isSelected, hasFocus, row, column);// pour une cellule donnee
					
					if (ma_liste.contains(row)){// si la ligne est contenu dans la liste des indices des voitures active alors couleur vert
						cell.setBackground(Color.GREEN);
					}
					else {// sinon couleur de fond rouge 
						cell.setBackground(Color.RED);
					}					
				return cell;
			}
		}

		table_voiture.setModel(model);
		table_voiture.setDefaultRenderer(Object.class, new MonCellRenderers());
		//desktopPane.add(table_voiture);


		//Bouton Ajouter voiture
		JButton btnAjouterVoiture = new JButton(Dico.dansLedico("", Dico.langue));//Ajouter
		btnAjouterVoiture.setContentAreaFilled(false);
		btnAjouterVoiture.setBorderPainted(false);
		Icon loginIcon1 = new ImageIcon(getClass().getResource("/icones/add.png"));
		btnAjouterVoiture.setIcon(loginIcon1);
		btnAjouterVoiture.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnAjouterVoiture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Voiture v = new Voiture();
				int ligne = table_voiture.getSelectedRow();
				if (ligne !=-1) {// si rien n'est selectionner dans le tableau alors on ne rentre pas
					int i = 0;
					Iterator <Voiture> it = event.getVoitures().iterator();
					while(it.hasNext() && i<=ligne){
						v =it.next();
						i++;
					}
				}				
				removeAll();
				repaint();
				VoitureAvecEvent inter7 = new VoitureAvecEvent(event, v);
				add(inter7);
				validate();
			}
		});
		btnAjouterVoiture.setForeground(new Color(0, 0, 0));
		btnAjouterVoiture.setBackground(SystemColor.activeCaption);
		btnAjouterVoiture.setBounds(79, 199, 148, 29);
		desktopPane.add(btnAjouterVoiture);



		//Bouton Supprimer Voiture		
		JButton btnSupprimer = new JButton(Dico.dansLedico("Supprimer", Dico.langue));
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ligne = table_voiture.getSelectedRow();
				Voiture voiture = new Voiture ();
				if (ligne !=-1) {// si rien n'est selectionner dans le tableau alors on ne rentre pas
					int i = 0;
					Iterator <Voiture> it = event.getVoitures().iterator();
					while(it.hasNext() && i<=ligne){
						voiture = it.next();
						if (i == ligne) {
							it.remove();
						}
						i++;
					}
				}
				model.removeRow(ligne);
				// on notify la table comme quoi une voiture n'est plus
			}
		});
		btnSupprimer.setContentAreaFilled(false);
		btnSupprimer.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnSupprimer.setBorderPainted(false);
		Icon loginIcon2 = new ImageIcon(getClass().getResource("/icones/suppr.png"));
		btnSupprimer.setIcon(loginIcon2);
		btnSupprimer.setBounds(207, 199, 148, 29);
		desktopPane.add(btnSupprimer);

		// contructions table essai
		JPanel panetable = new JPanel();
		panetable.setBounds(377, 239, 341, 259);
		table_essais = new JTable();
		panetable.setLayout(new BorderLayout());
		panetable.add(new JScrollPane(table_essais));
		desktopPane.add(panetable);
		final DefaultTableModel model2 = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int x, int y) {
				return false ; 
			}
		};

		model2.addColumn(Dico.dansLedico("Nom de l'essai :", Dico.langue));
		if (!event.listVoitureVide()) {
			Iterator <Essai> it = event.getEssais().iterator();
			while(it.hasNext()) {
				Essai s1 = it.next();
				String nom_essai = s1.getSession_nom();
				model2.addRow(new Object [] {nom_essai});
			}
		}
		table_essais.setModel(model2);
		//desktopPane.add(table_essais);

		//Bouton Ajouter Essai		
		JButton btnAjouterEssai = new JButton(Dico.dansLedico("", Dico.langue));//Ajouter
		btnAjouterEssai.setContentAreaFilled(false);
		btnAjouterEssai.setBorderPainted(false);
		Icon loginIcon3 = new ImageIcon(getClass().getResource("/icones/add.png"));
		btnAjouterEssai.setIcon(loginIcon3);
		btnAjouterEssai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Essai ess = new Essai();
				int ligne = table_essais.getSelectedRow();
				if (ligne !=-1) {// si rien n'est selectionner dans le tableau alors on ne rentre pas
					int i = 0;
					Iterator<Essai> it = event.getEssais().iterator();
					while(it.hasNext() && i<=ligne){
						ess =it.next();
						i++;
					}
				}	
				removeAll();
				repaint();
				CaracteristiquesEssai inter7 = new CaracteristiquesEssai(event, ess);
				add(inter7);
				validate();
			}
		});
		btnAjouterEssai.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnAjouterEssai.setForeground(Color.BLACK);
		btnAjouterEssai.setBackground(SystemColor.activeCaption);
		btnAjouterEssai.setBounds(500, 204, 130, 20);
		desktopPane.add(btnAjouterEssai);


		//Bouton Supprimer Essai
		JButton btnSupprimerEssai = new JButton(Dico.dansLedico("Supprimer", Dico.langue));
		btnSupprimerEssai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ligne = table_essais.getSelectedRow();
				Essai essai = new Essai();
				if (ligne !=-1) {// si rien n'est selectionne dans le tableau alors on ne rentre pas
					int i = 0;
					Iterator<Essai> it = event.getEssais().iterator();
					while(it.hasNext() && i<=ligne){
						essai = it.next();
						if (i == ligne) {
							it.remove();
						}
						i++;
					}
				}
				model.removeRow(ligne);
			}
		});
		btnSupprimerEssai.setContentAreaFilled(false);
		Icon loginIcon4 = new ImageIcon(getClass().getResource("/icones/suppr.png"));
		btnSupprimerEssai.setIcon(loginIcon4);
		btnSupprimerEssai.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnSupprimerEssai.setBorderPainted(false);
		btnSupprimerEssai.setBounds(606, 201, 148, 29);
		desktopPane.add(btnSupprimerEssai);


		//Bouton Modifier
		JButton btnEdit = new JButton(Dico.dansLedico("Modifier", Dico.langue));
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				removeAll();
				repaint();
				AjouterEvent inter7 = new AjouterEvent(event);
				add(inter7);
				validate();
			}
		});
		btnEdit.setContentAreaFilled(false);
		btnEdit.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnEdit.setBorderPainted(false);
		Icon loginIcon5 = new ImageIcon(getClass().getResource("/icones/edit.png"));
		btnEdit.setIcon(loginIcon5);
		btnEdit.setBounds(716, 92, 148, 29);
		desktopPane.add(btnEdit);

		// Bouton Importer Voiture
		JButton btnImporterVoiture = new JButton(Dico.dansLedico("Importer une voiture", Dico.langue));
		btnImporterVoiture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//chargement event
				// cr�ation de la bo�te de dialogue

				Dico.langueSystem(Dico.langue);// choix de la langue pour la fenetre de sauvegarde
				JFileChooser dialogue = new JFileChooser(new File("."));// ouverture d'une boite de dialogue
				File fichier=null;
				String namefile = "";
				String pathname= "";
				if (dialogue.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
					fichier = dialogue.getSelectedFile();
					namefile = fichier.getName();// on recupere le nom du fichier
					pathname = fichier.getParent();// on recupere le chemein du fichier
				}
				String nomdufichier = pathname+"\\"+namefile;// on ajoute l'extension xml au fihcier
				if (!nomdufichier.contains(".xml")){
					JOptionPane.showMessageDialog(desktopPane, Dico.dansLedico("Choisir un fichier xml", Dico.langue), Dico.dansLedico("Attention", Dico.langue), JOptionPane.ERROR_MESSAGE);
					return;
				}
				if (fichier==null){// si on clique sur annuler!
					return;
				}
				// r�cup�ration du fichier s�lectionn�
				else {
					try {	

						File file = new File(nomdufichier);
						JAXBContext jaxbContext = JAXBContext.newInstance(Voiture.class);
						Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
						Voiture voiture = (Voiture) jaxbUnmarshaller.unmarshal(file);
						event.ajouterVoiture(voiture);
						removeAll();
						repaint();
						CaracteristiquesEvent inter7 = new CaracteristiquesEvent(event);
						add(inter7);
						validate();
					}
					catch (Exception e2) {
						JOptionPane.showMessageDialog(desktopPane, Dico.dansLedico("Fichier incorrect", Dico.langue), Dico.dansLedico("Attention", Dico.langue), JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnImporterVoiture.setContentAreaFilled(false);
		btnImporterVoiture.setBorderPainted(false);
		Icon loginIcon6 = new ImageIcon(getClass().getResource("/icones/import.png"));
		btnImporterVoiture.setIcon(loginIcon6);
		btnImporterVoiture.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnImporterVoiture.setBounds(61, 494, 229, 49);
		desktopPane.add(btnImporterVoiture);


		// Bouton Lancer Essai
		JButton btnLancerLessai = new JButton(Dico.dansLedico("Lancer l'essai", Dico.langue));
		btnLancerLessai.setContentAreaFilled(false);
		btnLancerLessai.setBorderPainted(false);
		Icon loginIcon7 = new ImageIcon(getClass().getResource("/icones/lancerEssai.png"));
		btnLancerLessai.setIcon(loginIcon7);
		btnLancerLessai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!event.auMoinsuneVoitureActive()){// si l'utilsateur n'a rentre aucun essai alors il n'as pas le droit de lancer l'essai
					JOptionPane.showMessageDialog(desktopPane, Dico.dansLedico("Vous devez au moins avoir une voiture activee !", Dico.langue), Dico.dansLedico("Attention", Dico.langue), JOptionPane.ERROR_MESSAGE);
					return;
				}
				else {// pour lancer un essai on doit au moins selectionner un essai
					int ligne = table_essais.getSelectedRow();
					Essai essai = new Essai();
					if (ligne == -1){
						JOptionPane.showMessageDialog(desktopPane, Dico.dansLedico("Choisir au moins un essai a lancer", Dico.langue), Dico.dansLedico("Attention", Dico.langue), JOptionPane.ERROR_MESSAGE);
						return;
					}
					else {// si rien n'est selectionner dans le tableau alors on ne rentre pas
						int i = 0;
						Iterator<Essai> it = event.getEssais().iterator();
						while(it.hasNext() && i<=ligne){
							essai = it.next();
							i++;
						}
						removeAll();
						repaint();
						//Course course = new Course();
						CourseInterface inter7 = new CourseInterface(event, essai);
						add(inter7);
						validate();
					}

				}
			}
		});
		btnLancerLessai.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnLancerLessai.setBounds(420, 494, 192, 49);
		desktopPane.add(btnLancerLessai);



		// Bouton Lancer Course
		JButton btnLancerLaCourse = new JButton(Dico.dansLedico("Lancer la course", Dico.langue));
		btnLancerLaCourse.setContentAreaFilled(false);
		btnLancerLaCourse.setBorderPainted(false);
		Icon loginIcon8 = new ImageIcon(getClass().getResource("/icones/lancer.png"));
		btnLancerLaCourse.setIcon(loginIcon8);
		btnLancerLaCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!event.auMoinsuneVoitureActive()){// si l'utilsateur n'a rentre aucune voiture alors il n'as pas le droit de lancer la course
					JOptionPane.showMessageDialog(desktopPane, Dico.dansLedico("Vous devez au moins avoir une voiture activee !", Dico.langue), Dico.dansLedico("Attention", Dico.langue), JOptionPane.ERROR_MESSAGE);
					return;
				}
				else {
					removeAll();
					repaint();
					Course course = new Course();
					CaracteristiquesCourse inter7 = new CaracteristiquesCourse(event, course);
					add(inter7);
					validate();
				}

			}
		});
		btnLancerLaCourse.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnLancerLaCourse.setBounds(740, 496, 194, 44);
		desktopPane.add(btnLancerLaCourse);


		// Bouton Sauvegarder
		JButton btnSauvegarder = new JButton(Dico.dansLedico("Sauvegarder", Dico.langue));
		btnSauvegarder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SauvegarderXML.sauvegarder(Evenement.class, event);
			}
		});// une fois sauvegarder on reste sur la page
		btnSauvegarder.setContentAreaFilled(false);
		btnSauvegarder.setBorderPainted(false);
		Icon loginIcon9 = new ImageIcon(getClass().getResource("/icones/save.png"));
		btnSauvegarder.setIcon(loginIcon9);
		btnSauvegarder.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnSauvegarder.setBounds(740, 305, 173, 44);
		desktopPane.add(btnSauvegarder);


		// Bouton Retour
		JButton btnRetour = new JButton(Dico.dansLedico("Retour", Dico.langue));
		btnRetour.setContentAreaFilled(false);
		btnRetour.setBorderPainted(false);
		Icon loginIcon10 = new ImageIcon(getClass().getResource("/icones/previous.png"));
		btnRetour.setIcon(loginIcon10);
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				repaint();
				GestionEvent inter7 = new GestionEvent();
				add(inter7);
				validate();
			}
		});
		btnRetour.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnRetour.setBounds(740, 388, 148, 44);
		desktopPane.add(btnRetour);


	}
}
