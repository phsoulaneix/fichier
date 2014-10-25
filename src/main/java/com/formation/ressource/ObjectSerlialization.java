package com.formation.ressource;

/**
 * The Interface ObjectSerlialization.
 */
public interface ObjectSerlialization {

	/**
	 * Store object into file.
	 *
	 * @param s
	 *            the s
	 * @param obj
	 *            the obj
	 */
	public abstract void storeObjectIntoFile(String s, Object obj);

	/**
	 * Gets the object from file.
	 *
	 * @param s
	 *            the s
	 * @return the object from file
	 */
	public abstract Object getObjectFromFile(String s);
}
