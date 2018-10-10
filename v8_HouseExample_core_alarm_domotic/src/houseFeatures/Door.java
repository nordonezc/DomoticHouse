package houseFeatures;

//JUST IF THE DOOR IS DOMOTIC
import storeFeatures.Domotic;

/**
 * REPRESENTATION OF THE ASSET DOOR IN A HOUSE IMPLEMENTS ONLY IF DOMOTIC
 * FEATURE IS PRESENT
 * 
 * @author Nicolas Ordoñez Chala
 */
public class Door implements Domotic {

	// JUST IF THE WINDOW COME WITH ALARM
	private Alarm alarm;

	/**
	 * IT ALLOWS THE USER TO OPEN THE DOOR IF THE USER IS NOT ALLOWED ACCORDING TO
	 * THE ALARM THE ALARM WILL CALL THE POLICE
	 */
	public void open() {
		if (alarm.userAllowed())
			alarm.callPolice();
		// OPEN DOOR
	}

	/**
	 * IT ALLOWS THE USER CLOSE THE DOOR
	 */
	public void close() {
		// CLOSE DOOR
	}

	/**
	 * IF THE HOUSE IS DOMOTIC IT RECOGNIZE THE USER AND IT WILL OPEN THE DOOR
	 * AUTOMATICALLY
	 */
	public void automaticOpen() {
		// MAGICALLY OPEN DOOR
	}

	/**
	 * IF THE HOUSE IS DOMOTIC IT WILL CLOSE THE DOOR AUTOMATICALLY
	 */
	public void automaticClose() {
		// MAGICALLY CLOSE DOOR
	}
}
