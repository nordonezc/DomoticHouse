package houseFeatures;

//JUST IF THE DOOR IS DOMOTIC
import storeFeatures.Domotic;

/**
 * REPRESENTATION OF THE ASSET DOOR IN A HOUSE IMPLEMENTS ONLY IF DOMOTIC
 * FEATURE IS PRESENT
 * 
 * @author Nicolas Ordo�ez Chala
 */
public class Door implements Domotic {

	/**
	 * IT ALLOWS THE USER TO OPEN THE DOOR
	 */
	public void open() {
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
