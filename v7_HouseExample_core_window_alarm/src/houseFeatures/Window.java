package houseFeatures;

/**
 * REPRESENTATION OF THE ASSET WINDOW IN A HOUSE
 * 
 * @author Nicolas Ordoñez Chala
 */
public class Window {

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

}
