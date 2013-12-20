/**
 * 
 */
package principal;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import ihm.Chrono;



/**
 * In charge of time issues:
 *  two chronos are managed one for handling top the other for global time
 * @author Kavishan
 *
 */
public class TimeManager {

	private Chrono _top;
	private Chrono _global;
	private JTable _panel;
	private JTextField _jtext;
	private int _compteur;

	public TimeManager(Chrono top, Chrono global, JTable jTable, JTextField jTextField) {
		_top = top ; 
		_global = global ; 
		_panel = jTable;
		_jtext = jTextField;
		_compteur = 0;
	}

	/**
	 * @return the _top
	 */
	public Chrono getChronoTop() {
		return _top;
	}
	
	/**
	 * @return the _global
	 */
	public Chrono getChronoGlobal() {
		return _global;
	}

	/**
	 * @return the _panel
	 */
	public JTable get_Table() {
		return _panel;
	}

	/**
	 * @return the _compteur
	 */
	public int get_compteur() {
		return _compteur;
	}

	/**
	 * @param _compteur the _compteur to set
	 */
	public void set_compteur(int _compteur) {
		this._compteur = _compteur;
	}

	/**
	 * @return the _jtext
	 */
	public JTextField get_jtext() {
		return _jtext;
	}





	
}
