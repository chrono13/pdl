/**
 * 
 */
package principal;

import ihm.Chrono;

import javax.swing.JTable;
import javax.swing.JTextField;



/**
 * In charge of time issues:
 *  two chronos are managed one for handling top the other for global time
 * @author Kavishan
 *
 */

// cette classe est la afin de permettre d'ajouter des elements de l'interface ihm, de maniere a ce que chaque voiture aient leur propres
// composant 
public class TimeManager {

	private Chrono _top;// le temps d'un tour
	private Chrono _global;// le temps depuis le debut de la course
	private JTable _panel;// la table qui affichera les tops
	private JTextField _jtext;// l'heure courante
	private int _compteur;// compte tour

	public TimeManager(Chrono top, Chrono global, JTable jTable, JTextField jTextField) {// constructeur
		_top = top ; 
		_global = global ; 
		_panel = jTable;
		_jtext = jTextField;
		_compteur = 0;
	}

	/**
	 * retourne l'affichage chrono pour un top
	 * @return the _top
	 */
	public Chrono getChronoTop() {
		return _top;
	}
	
	/**
	 * retourne l'affichage chrono pour l'ensemble de la course (temps total)
	 * @return the _global
	 */
	public Chrono getChronoGlobal() {
		return _global;
	}

	/**
	 * retourne l'affichage de la table des tops
	 * @return the _panel
	 */
	public JTable get_Table() {
		return _panel;
	}

	/**
	 * retourne l'affichage compteur de tour
	 * @return the _compteur
	 */
	public int get_compteur() {
		return _compteur;
	}

	/**
	 * fixe l'affichage du compteur de tour
	 * @param _compteur the _compteur to set
	 */
	public void set_compteur(int _compteur) {
		this._compteur = _compteur;
	}

	/**
	 * affichage de l'heure
	 * @return the _jtext
	 */
	public JTextField get_jtext() {
		return _jtext;
	}





	
}
