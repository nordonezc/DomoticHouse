package houseFeatures;

/**
 * REPRESENTATION OF THE ASSET DOOR IN A HOUSE
 * 
 * @author Nicolas Ordoñez Chala
 */
public class Door {

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
}
