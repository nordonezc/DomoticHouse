	package houseFeatures;

//JUST IF THE WINDOW IS DOMOTIC
import storeFeatures.Domotic;

/**
 * REPRESENTATION OF THE ASSET WINDOW IN A HOUSE IMPLEMENTS ONLY IF DOMOTIC
 * FEATURE IS PRESENT
 * 
 * @author Nicolas Ordo�ez Chala
 */
public class Window implements Domotic {

	// JUST IF THE WINDOW COME WITH ALARM
	private Alarm alarm;

	/**
	 * IT ALLOWS THE USER TO OPEN THE WINDOW IF THE USER IS NOT ALLOWED ACCORDING TO
	 * THE ALARM THE ALARM WILL CALL THE POLICE
	 */
	public void open() {
		if (!alarm.userAllowed())
			alarm.callPolice();
		// OPEN WINDOW
	}

	/**
	 * IT ALLOWS THE USER CLOSE THE WINDOW
	 */
	public void close() {
		// CLOSE WINDOW
	}

	/**
	 * IF THE HOUSE IS DOMOTIC IT RECOGNIZE THE USER AND IT WILL OPEN THE WINDOW
	 * AUTOMATICALLY
	 */
	public void automaticOpen() {
		// MAGICALLY OPEN WINDOW
	}

	/**
	 * IF THE HOUSE IS DOMOTIC IT WILL CLOSE THE WINDOW AUTOMATICALLY
	 */
	public void automaticClose() {
		// MAGICALLY CLOSE WINDOW
	}

}
