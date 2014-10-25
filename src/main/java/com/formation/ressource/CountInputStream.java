package com.formation.ressource;

import java.io.FilterInputStream;
import java.io.InputStream;

/**
 * The Class CountInputStream.
 */
public abstract class CountInputStream extends FilterInputStream {

	/**
	 * Instantiates a new count input stream.
	 *
	 * @param in
	 *            the in
	 */
	public CountInputStream(InputStream in) {
		super(in);
	}

	/**
	 * Gets the count.
	 *
	 * @return the count
	 */
	public abstract int getCount();
}