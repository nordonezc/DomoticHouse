package houseFeatures;

import java.util.List;

/**
 * THE HOUSE IS THE REPRESENTATION OF A 1-FLOOR BUILDING WITH 1-ROOM THAT COMES
 * WITH N-DOORS AND N-WINDOWS
 * 
 * @author Nicolas Ordoñez Chaña
 *
 */
public class House {

	// THE HOUSE COMES WITH A LIST OF DOORS
	public List<Door> doors;

	// THE HOUSE COMES WITH A LIST OF WINDOWS
	// NOT ALWAYS THE HOUSES COME WITH WINDOWS
	public List<Window> windows;
}
