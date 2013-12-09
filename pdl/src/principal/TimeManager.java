/**
 * 
 */
package principal;

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

	public TimeManager(Chrono top, Chrono global) {
		_top = top ; 
		_global = global ; 
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

	
}
