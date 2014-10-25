package com.formation.ressource;

import java.io.File;
import java.io.InputStream;

/**
 * The Interface StreamHandler.
 */
public interface StreamHandler {

	/**
	 * String to file.
	 *
	 * @param s
	 *            the s
	 * @param file
	 *            the file
	 */
	public abstract void stringToFile(String s, File file);

	/**
	 * Creates the count input stream.
	 *
	 * @param inputstream
	 *            the inputstream
	 * @return the count input stream
	 */
	public abstract CountInputStream createCountInputStream(
			InputStream inputstream);
}
